package com.us.pedido;import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.util.ByteArrayDataSource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomMailSender {

    private final JavaMailSender mailSender;

    public CustomMailSender(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void sendSimpleMessage(String to, String subject, String text)
            throws MessagingException {
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        helper.setTo(to);
        helper.setSubject(subject);
        helper.setText(text);
        mailSender.send(message);
    }

    public void sendMessageWithAttachments(String to, String subject, String text, List<Attachment> attachments) throws MessagingException {
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true); // true = multipart
        helper.setTo(to);
        helper.setSubject(subject);
        helper.setText(text);

        // Añadir archivos adjuntos
        if (attachments != null) {
            for (Attachment attachment : attachments) {
                ByteArrayDataSource dataSource = new ByteArrayDataSource(attachment.getData(), "application/octet-stream");
                helper.addAttachment(attachment.getName(), dataSource);
            }
        }

        mailSender.send(message);
    }
}
