
import java.awt.event.*;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import javax.swing.plaf.ColorUIResource;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author netti
 */

/*
  ascoltatore che gestisce la pressione 
  dei tasti w, s, a, d per far funzionare
  il tagliaerba
*/
public class MyKeyListener implements KeyListener {

    int cont=0;    //contatore delle collisioni
    private Timer timer;   //timer per muovere il tagliaerba di una casella ogni x millisexondi
    int lvCorrente = 0;    //variabile per far sapere ai metodi cosa fare in base al livello che è in corso
    KeyEvent x;            //tasto premuto
    NewJFrame f;  //collegamento a newJFrame per accedera alla variabile colore del tagliaerba        
    Livello0 f0;
    Livello1 f1;
    livello2 f2;
    Livello3 f3;
    int tagliabile = 0;   //blocco: 0 = erba alta, 1 = ostacolo, 2 = erba bassa, 4 = fine mappa
    int v=0, o=0;         //indici della matrice della mappa
    char collisione = 'n';  //n = no collisione, w = collisione in avanti, s = ... indietro, a = ... sinistra, d = ... destra
    AudioInputStream tosaerba;  //suono del tagliaerba che taglia
    Clip clipTosaerba;
    boolean tosaerbaOn = false;  //true = suono tosaerba on, false = suono tosaerba off
    
    /*
      costruttori dell'ascoltatore.
      In base all'ascoltatore utilizzato crea il collegamento con il livello,
      aggiorna la variabile lvCorrente e crea il timer.
      (commento solo il primo costruttore visto che fanno la stessa cosa
      ma usano livelli e immagini diverse)
    */
    
    public MyKeyListener(Livello0 f0, NewJFrame f){ //costruttore dell'ascoltatore per il livello 0
        this.f0=f0;
        this.f=f;
        lvCorrente = 0;
        /*
          Questo if, se il tagliaerba deve essere nero, controlla dove si trova
          e ne cambia il colore prima di premere qualsiasi tasto
        */
        if(f.colore == false){       
            for(int i=0;i<10;i++){  //controlla dobe si trova il tagliaerba
                for(int j=0;j<18;j++){
                    if(f0.matrice[i][j] == 3){
                        v=i; //ne memorizza gli indici della matrice
                        o=j;
                        break;
                    }
                }
            }
            ((JLabel)f0.al.get(((v)*18)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini/tosaerba nero  68x68.jpg")));
        }
        timer = new Timer(170, new ActionListener() {  //alla pressione di un tasto ogni 170 ms esegue le istruzioni dell'actionPerformed
            public void actionPerformed(ActionEvent e) {
                    if(x.getKeyCode() == KeyEvent.VK_W){  //se premuto il tasto w
                        tagliabile = controllaCasellaLV0(f0);  //avvia il metodo per controllare cosa c'è nella casella successiva
                        if(tagliabile == 0 || tagliabile == 2){  //se non c'è un ostacolo e non è finita la mappa
                            ((JLabel)f0.al.get((v*18)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV0-68x68.png")));
                            // al posto del tagliaerba viene messa l'erba tagliata
                            if(f.colore == true) //tagliaerba 
                                ((JLabel)f0.al.get(((v-1)*18)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/tagliaerbaLV0-68x68.jpg"))); 
                                //nella casella successiva viene messo il tagliaerba
                            if(f.colore == false)
                                ((JLabel)f0.al.get(((v-1)*18)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini/tosaerba nero  68x68.jpg")));
                            
                            /*
                              I JLabel che contengono le immagini sono in un arraylist, mentre il contenuto della casella viene controllato nella matrice,
                              quindi bisogna convertire i due indici della matrice in un solo indice per l'arraylist.
                              L'arraylist memorizza le JLabel in ordine da destra a sinistra, dalla riga più in alto a quella più in basso.
                              Una riga nella matrice ( primo indice uguale a 1) equivale a 18 caselle nell'arraylist, 
                              mentre il secondo indice incrementa di uno alla volta,
                              quindi per convertire gli indici di una casella nella matrice in un unico indice per la stessa casella nell'arraylist
                              bisogna moltiplicare il primo indice per 18 ( numero di caselle per riga) e aggiungerci il secondo indice.
                            */
                        }
                    } 
                    if(x.getKeyCode() == KeyEvent.VK_A){  //se premuto il tasto a
                        tagliabile = controllaCasellaLV0(f0);  //avvia il metodo per controllare cosa c'è nella casella successiva
                        if(tagliabile == 0 || tagliabile == 2){  //se non c'è un ostacolo e non è finita la mappa
                            ((JLabel)f0.al.get((v*18)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV0-68x68.png"))); 
                            if(f.colore == true)
                                ((JLabel)f0.al.get((v*18)-1+o)).setIcon(new ImageIcon(getClass().getResource("/immagini/taglia erba 68x68 LV0 sinistra.jpg")));  
                            if(f.colore == false)
                                ((JLabel)f0.al.get((v*18)-1+o)).setIcon(new ImageIcon(getClass().getResource("/immagini/tosaerba nero  68x68 sinistra.jpg")));
                            //in base alla direzione in cui si muove il tagliaerba l'immagine viene girata
                        }
                    }
                    if(x.getKeyCode() == KeyEvent.VK_D){  //se premuto il tasto d
                        tagliabile = controllaCasellaLV0(f0);  //avvia il metodo per controllare cosa c'è nella casella successiva
                        if(tagliabile == 0 || tagliabile == 2){  //se non c'è un ostacolo e non è finita la mappa
                            ((JLabel)f0.al.get((v*18)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV0-68x68.png"))); 
                            if(f.colore == true)
                                ((JLabel)f0.al.get((v*18)+1+o)).setIcon(new ImageIcon(getClass().getResource("/immagini/taglia erba 68x68 LV0 destra.jpg")));  
                            if(f.colore == false)
                                ((JLabel)f0.al.get((v*18)+1+o)).setIcon(new ImageIcon(getClass().getResource("/immagini/tosaerba nero  68x68 destra.jpg")));
                        }
                    }
                    if(x.getKeyCode() == KeyEvent.VK_S){  //se premuto il tasto s
                        tagliabile = controllaCasellaLV0(f0);  //avvia il metodo per controllare cosa c'è nella casella successiva
                        if(tagliabile == 0 || tagliabile == 2){  //se non c'è un ostacolo e non è finita la mappa
                            ((JLabel)f0.al.get((v*18)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV0-68x68.png"))); 
                            if(f.colore == true)
                                ((JLabel)f0.al.get(((v+1)*18)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini/taglia erba 68x68 LV0 basso.jpg"))); 
                            if(f.colore == false)
                                ((JLabel)f0.al.get(((v+1)*18)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini/tosaerba nero  68x68 basso.jpg")));
                        }
                    }
                    controllaFineLV0(); //controlla se tutta l'erba è stata tagliata per poi far procedere il gioco
            }
        });
    }
    
    public MyKeyListener(Livello1 f1, NewJFrame f){ //costruttore dell'ascoltatore per il livello 1
        this.f1=f1;
        this.f=f;
        lvCorrente = 1;
        if(f.colore == false){       
            for(int i=0;i<12;i++){  //controlla dobe si trova il tagliaerba
                for(int j=0;j<21;j++){
                    if(f1.matrice[i][j] == 3){
                        v=i; //ne memorizza gli indici della matrice
                        o=j;
                        break;
                    }
                }
            }
            ((JLabel)f1.al.get(((v)*21)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini/tosaerba nero  58x58.jpg")));
        }
        timer = new Timer(170, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    if(x.getKeyCode() == KeyEvent.VK_W){
                        tagliabile = controllaCasellaLV1(f1);
                        if(tagliabile == 0 || tagliabile == 2){
                            ((JLabel)f1.al.get((v*21)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV1-58x58.png"))); 
                            if(f.colore == true)
                                ((JLabel)f1.al.get(((v-1)*21)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/tagliaerbaLV1-58x58.jpg"))); 
                            if(f.colore == false)
                                ((JLabel)f1.al.get(((v-1)*21)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini/tosaerba nero  58x58.jpg")));
                        }
                    }
                    if(x.getKeyCode() == KeyEvent.VK_A){
                        tagliabile = controllaCasellaLV1(f1);
                        if(tagliabile == 0 || tagliabile == 2){
                            ((JLabel)f1.al.get((v*21)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV1-58x58.png"))); 
                            if(f.colore == true)
                                ((JLabel)f1.al.get((v*21)-1+o)).setIcon(new ImageIcon(getClass().getResource("/immagini/taglia erba 58x58 LV1 sinistra.jpg")));  
                            if(f.colore == false)
                                ((JLabel)f1.al.get((v*21)-1+o)).setIcon(new ImageIcon(getClass().getResource("/immagini/tosaerba nero  58x58 sinistra.jpg")));
                        }
                    }
                    if(x.getKeyCode() == KeyEvent.VK_D){
                        tagliabile = controllaCasellaLV1(f1);
                        if(tagliabile == 0 || tagliabile == 2){
                            ((JLabel)f1.al.get((v*21)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV1-58x58.png"))); 
                            if(f.colore == true)
                                ((JLabel)f1.al.get((v*21)+1+o)).setIcon(new ImageIcon(getClass().getResource("/immagini/taglia erba 58x58 LV1 destra.jpg")));  
                            if(f.colore == false)
                                ((JLabel)f1.al.get((v*21)+1+o)).setIcon(new ImageIcon(getClass().getResource("/immagini/tosaerba nero  58x58 destra.jpg")));
                        }
                    }
                    if(x.getKeyCode() == KeyEvent.VK_S){
                        tagliabile = controllaCasellaLV1(f1);
                        if(tagliabile == 0 || tagliabile == 2){
                            ((JLabel)f1.al.get((v*21)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV1-58x58.png"))); 
                            if(f.colore == true)
                                ((JLabel)f1.al.get(((v+1)*21)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini/taglia erba 58x58 LV1 basso.jpg"))); 
                            if(f.colore == false)
                                ((JLabel)f1.al.get(((v+1)*21)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini/tosaerba nero  58x58 basso.jpg")));
                        }
                    }
                    controllaFineLV1();
            }
        });
    }
   
    
    public MyKeyListener(livello2 f2, NewJFrame f){ //costruttore dell'ascoltatore per il livello 2
        this.f2=f2;
        this.f=f;
        lvCorrente = 2;
        if(f.colore == false){       
            for(int i=0;i<14;i++){  //controlla dobe si trova il tagliaerba
                for(int j=0;j<25;j++){
                    if(f2.matrice[i][j] == 3){
                        v=i; //ne memorizza gli indici della matrice
                        o=j;
                        break;
                    }
                }
            }
            ((JLabel)f2.al.get(((v)*25)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini/tosaerba nero  49x49.jpg")));
        }
        timer = new Timer(170, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    if(x.getKeyCode() == KeyEvent.VK_W){
                        tagliabile = controllaCasellaLV2(f2);
                        if(tagliabile == 0 || tagliabile == 2){
                            ((JLabel)f2.al.get((v*25)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV2-49x49.png"))); // NOI18N  
                            if(f.colore == true)
                                ((JLabel)f2.al.get(((v-1)*25)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/tagliaerbaLV2-49x49.jpg"))); // NOI18N  
                            if(f.colore == false)
                                ((JLabel)f2.al.get(((v-1)*25)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini/tosaerba nero  49x49.jpg")));
                        }
                    }
                    if(x.getKeyCode() == KeyEvent.VK_A){
                        tagliabile = controllaCasellaLV2(f2);
                        if(tagliabile == 0 || tagliabile == 2){
                            ((JLabel)f2.al.get((v*25)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV2-49x49.png"))); // NOI18N  
                            if(f.colore == true)
                                ((JLabel)f2.al.get((v*25)+o-1)).setIcon(new ImageIcon(getClass().getResource("/immagini/taglia erba 49x49 LV2 sinistra.jpg"))); // NOI18N  
                            if(f.colore == false)
                                ((JLabel)f2.al.get((v*25)+o-1)).setIcon(new ImageIcon(getClass().getResource("/immagini/tosaerba nero  49x49 sinistra.jpg")));
                        }
                    }
                    if(x.getKeyCode() == KeyEvent.VK_D){
                        tagliabile = controllaCasellaLV2(f2);
                        if(tagliabile == 0 || tagliabile == 2){
                            ((JLabel)f2.al.get((v*25)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV2-49x49.png"))); // NOI18N  
                            if(f.colore == true)
                                ((JLabel)f2.al.get((v*25)+o+1)).setIcon(new ImageIcon(getClass().getResource("/immagini/taglia erba 49x49 LV2 desta.jpg"))); // NOI18N  
                            if(f.colore == false)
                                ((JLabel)f2.al.get((v*25)+o+1)).setIcon(new ImageIcon(getClass().getResource("/immagini/tosaerba nero  49x49 destra.jpg")));
                        }
                    }
                    if(x.getKeyCode() == KeyEvent.VK_S){
                        tagliabile = controllaCasellaLV2(f2);
                        if(tagliabile == 0 || tagliabile == 2){
                            ((JLabel)f2.al.get((v*25)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV2-49x49.png"))); // NOI18N  
                            if(f.colore == true)
                                ((JLabel)f2.al.get(((v+1)*25)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini/taglia erba 49x49 LV2 basso.jpg"))); // NOI18N  
                            if(f.colore == false)
                                ((JLabel)f2.al.get(((v+1)*25)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini/tosaerba nero  49x49 basso.jpg")));
                        }
                    }
                controllaFineLV2();
            }
        });
    }
    
    public MyKeyListener(Livello3 f3, NewJFrame f){ //costruttore dell'ascoltatore per il livello 3
        this.f3=f3;
        this.f=f;
        lvCorrente = 3;
        if(f.colore == false){       
            for(int i=0;i<18;i++){  //controlla dobe si trova il tagliaerba
                for(int j=0;j<32;j++){
                    if(f3.matrice[i][j] == 3){
                        v=i; //ne memorizza gli indici della matrice
                        o=j;
                        break;
                    }
                }
            }
            ((JLabel)f3.al.get(((v)*32)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini/tosaerba nero  40x40.jpg")));
        }
        timer = new Timer(170, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    if(x.getKeyCode() == KeyEvent.VK_W){
                        tagliabile = controllaCasellaLV3(f3);
                        if(tagliabile == 0 || tagliabile == 2){
                            ((JLabel)f3.al.get((v*32)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV3-40x40.png"))); // NOI18N  
                            if(f.colore == true)
                                ((JLabel)f3.al.get(((v-1)*32)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/tagliaerbaLV3-40x40.jpg"))); // NOI18N  
                            if(f.colore == false)
                                ((JLabel)f3.al.get(((v-1)*32)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini/tosaerba nero  40x40.jpg")));
                        }
                    }
                    if(x.getKeyCode() == KeyEvent.VK_A){
                        tagliabile = controllaCasellaLV3(f3);
                        if(tagliabile == 0 || tagliabile == 2){
                            ((JLabel)f3.al.get((v*32)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV3-40x40.png"))); // NOI18N  
                            if(f.colore == true)
                                ((JLabel)f3.al.get((v*32)+o-1)).setIcon(new ImageIcon(getClass().getResource("/immagini/taglia erba 40x40 LV3 sinistra.jpg"))); // NOI18N  
                            if(f.colore == false)
                                ((JLabel)f3.al.get((v*32)+o-1)).setIcon(new ImageIcon(getClass().getResource("/immagini/tosaerba nero  40x40 sinistra.jpg")));
                        }
                    }
                    if(x.getKeyCode() == KeyEvent.VK_D){
                        tagliabile = controllaCasellaLV3(f3);
                        if(tagliabile == 0 || tagliabile == 2){
                            ((JLabel)f3.al.get((v*32)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV3-40x40.png"))); // NOI18N  
                            if(f.colore == true)
                                ((JLabel)f3.al.get((v*32)+o+1)).setIcon(new ImageIcon(getClass().getResource("/immagini/taglia erba 40x40 LV3 destra.jpg"))); // NOI18N  
                            if(f.colore == false)
                                ((JLabel)f3.al.get((v*32)+o+1)).setIcon(new ImageIcon(getClass().getResource("/immagini/tosaerba nero  40x40 destra.jpg")));
                        }
                    }
                    if(x.getKeyCode() == KeyEvent.VK_S){
                        tagliabile = controllaCasellaLV3(f3);
                        if(tagliabile == 0 || tagliabile == 2){
                            ((JLabel)f3.al.get((v*32)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV3-40x40.png"))); // NOI18N  
                            if(f.colore == true)
                                ((JLabel)f3.al.get(((v+1)*32)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini/taglia erba 40x40 LV3 basso.jpg"))); // NOI18N  
                            if(f.colore == false)
                                ((JLabel)f3.al.get(((v+1)*32)+o)).setIcon(new ImageIcon(getClass().getResource("/immagini/tosaerba nero  40x40 basso.jpg")));
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
    public void keyPressed(KeyEvent e) { //se un tasto viene tenuto premuto
        x = e;  //si segna quale tasto è stato premuto
        timer.start();  //avvia il timer dichiarato nel costruttore
        /*
          Il seguente codice controlla quale livello è in corso e se vengono premuti i tasti per il movimento
          aziona il rumore del tagliaerba solo quando il tagliaerba passa sull'erba alta.
          Commento solo il codice per il primo livello.
        */
        if(lvCorrente == 0){
        if(x.getKeyCode() == KeyEvent.VK_W || x.getKeyCode() == KeyEvent.VK_S || x.getKeyCode() == KeyEvent.VK_A || x.getKeyCode() == KeyEvent.VK_D){
            for(int i=0;i<10;i++){  //controlla dove si trova il tagliaerba e ne memorizza gli indici della matrice
            for(int j=0;j<18;j++){
                if(f0.matrice[i][j] == 3){
                    v=i;
                    o=j;
                    break;
                }
            }
            }
            if(tosaerbaOn == false){
                /*
                  Se il rumore è spento in base al tasto premuto controlla il contenuto della casella sopra, sotto, a destra o a sinistra.
                  Se nella casella in cui deve andare il tagliaerba c'è l'erba alta aziona il rumore.
                */
                if(v!=0){ //controlla che il tagliaerba non sia arrivato a fine mappa
                if(x.getKeyCode() == KeyEvent.VK_W && f0.matrice[v-1][o] == 0){
                    suonoTosaerba(); //apre il file contenente il rumore del tagliaerba
                    clipTosaerba.start();  //avvia il rumore
                    tosaerbaOn = true;  //si segna che il rumore è acceso
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
                /*
                  Se il rumore è acceso in base al tasto premuto controlla il contenuto della casella sopra, sotto, a destra o a sinistra.
                  Se nella casella in cui deve andare il tagliaerba non c'è l'erba alta spegne il rumore.
                */
                if(v!=0){  //controlla che il tagliaerba non sia arrivato a fine mappa
                if(x.getKeyCode() == KeyEvent.VK_W && f0.matrice[v-1][o] != 0){
                    clipTosaerba.stop(); //ferma il rumore
                    clipTosaerba.close(); //chiude il file contenente il rumore
                    tosaerbaOn = false; //si segna che il rumore è stato disattivato
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
    public void keyReleased(KeyEvent e) { //quando viene rilasciato il tasto che era stato premuto
        timer.stop();  //il timer che fa muovere il tagliaerba viene fermato finche non viene nuovamente premuto un tasto
        if(tosaerbaOn == true){
            clipTosaerba.stop();  //qualunque sia la casella successiva il rumore del tagliaerba viene fermato
            clipTosaerba.close();  //chiude il file contenente il rumore
        }
        tosaerbaOn = false;  //si segna che il rumore è stato fermato
    }
    
    /*
      Questa funzione, in base al tasto premuto, controlla cosa c'è nella casella successiva
      e informa il timer che agirà di conseguenza.
      Se nella casella successiva c'è un ostacolo ed è stato premuto il tasto per andarci addosso,
      viene attivato un suono che fa capire che c'è stata una collisione e toglie una vita.
      Quando finiscono le tre vite il livello viene chiuso.
      Commanto solo il primo metodo.
    */
    private int controllaCasellaLV0(Livello0 l){       //matrice[verticale][orizzontale]
        for(int i=0;i<10;i++){  //controlla dobe si trova il tagliaerba
            for(int j=0;j<18;j++){
                if(l.matrice[i][j] == 3){
                    v=i; //ne memorizza gli indici della matrice
                    o=j;
                    break;
                }
            }
        }
        
        if(x.getKeyCode() == KeyEvent.VK_W && collisione != 'w'){  //se viene premuto il tasto w e non c'è appena stata una collisione in avanti
            if(v-1<0){                    //se il tagliaerba è arrivato a fine mappa
                collisione = 'n';   //non c'è stata collisione
                return 4; 
            }
            if(l.matrice[v-1][o] == 0){  //se l'erba della casella successiva è alta
                collisione = 'n';   //no collisione
                l.matrice[v-1][o] = 3; //sostituisce i valori nella matrice: il tagliaerba verrà segnalato nella casella successiva
                l.matrice[v][o] = 2;  //dove c'era il tagliaerba verra segnalata erba tagliata
                return 0;
            }
            if(l.matrice[v-1][o] == 2){  //se l'erba della casella successiva è bassa
                collisione = 'n';  //no collisione
                l.matrice[v-1][o] = 3; //sostituisce i valori nella matrice: il tagliaerba verrà segnalato nella casella successiva
                l.matrice[v][o] = 2; //dove c'era il tagliaerba verra segnalata erba tagliata
                return 2;       
            }                                         
            // se c'è un ostacolo
                try {  //apre e avvia il rumore dovuto alla collisione
                    l.bum = AudioSystem.getAudioInputStream(new File("src/audio/bum.wav").getAbsoluteFile());
                    l.clipBum = AudioSystem.getClip();
                    l.clipBum.open(l.bum);
                    l.clipBum.start();
                } catch(Exception ex) {
                    System.out.println("Error with playing sound.");
                    ex.printStackTrace();
                }
                /*
                  Il seguente codice fa comparire un avviso ogni volta che si va addosso ad un ostacolo,
                  gli if controllano quante collisioni ci sono gia state e la volta dopo tolgono il cuore successivo.
                  Una volta finiti i cuori bisogna ricominciare da capo.
                */
                JOptionPane.showMessageDialog(f,"Ti sei scontrato contro un ostacolo!!!","ATTENZIONE!",JOptionPane.WARNING_MESSAGE);  //messaggio dim avviso
                if(cont==0){
                    ((JLabel)f0.al.get(177)).setIcon(new ImageIcon(getClass().getResource("/immagini/cuore vuoto 68x68 strada.jpg"))); // sostituzione cuore pieno con vuoto
                }
                if(cont==1){
                    ((JLabel)f0.al.get(178)).setIcon(new ImageIcon(getClass().getResource("/immagini/cuore vuoto 68x68 strada.jpg"))); // NOI18N                      
                }
                if(cont==2){  //se i cuori sono esauriti
                    ((JLabel)f0.al.get(179)).setIcon(new ImageIcon(getClass().getResource("/immagini/cuore vuoto 68x68 strada.jpg"))); // NOI18N                      
                    HubLivelli HB = new HubLivelli(f);  //si ritorna all'hub livelli
                    f0.setVisible(false);
                    f0.clip.stop();
                    f0.clip.close();
                }
                cont++;
                collisione = 'w'; //visto che c'è stata una collisione andando avanti viene segnalata
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
                JOptionPane.showMessageDialog(f,"Ti sei scontrato contro un ostacolo!!!","ATTENZIONE!",JOptionPane.WARNING_MESSAGE);
                if(cont==0){
                    ((JLabel)f0.al.get(177)).setIcon(new ImageIcon(getClass().getResource("/immagini/cuore vuoto 68x68 strada.jpg"))); // NOI18N  
                }
                if(cont==1){
                    ((JLabel)f0.al.get(178)).setIcon(new ImageIcon(getClass().getResource("/immagini/cuore vuoto 68x68 strada.jpg"))); // NOI18N                      
                }
                if(cont==2){
                    ((JLabel)f0.al.get(179)).setIcon(new ImageIcon(getClass().getResource("/immagini/cuore vuoto 68x68 strada.jpg"))); // NOI18N                      
                    HubLivelli HB = new HubLivelli(f);
                    f0.setVisible(false);
                    f0.clip.stop();
                    f0.clip.close();
                }
                cont++;
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
                JOptionPane.showMessageDialog(f,"Ti sei scontrato contro un ostacolo!!!","ATTENZIONE!",JOptionPane.WARNING_MESSAGE);
                if(cont==0){
                    ((JLabel)f0.al.get(177)).setIcon(new ImageIcon(getClass().getResource("/immagini/cuore vuoto 68x68 strada.jpg"))); // NOI18N  
                }
                if(cont==1){
                    ((JLabel)f0.al.get(178)).setIcon(new ImageIcon(getClass().getResource("/immagini/cuore vuoto 68x68 strada.jpg"))); // NOI18N                      
                }
                if(cont==2){
                    ((JLabel)f0.al.get(179)).setIcon(new ImageIcon(getClass().getResource("/immagini/cuore vuoto 68x68 strada.jpg"))); // NOI18N                      
                    HubLivelli HB = new HubLivelli(f);
                    f0.setVisible(false);
                    f0.clip.stop();
                    f0.clip.close();
                }
                cont++;
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
                JOptionPane.showMessageDialog(f,"Ti sei scontrato contro un ostacolo!!!","ATTENZIONE!",JOptionPane.WARNING_MESSAGE);
                if(cont==0){
                    ((JLabel)f0.al.get(177)).setIcon(new ImageIcon(getClass().getResource("/immagini/cuore vuoto 68x68 strada.jpg"))); // NOI18N  
                }
                if(cont==1){
                    ((JLabel)f0.al.get(178)).setIcon(new ImageIcon(getClass().getResource("/immagini/cuore vuoto 68x68 strada.jpg"))); // NOI18N                      
                }
                if(cont==2){
                    ((JLabel)f0.al.get(179)).setIcon(new ImageIcon(getClass().getResource("/immagini/cuore vuoto 68x68 strada.jpg"))); // NOI18N                      
                    HubLivelli HB = new HubLivelli(f);
                    f0.setVisible(false);
                    f0.clip.stop();
                    f0.clip.close();
                }
                cont++;
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
                JOptionPane.showMessageDialog(f,"Ti sei scontrato contro un ostacolo!!!","ATTENZIONE!",JOptionPane.WARNING_MESSAGE);
                if(cont==0){
                    ((JLabel)f1.al.get(249)).setIcon(new ImageIcon(getClass().getResource("/immagini/cuore vuoto 58x58 strada.jpg"))); // NOI18N  
                }
                if(cont==1){
                    ((JLabel)f1.al.get(250)).setIcon(new ImageIcon(getClass().getResource("/immagini/cuore vuoto 58x58 strada.jpg"))); // NOI18N                      
                }
                if(cont==2){
                    ((JLabel)f1.al.get(251)).setIcon(new ImageIcon(getClass().getResource("/immagini/cuore vuoto 58x58 strada.jpg"))); // NOI18N                      
                    HubLivelli HB = new HubLivelli(f);
                    f1.setVisible(false);
                    f1.clip.stop();
                    f1.clip.close();
                }
                cont++;
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
                JOptionPane.showMessageDialog(f,"Ti sei scontrato contro un ostacolo!!!","ATTENZIONE!",JOptionPane.WARNING_MESSAGE);
                if(cont==0){
                    ((JLabel)f1.al.get(249)).setIcon(new ImageIcon(getClass().getResource("/immagini/cuore vuoto 58x58 strada.jpg"))); // NOI18N  
                }
                if(cont==1){
                    ((JLabel)f1.al.get(250)).setIcon(new ImageIcon(getClass().getResource("/immagini/cuore vuoto 58x58 strada.jpg"))); // NOI18N                      
                }
                if(cont==2){
                    ((JLabel)f1.al.get(251)).setIcon(new ImageIcon(getClass().getResource("/immagini/cuore vuoto 58x58 strada.jpg"))); // NOI18N                      
                    HubLivelli HB = new HubLivelli(f);
                    f1.setVisible(false);
                    f1.clip.stop();
                    f1.clip.close();
                }
                cont++;
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
                JOptionPane.showMessageDialog(f,"Ti sei scontrato contro un ostacolo!!!","ATTENZIONE!",JOptionPane.WARNING_MESSAGE);
                if(cont==0){
                    ((JLabel)f1.al.get(249)).setIcon(new ImageIcon(getClass().getResource("/immagini/cuore vuoto 58x58 strada.jpg"))); // NOI18N  
                }
                if(cont==1){
                    ((JLabel)f1.al.get(250)).setIcon(new ImageIcon(getClass().getResource("/immagini/cuore vuoto 58x58 strada.jpg"))); // NOI18N                      
                }
                if(cont==2){
                    ((JLabel)f1.al.get(251)).setIcon(new ImageIcon(getClass().getResource("/immagini/cuore vuoto 58x58 strada.jpg"))); // NOI18N                      
                    HubLivelli HB = new HubLivelli(f);
                    f1.setVisible(false);
                    f1.clip.stop();
                    f1.clip.close();
                }
                cont++;
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
                JOptionPane.showMessageDialog(f,"Ti sei scontrato contro un ostacolo!!!","ATTENZIONE!",JOptionPane.WARNING_MESSAGE);
                if(cont==0){
                    ((JLabel)f1.al.get(249)).setIcon(new ImageIcon(getClass().getResource("/immagini/cuore vuoto 58x58 strada.jpg"))); // NOI18N  
                }
                if(cont==1){
                    ((JLabel)f1.al.get(250)).setIcon(new ImageIcon(getClass().getResource("/immagini/cuore vuoto 58x58 strada.jpg"))); // NOI18N                      
                }
                if(cont==2){
                    ((JLabel)f1.al.get(251)).setIcon(new ImageIcon(getClass().getResource("/immagini/cuore vuoto 58x58 strada.jpg"))); // NOI18N                      
                    HubLivelli HB = new HubLivelli(f);
                    f1.setVisible(false);
                    f1.clip.stop();
                    f1.clip.close();
                }
                System.out.println(cont);
                cont++;
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
                JOptionPane.showMessageDialog(f,"Ti sei scontrato contro un ostacolo!!!","ATTENZIONE!",JOptionPane.WARNING_MESSAGE);
                if(cont==0){
                    ((JLabel)f2.al.get(346)).setIcon(new ImageIcon(getClass().getResource("/immagini/cuore vuoto 49x49 strada.jpg"))); // NOI18N  
                }
                if(cont==1){
                    ((JLabel)f2.al.get(347)).setIcon(new ImageIcon(getClass().getResource("/immagini/cuore vuoto 49x49 strada.jpg"))); // NOI18N                      
                }
                if(cont==2){
                    ((JLabel)f2.al.get(348)).setIcon(new ImageIcon(getClass().getResource("/immagini/cuore vuoto 49x49 strada.jpg"))); // NOI18N                      
                    HubLivelli HB = new HubLivelli(f);
                    f2.setVisible(false);
                    f2.clip.stop();
                    f2.clip.close();
                }
                cont++;
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
                JOptionPane.showMessageDialog(f,"Ti sei scontrato contro un ostacolo!!!","ATTENZIONE!",JOptionPane.WARNING_MESSAGE);
                if(cont==0){
                    ((JLabel)f2.al.get(346)).setIcon(new ImageIcon(getClass().getResource("/immagini/cuore vuoto 49x49 strada.jpg"))); // NOI18N  
                }
                if(cont==1){
                    ((JLabel)f2.al.get(347)).setIcon(new ImageIcon(getClass().getResource("/immagini/cuore vuoto 49x49 strada.jpg"))); // NOI18N                      
                }
                if(cont==2){
                    ((JLabel)f2.al.get(348)).setIcon(new ImageIcon(getClass().getResource("/immagini/cuore vuoto 49x49 strada.jpg"))); // NOI18N                      
                    HubLivelli HB = new HubLivelli(f);
                    f2.setVisible(false);
                    f2.clip.stop();
                    f2.clip.close();
                }
                cont++;
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
                JOptionPane.showMessageDialog(f,"Ti sei scontrato contro un ostacolo!!!","ATTENZIONE!",JOptionPane.WARNING_MESSAGE);  
                if(cont==0){
                    ((JLabel)f2.al.get(346)).setIcon(new ImageIcon(getClass().getResource("/immagini/cuore vuoto 49x49 strada.jpg"))); // NOI18N  
                }
                if(cont==1){
                    ((JLabel)f2.al.get(347)).setIcon(new ImageIcon(getClass().getResource("/immagini/cuore vuoto 49x49 strada.jpg"))); // NOI18N                      
                }
                if(cont==2){
                    ((JLabel)f2.al.get(348)).setIcon(new ImageIcon(getClass().getResource("/immagini/cuore vuoto 49x49 strada.jpg"))); // NOI18N                      
                    HubLivelli HB = new HubLivelli(f);
                    f2.setVisible(false);
                    f2.clip.stop();
                    f2.clip.close();
                }
                cont++;
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
                JOptionPane.showMessageDialog(f,"Ti sei scontrato contro un ostacolo!!!","ATTENZIONE!",JOptionPane.WARNING_MESSAGE);
                if(cont==0){
                    ((JLabel)f2.al.get(346)).setIcon(new ImageIcon(getClass().getResource("/immagini/cuore vuoto 49x49 strada.jpg"))); // NOI18N  
                }
                if(cont==1){
                    ((JLabel)f2.al.get(347)).setIcon(new ImageIcon(getClass().getResource("/immagini/cuore vuoto 49x49 strada.jpg"))); // NOI18N                      
                }
                if(cont==2){
                    ((JLabel)f2.al.get(348)).setIcon(new ImageIcon(getClass().getResource("/immagini/cuore vuoto 49x49 strada.jpg"))); // NOI18N                      
                    HubLivelli HB = new HubLivelli(f);
                    f2.setVisible(false);
                    f2.clip.stop();
                    f2.clip.close();
                }
                cont++;
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
                JOptionPane.showMessageDialog(f,"Ti sei scontrato contro un ostacolo!!!","ATTENZIONE!",JOptionPane.WARNING_MESSAGE);
                if(cont==0){
                    ((JLabel)f3.al.get(287)).setIcon(new ImageIcon(getClass().getResource("/immagini/cuore vuoto 40x40 strada.jpg"))); // NOI18N  
                }
                if(cont==1){
                    ((JLabel)f3.al.get(319)).setIcon(new ImageIcon(getClass().getResource("/immagini/cuore vuoto 40x40 strada.jpg"))); // NOI18N                      
                }
                if(cont==2){
                    ((JLabel)f3.al.get(351)).setIcon(new ImageIcon(getClass().getResource("/immagini/cuore vuoto 40x40 strada.jpg"))); // NOI18N                      
                    HubLivelli HB = new HubLivelli(f);
                    f3.setVisible(false);
                    f3.clip.stop();
                    f3.clip.close();
                }
                cont++;
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
                JOptionPane.showMessageDialog(f,"Ti sei scontrato contro un ostacolo!!!","ATTENZIONE!",JOptionPane.WARNING_MESSAGE);
                if(cont==0){
                    ((JLabel)f3.al.get(287)).setIcon(new ImageIcon(getClass().getResource("/immagini/cuore vuoto 40x40 strada.jpg"))); // NOI18N  
                }
                if(cont==1){
                    ((JLabel)f3.al.get(319)).setIcon(new ImageIcon(getClass().getResource("/immagini/cuore vuoto 40x40 strada.jpg"))); // NOI18N                      
                }
                if(cont==2){
                    ((JLabel)f3.al.get(351)).setIcon(new ImageIcon(getClass().getResource("/immagini/cuore vuoto 40x40 strada.jpg"))); // NOI18N                      
                    HubLivelli HB = new HubLivelli(f);
                    f3.setVisible(false);
                    f3.clip.stop();
                    f3.clip.close();
                }
                cont++;
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
                JOptionPane.showMessageDialog(f,"Ti sei scontrato contro un ostacolo!!!","ATTENZIONE!",JOptionPane.WARNING_MESSAGE);
                if(cont==0){
                    ((JLabel)f3.al.get(287)).setIcon(new ImageIcon(getClass().getResource("/immagini/cuore vuoto 40x40 strada.jpg"))); // NOI18N  
                }
                if(cont==1){
                    ((JLabel)f3.al.get(319)).setIcon(new ImageIcon(getClass().getResource("/immagini/cuore vuoto 40x40 strada.jpg"))); // NOI18N                      
                }
                if(cont==2){
                    ((JLabel)f3.al.get(351)).setIcon(new ImageIcon(getClass().getResource("/immagini/cuore vuoto 40x40 strada.jpg"))); // NOI18N                      
                    HubLivelli HB = new HubLivelli(f);
                    f3.setVisible(false);
                    f3.clip.stop();
                    f3.clip.close();
                }
                cont++;
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
                JOptionPane.showMessageDialog(f,"Ti sei scontrato contro un ostacolo!!!","ATTENZIONE!",JOptionPane.WARNING_MESSAGE);
                if(cont==0){
                    ((JLabel)f3.al.get(287)).setIcon(new ImageIcon(getClass().getResource("/immagini/cuore vuoto 40x40 strada.jpg"))); // NOI18N  
                }
                if(cont==1){
                    ((JLabel)f3.al.get(319)).setIcon(new ImageIcon(getClass().getResource("/immagini/cuore vuoto 40x40 strada.jpg"))); // NOI18N                      
                }
                if(cont==2){
                    ((JLabel)f3.al.get(351)).setIcon(new ImageIcon(getClass().getResource("/immagini/cuore vuoto 40x40 strada.jpg"))); // NOI18N                      
                    HubLivelli HB = new HubLivelli(f);
                    f3.setVisible(false);
                    f3.clip.stop();
                    f3.clip.close();
                }
                cont++;
                
                collisione = 'd';
                return 1;
        }
        
        return 1;    
    }
    
    /*
      Questo metodo controlla se l'erba della mappa è stata tagliata tutta,
      in tal caso interrompe il livello spegnendo la musica e tornando all'hub livelli.
      Commento solo il metodo del livello 0.
    */
    private void controllaFineLV0(){
        for(int i=0;i<10;i++){  //questo ciclo scorre tutta la matrice
            for(int j=0;j<18;j++){
                if(f0.matrice[i][j] == 0){  //se trova anche solo una casella con l'erba alta il metodo viene interrotto
                    return;                 //come se non fosse mai stato avviato
                }      
            }
        }      //se il ciclo finisce vuol dire che l'erba è tutta tagliata, quindi si può eseguire il resto del codice del metodo
        f0.clip.stop();  //spegne la musica si sottofondo
        HubLivelli HB = new HubLivelli(f);
        f0.setVisible(false);
        timer.stop();
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
        HubLivelli HB = new HubLivelli(f);
        f1.setVisible(false);
        timer.stop();
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
        HubLivelli HB = new HubLivelli(f);
        f2.setVisible(false);
        timer.stop();
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
        HubLivelli HB = new HubLivelli(f);
        f3.setVisible(false);
        timer.stop();
    }
    
    /*
      Questo metodo quando viene richiamato apre il file contenente il rumore del tagliaerba
      in attesa di essere avviato.
    */
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
