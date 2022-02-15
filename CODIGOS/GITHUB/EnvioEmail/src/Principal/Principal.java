package Principal;

import model.Usuario;
import padroes.EmailService;
import padroes.SenderMail;


public class Principal {

  private static EmailService emailService() {
      return new SenderMail("noreply@ufj.edu.br", "CADASTRO", "15:15:30");
  }
    
    public static void main(String[] args) {
       Usuario usuario = new Usuario("Marcos Wagner", "marcos@email.com");
       new CreateUser(usuario, emailService());
    }
    
}
