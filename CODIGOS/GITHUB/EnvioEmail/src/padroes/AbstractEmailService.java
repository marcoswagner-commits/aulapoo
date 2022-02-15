
package padroes;

import model.Usuario;

/**
 * Template Method
 * @author marcos_wagner
 */
public abstract class AbstractEmailService implements EmailService {
   
    private String sender;
    private String subject;
    private String momento;

    public AbstractEmailService(String sender, String subject, String momento) {
        this.sender = sender;
        this.subject = subject;
        this.momento = momento;
    }
    
        
    @Override
    public void confirmationEmail(Usuario obj) {
        String simpleMail = prepareMailMessage(obj);
        sendEmail(simpleMail);
    }

    protected String prepareMailMessage(Usuario obj) {
        String sm = new String();
        
        sm = obj.getNome() + " - " + obj.getEmail()  + " - foi cadastrado com sucesso - "+
                this.sender + " - " + this.sender +  " - " + this.momento;
        
        return sm;
    }
}
