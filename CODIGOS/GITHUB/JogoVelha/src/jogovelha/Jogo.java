/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogovelha;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author marcos_wagner
 */
public class Jogo extends JFrame implements ActionListener, Runnable
{
    
    //atributos do jogo
    private Jogador jogador1;
    private Jogador jogador2;
    private LogicaJogo logica;
    
    private ImageIcon icon;
    
    private final String caminho1 = "./src/imgs/o_jv.png";
    private final String caminho2 = "./src/imgs/x_jv.png";
    
    // componentes gráficos
    private JRadioButton rbHumanoJ1, rbMaquinaJ1,rbHumanoJ2, rbMaquinaJ2;
    private ButtonGroup gbJogador1, gbJogador2;
    private JPanel painelJogador1, painelJogador2, 
                          painelDados, painelDesenho, painelBotoes;
    private JLabel lbBarraT, lbBarraS;
    private JButton btIniciar;
    private JButton[] bts;

    
    public Jogo()
    {
       
         
        // componentes gráficos - instâncias
        this.setLayout(new BorderLayout());
        
        painelDados = new JPanel(new GridLayout(3,1));
        painelBotoes = new JPanel(new GridLayout(3,3));
        painelDesenho = new JPanel(new BorderLayout());
        
        bts = new JButton[9];
        for (int i=0;i<9;i++) bts[i] = new JButton();
        for (int i=0;i<9;i++) painelBotoes.add(bts[i]);
        
        lbBarraT = new JLabel("Jogador ==>"); 
        lbBarraS = new JLabel("Jogada ==>");
        
        painelDesenho.add(lbBarraT,BorderLayout.NORTH);
        painelDesenho.add(lbBarraS,BorderLayout.SOUTH);
        painelDesenho.add(painelBotoes,BorderLayout.CENTER);
                     
        painelJogador1 = new JPanel();
        painelJogador1.setBorder(BorderFactory.createTitledBorder("Jogador 1"));
        painelJogador2 = new JPanel();
        painelJogador2.setBorder(BorderFactory.createTitledBorder("Jogador 2"));
        
        gbJogador1 = new ButtonGroup();
        gbJogador2 = new ButtonGroup();
        
        rbHumanoJ1 = new JRadioButton("Humano",true);
        rbHumanoJ2 = new JRadioButton("Humano");
        rbMaquinaJ1 = new JRadioButton("Máquina");
        rbMaquinaJ2 = new JRadioButton("Máquina",true);
        
        gbJogador1.add(rbHumanoJ1);
        gbJogador1.add(rbMaquinaJ1);
        gbJogador2.add(rbHumanoJ2);
        gbJogador2.add(rbMaquinaJ2);
        
        btIniciar = new JButton("INICIAR");
        
        //organizando os botões de escolha
        painelJogador1.add(rbHumanoJ1);
        painelJogador1.add(rbMaquinaJ1);
        
        painelJogador2.add(rbHumanoJ2);
        painelJogador2.add(rbMaquinaJ2);
        
        painelDados.add(painelJogador1); 
        painelDados.add(painelJogador2);
        painelDados.add(btIniciar);
        
           
        this.add(painelDados,BorderLayout.WEST);
        this.add(painelDesenho,BorderLayout.EAST);
        
        btIniciar.addActionListener(this);
       
        
        for (int i=0;i<9;i++) bts[i].addActionListener(this);
        
        // organizando a janela
        this.setTitle("Jogo da Velha");
        this.setSize(500,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
              
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == btIniciar) {
            iniciarJogadores();
            logica = new LogicaJogo(jogador1, jogador2);
            btIniciar.setText("REINICIAR");
            new Thread(this).start();
         }
        
   
        
        for (int i=0;i<9;i++) 
            if (e.getSource() == bts[i]) {
                if (logica == null) 
                    JOptionPane.showMessageDialog(this, "Clique em INICIAR para começar o jogo!");
                else if (!logica.isIniciado())
                    JOptionPane.showMessageDialog(this, "Clique em REINICIAR para recomeçar o jogo!");
                else {
                    if (bts[i].getIcon() == null) {
                        logica.geraRodada(i);
                        
                    }
                }
            }
    }
    
     public void iniciarJogadores(){
                         
        if (rbHumanoJ1.isSelected()) {
            this.jogador1 = new Humano(1);
            lbBarraT.setText("Jogadores: Humano x ");
            
        }
        else {
            this.jogador1 = new Computador(1);
            lbBarraT.setText("Jogadores: Máquina x ");
        }
        
        if (rbHumanoJ2.isSelected()) {
            this.jogador2 = new Humano(2);
            lbBarraT.setText(lbBarraT.getText() + "Humano");
        }
        else {
            this.jogador2 = new Computador(2);
            lbBarraT.setText(lbBarraT.getText() + "Máquina");
        }
                    
    }

    
    public void reiniciaBotoes()
    {
        for (int i=0; i<9; i++) bts[i].setIcon(null);
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(1000);
                lbBarraS.setText("Rodada: "+ logica.getRodadaJogo());
                for (int i=0;i<9;i++) 
                    if (logica.getTabuleiro().tabSimbolo[i] == 0) {
                        icon = new ImageIcon(caminho1);
                        bts[i].setIcon(icon);
                    }
                    else if (logica.getTabuleiro().tabSimbolo[i] == 1) {
                        icon = new ImageIcon(caminho2);
                        bts[i].setIcon(icon); }
                    else
                        bts[i].setIcon(null);
                    
                    
                    
            } catch (InterruptedException ex) {
                Logger.getLogger(Jogo.class.getName()).log(Level.SEVERE, null, ex);
            }
                  
        }
         
    }
    
   
   
}
