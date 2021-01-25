package in.gilsondev.cdiproject.managedbeans;

import in.gilsondev.cdiproject.pojos.Usuario;
import in.gilsondev.cdiproject.services.MailService;

import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@RequestScoped
@Named
public class Mail {
    @Inject
    private MailService mailService;

    @Inject
    private Usuario usuario;

    private String mensagem;

    private String destinatario;

    public String enviarEmail() {
        mailService.enviar(usuario.getEmail(), "fulano@mail.com", "Teste");
        return "enviada";
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
}
