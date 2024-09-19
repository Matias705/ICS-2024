document.addEventListener('DOMContentLoaded', function () {
    // Inicialización de provincias
    const provincias = ['Buenos Aires', 'CABA', 'Catamarca', 'Chaco', 'Chubut', 'Córdoba', 'Corrientes', 'Entre Ríos',
        'Formosa', 'Jujuy', 'La Pampa', 'La Rioja', 'Mendoza', 'Misiones', 'Neuquén', 'Río Negro', 'Salta', 'San Juan',
        'San Luis', 'Santa Cruz', 'Santa Fe', 'Santiago del Estero', 'Tierra del Fuego', 'Tucumán'];

    const retiroProvinciaSelect = document.getElementById('domicilioRetiroProvincia');
    const entregaProvinciaSelect = document.getElementById('domicilioEntregaProvincia');

    // Inicializar provincias para ambos select
    provincias.forEach(function (provincia) {
        const optionRetiro = document.createElement('option');
        optionRetiro.value = provincia;
        optionRetiro.textContent = provincia;
        retiroProvinciaSelect.appendChild(optionRetiro);

        const optionEntrega = document.createElement('option');
        optionEntrega.value = provincia;
        optionEntrega.textContent = provincia;
        entregaProvinciaSelect.appendChild(optionEntrega);
    });

    const fechaRetiroInput = document.getElementById('fechaRetiro');
    const hoy = new Date();
    const unMesDesdeHoy = new Date(hoy);
    unMesDesdeHoy.setMonth(hoy.getMonth() + 1);
    const hoyFormato = hoy.toISOString().split('T')[0];
    const unMesDesdeHoyFormato = unMesDesdeHoy.toISOString().split('T')[0];
    fechaRetiroInput.setAttribute('min', hoyFormato);
    fechaRetiroInput.setAttribute('max', unMesDesdeHoyFormato);

    document.getElementById('pedidoForm').addEventListener('submit', function (event) {
        event.preventDefault();
        const tipoCarga = document.getElementById('tipoCarga').value;
        const domicilioRetiro = {
            provincia: document.getElementById('domicilioRetiroProvincia').value,
            localidad: document.getElementById('domicilioRetiroLocalidad').value,
            calle: document.getElementById('domicilioRetiroCalle').value,
            numero: document.getElementById('domicilioRetiroNumero').value,
            otros: document.getElementById('domicilioRetiroOtros').value
        };
        const fechaRetiro = new Date(document.getElementById('fechaRetiro').value);
        const domicilioEntrega = {
            provincia: document.getElementById('domicilioEntregaProvincia').value,
            localidad: document.getElementById('domicilioEntregaLocalidad').value,
            calle: document.getElementById('domicilioEntregaCalle').value,
            numero: document.getElementById('domicilioEntregaNumero').value,
            otros: document.getElementById('domicilioEntregaOtros').value
        };
        const fechaEntrega = new Date(document.getElementById('fechaEntrega').value);

        //Este es el arreglo para que tome el dia de hoy
        const hoy = new Date();
        // Restar un día
        hoy.setDate(hoy.getDate() - 1);
        // Establecer la hora a 23:59:59
        hoy.setHours(20, 50, 59, 999);

        if (fechaRetiro < hoy) {
            document.getElementById('error').classList.remove('d-none');
            document.getElementById('error').innerText = 'Error: La fecha de retiro no puede ser anterior a hoy.';
            return;
        }

        if (fechaEntrega < fechaRetiro) {
            document.getElementById('error').classList.remove('d-none');
            document.getElementById('error').innerText = 'Error: La fecha de entrega no puede ser anterior a la fecha de retiro.';
            return;
        }

        const diezDias = 10 * 24 * 60 * 60 * 1000;
        if (fechaEntrega > new Date(fechaRetiro.getTime() + diezDias)) {
            document.getElementById('error').classList.remove('d-none');
            document.getElementById('error').innerText = 'Error: La fecha de entrega debe ser dentro de los 10 días posteriores a la fecha de retiro.';
            return;
        }

        document.getElementById('error').classList.add('d-none');

        const formData = new FormData();
        formData.append('tipoCarga', tipoCarga);
        formData.append('domicilioRetiroProvincia', domicilioRetiro.provincia);
        formData.append('domicilioRetiroLocalidad', domicilioRetiro.localidad);
        formData.append('domicilioRetiroCalle', domicilioRetiro.calle);
        formData.append('domicilioRetiroNumero', domicilioRetiro.numero);
        formData.append('domicilioRetiroOtros', domicilioRetiro.otros);
        formData.append('fechaRetiro', fechaRetiro.toISOString().split('T')[0]);
        formData.append('domicilioEntregaProvincia', domicilioEntrega.provincia);
        formData.append('domicilioEntregaLocalidad', domicilioEntrega.localidad);
        formData.append('domicilioEntregaCalle', domicilioEntrega.calle);
        formData.append('domicilioEntregaNumero', domicilioEntrega.numero);
        formData.append('domicilioEntregaOtros', domicilioEntrega.otros);
        formData.append('fechaEntrega', fechaEntrega.toISOString().split('T')[0]);

        const fotosInput = document.getElementById('fotos');
        if (fotosInput.files.length > 0) {
            Array.from(fotosInput.files).forEach(file => {
                // Asegurarse de que solo se envíen archivos JPG y PNG
                if (file.type === 'image/jpeg' || file.type === 'image/png') {
                    formData.append('fotos', file);
                } else {
                    document.getElementById('error').classList.remove('d-none');
                    document.getElementById('error').innerText = 'Error: Solo se permiten archivos en formato JPG o PNG.';
                    return;
                }
            });
        }

        fetch('/api/pedidos', {
            method: 'POST',
            body: formData
        })
            .then(response => response.json())
            .then(data => {
                if (data.success
                    && document.getElementById('error').innerText !== 'Error: La fecha de retiro no puede ser anterior a hoy.'
                    && document.getElementById('error').innerText !== 'Error: La fecha de entrega no puede ser anterior a la fecha de retiro.'
                    && document.getElementById('error').innerText !== 'Error: La fecha de entrega debe ser dentro de los 10 días posteriores a la fecha de retiro.'
                    && document.getElementById('error').innerText !== 'Error: Solo se permiten archivos en formato JPG o PNG.') {

                    // Mostrar la notificación
                    const notificacion = document.getElementById('notificacion');
                    notificacion.classList.remove('d-none');

                    setTimeout(function () {
                        notificacion.classList.add('d-none');

                        if (data.transportistas && data.transportistas.length > 0) {
                            // Almacenar transportistas en localStorage para la nueva pestaña
                            localStorage.setItem('transportistas', JSON.stringify(data.transportistas));

                            // Cualquiera de las dos deberia funcionar, si alguno no le anda pruebe con la otra. Besos.
                            //window.open('/static/mensajeTransportista.html', '_blank');
                            window.open('http://localhost:63342/pedido/static/mensajeTransportista.html', '_blank');
                        } else {
                            // Si no hay transportistas, mostrar un mensaje o realizar otra acción
                            console.log('No se encontraron transportistas para este pedido.');
                        }
                    }, 7000);

                    document.getElementById('pedidoForm').reset();

                } else {
                    document.getElementById('error').classList.remove('d-none');
                    document.getElementById('error').innerText = 'Hubo un error al enviar el pedido. Por favor, intente nuevamente.';
                }
            })
            .catch(() => {
                document.getElementById('error').classList.remove('d-none');
                document.getElementById('error').innerText = 'Hubo un error al enviar el pedido. Por favor, intente nuevamente.';
            });
    });
});