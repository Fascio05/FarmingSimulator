/*ggggggggggg
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author netti
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        setLocationRelativeTo(null); //centrare nello schermo
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        titolo = new javax.swing.JLabel();
        nickname = new javax.swing.JLabel();
        inserireNickname = new javax.swing.JTextField();
        imgRosso = new javax.swing.JLabel();
        imgBlu = new javax.swing.JLabel();
        avvia = new javax.swing.JButton();
        sfondo = new javax.swing.JLabel();
        spunta1 = new javax.swing.JLabel();
        spunta2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Farming simulator");
        setResizable(false);

        jPanel.setLayout(null);

        titolo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini/titolo.png"))); // NOI18N
        jPanel.add(titolo);
        titolo.setBounds(140, 0, 680, 120);

        nickname.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        nickname.setForeground(new java.awt.Color(255, 255, 255));
        nickname.setText("NICKNAME:");
        jPanel.add(nickname);
        nickname.setBounds(269, 118, 180, 30);

        inserireNickname.setText("Inserire nickname...");
        inserireNickname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserireNicknameActionPerformed(evt);
            }
        });
        jPanel.add(inserireNickname);
        inserireNickname.setBounds(495, 122, 170, 30);

        imgRosso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini/rosso.png"))); // NOI18N
        jPanel.add(imgRosso);
        imgRosso.setBounds(190, 180, 267, 150);

        imgBlu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini/blu.png"))); // NOI18N
        imgBlu.setToolTipText("");
        jPanel.add(imgBlu);
        imgBlu.setBounds(515, 188, 267, 150);

        avvia.setBackground(new java.awt.Color(0, 153, 51));
        avvia.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        avvia.setText("AVVIA");
        avvia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avviaActionPerformed(evt);
            }
        });
        jPanel.add(avvia);
        avvia.setBounds(320, 410, 359, 70);

        sfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini/sfondo erba.jpg"))); // NOI18N
        jPanel.add(sfondo);
        sfondo.setBounds(0, 0, 960, 540);
        jPanel.add(spunta1);
        spunta1.setBounds(280, 340, 50, 50);
        jPanel.add(spunta2);
        spunta2.setBounds(620, 350, 50, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inserireNicknameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserireNicknameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inserireNicknameActionPerformed

    private void avviaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avviaActionPerformed


        HubLivelli a2 = new HubLivelli();
        setVisible(false);
        //HubLivelli a2 = new HubLivelli(); //apre la finestra per scegliere il livello da giocare
      
    }//GEN-LAST:event_avviaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton avvia;
    private javax.swing.JLabel imgBlu;
    private javax.swing.JLabel imgRosso;
    private javax.swing.JTextField inserireNickname;
    private javax.swing.JPanel jPanel;
    private javax.swing.JLabel nickname;
    private javax.swing.JLabel sfondo;
    private javax.swing.JLabel spunta1;
    private javax.swing.JLabel spunta2;
    private javax.swing.JLabel titolo;
    // End of variables declaration//GEN-END:variables
}
