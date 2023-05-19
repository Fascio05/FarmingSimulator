
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
    int tagliabile = 0;
    int v=0, o=0;
    
    public MyKeyListener(Livello0 f0){
        this.f0=f0;
        timer = new Timer(170, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    if(x.getKeyCode() == KeyEvent.VK_W){
                        tagliabile = controllaCasellaLV0(f0);
                        if(tagliabile == 0 || tagliabile == 2){
                            ((JLabel)f0.al.get((v*18)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV0-68x68.png"))); 
                            ((JLabel)f0.al.get(((v-1)*18)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/tagliaerbaLV0-68x68.jpg"))); 
                        }
                    } 
                    if(x.getKeyCode() == KeyEvent.VK_A){
                        tagliabile = controllaCasellaLV0(f0);
                        if(tagliabile == 0 || tagliabile == 2){
                            ((JLabel)f0.al.get((v*18)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV0-68x68.png"))); 
                            ((JLabel)f0.al.get((v*18)-1+o)).setIcon(new ImageIcon(getClass().getResource("/immagini/taglia erba 68x68 LV0 sinistra.jpg")));  
                        }
                    }
                    if(x.getKeyCode() == KeyEvent.VK_D){
                        tagliabile = controllaCasellaLV0(f0);
                        if(tagliabile == 0 || tagliabile == 2){
                            ((JLabel)f0.al.get((v*18)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV0-68x68.png"))); 
                            ((JLabel)f0.al.get((v*18)+1+o)).setIcon(new ImageIcon(getClass().getResource("/immagini/taglia erba 68x68 LV0 destra.jpg")));  
                        }
                    }
                    if(x.getKeyCode() == KeyEvent.VK_S){
                        tagliabile = controllaCasellaLV0(f0);
                        if(tagliabile == 0 || tagliabile == 2){
                            ((JLabel)f0.al.get((v*18)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV0-68x68.png"))); 
                            ((JLabel)f0.al.get(((v+1)*18)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini/taglia erba 68x68 LV0 basso.jpg"))); 
                        }
                    }
            }
        });
    }
    
    public MyKeyListener(Livello1 f1){
        this.f1=f1;
        timer = new Timer(170, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    if(x.getKeyCode() == KeyEvent.VK_W){
                        tagliabile = controllaCasellaLV1(f1);
                        if(tagliabile == 0 || tagliabile == 2){
                            ((JLabel)f1.al.get((v*21)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV1-58x58.png"))); 
                            ((JLabel)f1.al.get(((v-1)*21)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/tagliaerbaLV1-58x58.jpg"))); 
                        }
                    }
                    if(x.getKeyCode() == KeyEvent.VK_A){
                        tagliabile = controllaCasellaLV1(f1);
                        if(tagliabile == 0 || tagliabile == 2){
                            ((JLabel)f1.al.get((v*21)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV1-58x58.png"))); 
                            ((JLabel)f1.al.get((v*21)-1+o)).setIcon(new ImageIcon(getClass().getResource("/immagini/taglia erba 58x58 LV1 sinistra.jpg")));  
                        }
                    }
                    if(x.getKeyCode() == KeyEvent.VK_D){
                        tagliabile = controllaCasellaLV1(f1);
                        if(tagliabile == 0 || tagliabile == 2){
                            ((JLabel)f1.al.get((v*21)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV1-58x58.png"))); 
                            ((JLabel)f1.al.get((v*21)+1+o)).setIcon(new ImageIcon(getClass().getResource("/immagini/taglia erba 58x58 LV1 destra.jpg")));  
                        }
                    }
                    if(x.getKeyCode() == KeyEvent.VK_S){
                        tagliabile = controllaCasellaLV1(f1);
                        if(tagliabile == 0 || tagliabile == 2){
                            ((JLabel)f1.al.get((v*21)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV1-58x58.png"))); 
                            ((JLabel)f1.al.get(((v+1)*21)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini/taglia erba 58x58 LV1 basso.jpg"))); 
                        }
                    }
            }
        });
    }
   
    
    public MyKeyListener(livello2 f2){
        this.f2=f2;
        timer = new Timer(170, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(lvCorrente == 2){
                    if(x.getKeyCode() == KeyEvent.VK_W){
                        tagliabile = controllaCasellaLV2(f2);
                        if(tagliabile == 0 || tagliabile == 2){
                            ((JLabel)f2.al.get((v*25)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV2-49x49.png"))); // NOI18N  
                            ((JLabel)f2.al.get(((v-1)*25)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/tagliaerbaLV2-49x49.jpg"))); // NOI18N  
                        }
                    }
                    if(x.getKeyCode() == KeyEvent.VK_A){
                        tagliabile = controllaCasellaLV2(f2);
                        if(tagliabile == 0 || tagliabile == 2){
                            ((JLabel)f2.al.get((v*25)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV2-49x49.png"))); // NOI18N  
                            ((JLabel)f2.al.get((v*25)+o-1)).setIcon(new ImageIcon(getClass().getResource("/immagini/taglia erba 49x49 LV2 sinistra.jpg"))); // NOI18N  
                        }
                    }
                    if(x.getKeyCode() == KeyEvent.VK_D){
                        tagliabile = controllaCasellaLV2(f2);
                        if(tagliabile == 0 || tagliabile == 2){
                            ((JLabel)f2.al.get((v*25)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV2-49x49.png"))); // NOI18N  
                            ((JLabel)f2.al.get((v*25)+o+1)).setIcon(new ImageIcon(getClass().getResource("/immagini/taglia erba 49x49 LV2 desta.jpg"))); // NOI18N  
                        }
                    }
                    if(x.getKeyCode() == KeyEvent.VK_S){
                        tagliabile = controllaCasellaLV2(f2);
                        if(tagliabile == 0 || tagliabile == 2){
                            ((JLabel)f2.al.get((v*25)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV2-49x49.png"))); // NOI18N  
                            ((JLabel)f2.al.get(((v+1)*25)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini/taglia erba 49x49 LV2 basso.jpg"))); // NOI18N  
                        }
                    }
                }
            }
        });
    }
    
    public MyKeyListener(Livello3 f3){
        this.f3=f3;
        timer = new Timer(170, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(lvCorrente == 2){
                    if(x.getKeyCode() == KeyEvent.VK_W){
                        tagliabile = controllaCasellaLV3(f3);
                        if(tagliabile == 0 || tagliabile == 2){
                            ((JLabel)f3.al.get((v*25)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV3-40x40.png"))); // NOI18N  
                            ((JLabel)f3.al.get(((v-1)*25)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/tagliaerbaLV3-40x40.jpg"))); // NOI18N  
                        }
                    }
                    if(x.getKeyCode() == KeyEvent.VK_A){
                        tagliabile = controllaCasellaLV3(f3);
                        if(tagliabile == 0 || tagliabile == 2){
                            ((JLabel)f3.al.get((v*25)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV3-40x40.png"))); // NOI18N  
                            ((JLabel)f3.al.get((v*25)+o-1)).setIcon(new ImageIcon(getClass().getResource("/immagini/taglia erba 40x40 LV3 sinistra.jpg"))); // NOI18N  
                        }
                    }
                    if(x.getKeyCode() == KeyEvent.VK_D){
                        tagliabile = controllaCasellaLV3(f3);
                        if(tagliabile == 0 || tagliabile == 2){
                            ((JLabel)f3.al.get((v*25)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV3-40x40.png"))); // NOI18N  
                            ((JLabel)f3.al.get((v*25)+o+1)).setIcon(new ImageIcon(getClass().getResource("/immagini/taglia erba 40x40 LV3 destra.jpg"))); // NOI18N  
                        }
                    }
                    if(x.getKeyCode() == KeyEvent.VK_S){
                        tagliabile = controllaCasellaLV3(f3);
                        if(tagliabile == 0 || tagliabile == 2){
                            ((JLabel)f3.al.get((v*25)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV3-40x40.png"))); // NOI18N  
                            ((JLabel)f3.al.get(((v+1)*25)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini/taglia erba 40x40 LV3 basso.jpg"))); // NOI18N  
                        }
                    }
                }
            }
        });
    }
    
    
    
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
    
    
    private int controllaCasellaLV0(Livello0 l){       //matrice[verticale][orizzontale]
        for(int i=0;i<10;i++){
            for(int j=0;j<18;j++){
                if(l.matrice[i][j] == 3){
                    v=i;
                    o=j;
                    break;
                }
            }
        }
        
        if(x.getKeyCode() == KeyEvent.VK_W){
            if(v-1<0){
                return 4;
            }
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
            if(v-1<0 || o<0){
                System.out.println("4");
                return 4;
            }
                return 1;
        }
        
        if(x.getKeyCode() == KeyEvent.VK_S){
            if(v+1>9){
                return 4;
            }
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
            if(v+1<0 || o<0){
                System.out.println("4");
                return 4;
            }
                return 1;
        }
        
        if(x.getKeyCode() == KeyEvent.VK_A){
            if(o-1<0){
                return 4;
            }
            if(l.matrice[v][o-1] == 0){                 //se l'erba è alta
                l.matrice[v][o-1] = 3;
                l.matrice[v][o] = 2;
                return 0;
            }
            if(l.matrice[v][o-1] == 2){              //se è bassa
                l.matrice[v][o-1] = 3;
                l.matrice[v][o] = 2;
                return 2;
            }
            // se c'è un ostacolo
            if(v<0 || o-1<0){
                System.out.println("4");
                return 4;
            }
                return 1;
        }
        
        if(x.getKeyCode() == KeyEvent.VK_D){
            if(o+1>17){
                return 4;
            }
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
    
    private int controllaCasellaLV1(Livello1 l){       //matrice[verticale][orizzontale]
        for(int i=0;i<12;i++){
            for(int j=0;j<21;j++){
                if(l.matrice[i][j] == 3){
                    v=i;
                    o=j;
                    break;
                }
            }
        }
        
        if(x.getKeyCode() == KeyEvent.VK_W){
            if(v-1<0){
                return 4;
            }
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
            if(v-1<0 || o<0){
                System.out.println("4");
                return 4;
            }
                return 1;
        }
        
        if(x.getKeyCode() == KeyEvent.VK_S){
            if(v+1>11){
                return 4;
            }
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
            if(o-1<0){
                return 4;
            }
            if(l.matrice[v][o-1] == 0){                 //se l'erba è alta
                l.matrice[v][o-1] = 3;
                l.matrice[v][o] = 2;
                return 0;
            }
            if(l.matrice[v][o-1] == 2){              //se è bassa
                l.matrice[v][o-1] = 3;
                l.matrice[v][o] = 2;
                return 2;
            }
            // se c'è un ostacolo
                return 1;
        }
        
        if(x.getKeyCode() == KeyEvent.VK_D){
            if(o+1>20){
                return 4;
            }
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
    
    private int controllaCasellaLV2(livello2 l){       //matrice[verticale][orizzontale]
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
            if(v-1<0){
                return 4;
            }
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
            if(v+1>13){
                return 4;
            }
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
            if(o-1<0){
                return 4;
            }
            if(l.matrice[v][o-1] == 0){                 //se l'erba è alta
                l.matrice[v][o-1] = 3;
                l.matrice[v][o] = 2;
                return 0;
            }
            if(l.matrice[v][o-1] == 2){              //se è bassa
                l.matrice[v][o-1] = 3;
                l.matrice[v][o] = 2;
                return 2;
            }
            // se c'è un ostacolo
                return 1;
        }
        
        if(x.getKeyCode() == KeyEvent.VK_D){
            if(o+1>24){
                return 4;
            }
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
    
    private int controllaCasellaLV3(Livello3 l){       //matrice[verticale][orizzontale]
        for(int i=0;i<18;i++){
            for(int j=0;j<32;j++){
                if(l.matrice[i][j] == 3){
                    v=i;
                    o=j;
                    break;
                }
            }
        }
        
        if(x.getKeyCode() == KeyEvent.VK_W){
            if(v-1<0){
                return 4;
            }
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
            if(v+1>17){
                return 4;
            }
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
            if(o-1<0){
                return 4;
            }
            if(l.matrice[v][o-1] == 0){                 //se l'erba è alta
                l.matrice[v][o-1] = 3;
                l.matrice[v][o] = 2;
                return 0;
            }
            if(l.matrice[v][o-1] == 2){              //se è bassa
                l.matrice[v][o-1] = 3;
                l.matrice[v][o] = 2;
                return 2;
            }
            // se c'è un ostacolo
            if(v<0 || o-1<0){
                System.out.println("4");
                return 4;
            }
                return 1;
        }
        
        if(x.getKeyCode() == KeyEvent.VK_D){
            if(o+1>31){
                return 4;
            }
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
