
import java.awt.event.*;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author netti
 */
public class MyKeyListener implements KeyListener {

    private Timer timer;
    int lvCorrente = 2;
    KeyEvent x;
    Livello0 f0;
    Livello1 f1;
    livello2 f2;
    Livello3 f3;
    int cont=256;
    int tagliabile = 0;
    /*
    public MyKeyListener(Livello0 f0){
        this.f0=f0;
        timer = new Timer(300, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(lvCorrente == 2){
                    if(x.getKeyCode() == KeyEvent.VK_W){
                        ((JLabel)f0.al.get(cont)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV2-49x49.png"))); // NOI18N  
                        System.out.println("w");
                        ((JLabel)f0.al.get(cont-25)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/taglia erba.jpg"))); // NOI18N  
                        cont=cont-25;
                    }
                    if(x.getKeyCode() == KeyEvent.VK_A){
                        ((JLabel)f0.al.get(cont)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV2-49x49.png"))); // NOI18N  
                        System.out.println("a");
                        ((JLabel)f0.al.get(cont-1)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/taglia erba.jpg"))); // NOI18N  
                        cont=cont-1;
                    }
                    if(x.getKeyCode() == KeyEvent.VK_D){
                        ((JLabel)f0.al.get(cont)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV2-49x49.png"))); // NOI18N  
                        System.out.println("d");
                        ((JLabel)f0.al.get(cont+1)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/taglia erba.jpg"))); // NOI18N  
                        cont=cont+1;
                    }
                    if(x.getKeyCode() == KeyEvent.VK_S){
                        ((JLabel)f0.al.get(cont)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV2-49x49.png"))); // NOI18N  
                        System.out.println("s");
                        ((JLabel)f0.al.get(cont+25)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/taglia erba.jpg"))); // NOI18N  
                        cont=cont+25;
                    }
                }
            }
        });
    }*/
    
    public MyKeyListener(Livello1 f1){
        this.f1=f1;
        timer = new Timer(300, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(lvCorrente == 2){
                    if(x.getKeyCode() == KeyEvent.VK_W){
                        ((JLabel)f1.al.get(cont)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV2-49x49.png"))); // NOI18N  
                        System.out.println("w");
                        ((JLabel)f1.al.get(cont-25)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/taglia erba.jpg"))); // NOI18N  
                        cont=cont-25;
                    }
                    if(x.getKeyCode() == KeyEvent.VK_A){
                        ((JLabel)f1.al.get(cont)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV2-49x49.png"))); // NOI18N  
                        System.out.println("a");
                        ((JLabel)f1.al.get(cont-1)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/taglia erba.jpg"))); // NOI18N  
                        cont=cont-1;
                    }
                    if(x.getKeyCode() == KeyEvent.VK_D){
                        ((JLabel)f1.al.get(cont)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV2-49x49.png"))); // NOI18N  
                        System.out.println("d");
                        ((JLabel)f1.al.get(cont+1)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/taglia erba.jpg"))); // NOI18N  
                        cont=cont+1;
                    }
                    if(x.getKeyCode() == KeyEvent.VK_S){
                        ((JLabel)f1.al.get(cont)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV2-49x49.png"))); // NOI18N  
                        System.out.println("s");
                        ((JLabel)f1.al.get(cont+25)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/taglia erba.jpg"))); // NOI18N  
                        cont=cont+25;
                    }
                }
            }
        });
    }
    
    public MyKeyListener(livello2 f2){
        this.f2=f2;
        timer = new Timer(300, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(lvCorrente == 2){
                    if(x.getKeyCode() == KeyEvent.VK_W){
                        tagliabile = controllaCasellaLV2(f2);
                        if(tagliabile == 0 || tagliabile == 2){
                            ((JLabel)f2.al.get(cont)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV2-49x49.png"))); // NOI18N  
                            ((JLabel)f2.al.get(cont-25)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/taglia erba.jpg"))); // NOI18N  
                            cont=cont-25;
                        }
                    }
                    if(x.getKeyCode() == KeyEvent.VK_A){
                        tagliabile = controllaCasellaLV2(f2);
                        if(tagliabile == 0 || tagliabile == 2){
                            ((JLabel)f2.al.get(cont)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV2-49x49.png"))); // NOI18N  
                            ((JLabel)f2.al.get(cont-1)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/taglia erba.jpg"))); // NOI18N  
                            cont=cont-1;
                        }
                    }
                    if(x.getKeyCode() == KeyEvent.VK_D){
                        tagliabile = controllaCasellaLV2(f2);
                        if(tagliabile == 0 || tagliabile == 2){
                            ((JLabel)f2.al.get(cont)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV2-49x49.png"))); // NOI18N  
                            ((JLabel)f2.al.get(cont+1)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/taglia erba.jpg"))); // NOI18N  
                            cont=cont+1;
                        }
                    }
                    if(x.getKeyCode() == KeyEvent.VK_S){
                        tagliabile = controllaCasellaLV2(f2);
                        if(tagliabile == 0 || tagliabile == 2){
                            ((JLabel)f2.al.get(cont)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV2-49x49.png"))); // NOI18N  
                            ((JLabel)f2.al.get(cont+25)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/taglia erba.jpg"))); // NOI18N  
                            cont=cont+25;
                        }
                    }
                }
            }
        });
    }
    
    /*
    public MyKeyListener(Livello3 f3){
        this.f3=f3;
        timer = new Timer(300, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(lvCorrente == 2){
                    if(x.getKeyCode() == KeyEvent.VK_W){
                        ((JLabel)f3.al.get(cont)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV2-49x49.png"))); // NOI18N  
                        System.out.println("w");
                        ((JLabel)f3.al.get(cont-25)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/taglia erba.jpg"))); // NOI18N  
                        cont=cont-25;
                    }
                    if(x.getKeyCode() == KeyEvent.VK_A){
                        ((JLabel)f3.al.get(cont)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV2-49x49.png"))); // NOI18N  
                        System.out.println("a");
                        ((JLabel)f3.al.get(cont-1)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/taglia erba.jpg"))); // NOI18N  
                        cont=cont-1;
                    }
                    if(x.getKeyCode() == KeyEvent.VK_D){
                        ((JLabel)f3.al.get(cont)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV2-49x49.png"))); // NOI18N  
                        System.out.println("d");
                        ((JLabel)f3.al.get(cont+1)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/taglia erba.jpg"))); // NOI18N  
                        cont=cont+1;
                    }
                    if(x.getKeyCode() == KeyEvent.VK_S){
                        ((JLabel)f3.al.get(cont)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV2-49x49.png"))); // NOI18N  
                        System.out.println("s");
                        ((JLabel)f3.al.get(cont+25)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/taglia erba.jpg"))); // NOI18N  
                        cont=cont+25;
                    }
                }
            }
        });
    }*/
    
    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        x = e;
        timer.start();
                
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
        timer.stop();
    }
    
    private int controllaCasellaLV2(livello2 l){       //matrice[verticale][orizzontale]
        int v=0, o=0;
        for(int i=0;i<14;i++){
            for(int j=0;j<25;j++){
                if(l.matrice[i][j] == 3){
                    v=i;
                    o=j;
                    break;
                }
            }
        }
        
        if(x.getKeyCode() == KeyEvent.VK_W){
            System.out.println(v + "e" + o);
            if(l.matrice[v-1][o] == 0){                 //se l'erba è alta
                l.matrice[v-1][o] = 3;
                l.matrice[v][o] = 2;
                return 0;
            }
            if(l.matrice[v-1][o] == 2){              //se è bassa
                l.matrice[v-1][o] = 3;
                l.matrice[v][o] = 2;
                return 2;
            }                                         
             // se c'è un ostacolo
                return 1;
        }
        
        if(x.getKeyCode() == KeyEvent.VK_S){
            System.out.println(v + "e" + o);
            if(l.matrice[v+1][o] == 0){                 //se l'erba è alta
                l.matrice[v+1][o] = 3;
                l.matrice[v][o] = 2; 
                return 0;
            }
            if(l.matrice[v+1][o] == 2){              //se è bassa
                l.matrice[v+1][o] = 3;
                l.matrice[v][o] = 2;
                return 2;
            }
            // se c'è un ostacolo
                return 1;
        }
        
        if(x.getKeyCode() == KeyEvent.VK_A){
            System.out.println(v + "e" + o);
            if(l.matrice[v][o-1] == 0){                 //se l'erba è alta
                l.matrice[v][o-1] = 3;
                l.matrice[v][o] = 2;
                return 0;
            }
            if(l.matrice[v][o-1] == 2){              //se è bassa
                l.matrice[1][o-1] = 3;
                l.matrice[v][o] = 2;
                return 2;
            }
            // se c'è un ostacolo
                return 1;
        }
        
        if(x.getKeyCode() == KeyEvent.VK_D){
            System.out.println(v + "e" + o);
            if(l.matrice[v][o+1] == 0){                 //se l'erba è alta
                l.matrice[v][o+1] = 3;
                l.matrice[v][o] = 2;
                return 0;
            }
            if(l.matrice[v][o+1] == 2){              //se è bassa
                l.matrice[v][o+1] = 3;
                l.matrice[v][o] = 2;
                return 2;
            }
             // se c'è un ostacolo
                return 1;
        }
        
        return 1;    
    }
    
    
}
