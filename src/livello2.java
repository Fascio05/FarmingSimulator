
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author netti
 */
public class livello2 extends javax.swing.JFrame {

    ArrayList<JLabel> al = new ArrayList<JLabel>();
    
    public livello2() {
        initComponents();
        //setSize(960,540); pc piccoli
        setSize(1248,702); //pc normali
        setLocationRelativeTo(null); //centrare nello schermo
        setVisible(true);
        
        addKeyListener(new MyKeyListener(this));

        /*for (int i = 1; i <= 350; i++) {
            JLabel label = new JLabel();
            label.setName("JLabel" + i); //imposta il nome della JLabel concatenando "JLabel" con il valore corrente di i
            al.add(label);
        }*/
        
        
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
        al.add(jLabel181);
        al.add(jLabel182);
        al.add(jLabel183);
        al.add(jLabel184);
        al.add(jLabel185);
        al.add(jLabel186);
        al.add(jLabel187);
        al.add(jLabel188);
        al.add(jLabel189);
        al.add(jLabel190);
        al.add(jLabel191);
        al.add(jLabel192);
        al.add(jLabel193);
        al.add(jLabel194);
        al.add(jLabel195);
        al.add(jLabel196);
        al.add(jLabel197);
        al.add(jLabel198);
        al.add(jLabel199);
        al.add(jLabel200);
        al.add(jLabel201);
        al.add(jLabel202);
        al.add(jLabel203);
        al.add(jLabel204);
        al.add(jLabel205);
        al.add(jLabel206);
        al.add(jLabel207);
        al.add(jLabel208);
        al.add(jLabel209);
        al.add(jLabel210);
        al.add(jLabel211);
        al.add(jLabel212);
        al.add(jLabel213);
        al.add(jLabel214);
        al.add(jLabel215);
        al.add(jLabel216);
        al.add(jLabel217);
        al.add(jLabel218);
        al.add(jLabel219);
        al.add(jLabel220);
        al.add(jLabel221);
        al.add(jLabel222);
        al.add(jLabel223);
        al.add(jLabel224);
        al.add(jLabel225);
        al.add(jLabel226);
        al.add(jLabel227);
        al.add(jLabel228);
        al.add(jLabel229);
        al.add(jLabel230);
        al.add(jLabel231);
        al.add(jLabel232);
        al.add(jLabel233);
        al.add(jLabel234);
        al.add(jLabel235);
        al.add(jLabel236);
        al.add(jLabel237);
        al.add(jLabel238);
        al.add(jLabel239);
        al.add(jLabel240);
        al.add(jLabel241);
        al.add(jLabel242);
        al.add(jLabel243);
        al.add(jLabel244);
        al.add(jLabel245);
        al.add(jLabel246);
        al.add(jLabel247);
        al.add(jLabel248);
        al.add(jLabel249);
        al.add(jLabel250);
        al.add(jLabel251);
        al.add(jLabel252);
        al.add(jLabel253);
        al.add(jLabel254);
        al.add(jLabel255);
        al.add(jLabel256);
        al.add(jLabel257);
        al.add(jLabel258);
        al.add(jLabel259);
        al.add(jLabel260);
        al.add(jLabel261);
        al.add(jLabel262);
        al.add(jLabel263);
        al.add(jLabel264);
        al.add(jLabel265);
        al.add(jLabel266);
        al.add(jLabel267);
        al.add(jLabel268);
        al.add(jLabel269);
        al.add(jLabel270);
        al.add(jLabel271);
        al.add(jLabel272);
        al.add(jLabel273);
        al.add(jLabel274);
        al.add(jLabel275);
        al.add(jLabel276);
        al.add(jLabel277);
        al.add(jLabel278);
        al.add(jLabel279);
        al.add(jLabel280);
        al.add(jLabel281);
        al.add(jLabel282);
        al.add(jLabel283);
        al.add(jLabel284);
        al.add(jLabel285);
        al.add(jLabel286);
        al.add(jLabel287);
        al.add(jLabel288);
        al.add(jLabel289);
        al.add(jLabel290);
        al.add(jLabel291);
        al.add(jLabel292);
        al.add(jLabel293);
        al.add(jLabel294);
        al.add(jLabel295);
        al.add(jLabel296);
        al.add(jLabel297);
        al.add(jLabel298);
        al.add(jLabel299);
        al.add(jLabel300);
        al.add(jLabel301);
        al.add(jLabel302);
        al.add(jLabel303);
        al.add(jLabel304);
        al.add(jLabel305);
        al.add(jLabel306);
        al.add(jLabel307);
        al.add(jLabel308);
        al.add(jLabel309);
        al.add(jLabel310);
        al.add(jLabel311);
        al.add(jLabel312);
        al.add(jLabel313);
        al.add(jLabel314);
        al.add(jLabel315);
        al.add(jLabel316);
        al.add(jLabel317);
        al.add(jLabel318);
        al.add(jLabel319);
        al.add(jLabel320);
        al.add(jLabel321);
        al.add(jLabel322);
        al.add(jLabel323);
        al.add(jLabel324);
        al.add(jLabel325);
        al.add(jLabel326);
        al.add(jLabel327);
        al.add(jLabel328);
        al.add(jLabel329);
        al.add(jLabel330);
        al.add(jLabel331);
        al.add(jLabel332);
        al.add(jLabel333);
        al.add(jLabel334);
        al.add(jLabel335);
        al.add(jLabel336);
        al.add(jLabel337);
        al.add(jLabel338);
        al.add(jLabel339);
        al.add(jLabel340);
        al.add(jLabel341);
        al.add(jLabel342);
        al.add(jLabel343);
        al.add(jLabel344);
        al.add(jLabel345);
        al.add(jLabel346);
        al.add(jLabel347);
        al.add(jLabel348);
        al.add(jLabel349);
        al.add(jLabel350); 
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
        jLabel181 = new javax.swing.JLabel();
        jLabel182 = new javax.swing.JLabel();
        jLabel183 = new javax.swing.JLabel();
        jLabel184 = new javax.swing.JLabel();
        jLabel185 = new javax.swing.JLabel();
        jLabel186 = new javax.swing.JLabel();
        jLabel187 = new javax.swing.JLabel();
        jLabel188 = new javax.swing.JLabel();
        jLabel189 = new javax.swing.JLabel();
        jLabel190 = new javax.swing.JLabel();
        jLabel191 = new javax.swing.JLabel();
        jLabel192 = new javax.swing.JLabel();
        jLabel193 = new javax.swing.JLabel();
        jLabel194 = new javax.swing.JLabel();
        jLabel195 = new javax.swing.JLabel();
        jLabel196 = new javax.swing.JLabel();
        jLabel197 = new javax.swing.JLabel();
        jLabel198 = new javax.swing.JLabel();
        jLabel199 = new javax.swing.JLabel();
        jLabel200 = new javax.swing.JLabel();
        jLabel201 = new javax.swing.JLabel();
        jLabel202 = new javax.swing.JLabel();
        jLabel203 = new javax.swing.JLabel();
        jLabel204 = new javax.swing.JLabel();
        jLabel205 = new javax.swing.JLabel();
        jLabel206 = new javax.swing.JLabel();
        jLabel207 = new javax.swing.JLabel();
        jLabel208 = new javax.swing.JLabel();
        jLabel209 = new javax.swing.JLabel();
        jLabel210 = new javax.swing.JLabel();
        jLabel211 = new javax.swing.JLabel();
        jLabel212 = new javax.swing.JLabel();
        jLabel213 = new javax.swing.JLabel();
        jLabel214 = new javax.swing.JLabel();
        jLabel215 = new javax.swing.JLabel();
        jLabel216 = new javax.swing.JLabel();
        jLabel217 = new javax.swing.JLabel();
        jLabel218 = new javax.swing.JLabel();
        jLabel219 = new javax.swing.JLabel();
        jLabel220 = new javax.swing.JLabel();
        jLabel221 = new javax.swing.JLabel();
        jLabel222 = new javax.swing.JLabel();
        jLabel223 = new javax.swing.JLabel();
        jLabel224 = new javax.swing.JLabel();
        jLabel225 = new javax.swing.JLabel();
        jLabel226 = new javax.swing.JLabel();
        jLabel227 = new javax.swing.JLabel();
        jLabel228 = new javax.swing.JLabel();
        jLabel229 = new javax.swing.JLabel();
        jLabel230 = new javax.swing.JLabel();
        jLabel231 = new javax.swing.JLabel();
        jLabel232 = new javax.swing.JLabel();
        jLabel233 = new javax.swing.JLabel();
        jLabel234 = new javax.swing.JLabel();
        jLabel235 = new javax.swing.JLabel();
        jLabel236 = new javax.swing.JLabel();
        jLabel237 = new javax.swing.JLabel();
        jLabel238 = new javax.swing.JLabel();
        jLabel239 = new javax.swing.JLabel();
        jLabel240 = new javax.swing.JLabel();
        jLabel241 = new javax.swing.JLabel();
        jLabel242 = new javax.swing.JLabel();
        jLabel243 = new javax.swing.JLabel();
        jLabel244 = new javax.swing.JLabel();
        jLabel245 = new javax.swing.JLabel();
        jLabel246 = new javax.swing.JLabel();
        jLabel247 = new javax.swing.JLabel();
        jLabel248 = new javax.swing.JLabel();
        jLabel249 = new javax.swing.JLabel();
        jLabel250 = new javax.swing.JLabel();
        jLabel251 = new javax.swing.JLabel();
        jLabel252 = new javax.swing.JLabel();
        jLabel253 = new javax.swing.JLabel();
        jLabel254 = new javax.swing.JLabel();
        jLabel255 = new javax.swing.JLabel();
        jLabel256 = new javax.swing.JLabel();
        jLabel257 = new javax.swing.JLabel();
        jLabel258 = new javax.swing.JLabel();
        jLabel259 = new javax.swing.JLabel();
        jLabel260 = new javax.swing.JLabel();
        jLabel261 = new javax.swing.JLabel();
        jLabel262 = new javax.swing.JLabel();
        jLabel263 = new javax.swing.JLabel();
        jLabel264 = new javax.swing.JLabel();
        jLabel265 = new javax.swing.JLabel();
        jLabel266 = new javax.swing.JLabel();
        jLabel267 = new javax.swing.JLabel();
        jLabel268 = new javax.swing.JLabel();
        jLabel269 = new javax.swing.JLabel();
        jLabel270 = new javax.swing.JLabel();
        jLabel271 = new javax.swing.JLabel();
        jLabel272 = new javax.swing.JLabel();
        jLabel273 = new javax.swing.JLabel();
        jLabel274 = new javax.swing.JLabel();
        jLabel275 = new javax.swing.JLabel();
        jLabel276 = new javax.swing.JLabel();
        jLabel277 = new javax.swing.JLabel();
        jLabel278 = new javax.swing.JLabel();
        jLabel279 = new javax.swing.JLabel();
        jLabel280 = new javax.swing.JLabel();
        jLabel281 = new javax.swing.JLabel();
        jLabel282 = new javax.swing.JLabel();
        jLabel283 = new javax.swing.JLabel();
        jLabel284 = new javax.swing.JLabel();
        jLabel285 = new javax.swing.JLabel();
        jLabel286 = new javax.swing.JLabel();
        jLabel287 = new javax.swing.JLabel();
        jLabel288 = new javax.swing.JLabel();
        jLabel289 = new javax.swing.JLabel();
        jLabel290 = new javax.swing.JLabel();
        jLabel291 = new javax.swing.JLabel();
        jLabel292 = new javax.swing.JLabel();
        jLabel293 = new javax.swing.JLabel();
        jLabel294 = new javax.swing.JLabel();
        jLabel295 = new javax.swing.JLabel();
        jLabel296 = new javax.swing.JLabel();
        jLabel297 = new javax.swing.JLabel();
        jLabel298 = new javax.swing.JLabel();
        jLabel299 = new javax.swing.JLabel();
        jLabel300 = new javax.swing.JLabel();
        jLabel301 = new javax.swing.JLabel();
        jLabel302 = new javax.swing.JLabel();
        jLabel303 = new javax.swing.JLabel();
        jLabel304 = new javax.swing.JLabel();
        jLabel305 = new javax.swing.JLabel();
        jLabel306 = new javax.swing.JLabel();
        jLabel307 = new javax.swing.JLabel();
        jLabel308 = new javax.swing.JLabel();
        jLabel309 = new javax.swing.JLabel();
        jLabel310 = new javax.swing.JLabel();
        jLabel311 = new javax.swing.JLabel();
        jLabel312 = new javax.swing.JLabel();
        jLabel313 = new javax.swing.JLabel();
        jLabel314 = new javax.swing.JLabel();
        jLabel315 = new javax.swing.JLabel();
        jLabel316 = new javax.swing.JLabel();
        jLabel317 = new javax.swing.JLabel();
        jLabel318 = new javax.swing.JLabel();
        jLabel319 = new javax.swing.JLabel();
        jLabel320 = new javax.swing.JLabel();
        jLabel321 = new javax.swing.JLabel();
        jLabel322 = new javax.swing.JLabel();
        jLabel323 = new javax.swing.JLabel();
        jLabel324 = new javax.swing.JLabel();
        jLabel325 = new javax.swing.JLabel();
        jLabel326 = new javax.swing.JLabel();
        jLabel327 = new javax.swing.JLabel();
        jLabel328 = new javax.swing.JLabel();
        jLabel329 = new javax.swing.JLabel();
        jLabel330 = new javax.swing.JLabel();
        jLabel331 = new javax.swing.JLabel();
        jLabel332 = new javax.swing.JLabel();
        jLabel333 = new javax.swing.JLabel();
        jLabel334 = new javax.swing.JLabel();
        jLabel335 = new javax.swing.JLabel();
        jLabel336 = new javax.swing.JLabel();
        jLabel337 = new javax.swing.JLabel();
        jLabel338 = new javax.swing.JLabel();
        jLabel339 = new javax.swing.JLabel();
        jLabel340 = new javax.swing.JLabel();
        jLabel341 = new javax.swing.JLabel();
        jLabel342 = new javax.swing.JLabel();
        jLabel343 = new javax.swing.JLabel();
        jLabel344 = new javax.swing.JLabel();
        jLabel345 = new javax.swing.JLabel();
        jLabel346 = new javax.swing.JLabel();
        jLabel347 = new javax.swing.JLabel();
        jLabel348 = new javax.swing.JLabel();
        jLabel349 = new javax.swing.JLabel();
        jLabel350 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Livello 2");
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(14, 25));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fogliaLV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel1);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fogliaLV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel2);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fogliaLV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel3);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fogliaLV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel4);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel5);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel6);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel7);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel8);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
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

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel17);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel18);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel19);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel20);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel21);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel22);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel23);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel24);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel25);

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fogliaLV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel26);

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fogliaLV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel27);

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fogliaLV2-49x49.png"))); // NOI18N
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

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel35);

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel36);

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel37);

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel38);

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
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

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel53);

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel54);

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel55);

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
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

        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fieno1LV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel64);

        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fieno2LV2-49x49.png"))); // NOI18N
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

        jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel72);

        jLabel73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fogliaLV2-49x49.png"))); // NOI18N
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

        jLabel83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel83);

        jLabel84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel84);

        jLabel85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel85);

        jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel86);

        jLabel87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel87);

        jLabel88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fieno1LV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel88);

        jLabel89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fieno1LV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel89);

        jLabel90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fieno1LV2-49x49.png"))); // NOI18N
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

        jLabel97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fogliaLV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel97);

        jLabel98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fogliaLV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel98);

        jLabel99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fogliaLV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel99);

        jLabel100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel100);

        jLabel101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel101);

        jLabel102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel102);

        jLabel103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel103);

        jLabel104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel104);

        jLabel105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fieno1LV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel105);

        jLabel106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fieno2LV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel106);

        jLabel107.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel107);

        jLabel108.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel108);

        jLabel109.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel109);

        jLabel110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/acquaLV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel110);

        jLabel111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/acquaLV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel111);

        jLabel112.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/acquaLV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel112);

        jLabel113.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fieno1LV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel113);

        jLabel114.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fieno2LV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel114);

        jLabel115.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fieno1LV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel115);

        jLabel116.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel116);

        jLabel117.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel117);

        jLabel118.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel118);

        jLabel119.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel119);

        jLabel120.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel120);

        jLabel121.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel121);

        jLabel122.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel122);

        jLabel123.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fogliaLV2-49x49.png"))); // NOI18N
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

        jLabel129.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel129);

        jLabel130.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fieno1LV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel130);

        jLabel131.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fieno1LV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel131);

        jLabel132.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel132);

        jLabel133.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel133);

        jLabel134.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/acquaLV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel134);

        jLabel135.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/acquaLV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel135);

        jLabel136.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/acquaLV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel136);

        jLabel137.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/acquaLV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel137);

        jLabel138.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/ninfeaLV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel138);

        jLabel139.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/acquaLV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel139);

        jLabel140.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel140);

        jLabel141.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel141);

        jLabel142.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel142);

        jLabel143.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel143);

        jLabel144.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel144);

        jLabel145.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel145);

        jLabel146.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel146);

        jLabel147.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel147);

        jLabel148.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel148);

        jLabel149.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel149);

        jLabel150.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
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

        jLabel158.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/acquaLV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel158);

        jLabel159.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/acquaLV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel159);

        jLabel160.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/ninfeaLV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel160);

        jLabel161.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/acquaLV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel161);

        jLabel162.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/acquaLV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel162);

        jLabel163.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/acquaLV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel163);

        jLabel164.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/acquaLV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel164);

        jLabel165.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/acquaLV2-49x49.png"))); // NOI18N
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

        jLabel171.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel171);

        jLabel172.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel172);

        jLabel173.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel173);

        jLabel174.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel174);

        jLabel175.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fieno2LV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel175);

        jLabel176.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel176);

        jLabel177.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel177);

        jLabel178.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel178);

        jLabel179.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel179);

        jLabel180.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel180);

        jLabel181.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel181);

        jLabel182.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/acquaLV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel182);

        jLabel183.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/ninfeaLV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel183);

        jLabel184.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/acquaLV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel184);

        jLabel185.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/acquaLV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel185);

        jLabel186.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/acquaLV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel186);

        jLabel187.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/acquaLV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel187);

        jLabel188.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel188);

        jLabel189.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel189);

        jLabel190.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel190);

        jLabel191.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel191);

        jLabel192.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel192);

        jLabel193.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel193);

        jLabel194.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel194);

        jLabel195.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel195);

        jLabel196.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel196);

        jLabel197.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel197);

        jLabel198.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel198);

        jLabel199.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel199);

        jLabel200.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fieno1LV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel200);

        jLabel201.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel201);

        jLabel202.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel202);

        jLabel203.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel203);

        jLabel204.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel204);

        jLabel205.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel205);

        jLabel206.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/acquaLV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel206);

        jLabel207.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/acquaLV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel207);

        jLabel208.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/acquaLV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel208);

        jLabel209.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/acquaLV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel209);

        jLabel210.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/acquaLV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel210);

        jLabel211.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/acquaLV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel211);

        jLabel212.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/acquaLV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel212);

        jLabel213.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel213);

        jLabel214.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel214);

        jLabel215.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel215);

        jLabel216.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel216);

        jLabel217.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel217);

        jLabel218.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel218);

        jLabel219.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel219);

        jLabel220.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel220);

        jLabel221.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel221);

        jLabel222.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel222);

        jLabel223.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel223);

        jLabel224.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel224);

        jLabel225.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel225);

        jLabel226.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel226);

        jLabel227.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel227);

        jLabel228.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel228);

        jLabel229.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel229);

        jLabel230.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel230);

        jLabel231.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/acquaLV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel231);

        jLabel232.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel232);

        jLabel233.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel233);

        jLabel234.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel234);

        jLabel235.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/acquaLV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel235);

        jLabel236.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/acquaLV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel236);

        jLabel237.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel237);

        jLabel238.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel238);

        jLabel239.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel239);

        jLabel240.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel240);

        jLabel241.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel241);

        jLabel242.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel242);

        jLabel243.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel243);

        jLabel244.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel244);

        jLabel245.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fogliaLV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel245);

        jLabel246.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fogliaLV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel246);

        jLabel247.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel247);

        jLabel248.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel248);

        jLabel249.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel249);

        jLabel250.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel250);

        jLabel251.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel251);

        jLabel252.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel252);

        jLabel253.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel253);

        jLabel254.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel254);

        jLabel255.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel255);

        jLabel256.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel256);

        jLabel257.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel257.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/taglia erba.jpg"))); // NOI18N
        getContentPane().add(jLabel257);

        jLabel258.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel258);

        jLabel259.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel259);

        jLabel260.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel260);

        jLabel261.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel261);

        jLabel262.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel262);

        jLabel263.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel263);

        jLabel264.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel264);

        jLabel265.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel265);

        jLabel266.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel266);

        jLabel267.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel267);

        jLabel268.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel268);

        jLabel269.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fogliaLV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel269);

        jLabel270.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fogliaLV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel270);

        jLabel271.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fogliaLV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel271);

        jLabel272.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fogliaLV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel272);

        jLabel273.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel273);

        jLabel274.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel274);

        jLabel275.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel275);

        jLabel276.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel276);

        jLabel277.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fieno1LV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel277);

        jLabel278.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel278);

        jLabel279.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel279);

        jLabel280.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel280);

        jLabel281.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel281);

        jLabel282.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel282);

        jLabel283.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel283);

        jLabel284.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel284);

        jLabel285.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel285);

        jLabel286.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel286);

        jLabel287.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel287);

        jLabel288.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel288);

        jLabel289.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel289);

        jLabel290.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel290);

        jLabel291.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fieno2LV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel291);

        jLabel292.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel292);

        jLabel293.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel293);

        jLabel294.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fogliaLV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel294);

        jLabel295.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fogliaLV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel295);

        jLabel296.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fogliaLV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel296);

        jLabel297.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fogliaLV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel297);

        jLabel298.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel298);

        jLabel299.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel299);

        jLabel300.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel300);

        jLabel301.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel301);

        jLabel302.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fieno2LV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel302);

        jLabel303.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fieno2LV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel303);

        jLabel304.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fieno1LV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel304);

        jLabel305.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel305);

        jLabel306.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel306);

        jLabel307.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel307);

        jLabel308.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel308);

        jLabel309.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel309);

        jLabel310.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel310);

        jLabel311.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel311);

        jLabel312.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel312);

        jLabel313.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel313);

        jLabel314.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel314);

        jLabel315.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fieno1LV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel315);

        jLabel316.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fieno1LV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel316);

        jLabel317.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fieno2LV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel317);

        jLabel318.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel318);

        jLabel319.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel319);

        jLabel320.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fogliaLV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel320);

        jLabel321.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/fogliaLV2-49x49.png"))); // NOI18N
        getContentPane().add(jLabel321);

        jLabel322.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel322);

        jLabel323.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel323);

        jLabel324.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel324);

        jLabel325.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel325);

        jLabel326.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel326);

        jLabel327.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel327);

        jLabel328.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel328);

        jLabel329.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel329);

        jLabel330.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel330);

        jLabel331.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel331);

        jLabel332.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel332);

        jLabel333.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel333);

        jLabel334.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel334);

        jLabel335.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel335);

        jLabel336.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel336);

        jLabel337.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel337);

        jLabel338.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel338);

        jLabel339.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel339);

        jLabel340.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel340);

        jLabel341.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel341);

        jLabel342.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel342);

        jLabel343.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel343);

        jLabel344.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel344);

        jLabel345.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel345);

        jLabel346.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel346);

        jLabel347.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel347);

        jLabel348.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel348);

        jLabel349.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel349);

        jLabel350.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini livelli/erba alta.PNG"))); // NOI18N
        getContentPane().add(jLabel350);

        setSize(new java.awt.Dimension(656, 368));
        setLocationRelativeTo(null);
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
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel191;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel194;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel197;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel199;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel200;
    private javax.swing.JLabel jLabel201;
    private javax.swing.JLabel jLabel202;
    private javax.swing.JLabel jLabel203;
    private javax.swing.JLabel jLabel204;
    private javax.swing.JLabel jLabel205;
    private javax.swing.JLabel jLabel206;
    private javax.swing.JLabel jLabel207;
    private javax.swing.JLabel jLabel208;
    private javax.swing.JLabel jLabel209;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel210;
    private javax.swing.JLabel jLabel211;
    private javax.swing.JLabel jLabel212;
    private javax.swing.JLabel jLabel213;
    private javax.swing.JLabel jLabel214;
    private javax.swing.JLabel jLabel215;
    private javax.swing.JLabel jLabel216;
    private javax.swing.JLabel jLabel217;
    private javax.swing.JLabel jLabel218;
    private javax.swing.JLabel jLabel219;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel220;
    private javax.swing.JLabel jLabel221;
    private javax.swing.JLabel jLabel222;
    private javax.swing.JLabel jLabel223;
    private javax.swing.JLabel jLabel224;
    private javax.swing.JLabel jLabel225;
    private javax.swing.JLabel jLabel226;
    private javax.swing.JLabel jLabel227;
    private javax.swing.JLabel jLabel228;
    private javax.swing.JLabel jLabel229;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel230;
    private javax.swing.JLabel jLabel231;
    private javax.swing.JLabel jLabel232;
    private javax.swing.JLabel jLabel233;
    private javax.swing.JLabel jLabel234;
    private javax.swing.JLabel jLabel235;
    private javax.swing.JLabel jLabel236;
    private javax.swing.JLabel jLabel237;
    private javax.swing.JLabel jLabel238;
    private javax.swing.JLabel jLabel239;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel240;
    private javax.swing.JLabel jLabel241;
    private javax.swing.JLabel jLabel242;
    private javax.swing.JLabel jLabel243;
    private javax.swing.JLabel jLabel244;
    private javax.swing.JLabel jLabel245;
    private javax.swing.JLabel jLabel246;
    private javax.swing.JLabel jLabel247;
    private javax.swing.JLabel jLabel248;
    private javax.swing.JLabel jLabel249;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel250;
    private javax.swing.JLabel jLabel251;
    private javax.swing.JLabel jLabel252;
    private javax.swing.JLabel jLabel253;
    private javax.swing.JLabel jLabel254;
    private javax.swing.JLabel jLabel255;
    private javax.swing.JLabel jLabel256;
    private javax.swing.JLabel jLabel257;
    private javax.swing.JLabel jLabel258;
    private javax.swing.JLabel jLabel259;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel260;
    private javax.swing.JLabel jLabel261;
    private javax.swing.JLabel jLabel262;
    private javax.swing.JLabel jLabel263;
    private javax.swing.JLabel jLabel264;
    private javax.swing.JLabel jLabel265;
    private javax.swing.JLabel jLabel266;
    private javax.swing.JLabel jLabel267;
    private javax.swing.JLabel jLabel268;
    private javax.swing.JLabel jLabel269;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel270;
    private javax.swing.JLabel jLabel271;
    private javax.swing.JLabel jLabel272;
    private javax.swing.JLabel jLabel273;
    private javax.swing.JLabel jLabel274;
    private javax.swing.JLabel jLabel275;
    private javax.swing.JLabel jLabel276;
    private javax.swing.JLabel jLabel277;
    private javax.swing.JLabel jLabel278;
    private javax.swing.JLabel jLabel279;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel280;
    private javax.swing.JLabel jLabel281;
    private javax.swing.JLabel jLabel282;
    private javax.swing.JLabel jLabel283;
    private javax.swing.JLabel jLabel284;
    private javax.swing.JLabel jLabel285;
    private javax.swing.JLabel jLabel286;
    private javax.swing.JLabel jLabel287;
    private javax.swing.JLabel jLabel288;
    private javax.swing.JLabel jLabel289;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel290;
    private javax.swing.JLabel jLabel291;
    private javax.swing.JLabel jLabel292;
    private javax.swing.JLabel jLabel293;
    private javax.swing.JLabel jLabel294;
    private javax.swing.JLabel jLabel295;
    private javax.swing.JLabel jLabel296;
    private javax.swing.JLabel jLabel297;
    private javax.swing.JLabel jLabel298;
    private javax.swing.JLabel jLabel299;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel300;
    private javax.swing.JLabel jLabel301;
    private javax.swing.JLabel jLabel302;
    private javax.swing.JLabel jLabel303;
    private javax.swing.JLabel jLabel304;
    private javax.swing.JLabel jLabel305;
    private javax.swing.JLabel jLabel306;
    private javax.swing.JLabel jLabel307;
    private javax.swing.JLabel jLabel308;
    private javax.swing.JLabel jLabel309;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel310;
    private javax.swing.JLabel jLabel311;
    private javax.swing.JLabel jLabel312;
    private javax.swing.JLabel jLabel313;
    private javax.swing.JLabel jLabel314;
    private javax.swing.JLabel jLabel315;
    private javax.swing.JLabel jLabel316;
    private javax.swing.JLabel jLabel317;
    private javax.swing.JLabel jLabel318;
    private javax.swing.JLabel jLabel319;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel320;
    private javax.swing.JLabel jLabel321;
    private javax.swing.JLabel jLabel322;
    private javax.swing.JLabel jLabel323;
    private javax.swing.JLabel jLabel324;
    private javax.swing.JLabel jLabel325;
    private javax.swing.JLabel jLabel326;
    private javax.swing.JLabel jLabel327;
    private javax.swing.JLabel jLabel328;
    private javax.swing.JLabel jLabel329;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel330;
    private javax.swing.JLabel jLabel331;
    private javax.swing.JLabel jLabel332;
    private javax.swing.JLabel jLabel333;
    private javax.swing.JLabel jLabel334;
    private javax.swing.JLabel jLabel335;
    private javax.swing.JLabel jLabel336;
    private javax.swing.JLabel jLabel337;
    private javax.swing.JLabel jLabel338;
    private javax.swing.JLabel jLabel339;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel340;
    private javax.swing.JLabel jLabel341;
    private javax.swing.JLabel jLabel342;
    private javax.swing.JLabel jLabel343;
    private javax.swing.JLabel jLabel344;
    private javax.swing.JLabel jLabel345;
    private javax.swing.JLabel jLabel346;
    private javax.swing.JLabel jLabel347;
    private javax.swing.JLabel jLabel348;
    private javax.swing.JLabel jLabel349;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel350;
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
