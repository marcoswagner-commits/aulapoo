/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conclientes;

import dao.ClientesJpaController;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Clientes;

/**
 *
 * @author marcos_wagner
 */
public class ConClientes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Clientes cliente = new Clientes();
        cliente.setNome("Bruna");
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ConClientesPU");
        ClientesJpaController daocliente = new ClientesJpaController(emf);
        
        try {
             daocliente.create(cliente);
             System.out.println("Cliente Cadastrado!");
        } catch (Exception e) {
            System.out.println("Cliente não cadastrado! "+ e.getMessage());
        }
        
        
        
    }
    
}
