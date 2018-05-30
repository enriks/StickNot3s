/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Snakez;

import java.io.FileInputStream;
import java.util.List;
import javax.swing.JFrame;
import javazoom.jl.player.Player;

/**
 *
 * @author Alumno
 */
public class Inicio extends javax.swing.JFrame {
public DbManager manejadorConfig = new DbManager();
private List<String> lit = manejadorConfig.selectConfig();
private Thread as= new Thread(new Runnable() {
       @Override
       public void run() {
           try{
               do{
                   FileInputStream fis = new FileInputStream("../Snakez/src/res/inicio.mp3");
                   Player playMP3 = new Player(fis);
                   playMP3.play();}
               while(true);
           }
           catch(Exception exc){
               exc.printStackTrace();
               System.out.println("Failed to play the file.");
           }      }
   });;
    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        as.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFondoInicio = new javax.swing.JPanel();
        lblInicio = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlFondoInicio.setName(""); // NOI18N

        lblInicio.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInicio.setText("Inicio");

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jButton1.setText("Jugar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jButton2.setText("Configuracion");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jButton3.setText("Puntuaciones");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFondoInicioLayout = new javax.swing.GroupLayout(pnlFondoInicio);
        pnlFondoInicio.setLayout(pnlFondoInicioLayout);
        pnlFondoInicioLayout.setHorizontalGroup(
            pnlFondoInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoInicioLayout.createSequentialGroup()
                .addGroup(pnlFondoInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFondoInicioLayout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(lblInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFondoInicioLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jButton1))
                    .addGroup(pnlFondoInicioLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        pnlFondoInicioLayout.setVerticalGroup(
            pnlFondoInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(23, 23, 23)
                .addGroup(pnlFondoInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondoInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        Configuracion a = new Configuracion();
        a.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        as.stop();
        serpienteEjecutador k =  new serpienteEjecutador(Integer.parseInt(lit.get(4)), lit.get(0), lit.get(1), lit.get(2), lit.get(3), Integer.parseInt(lit.get(5)), Integer.parseInt(lit.get(6)), Integer.parseInt(lit.get(7)),manejadorConfig.selectReproductionMusic(selectMusicaIndex()));
        k.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       Puntuaciones punt=new Puntuaciones();
       punt.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private int selectMusicaIndex(){
        int esto = 0;
         List<String> lit2 = manejadorConfig.selectMusic();
         if (lit.get(8).equals("1")){
             esto = (int)(Math.random()*lit2.size()+1);
             System.out.println(lit2.size()+"    "+esto+"a");
         }
         else{
             esto = Integer.parseInt(lit.get(9));
         }
     return esto;    
    }
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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JPanel pnlFondoInicio;
    // End of variables declaration//GEN-END:variables
}
