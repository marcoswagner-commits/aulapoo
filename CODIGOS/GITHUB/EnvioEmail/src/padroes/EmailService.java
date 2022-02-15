/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padroes;

import model.Usuario;

/**
 *
 * @author marcos_wagner
 */
public interface EmailService {
    
        void confirmationEmail(Usuario obj);
        
        void sendEmail(String msg);
}
