package in.gilsondev.cdiproject.services;

public class MailServiceImpl implements MailService {
    @Override
    public void enviar(String de, String para, String texto) {
        System.out.println("Enviando email...");
    }
}
