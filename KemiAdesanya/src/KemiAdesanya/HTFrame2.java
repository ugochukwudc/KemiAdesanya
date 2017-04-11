/* Copyright (c) Ugochukwu Chukwu
 /* All Rights Reserved
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KemiAdesanya;

import KemiAdesanya.Item.HairTies;
import java.io.File;
import java.io.FileWriter;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author Ugochukwudouglas
 */
public class HTFrame2 extends javax.swing.JFrame {
    
    private static final Logger LOG = Logger.getLogger(HTFrame2.class.getName());
    private static final HTFrame2 Instance = new HTFrame2();
    private static final javax.swing.JFrame next = null;
    private static final javax.swing.JFrame prev = HTFrame.getInstance();

    public static HTFrame2 getInstance() {
        return Instance;
    }
    
    public static Logger getLOG() {
        return LOG;
    }
    
    
    /**
     * Creates new form HTFrame2
     */
    public HTFrame2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Button_Previous = new javax.swing.JButton();
        Button_genExcel = new javax.swing.JButton();
        Label_FB = new javax.swing.JLabel();
        BackgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(520, 520));
        setMinimumSize(new java.awt.Dimension(510, 510));
        getContentPane().setLayout(null);

        Button_Previous.setText("Previous");
        Button_Previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_PreviousActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Previous);
        Button_Previous.setBounds(0, 470, 97, 29);

        Button_genExcel.setText("Generate Excel File");
        Button_genExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_genExcelActionPerformed(evt);
            }
        });
        getContentPane().add(Button_genExcel);
        Button_genExcel.setBounds(120, 230, 260, 60);

        Label_FB.setFont(new java.awt.Font("Lucida Handwriting", 3, 14)); // NOI18N
        getContentPane().add(Label_FB);
        Label_FB.setBounds(10, 370, 480, 40);

        BackgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KemiAdesanya/Files/KemiAdesanyaLogo.jpeg"))); // NOI18N
        BackgroundImage.setEnabled(false);
        getContentPane().add(BackgroundImage);
        BackgroundImage.setBounds(0, 0, 510, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_genExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_genExcelActionPerformed
        // TODO add your handling code here:
        String fileName = "HTExcel.xls", nl = "\r\n";
        String HDR = "SKU" + '\t' + "DESCRIPTION" + '\t' +"PRICE" + nl;
        String diag="",path="";
        int recs=0;
        JFileChooser chooser;
        chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle("Select Output Directory");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        
        
        chooser.setAcceptAllFileFilterUsed(false);

        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            diag = "Directory Selected :" + chooser.getSelectedFile();
            // Set Output File Directory
            path = chooser.getSelectedFile().toString() + "/";
        } else {
            diag="No Selection";
        }
        // display feedback message
        Label_FB.setText(diag);

        File EF = new File(path+fileName);
        try (FileWriter fw = new FileWriter(EF)) {
            fw.write(HDR);
            for (HairTies h : KemiAdesanyaGUIFrame.getHT()){
                fw.write(h.toExcel());
                fw.write(nl);
                recs++;
            }
        }catch(Exception e){
        e.printStackTrace(System.out);
        }
        Label_FB.setText(recs + "Records Written");
    }//GEN-LAST:event_Button_genExcelActionPerformed

    private void Button_PreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_PreviousActionPerformed
        // TODO add your handling code here:
        KemiAdesanya.Utilities.Util.switchFrames(this, prev);
    }//GEN-LAST:event_Button_PreviousActionPerformed

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
            java.util.logging.Logger.getLogger(HTFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HTFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HTFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HTFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HTFrame2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundImage;
    private javax.swing.JButton Button_Previous;
    private javax.swing.JButton Button_genExcel;
    private javax.swing.JLabel Label_FB;
    // End of variables declaration//GEN-END:variables
}