
import java.awt.event.*;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
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
    int lvCorrente = 0;
    KeyEvent x;
    Livello0 f0;
    Livello1 f1;
    livello2 f2;
    Livello3 f3;
    int tagliabile = 0;
    int v=0, o=0;
    char collisione = 'n';  //n = no collisione, w = collisione in avanti, ecc...
    AudioInputStream tosaerba;
    Clip clipTosaerba;
    boolean tosaerbaOn = false;
    
    public MyKeyListener(Livello0 f0){
        this.f0=f0;
        lvCorrente = 0;
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
                    controllaFineLV0();
            }
        });
    }
    
    public MyKeyListener(Livello1 f1){
        this.f1=f1;
        lvCorrente = 1;
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
                    controllaFineLV1();
            }
        });
    }
   
    
    public MyKeyListener(livello2 f2){
        this.f2=f2;
        lvCorrente = 2;
        timer = new Timer(170, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
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
                controllaFineLV2();
            }
        });
    }
    
    public MyKeyListener(Livello3 f3){
        this.f3=f3;
        lvCorrente = 3;
        timer = new Timer(170, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    if(x.getKeyCode() == KeyEvent.VK_W){
                        tagliabile = controllaCasellaLV3(f3);
                        if(tagliabile == 0 || tagliabile == 2){
                            ((JLabel)f3.al.get((v*32)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV3-40x40.png"))); // NOI18N  
                            ((JLabel)f3.al.get(((v-1)*32)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/tagliaerbaLV3-40x40.jpg"))); // NOI18N  
                        }
                    }
                    if(x.getKeyCode() == KeyEvent.VK_A){
                        tagliabile = controllaCasellaLV3(f3);
                        if(tagliabile == 0 || tagliabile == 2){
                            ((JLabel)f3.al.get((v*32)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV3-40x40.png"))); // NOI18N  
                            ((JLabel)f3.al.get((v*32)+o-1)).setIcon(new ImageIcon(getClass().getResource("/immagini/taglia erba 40x40 LV3 sinistra.jpg"))); // NOI18N  
                        }
                    }
                    if(x.getKeyCode() == KeyEvent.VK_D){
                        tagliabile = controllaCasellaLV3(f3);
                        if(tagliabile == 0 || tagliabile == 2){
                            ((JLabel)f3.al.get((v*32)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV3-40x40.png"))); // NOI18N  
                            ((JLabel)f3.al.get((v*32)+o+1)).setIcon(new ImageIcon(getClass().getResource("/immagini/taglia erba 40x40 LV3 destra.jpg"))); // NOI18N  
                        }
                    }
                    if(x.getKeyCode() == KeyEvent.VK_S){
                        tagliabile = controllaCasellaLV3(f3);
                        if(tagliabile == 0 || tagliabile == 2){
                            ((JLabel)f3.al.get((v*32)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV3-40x40.png"))); // NOI18N  
                            ((JLabel)f3.al.get(((v+1)*32)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini/taglia erba 40x40 LV3 basso.jpg"))); // NOI18N  
                        }
                    }
                    controllaFineLV3();
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
        if(lvCorrente == 0){
        if(x.getKeyCode() == KeyEvent.VK_W || x.getKeyCode() == KeyEvent.VK_S || x.getKeyCode() == KeyEvent.VK_A || x.getKeyCode() == KeyEvent.VK_D){
            for(int i=0;i<10;i++){
            for(int j=0;j<18;j++){
                if(f0.matrice[i][j] == 3){
                    v=i;
                    o=j;
                    break;
                }
            }
            }
            if(tosaerbaOn == false){
                if(v!=0){
                if(x.getKeyCode() == KeyEvent.VK_W && f0.matrice[v-1][o] == 0){
                    suonoTosaerba();
                    clipTosaerba.start();
                    tosaerbaOn = true;
                }
                }
                if(v!=9){
                if(x.getKeyCode() == KeyEvent.VK_S && f0.matrice[v+1][o] == 0){
                    suonoTosaerba();
                    clipTosaerba.start();
                    tosaerbaOn = true;
                }
                }
                if(o!=0){
                if(x.getKeyCode() == KeyEvent.VK_A && f0.matrice[v][o-1] == 0){
                    suonoTosaerba();
                    clipTosaerba.start();
                    tosaerbaOn = true;
                }
                }
                if(o!=17){
                if(x.getKeyCode() == KeyEvent.VK_D && f0.matrice[v][o+1] == 0){
                    suonoTosaerba();
                    clipTosaerba.start();
                    tosaerbaOn = true;
                }
                }
            }
            if(tosaerbaOn == true){
                if(v!=0){
                if(x.getKeyCode() == KeyEvent.VK_W && f0.matrice[v-1][o] != 0){
                    clipTosaerba.stop();
                    clipTosaerba.close();
                    tosaerbaOn = false;
                }
                }
                if(v!=9){
                if(x.getKeyCode() == KeyEvent.VK_S && f0.matrice[v+1][o] != 0){
                    clipTosaerba.stop();
                    clipTosaerba.close();
                    tosaerbaOn = false;
                }
                }
                if(o!=0){
                if(x.getKeyCode() == KeyEvent.VK_A && f0.matrice[v][o-1] != 0){
                    clipTosaerba.stop();
                    clipTosaerba.close();
                    tosaerbaOn = false;
                }
                }
                if(o!=17){
                if(x.getKeyCode() == KeyEvent.VK_D && f0.matrice[v][o+1] != 0){
                    clipTosaerba.stop();
                    clipTosaerba.close();
                    tosaerbaOn = false;
                }
            }
        }
        }
        }
        if(lvCorrente == 1){
        if(x.getKeyCode() == KeyEvent.VK_W || x.getKeyCode() == KeyEvent.VK_S || x.getKeyCode() == KeyEvent.VK_A || x.getKeyCode() == KeyEvent.VK_D){
            for(int i=0;i<12;i++){
            for(int j=0;j<21;j++){
                if(f1.matrice[i][j] == 3){
                    v=i;
                    o=j;
                    break;
                }
            }
            }
            if(tosaerbaOn == false){
                if(v!=0){
                if(x.getKeyCode() == KeyEvent.VK_W && f1.matrice[v-1][o] == 0){
                    suonoTosaerba();
                    clipTosaerba.start();
                    tosaerbaOn = true;
                }
                }
                if(v!=11){
                if(x.getKeyCode() == KeyEvent.VK_S && f1.matrice[v+1][o] == 0){
                    suonoTosaerba();
                    clipTosaerba.start();
                    tosaerbaOn = true;
                }
                }
                if(o!=0){
                if(x.getKeyCode() == KeyEvent.VK_A && f1.matrice[v][o-1] == 0){
                    suonoTosaerba();
                    clipTosaerba.start();
                    tosaerbaOn = true;
                }
                }
                if(o!=20){
                if(x.getKeyCode() == KeyEvent.VK_D && f1.matrice[v][o+1] == 0){
                    suonoTosaerba();
                    clipTosaerba.start();
                    tosaerbaOn = true;
                }
                }
            }
            if(tosaerbaOn == true){
                if(v!=0){
                if(x.getKeyCode() == KeyEvent.VK_W && f1.matrice[v-1][o] != 0){
                    clipTosaerba.stop();
                    clipTosaerba.close();
                    tosaerbaOn = false;
                }
                }
                if(v!=11){
                if(x.getKeyCode() == KeyEvent.VK_S && f1.matrice[v+1][o] != 0){
                    clipTosaerba.stop();
                    clipTosaerba.close();
                    tosaerbaOn = false;
                }
                }
                if(o!=0){
                if(x.getKeyCode() == KeyEvent.VK_A && f1.matrice[v][o-1] != 0){
                    clipTosaerba.stop();
                    clipTosaerba.close();
                    tosaerbaOn = false;
                }
                }
                if(o!=20){
                if(x.getKeyCode() == KeyEvent.VK_D && f1.matrice[v][o+1] != 0){
                    clipTosaerba.stop();
                    clipTosaerba.close();
                    tosaerbaOn = false;
                }
            }
        }
        }
        }
        if(lvCorrente == 2){
        if(x.getKeyCode() == KeyEvent.VK_W || x.getKeyCode() == KeyEvent.VK_S || x.getKeyCode() == KeyEvent.VK_A || x.getKeyCode() == KeyEvent.VK_D){
            for(int i=0;i<14;i++){
            for(int j=0;j<25;j++){
                if(f2.matrice[i][j] == 3){
                    v=i;
                    o=j;
                    break;
                }
            }
            }
            if(tosaerbaOn == false){
                if(v!=0){
                if(x.getKeyCode() == KeyEvent.VK_W && f2.matrice[v-1][o] == 0){
                    suonoTosaerba();
                    clipTosaerba.start();
                    tosaerbaOn = true;
                }
                }
                if(v!=13){
                if(x.getKeyCode() == KeyEvent.VK_S && f2.matrice[v+1][o] == 0){
                    suonoTosaerba();
                    clipTosaerba.start();
                    tosaerbaOn = true;
                }
                }
                if(o!=0){
                if(x.getKeyCode() == KeyEvent.VK_A && f2.matrice[v][o-1] == 0){
                    suonoTosaerba();
                    clipTosaerba.start();
                    tosaerbaOn = true;
                }
                }
                if(o!=24){
                if(x.getKeyCode() == KeyEvent.VK_D && f2.matrice[v][o+1] == 0){
                    suonoTosaerba();
                    clipTosaerba.start();
                    tosaerbaOn = true;
                }
                }
            }
            if(tosaerbaOn == true){
                if(v!=0){
                if(x.getKeyCode() == KeyEvent.VK_W && f2.matrice[v-1][o] != 0){
                    clipTosaerba.stop();
                    clipTosaerba.close();
                    tosaerbaOn = false;
                }
                }
                if(v!=13){
                if(x.getKeyCode() == KeyEvent.VK_S && f2.matrice[v+1][o] != 0){
                    clipTosaerba.stop();
                    clipTosaerba.close();
                    tosaerbaOn = false;
                }
                }
                if(o!=0){
                if(x.getKeyCode() == KeyEvent.VK_A && f2.matrice[v][o-1] != 0){
                    clipTosaerba.stop();
                    clipTosaerba.close();
                    tosaerbaOn = false;
                }
                }
                if(o!=24){
                if(x.getKeyCode() == KeyEvent.VK_D && f2.matrice[v][o+1] != 0){
                    clipTosaerba.stop();
                    clipTosaerba.close();
                    tosaerbaOn = false;
                }
            }
        }
        }
        }
        if(lvCorrente == 3){
        if(x.getKeyCode() == KeyEvent.VK_W || x.getKeyCode() == KeyEvent.VK_S || x.getKeyCode() == KeyEvent.VK_A || x.getKeyCode() == KeyEvent.VK_D){
            for(int i=0;i<18;i++){
            for(int j=0;j<32;j++){
                if(f3.matrice[i][j] == 3){
                    v=i;
                    o=j;
                    break;
                }
            }
            }
            if(tosaerbaOn == false){
                if(v!=0){
                if(x.getKeyCode() == KeyEvent.VK_W && f3.matrice[v-1][o] == 0){
                    suonoTosaerba();
                    clipTosaerba.start();
                    tosaerbaOn = true;
                }
                }
                if(v!=17){
                if(x.getKeyCode() == KeyEvent.VK_S && f3.matrice[v+1][o] == 0){
                    suonoTosaerba();
                    clipTosaerba.start();
                    tosaerbaOn = true;
                }
                }
                if(o!=0){
                if(x.getKeyCode() == KeyEvent.VK_A && f3.matrice[v][o-1] == 0){
                    suonoTosaerba();
                    clipTosaerba.start();
                    tosaerbaOn = true;
                }
                }
                if(o!=31){
                if(x.getKeyCode() == KeyEvent.VK_D && f3.matrice[v][o+1] == 0){
                    suonoTosaerba();
                    clipTosaerba.start();
                    tosaerbaOn = true;
                }
                }
            }
            if(tosaerbaOn == true){
                if(v!=0){
                if(x.getKeyCode() == KeyEvent.VK_W && f3.matrice[v-1][o] != 0){
                    clipTosaerba.stop();
                    clipTosaerba.close();
                    tosaerbaOn = false;
                }
                }
                if(v!=17){
                if(x.getKeyCode() == KeyEvent.VK_S && f3.matrice[v+1][o] != 0){
                    clipTosaerba.stop();
                    clipTosaerba.close();
                    tosaerbaOn = false;
                }
                }
                if(o!=0){
                if(x.getKeyCode() == KeyEvent.VK_A && f3.matrice[v][o-1] != 0){
                    clipTosaerba.stop();
                    clipTosaerba.close();
                    tosaerbaOn = false;
                }
                }
                if(o!=31){
                if(x.getKeyCode() == KeyEvent.VK_D && f3.matrice[v][o+1] != 0){
                    clipTosaerba.stop();
                    clipTosaerba.close();
                    tosaerbaOn = false;
                }
            }
        }
        }
        }
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
        timer.stop();
        clipTosaerba.stop();
        clipTosaerba.close();
        tosaerbaOn = false;
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
        
        if(x.getKeyCode() == KeyEvent.VK_W && collisione != 'w'){
            if(v-1<0){
                collisione = 'n';
                return 4;
            }
            if(l.matrice[v-1][o] == 0){                 //se l'erba è alta
                collisione = 'n';
                l.matrice[v-1][o] = 3;
                l.matrice[v][o] = 2;
                return 0;
            }
            if(l.matrice[v-1][o] == 2){              //se è bassa
                collisione = 'n';
                l.matrice[v-1][o] = 3;
                l.matrice[v][o] = 2;
                return 2;
            }                                         
            // se c'è un ostacolo
                try {
                    l.bum = AudioSystem.getAudioInputStream(new File("src/audio/bum.wav").getAbsoluteFile());
                    l.clipBum = AudioSystem.getClip();
                    l.clipBum.open(l.bum);
                    l.clipBum.start();
                } catch(Exception ex) {
                    System.out.println("Error with playing sound.");
                    ex.printStackTrace();
                }
                
                collisione = 'w';
                return 1;
        }
        
        if(x.getKeyCode() == KeyEvent.VK_S && collisione != 's'){
            if(v+1>9){
                collisione = 'n';
                return 4;
            }
            if(l.matrice[v+1][o] == 0){                 //se l'erba è alta
                collisione = 'n';
                l.matrice[v+1][o] = 3;
                l.matrice[v][o] = 2; 
                return 0;
            }
            if(l.matrice[v+1][o] == 2){              //se è bassa
                collisione = 'n';
                l.matrice[v+1][o] = 3;
                l.matrice[v][o] = 2;
                return 2;
            }
            // se c'è un ostacolo
                try {
                    l.bum = AudioSystem.getAudioInputStream(new File("src/audio/bum.wav").getAbsoluteFile());
                    l.clipBum = AudioSystem.getClip();
                    l.clipBum.open(l.bum);
                    l.clipBum.start();
                } catch(Exception ex) {
                    System.out.println("Error with playing sound.");
                    ex.printStackTrace();
                }
                
                collisione = 's';
                return 1;
        }
        
        if(x.getKeyCode() == KeyEvent.VK_A && collisione != 'a'){
            if(o-1<0){
                collisione = 'n';
                return 4;
            }
            if(l.matrice[v][o-1] == 0){                 //se l'erba è alta
                collisione = 'n';
                l.matrice[v][o-1] = 3;
                l.matrice[v][o] = 2;
                return 0;
            }
            if(l.matrice[v][o-1] == 2){              //se è bassa
                collisione = 'n';
                l.matrice[v][o-1] = 3;
                l.matrice[v][o] = 2;
                return 2;
            }
            // se c'è un ostacolo
                try {
                    l.bum = AudioSystem.getAudioInputStream(new File("src/audio/bum.wav").getAbsoluteFile());
                    l.clipBum = AudioSystem.getClip();
                    l.clipBum.open(l.bum);
                    l.clipBum.start();
                } catch(Exception ex) {
                    System.out.println("Error with playing sound.");
                    ex.printStackTrace();
                }
                
                collisione = 'a';
                return 1;
        }
        
        if(x.getKeyCode() == KeyEvent.VK_D && collisione != 'd'){
            if(o+1>17){
                collisione = 'n';
                return 4;
            }
            if(l.matrice[v][o+1] == 0){                 //se l'erba è alta
                collisione = 'n';
                l.matrice[v][o+1] = 3;
                l.matrice[v][o] = 2;
                return 0;
            }
            if(l.matrice[v][o+1] == 2){              //se è bassa
                collisione = 'n';
                l.matrice[v][o+1] = 3;
                l.matrice[v][o] = 2;
                return 2;
            }
             // se c'è un ostacolo
                try {
                    l.bum = AudioSystem.getAudioInputStream(new File("src/audio/bum.wav").getAbsoluteFile());
                    l.clipBum = AudioSystem.getClip();
                    l.clipBum.open(l.bum);
                    l.clipBum.start();
                } catch(Exception ex) {
                    System.out.println("Error with playing sound.");
                    ex.printStackTrace();
                }
                
                collisione = 'd';
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
        
        if(x.getKeyCode() == KeyEvent.VK_W && collisione != 'w'){
            if(v-1<0){
                collisione = 'n';
                return 4;
            }
            if(l.matrice[v-1][o] == 0){                 //se l'erba è alta
                collisione = 'n';
                l.matrice[v-1][o] = 3;
                l.matrice[v][o] = 2;
                return 0;
            }
            if(l.matrice[v-1][o] == 2){              //se è bassa
                collisione = 'n';
                l.matrice[v-1][o] = 3;
                l.matrice[v][o] = 2;
                return 2;
            }                                         
            // se c'è un ostacolo
                try {
                    l.bum = AudioSystem.getAudioInputStream(new File("src/audio/bum.wav").getAbsoluteFile());
                    l.clipBum = AudioSystem.getClip();
                    l.clipBum.open(l.bum);
                    l.clipBum.start();
                } catch(Exception ex) {
                    System.out.println("Error with playing sound.");
                    ex.printStackTrace();
                }
                
                collisione = 'w';
                return 1;
        }
        
        if(x.getKeyCode() == KeyEvent.VK_S && collisione != 's'){
            if(v+1>11){
                collisione = 'n';
                return 4;
            }
            if(l.matrice[v+1][o] == 0){                 //se l'erba è alta
                collisione = 'n';
                l.matrice[v+1][o] = 3;
                l.matrice[v][o] = 2; 
                return 0;
            }
            if(l.matrice[v+1][o] == 2){              //se è bassa
                collisione = 'n';
                l.matrice[v+1][o] = 3;
                l.matrice[v][o] = 2;
                return 2;
            }
            // se c'è un ostacolo
                try {
                    l.bum = AudioSystem.getAudioInputStream(new File("src/audio/bum.wav").getAbsoluteFile());
                    l.clipBum = AudioSystem.getClip();
                    l.clipBum.open(l.bum);
                    l.clipBum.start();
                } catch(Exception ex) {
                    System.out.println("Error with playing sound.");
                    ex.printStackTrace();
                }
                
                collisione = 's';
                return 1;
        }
        
        if(x.getKeyCode() == KeyEvent.VK_A && collisione != 'a'){
            if(o-1<0){
                collisione = 'n';
                return 4;
            }
            if(l.matrice[v][o-1] == 0){                 //se l'erba è alta
                collisione = 'n';
                l.matrice[v][o-1] = 3;
                l.matrice[v][o] = 2;
                return 0;
            }
            if(l.matrice[v][o-1] == 2){              //se è bassa
                collisione = 'n';
                l.matrice[v][o-1] = 3;
                l.matrice[v][o] = 2;
                return 2;
            }
            // se c'è un ostacolo
                try {
                    l.bum = AudioSystem.getAudioInputStream(new File("src/audio/bum.wav").getAbsoluteFile());
                    l.clipBum = AudioSystem.getClip();
                    l.clipBum.open(l.bum);
                    l.clipBum.start();
                } catch(Exception ex) {
                    System.out.println("Error with playing sound.");
                    ex.printStackTrace();
                }
                
                collisione = 'a';
                return 1;
        }
        
        if(x.getKeyCode() == KeyEvent.VK_D && collisione != 'd'){
            if(o+1>20){
                collisione = 'n';
                return 4;
            }
            if(l.matrice[v][o+1] == 0){                 //se l'erba è alta
                collisione = 'n';
                l.matrice[v][o+1] = 3;
                l.matrice[v][o] = 2;
                return 0;
            }
            if(l.matrice[v][o+1] == 2){              //se è bassa
                collisione = 'n';
                l.matrice[v][o+1] = 3;
                l.matrice[v][o] = 2;
                return 2;
            }
             // se c'è un ostacolo
                try {
                    l.bum = AudioSystem.getAudioInputStream(new File("src/audio/bum.wav").getAbsoluteFile());
                    l.clipBum = AudioSystem.getClip();
                    l.clipBum.open(l.bum);
                    l.clipBum.start();
                } catch(Exception ex) {
                    System.out.println("Error with playing sound.");
                    ex.printStackTrace();
                }
                
                collisione = 'd';
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
        
        if(x.getKeyCode() == KeyEvent.VK_W && collisione != 'w'){
            if(v-1<0){
                collisione = 'n';
                return 4;
            }
            if(l.matrice[v-1][o] == 0){                 //se l'erba è alta
                collisione = 'n';
                l.matrice[v-1][o] = 3;
                l.matrice[v][o] = 2;
                return 0;
            }
            if(l.matrice[v-1][o] == 2){              //se è bassa
                collisione = 'n';
                l.matrice[v-1][o] = 3;
                l.matrice[v][o] = 2;
                return 2;
            }                                         
            // se c'è un ostacolo
                try {
                    l.bum = AudioSystem.getAudioInputStream(new File("src/audio/bum.wav").getAbsoluteFile());
                    l.clipBum = AudioSystem.getClip();
                    l.clipBum.open(l.bum);
                    l.clipBum.start();
                } catch(Exception ex) {
                    System.out.println("Error with playing sound.");
                    ex.printStackTrace();
                }
                
                collisione = 'w';
                return 1;
        }
        
        if(x.getKeyCode() == KeyEvent.VK_S && collisione != 's'){
            if(v+1>13){
                collisione = 'n';
                return 4;
            }
            if(l.matrice[v+1][o] == 0){                 //se l'erba è alta
                collisione = 'n';
                l.matrice[v+1][o] = 3;
                l.matrice[v][o] = 2; 
                return 0;
            }
            if(l.matrice[v+1][o] == 2){              //se è bassa
                collisione = 'n';
                l.matrice[v+1][o] = 3;
                l.matrice[v][o] = 2;
                return 2;
            }
            // se c'è un ostacolo
                try {
                    l.bum = AudioSystem.getAudioInputStream(new File("src/audio/bum.wav").getAbsoluteFile());
                    l.clipBum = AudioSystem.getClip();
                    l.clipBum.open(l.bum);
                    l.clipBum.start();
                } catch(Exception ex) {
                    System.out.println("Error with playing sound.");
                    ex.printStackTrace();
                }
                
                collisione = 's';
                return 1;
        }
        
        if(x.getKeyCode() == KeyEvent.VK_A && collisione != 'a'){
            if(o-1<0){
                collisione = 'n';
                return 4;
            }
            if(l.matrice[v][o-1] == 0){                 //se l'erba è alta
                collisione = 'n';
                l.matrice[v][o-1] = 3;
                l.matrice[v][o] = 2;
                return 0;
            }
            if(l.matrice[v][o-1] == 2){              //se è bassa
                collisione = 'n';
                l.matrice[v][o-1] = 3;
                l.matrice[v][o] = 2;
                return 2;
            }
            // se c'è un ostacolo
                try {
                    l.bum = AudioSystem.getAudioInputStream(new File("src/audio/bum.wav").getAbsoluteFile());
                    l.clipBum = AudioSystem.getClip();
                    l.clipBum.open(l.bum);
                    l.clipBum.start();
                } catch(Exception ex) {
                    System.out.println("Error with playing sound.");
                    ex.printStackTrace();
                }
                
                collisione = 'a';
                return 1;
        }
        
        if(x.getKeyCode() == KeyEvent.VK_D && collisione != 'd'){
            if(o+1>24){
                collisione = 'n';
                return 4;
            }
            if(l.matrice[v][o+1] == 0){                 //se l'erba è alta
                collisione = 'n';
                l.matrice[v][o+1] = 3;
                l.matrice[v][o] = 2;
                return 0;
            }
            if(l.matrice[v][o+1] == 2){              //se è bassa
                collisione = 'n';
                l.matrice[v][o+1] = 3;
                l.matrice[v][o] = 2;
                return 2;
            }
             // se c'è un ostacolo
                try {
                    l.bum = AudioSystem.getAudioInputStream(new File("src/audio/bum.wav").getAbsoluteFile());
                    l.clipBum = AudioSystem.getClip();
                    l.clipBum.open(l.bum);
                    l.clipBum.start();
                } catch(Exception ex) {
                    System.out.println("Error with playing sound.");
                    ex.printStackTrace();
                }
                
                collisione = 'd';
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
        
        System.out.println(""+v+"    "+o);
        
        if(x.getKeyCode() == KeyEvent.VK_W && collisione != 'w'){
            if(v-1<0){
                collisione = 'n';
                return 4;
            }
            if(l.matrice[v-1][o] == 0){                 //se l'erba è alta
                collisione = 'n';
                l.matrice[v-1][o] = 3;
                l.matrice[v][o] = 2;
                return 0;
            }
            if(l.matrice[v-1][o] == 2){              //se è bassa
                collisione = 'n';
                l.matrice[v-1][o] = 3;
                l.matrice[v][o] = 2;
                return 2;
            }                                         
            // se c'è un ostacolo
                try {
                    l.bum = AudioSystem.getAudioInputStream(new File("src/audio/bum.wav").getAbsoluteFile());
                    l.clipBum = AudioSystem.getClip();
                    l.clipBum.open(l.bum);
                    l.clipBum.start();
                } catch(Exception ex) {
                    System.out.println("Error with playing sound.");
                    ex.printStackTrace();
                }
                
                collisione = 'w';
                return 1;
        }
        
        if(x.getKeyCode() == KeyEvent.VK_S && collisione != 's'){
            if(v+1>17){
                collisione = 'n';
                return 4;
            }
            if(l.matrice[v+1][o] == 0){                 //se l'erba è alta
                collisione = 'n';
                l.matrice[v+1][o] = 3;
                l.matrice[v][o] = 2; 
                return 0;
            }
            if(l.matrice[v+1][o] == 2){              //se è bassa
                collisione = 'n';
                l.matrice[v+1][o] = 3;
                l.matrice[v][o] = 2;
                return 2;
            }
            // se c'è un ostacolo
                try {
                    l.bum = AudioSystem.getAudioInputStream(new File("src/audio/bum.wav").getAbsoluteFile());
                    l.clipBum = AudioSystem.getClip();
                    l.clipBum.open(l.bum);
                    l.clipBum.start();
                } catch(Exception ex) {
                    System.out.println("Error with playing sound.");
                    ex.printStackTrace();
                }
                
                collisione = 's';
                return 1;
        }
        
        if(x.getKeyCode() == KeyEvent.VK_A && collisione != 'a'){
            if(o-1<0){
                collisione = 'n';
                return 4;
            }
            if(l.matrice[v][o-1] == 0){                 //se l'erba è alta
                collisione = 'n';
                l.matrice[v][o-1] = 3;
                l.matrice[v][o] = 2;
                return 0;
            }
            if(l.matrice[v][o-1] == 2){              //se è bassa
                collisione = 'n';
                l.matrice[v][o-1] = 3;
                l.matrice[v][o] = 2;
                return 2;
            }
            // se c'è un ostacolo
                try {
                    l.bum = AudioSystem.getAudioInputStream(new File("src/audio/bum.wav").getAbsoluteFile());
                    l.clipBum = AudioSystem.getClip();
                    l.clipBum.open(l.bum);
                    l.clipBum.start();
                } catch(Exception ex) {
                    System.out.println("Error with playing sound.");
                    ex.printStackTrace();
                }
                
                collisione = 'a';
                return 1;
        }
        
        if(x.getKeyCode() == KeyEvent.VK_D && collisione != 'd'){
            if(o+1>31){
                collisione = 'n';
                return 4;
            }
            if(l.matrice[v][o+1] == 0){                 //se l'erba è alta
                collisione = 'n';
                l.matrice[v][o+1] = 3;
                l.matrice[v][o] = 2;
                return 0;
            }
            if(l.matrice[v][o+1] == 2){              //se è bassa
                collisione = 'n';
                l.matrice[v][o+1] = 3;
                l.matrice[v][o] = 2;
                return 2;
            }
             // se c'è un ostacolo
                try {
                    l.bum = AudioSystem.getAudioInputStream(new File("src/audio/bum.wav").getAbsoluteFile());
                    l.clipBum = AudioSystem.getClip();
                    l.clipBum.open(l.bum);
                    l.clipBum.start();
                } catch(Exception ex) {
                    System.out.println("Error with playing sound.");
                    ex.printStackTrace();
                }
                
                collisione = 'd';
                return 1;
        }
        
        return 1;    
    }
    
    private void controllaFineLV0(){
        for(int i=0;i<10;i++){
            for(int j=0;j<18;j++){
                if(f0.matrice[i][j] == 0){
                    return;
                }
            }
        }
        f0.clip.stop();
    }
    private void controllaFineLV1(){
        for(int i=0;i<12;i++){
            for(int j=0;j<21;j++){
                if(f1.matrice[i][j] == 0){
                    return;
                }
            }
        }
        f1.clip.stop();
    }
    private void controllaFineLV2(){
        for(int i=0;i<14;i++){
            for(int j=0;j<25;j++){
                if(f2.matrice[i][j] == 0){
                    return;
                }
            }
        }
        f2.clip.stop();
    }
    private void controllaFineLV3(){
        for(int i=0;i<18;i++){
            for(int j=0;j<32;j++){
                if(f3.matrice[i][j] == 0){
                    return;
                }
            }
        }
        f3.clip.stop();
    }
    
    private void suonoTosaerba(){
        try {
            tosaerba = AudioSystem.getAudioInputStream(new File("src/audio/tosaerba.wav").getAbsoluteFile());
            clipTosaerba = AudioSystem.getClip();
            clipTosaerba.open(tosaerba);
        } catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
    }
    
    
    
}
