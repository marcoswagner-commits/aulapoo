/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padroes;

/**
 *
 * @author marcos_wagner
 */
public class SenderMail  extends AbstractEmailService {

    public SenderMail(String sender, String subject, String momento) {
        super(sender, subject, momento);
    }

    @Override
    public void sendEmail(String msg) {
        System.out.println("Simulando o envio de email");
        System.out.println(msg);
        System.out.println("Email enviado...");
        
    }
    
}
