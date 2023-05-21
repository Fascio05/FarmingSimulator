
import java.io.File;
import java.util.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author utente
 */
public class Livello0 extends javax.swing.JFrame {

    AudioInputStream HeyDay, bum;  //variabili contenenti la musica di sottofondo e il rumore in caso di collisione
    Clip clip, clipBum;
    
    ArrayList<JLabel> al = new ArrayList<JLabel>(); //arraylist contenente tutti i JLabel
    
    int matrice[][] = {{1,1,1,0,0,1,1,1,1,0,0,0,0,0,0,0,1,1},  //matrice che rappresenta la mappa con i numeri
                       {1,1,1,0,0,0,1,1,0,0,0,0,0,0,0,0,1,1},  //0 = erba alta
                       {1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},  //1 = ostacolo
                       {1,1,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,1},  //2 = erba tagliata
                       {1,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0},  //3 = tagliaerba
                       {0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0},  //4 = zona non percorribile dal tagliaerba
                       {0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0},
                       {0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                       {1,0,0,1,1,1,0,0,0,0,0,0,0,0,0,0,1,1},
                       {1,3,0,0,0,0,0,0,1,1,0,0,0,0,1,1,1,1}};
    
    public Livello0() {
        initComponents();
        //setSize(960,540); pc piccoli
        setSize(1248,702); //pc normali
        setLocationRelativeTo(null); //centrare nello schermo
        setVisible(true);
        
        playHeyDay(); // avvia la musica di sottofondo
        
        addKeyListener(new MyKeyListener(this)); 
        
        al.add(jLabel1);  //memorizzazione mappa nell'arraylist (cella 0 = jlabel1 ecc...)
        al.add(jLabel2);
        al.add(jLabel3);
        al.add(jLabel4);
        al.add(jLabel5);
        al.add(jLabel6);
        al.add(jLabel7);
        al.add(jLabel8);
        al.add(jLabel9);
        al.add(jLabel10);
        al.add(jLabel11);
        al.add(jLabel12);
        al.add(jLabel13);
        al.add(jLabel14);
        al.add(jLabel15);
        al.add(jLabel16);
        al.add(jLabel17);
        al.add(jLabel18);
        al.add(jLabel19);
        al.add(jLabel20);
        al.add(jLabel21);
        al.add(jLabel22);
        al.add(jLabel23);
        al.add(jLabel24);
        al.add(jLabel25);
        al.add(jLabel26);
        al.add(jLabel27);
        al.add(jLabel28);
        al.add(jLabel29);
        al.add(jLabel30);
        al.add(jLabel31);
        al.add(jLabel32);
        al.add(jLabel33);
        al.add(jLabel34);
        al.add(jLabel35);
        al.add(jLabel36);
        al.add(jLabel37);
        al.add(jLabel38);
        al.add(jLabel39);
        al.add(jLabel40);
        al.add(jLabel41);
        al.add(jLabel42);
        al.add(jLabel43);
        al.add(jLabel44);
        al.add(jLabel45);
        al.add(jLabel46);
        al.add(jLabel47);
        al.add(jLabel48);
        al.add(jLabel49);
        al.add(jLabel50);
        al.add(jLabel51);
        al.add(jLabel52);
        al.add(jLabel53);
        al.add(jLabel54);
        al.add(jLabel55);
        al.add(jLabel56);
        al.add(jLabel57);
        al.add(jLabel58);
        al.add(jLabel59);
        al.add(jLabel60);
        al.add(jLabel61);
        al.add(jLabel62);
        al.add(jLabel63);
        al.add(jLabel64);
        al.add(jLabel65);
        al.add(jLabel66);
        al.add(jLabel67);
        al.add(jLabel68);
        al.add(jLabel69);
        al.add(jLabel70);
        al.add(jLabel71);
        al.add(jLabel72);
        al.add(jLabel73);
        al.add(jLabel74);
        al.add(jLabel75);
        al.add(jLabel76);
        al.add(jLabel77);
        al.add(jLabel78);
        al.add(jLabel79);
        al.add(jLabel80);
        al.add(jLabel81);
        al.add(jLabel82);
        al.add(jLabel83);
        al.add(jLabel84);
        al.add(jLabel85);
        al.add(jLabel86);
        al.add(jLabel87);
        al.add(jLabel88);
        al.add(jLabel89);
        al.add(jLabel90);
        al.add(jLabel91);
        al.add(jLabel92);
        al.add(jLabel93);
        al.add(jLabel94);
        al.add(jLabel95);
        al.add(jLabel96);
        al.add(jLabel97);
        al.add(jLabel98);
        al.add(jLabel99);
        al.add(jLabel100);
        al.add(jLabel101);
        al.add(jLabel102);
        al.add(jLabel103);
        al.add(jLabel104);
        al.add(jLabel105);
        al.add(jLabel106);
        al.add(jLabel107);
        al.add(jLabel108);
        al.add(jLabel109);
        al.add(jLabel110);
        al.add(jLabel111);
        al.add(jLabel112);
        al.add(jLabel113);
        al.add(jLabel114);
        al.add(jLabel115);
        al.add(jLabel116);
        al.add(jLabel117);
        al.add(jLabel118);
        al.add(jLabel119);
        al.add(jLabel120);
        al.add(jLabel121);
        al.add(jLabel122);
        al.add(jLabel123);
        al.add(jLabel124);
        al.add(jLabel125);
        al.add(jLabel126);
        al.add(jLabel127);
        al.add(jLabel128);
        al.add(jLabel129);
        al.add(jLabel130);
        al.add(jLabel131);
        al.add(jLabel132);
        al.add(jLabel133);
        al.add(jLabel134);
        al.add(jLabel135);
        al.add(jLabel136);
        al.add(jLabel137);
        al.add(jLabel138);
        al.add(jLabel139);
        al.add(jLabel140);
        al.add(jLabel141);
        al.add(jLabel142);
        al.add(jLabel143);
        al.add(jLabel144);
        al.add(jLabel145);
        al.add(jLabel146);
        al.add(jLabel147);
        al.add(jLabel148);
        al.add(jLabel149);
        al.add(jLabel150);
        al.add(jLabel151);
        al.add(jLabel152);
        al.add(jLabel153);
        al.add(jLabel154);
        al.add(jLabel155);
        al.add(jLabel156);
        al.add(jLabel157);
        al.add(jLabel158);
        al.add(jLabel159);
        al.add(jLabel160);
        al.add(jLabel161);
        al.add(jLabel162);
        al.add(jLabel163);
        al.add(jLabel164);
        al.add(jLabel165);
        al.add(jLabel166);
        al.add(jLabel167);
        al.add(jLabel168);
        al.add(jLabel169);
        al.add(jLabel170);
        al.add(jLabel171);
        al.add(jLabel172);
        al.add(jLabel173);
        al.add(jLabel174);
        al.add(jLabel175);
        al.add(jLabel176);
        al.add(jLabel177);
        al.add(jLabel178);
        al.add(jLabel179);
        al.add(jLabel180);    
    }
    
    private void playHeyDay(){ // apre e avvia la musica di sottofondo
        try {
            HeyDay = AudioSystem.getAudioInputStream(new File("src/audio/Hey-Day.wav").getAbsoluteFile());
            clip = AudioSystem.getClip();
            clip.open(HeyDay);
            clip.start();
            clip.loop(100);
        } catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
     }
     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        jLabel157 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        jLabel159 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        jLabel161 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();
        jLabel165 = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        jLabel168 = new javax.swing.JLabel();
        jLabel169 = new javax.swing.JLabel();
        jLabel170 = new javax.swing.JLabel();
        jLabel171 = new javax.swing.JLabel();
        jLabel172 = new javax.swing.JLabel();
        jLabel173 = new javax.swing.JLabel();
        jLabel174 = new javax.swing.JLabel();
        jLabel175 = new javax.swing.JLabel();
        jLabel176 = new javax.swing.JLabel();
        jLabel177 = new javax.swing.JLabel();
        jLabel178 = new javax.swing.JLabel();
        jLabel179 = new javax.swing.JLabel();
        jLabel180 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(10, 18));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/acquaLV0-68x68.png"))); // NOI18N
        getContentPane().add(jLabel1);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/acquaLV0-68x68.png"))); // NOI18N
        getContentPane().add(jLabel2);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/acquaLV0-68x68.png"))); // NOI18N
        getContentPane().add(jLabel3);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel4);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel5);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fogliaLV0-68x68.png"))); // NOI18N
        getContentPane().add(jLabel6);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fogliaLV0-68x68.png"))); // NOI18N
        getContentPane().add(jLabel7);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fogliaLV0-68x68.png"))); // NOI18N
        getContentPane().add(jLabel8);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fogliaLV0-68x68.png"))); // NOI18N
        getContentPane().add(jLabel9);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel10);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel11);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel12);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel13);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel14);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel15);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel16);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fogliaLV0-68x68.png"))); // NOI18N
        getContentPane().add(jLabel17);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fogliaLV0-68x68.png"))); // NOI18N
        getContentPane().add(jLabel18);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/acquaLV0-68x68.png"))); // NOI18N
        getContentPane().add(jLabel19);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/ninfeaLV0-68x68.png"))); // NOI18N
        getContentPane().add(jLabel20);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/acquaLV0-68x68.png"))); // NOI18N
        getContentPane().add(jLabel21);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel22);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel23);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel24);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fogliaLV0-68x68.png"))); // NOI18N
        getContentPane().add(jLabel25);

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fogliaLV0-68x68.png"))); // NOI18N
        getContentPane().add(jLabel26);

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel27);

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel28);

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel29);

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel30);

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel31);

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel32);

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel33);

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel34);

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fogliaLV0-68x68.png"))); // NOI18N
        getContentPane().add(jLabel35);

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fogliaLV0-68x68.png"))); // NOI18N
        getContentPane().add(jLabel36);

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/acquaLV0-68x68.png"))); // NOI18N
        getContentPane().add(jLabel37);

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/acquaLV0-68x68.png"))); // NOI18N
        getContentPane().add(jLabel38);

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/acquaLV0-68x68.png"))); // NOI18N
        getContentPane().add(jLabel39);

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel40);

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel41);

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel42);

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel43);

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel44);

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel45);

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel46);

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel47);

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel48);

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel49);

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel50);

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel51);

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel52);

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fogliaLV0-68x68.png"))); // NOI18N
        getContentPane().add(jLabel53);

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fogliaLV0-68x68.png"))); // NOI18N
        getContentPane().add(jLabel54);

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/acquaLV0-68x68.png"))); // NOI18N
        getContentPane().add(jLabel55);

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/acquaLV0-68x68.png"))); // NOI18N
        getContentPane().add(jLabel56);

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel57);

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel58);

        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel59);

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel60);

        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel61);

        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel62);

        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel63);

        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fieno2LV0-68x68.png"))); // NOI18N
        getContentPane().add(jLabel64);

        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fieno1LV0-68x68.png"))); // NOI18N
        getContentPane().add(jLabel65);

        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel66);

        jLabel67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel67);

        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel68);

        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel69);

        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel70);

        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel71);

        jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fogliaLV0-68x68.png"))); // NOI18N
        getContentPane().add(jLabel72);

        jLabel73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/acquaLV0-68x68.png"))); // NOI18N
        getContentPane().add(jLabel73);

        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel74);

        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel75);

        jLabel76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel76);

        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel77);

        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel78);

        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel79);

        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel80);

        jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel81);

        jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel82);

        jLabel83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fieno2LV0-68x68.png"))); // NOI18N
        getContentPane().add(jLabel83);

        jLabel84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fieno1LV0-68x68.png"))); // NOI18N
        getContentPane().add(jLabel84);

        jLabel85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel85);

        jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel86);

        jLabel87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel87);

        jLabel88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel88);

        jLabel89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel89);

        jLabel90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel90);

        jLabel91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel91);

        jLabel92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel92);

        jLabel93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel93);

        jLabel94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel94);

        jLabel95.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel95);

        jLabel96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel96);

        jLabel97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel97);

        jLabel98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel98);

        jLabel99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel99);

        jLabel100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel100);

        jLabel101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fieno2LV0-68x68.png"))); // NOI18N
        getContentPane().add(jLabel101);

        jLabel102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel102);

        jLabel103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel103);

        jLabel104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel104);

        jLabel105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel105);

        jLabel106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel106);

        jLabel107.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel107);

        jLabel108.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel108);

        jLabel109.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel109);

        jLabel110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel110);

        jLabel111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel111);

        jLabel112.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel112);

        jLabel113.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel113);

        jLabel114.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel114);

        jLabel115.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel115);

        jLabel116.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel116);

        jLabel117.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel117);

        jLabel118.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel118);

        jLabel119.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel119);

        jLabel120.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fieno1LV0-68x68.png"))); // NOI18N
        getContentPane().add(jLabel120);

        jLabel121.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel121);

        jLabel122.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel122);

        jLabel123.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel123);

        jLabel124.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel124);

        jLabel125.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel125);

        jLabel126.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel126);

        jLabel127.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel127);

        jLabel128.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel128);

        jLabel129.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fieno1LV0-68x68.png"))); // NOI18N
        getContentPane().add(jLabel129);

        jLabel130.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fieno2LV0-68x68.png"))); // NOI18N
        getContentPane().add(jLabel130);

        jLabel131.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel131);

        jLabel132.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel132);

        jLabel133.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel133);

        jLabel134.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel134);

        jLabel135.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel135);

        jLabel136.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel136);

        jLabel137.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel137);

        jLabel138.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel138);

        jLabel139.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel139);

        jLabel140.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel140);

        jLabel141.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel141);

        jLabel142.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel142);

        jLabel143.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel143);

        jLabel144.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/acquaLV0-68x68.png"))); // NOI18N
        getContentPane().add(jLabel144);

        jLabel145.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/acquaLV0-68x68.png"))); // NOI18N
        getContentPane().add(jLabel145);

        jLabel146.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel146);

        jLabel147.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel147);

        jLabel148.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fieno2LV0-68x68.png"))); // NOI18N
        getContentPane().add(jLabel148);

        jLabel149.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fieno1LV0-68x68.png"))); // NOI18N
        getContentPane().add(jLabel149);

        jLabel150.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fieno2LV0-68x68.png"))); // NOI18N
        getContentPane().add(jLabel150);

        jLabel151.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel151);

        jLabel152.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel152);

        jLabel153.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel153);

        jLabel154.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel154);

        jLabel155.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel155);

        jLabel156.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel156);

        jLabel157.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel157);

        jLabel158.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel158);

        jLabel159.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel159);

        jLabel160.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel160);

        jLabel161.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/acquaLV0-68x68.png"))); // NOI18N
        getContentPane().add(jLabel161);

        jLabel162.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/acquaLV0-68x68.png"))); // NOI18N
        getContentPane().add(jLabel162);

        jLabel163.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/acquaLV0-68x68.png"))); // NOI18N
        getContentPane().add(jLabel163);

        jLabel164.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/tagliaerbaLV0-68x68.jpg"))); // NOI18N
        getContentPane().add(jLabel164);

        jLabel165.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel165);

        jLabel166.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel166);

        jLabel167.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel167);

        jLabel168.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel168);

        jLabel169.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel169);

        jLabel170.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel170);

        jLabel171.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fogliaLV0-68x68.png"))); // NOI18N
        getContentPane().add(jLabel171);

        jLabel172.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fogliaLV0-68x68.png"))); // NOI18N
        getContentPane().add(jLabel172);

        jLabel173.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel173);

        jLabel174.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel174);

        jLabel175.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel175);

        jLabel176.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel176);

        jLabel177.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/acquaLV0-68x68.png"))); // NOI18N
        getContentPane().add(jLabel177);

        jLabel178.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/acquaLV0-68x68.png"))); // NOI18N
        getContentPane().add(jLabel178);

        jLabel179.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/ninfeaLV0-68x68.png"))); // NOI18N
        getContentPane().add(jLabel179);

        jLabel180.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/acquaLV0-68x68.png"))); // NOI18N
        getContentPane().add(jLabel180);

        setBounds(0, 0, 656, 368);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    // End of variables declaration//GEN-END:variables
}
