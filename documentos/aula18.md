# Aula 18 - Programação Orientada a Objetos

> Aula 06/10/2022
> 
>  * Orientação a Objetos - Ambiente Gráfico *

## Atividades da aula - roteiro
- Abstração
- Classes
- Objetos
- Herança
- Módulos
- Componentes Gráficos (Uso do Pacote Gráfico (graphics))
- Threads

## Exemplo de Aplicação 
![Captura de Tela 2021-11-25 às 15 00 54](https://user-images.githubusercontent.com/81576640/143485945-9d10a8a8-3dfd-438d-81d5-6bfefde76b1d.png)
![Captura de Tela 2021-11-25 às 14 59 51](https://user-images.githubusercontent.com/81576640/143485946-060cc4ee-7e7c-4c59-968e-bc5e5c2ab0ec.png)




### Conteúdo
- [Conceitos de Programação Orientada a Objetos](Conteudo_POO.pdf)


### Passo 1: Aplicação Gráfica PGráfico2 e PGráfico3
- [x]  Criando o primeiro projeto - Gráfico2
- [ ]  Criando um pequeno relógio digital
    - [ ]  Conhecendo Threads
    - [ ]  Explorando a interface Runnable
    - [ ]  Conhecendo o método start (Thread().start())
    - [ ]  Conhecendo o método run
- [ ]  Criando uma aplicação animada e interativa
  - [ ] Criando os atributos Forma, Cor, Posição e Direção
  - [ ] Criando um método para movimentação
  - [ ] Usando Threads
- [x]  Enviar para o GitHub (PGrafico2 e PGrafico3) 


[![Aulas no Youtube](https://github.com/marcoswagner-commits/gestao_obras_aula_daw/blob/cb3e2ea9547f9ddc831277f07919c3e78451eb92/yt-icon.png)](https://www.youtube.com/channel/UCfO-aJxKLqau0TnL0AfNAvA)

####  Os vídeos abaixo mostram a implementação do programa

🥇:[![material complementar aula18](Capa_Videos_POO.png)](https://www.youtube.com/watch?v=t5qBmiVU2Ho)
-
🥈:[![material complementar aula18](Capa_Videos_POO.png)](https://www.youtube.com/watch?v=2FiSekBqPXw)

```

package graphics;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

public class Janela extends JFrame implements KeyListener {

    Grafico grafico = new Grafico(0);
    
    public Janela() {
        
        
        this.add(grafico);
                
        this.addKeyListener(this);
        
        this.setTitle("Primeiros gráficos");
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT)
            grafico.setDir(1);
        if (e.getKeyCode() == KeyEvent.VK_RIGHT)
            grafico.setDir(0);
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
}

====

package graphics;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JOptionPane;


public class Grafico extends JComponent implements Runnable {

    private int px, py;
    private int dir;
    
    
    public Grafico(int dir) {
        new Thread(this).start();
        px = 200; py = 200;
        this.dir = dir;
       
    }
    
    public void setDir(int dir) {
        this.dir = dir;
    }
    
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(px, py, 40, 40);
        
        
    }

    @Override
    public void run() {
        while (true) {
            if (dir == 0)
                 {   px+=1;
                     if (px+45 > 400)
                       {
                           JOptionPane.showMessageDialog(null, "Você perdeu!");
                            dir = 1;
                        }
                  }
            else
                { 
                   px-=1;
                   if (px < 5)
                   { 
                      JOptionPane.showMessageDialog(null, "Você perdeu!");
                      dir = 1;
                    }
                }
                
            try {
                Thread.sleep(5);
            } catch (InterruptedException ex) {
                
            }
            repaint();
        }
    }
    
    
}

``


