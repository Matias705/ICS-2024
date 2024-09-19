package com.us.pedido;
import com.us.pedido.entities.Pedido;
import com.us.pedido.entities.Direccion;
import com.us.pedido.entities.Transportista;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    @Autowired
    private CustomMailSender mailService;

    @PostMapping
    public ResponseEntity<Map<String, Object>> crearPedido(
            @RequestParam("tipoCarga") String tipoCarga,
            @RequestParam("domicilioRetiroProvincia") String domicilioRetiroProvincia,
            @RequestParam("domicilioRetiroLocalidad") String domicilioRetiroLocalidad,
            @RequestParam("domicilioRetiroCalle") String domicilioRetiroCalle,
            @RequestParam("domicilioRetiroNumero") String domicilioRetiroNumero,
            @RequestParam(value = "domicilioRetiroOtros", required = false)
            String domicilioRetiroOtros,
            @RequestParam("fechaRetiro") String fechaRetiro,
            @RequestParam("domicilioEntregaProvincia") String domicilioEntregaProvincia,
            @RequestParam("domicilioEntregaLocalidad") String domicilioEntregaLocalidad,
            @RequestParam("domicilioEntregaCalle") String domicilioEntregaCalle,
            @RequestParam("domicilioEntregaNumero") String domicilioEntregaNumero,
            @RequestParam(value = "domicilioEntregaOtros", required = false)
            String domicilioEntregaOtros,
            @RequestParam("fechaEntrega") String fechaEntrega,
            @RequestParam(value = "fotos", required = false) MultipartFile[] fotos)
            throws MessagingException, IOException {

        // Crear objetos Direccion
        Direccion domicilioRetiro = new Direccion(domicilioRetiroProvincia,
                domicilioRetiroLocalidad, domicilioRetiroCalle, domicilioRetiroNumero,
                domicilioRetiroOtros);
        Direccion domicilioEntrega = new Direccion(domicilioEntregaProvincia,
                domicilioEntregaLocalidad, domicilioEntregaCalle, domicilioEntregaNumero,
                domicilioEntregaOtros);

        // Convertir fechas
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fechaRetiroLocal = LocalDate.parse(fechaRetiro, formatter);
        LocalDate fechaEntregaLocal = LocalDate.parse(fechaEntrega, formatter);

        // Crear el objeto Pedido
        Pedido pedido = new Pedido(tipoCarga, domicilioRetiro, fechaRetiroLocal,
                domicilioEntrega, fechaEntregaLocal);

        // Lógica para procesar el pedido (guardar en la base de datos, etc.)
        System.out.println("Pedido recibido: " + pedido);

        // Simular la creación de transportistas
        Mock mock = new Mock();
        List<Transportista> transportistas = pedido.verificarCobertura(mock.crearTransportistas());
        if (transportistas.isEmpty()) {
            System.out.println("La lista está vacía");
        }
        else {
            for (Transportista trans : transportistas) {
                List<Attachment> attachments = new ArrayList<>();

                if (fotos != null && fotos.length > 0) {
                    for (MultipartFile foto : fotos) {
                        byte[] attachmentData = foto.getBytes();
                        String attachmentName = foto.getOriginalFilename();
                        attachments.add(new Attachment(attachmentData, attachmentName));
                    }
                }
                mailService.sendMessageWithAttachments(
                        trans.getEmail(),
                        "Nuevo Pedido en tu Área de Cobertura",
                        "Se ha publicado un nuevo pedido en tu área de cobertura: " + pedido.toStringMail(),
                        attachments
                );
            }
        }

        // Preparar la respuesta
        Map<String, Object> response = new HashMap<>();
        response.put("success", true);
        response.put("pedido", pedido);
        response.put("transportistas", transportistas);

        // Simulamos una respuesta exitosa con el campo success
        return ResponseEntity.status(201).body(response);
    }
}
