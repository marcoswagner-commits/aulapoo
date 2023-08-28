# Aula 19 - Programação Orientada a Objetos

> Aula 11/10/2022
> 
>  * Orientação a Objetos - Ambiente Gráfico - Jogo da Velha*

## Atividades da aula - roteiro
- Abstração
- Classes
- Objetos
- Herança
- Módulos
- Componentes Gráficos (Uso do Pacote Gráfico (graphics))
- Threads

## Exemplo de Aplicação 
![Captura de Tela 2021-11-25 às 15 33 10](https://user-images.githubusercontent.com/81576640/143488695-1fe16759-ebd0-493a-a5f7-2281b0b41499.png)



### Conteúdo
- [Conceitos de Programação Orientada a Objetos](Conteudo_POO.pdf)


### Passo 1: Aplicação Gráfica Jogo da Velha
- [x]  Criando o projeto JogoVelha

- [x]  Enviar para o GitHub (Jogo da Velha) 


[![Aulas no Youtube](https://github.com/marcoswagner-commits/gestao_obras_aula_daw/blob/cb3e2ea9547f9ddc831277f07919c3e78451eb92/yt-icon.png)](https://www.youtube.com/channel/UCfO-aJxKLqau0TnL0AfNAvA)

####  Os vídeos abaixo mostram a implementação do programa

🥇:[![material complementar aula19](Capa_Videos_POO.png)](https://www.youtube.com/watch?v=jI96qfhA5ZA)
-
🥇:[![material complementar aula19](Capa_Videos_POO.png)](https://www.youtube.com/watch?v=ViyZSVQHkP8)
-
🥇:[![material complementar aula19](Capa_Videos_POO.png)](https://www.youtube.com/watch?v=8VTcba0gU3E)


### Passo 2: Roteiro de um MineCraft 2D
- [x] Criar uma estrutura de painéis (size 400 - cols 20 - rows - 20)
- [x] Criar caminhos para as imagens (avatar = "./src/imgs/avatar.png") - grama, terra, tijolo, flores
- [x] Criar uma classe MyPanel para colocar e desenhar o painel com atributo (ImageIcon)
    - g.drawImage(icon.getImage(),0,0,this.getWidth(),this.getHeight(),null);
- [x] Criar um vetor de inteiros para armazenar a tipo de bloco (int[] tipoBloco)
- [x] Associar os caminhos das imagens a ImageIcon
- [x] Criar uma variável para armazenar a posição do avatar (posAv)
- [ ] CONSTRUTOR
- [x] Layout da Janela (rows e cols)
- [x] Instanciar as imagens
- [x] Instanciar o tipoBloco (new int[size))
- [x] Instanciar o vetor de painéis e os respectivos painéis (new MyPanel[size]) e (panels[i] = new JPanel(icon))
- [x] Iniciar a posição do avatar em 0
- [x] Desenhar a posição do avatar em 0 (panels[posAv].setIcon(iconAv))
- [x] Adicionar um listener de teclado
- [x] Configurar janela (título - tamanho{ExtendState} - defaultclose - visible)
- [x] Teclas - vide código abaixo
- [x] MyPanel - vide código abaixo

```

package mycraft;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
    
    //atributos
    private ImageIcon icon;

    public MyPanel(ImageIcon icon) {
        this.icon = icon;
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
        repaint();
    }
    
    @Override
    public void paint(Graphics g) {
        g.drawImage(icon.getImage(),0,0,this.getWidth(),this.getHeight(),null);
    }
    
}

```

```
 private ImageIcon getIcon(int tipo) {
        switch(tipoBloco[tipo]) {
            case 1:
                return blc1;
            case 2:
                return blc2;
            case 3:
                return blc3;
            case 4:
                return blc4;
            default:
                return fundo;
                
        }
    }
@Override
    public void keyPressed(KeyEvent key) {
        
        // movimentações
        if (key.getKeyCode() == KeyEvent.VK_RIGHT) {
            panels[posAv].setIcon(getIcon(posAv));
            posAv++;
            if (posAv > size-1) posAv = 0;
            panels[posAv].setIcon(iconAv);
        }
        
        if (key.getKeyCode() == KeyEvent.VK_LEFT) {
            panels[posAv].setIcon(getIcon(posAv));
            posAv--;
            if (posAv < 0) posAv = size-1;
            panels[posAv].setIcon(iconAv);
        }
         
         if (key.getKeyCode() == KeyEvent.VK_DOWN) {
            panels[posAv].setIcon(getIcon(posAv));
            posAv+=20;
            if (posAv > 399) posAv = posAv - 399;
            panels[posAv].setIcon(iconAv);
        }
        
         if (key.getKeyCode() == KeyEvent.VK_UP) {
            panels[posAv].setIcon(getIcon(posAv));
            posAv-=20;
            if (posAv < 0) posAv = 399 - (Math.abs(posAv));
            panels[posAv].setIcon(iconAv);
        }
        
        // construções
        if (key.getKeyCode() == KeyEvent.VK_1) {
            panels[posAv].setIcon(icon1);
            tipoBloco[posAv] = 1;
            key.setKeyCode(KeyEvent.VK_RIGHT);
            keyPressed(key);
        }
        
        if (key.getKeyCode() == KeyEvent.VK_2) {
            panels[posAv].setIcon(icon2);
            tipoBloco[posAv] = 2;
            key.setKeyCode(KeyEvent.VK_RIGHT);
            keyPressed(key);
        }
       
        if (key.getKeyCode() == KeyEvent.VK_3) {
            panels[posAv].setIcon(icon3);
            tipoBloco[posAv] = 3;
            key.setKeyCode(KeyEvent.VK_RIGHT);
            keyPressed(key);
        }
        
        
        if (key.getKeyCode() == KeyEvent.VK_4) {
            panels[posAv].setIcon(icon4);
            tipoBloco[posAv] = 4;
            key.setKeyCode(KeyEvent.VK_RIGHT);
            keyPressed(key);
        }
        
        if (key.getKeyCode() == KeyEvent.VK_SPACE) {
            panels[posAv].setIcon(icon);
            tipoBloco[posAv] = 0;
            key.setKeyCode(KeyEvent.VK_RIGHT);
            keyPressed(key);
        }
    }
```

![avatar](https://github.com/marcoswagner-commits/aulapoo/assets/81576640/700e82dd-02f0-45a8-a006-ecee03aa0ce0)
![bloco_flor](https://github.com/marcoswagner-commits/aulapoo/assets/81576640/de82410b-f472-45cc-8606-e76ba9811a5e)
![bloco_madeira](https://github.com/marcoswagner-commits/aulapoo/assets/81576640/6f6e2bbe-2604-4574-a673-24b6376c95b7)
![bloco_terra](https://github.com/marcoswagner-commits/aulapoo/assets/81576640/ec235233-567e-4c72-92dc-ab15d5360fc5)
![bloco_verde](https://github.com/marcoswagner-commits/aulapoo/assets/81576640/95d3a12d-6e35-4874-a535-ec0fc0442fc2)
![fundo_azul](https://github.com/marcoswagner-commits/aulapoo/assets/81576640/6cc6e435-3021-4db6-9ac4-ff5c8dafbb07)


