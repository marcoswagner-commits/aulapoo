package Principal;

import model.Usuario;
import padroes.EmailService;

/**
 *
 * @author marcos_wagner
 */
public class CreateUser {
    
    private Usuario usuario;
    private EmailService emailService;

    public CreateUser(Usuario usuario, EmailService emailService) {
        this.usuario = usuario;
        this.emailService = emailService;
        enviaEmail();
    }

    private void enviaEmail() {
        emailService.confirmationEmail(usuario);
    }

    // getters e setters
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public EmailService getEmailService() {
        return emailService;
    }

    public void setEmailService(EmailService emailService) {
        this.emailService = emailService;
    }
    
    
}
