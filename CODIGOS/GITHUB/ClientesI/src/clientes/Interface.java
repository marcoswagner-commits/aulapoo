package clientes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marcos_wagner
 */
public class Interface extends JFrame implements ActionListener
{
    
    private JPanel pnDados, pnBotoes;
    private JLabel lbCodigo, lbNome;
    private JTextField tfCodigo, tfNome;
    private JButton btNovo, btInserir, btMostrar, btSair, btAnt, btPro;
    private Container tela;
    private Cadastro cliente;
    private JStatusBar statusBar;
    
    private List<Cadastro> clientes = new ArrayList<Cadastro>();
    private ListIterator<Cadastro> moveReg;
   
    
    
    Interface() throws IOException
    {
        //criação do container 
        tela = this.getContentPane();
        tela.setLayout(new BorderLayout());
        
        // configura paineis
        pnDados = new JPanel();
        pnBotoes = new JPanel();
        statusBar = new JStatusBar();
        tela.add(pnDados,BorderLayout.CENTER);
        tela.add(pnBotoes,BorderLayout.NORTH);
        tela.add(statusBar,BorderLayout.SOUTH);
        pnDados.setBackground(Color.cyan);
        pnBotoes.setBackground(Color.gray);
        
        // configurando componentes
         lbCodigo = new JLabel("Código do Cliente:");
         lbNome = new JLabel("Nome do Cliente:");
         tfCodigo = new JTextField(10);
         tfNome = new JTextField(30);
         btNovo = new JButton("NOVO");
         btInserir = new JButton("INSERIR");
         btMostrar = new JButton("MOSTRAR");
         btSair = new JButton("SAIR");
         btAnt = new JButton("<<<<");
         btPro = new JButton(">>>>");
         
         tfCodigo.setEditable(false);
         
         // adição dos componentes
         pnDados.setLayout(new GridLayout(2,2));
         pnDados.add(lbCodigo); pnDados.add(tfCodigo);
         pnDados.add(lbNome); pnDados.add(tfNome);
         
         pnBotoes.setLayout(new GridLayout(1,6));
         pnBotoes.add(btNovo); pnBotoes.add(btInserir); 
         pnBotoes.add(btAnt); pnBotoes.add(btPro);
         pnBotoes.add(btMostrar); pnBotoes.add(btSair);
         
         pnDados.setVisible(false);
         btInserir.setEnabled(false);
         btAnt.setEnabled(false);
         btPro.setEnabled(false);
                     
         //eventos dos botões
         btSair.addActionListener(this);
         btNovo.addActionListener(this);
         btInserir.addActionListener(this);
         btMostrar.addActionListener(this);
         btAnt.addActionListener(this);
         btPro.addActionListener(this);
        
        
         
        try {
            buscaArquivo();
        } catch (Exception e) {
            System.out.println("Erro ao ler os arquivos");
        }
         
        
        this.setTitle("Cadastro de Clientes");
        this.setSize(400,100);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        
    }
    
    private void inserirClientes()
    {
        clientes.add(cliente);
        moveReg = clientes.listIterator();
        ultimoClientes();
    }
    
    private void ultimoClientes()
    {
        for(;moveReg.hasNext();moveReg.next());
    }
    
    private void mostrarClientes()
    {
       clientes.forEach(item-> JOptionPane.showMessageDialog(null, item));
              
    }
    
    private void mostraClientesTela()
    {
        tfCodigo.setText(Integer.toString(clientes.get(moveReg.nextIndex() -1).getCodigo()));
        tfNome.setText(clientes.get(moveReg.nextIndex() - 1).getNome());
    }
    
    private void anteriorClientes()
    {
        if (moveReg.hasPrevious())
            moveReg.previous();
        mostraClientesTela();
        
       
    }
  
    private void proximoClientes()
    {
        if (moveReg.hasNext())
           moveReg.next();
        mostraClientesTela();
        
       
    }
    
    private void mostraStatus(String msg)
    {
        try {
            Thread.sleep(3000);
            statusBar.setText("Funcionando...");
        } catch (InterruptedException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
     private void buscaArquivo() throws IOException, ClassNotFoundException 
    {
          
        int count = 0;
        FileInputStream arquivo = new FileInputStream("clientes.txt");
        ObjectInputStream objeto = new ObjectInputStream(arquivo);
         try {
             clientes.clear();
             while(true){
                 cliente = (Cadastro) objeto.readObject();
                 inserirClientes();
                 Cadastro.codigoStatic = cliente.getCodigo()+1;
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Erro...");
        }
                   
    }
    
    private void gravaArquivo() throws IOException
    {
        
        FileOutputStream arquivo = new FileOutputStream("clientes.txt");
        ObjectOutputStream objeto = new ObjectOutputStream(arquivo);
        for(Cadastro cliente : clientes)
                objeto.writeObject(cliente);
        objeto.flush();
              
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == btSair) {
            try {
                gravaArquivo();
            } catch (IOException ex) {
                System.out.println("Erro ao gravar "+ex.getMessage());
                
            }
            System.exit(0);
        }
                    
        
        if (e.getSource() == btNovo)
        {
            pnDados.setVisible(true);
            btInserir.setEnabled(true);
            btAnt.setEnabled(true);
            btPro.setEnabled(true);
            
            tfCodigo.setText("");
            tfNome.setText("");
            
            statusBar.setText("");
            tfNome.setFocusable(true);
        }
        
        if (e.getSource() == btInserir)
            {
            
               cliente = new Cadastro(tfNome.getText());
               tfCodigo.setText(Integer.toString(cliente.getCodigo()));
               statusBar.setText("Cadastro efetuado com sucesso...");
               inserirClientes();
            }
        
        if (e.getSource() == btMostrar) 
        {
            mostrarClientes();
        }
        
        if (e.getSource() == btAnt)
        {
            anteriorClientes();
        }
         
         if (e.getSource() == btPro)
        {
            proximoClientes();
        }
        
        
    }

    
    
    
}
