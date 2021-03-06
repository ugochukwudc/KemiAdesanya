/* Copyright (c) Ugochukwu Chukwu
 /* All Rights Reserved
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KemiAdesanya;

import KemiAdesanya.Item.HairTies;
import KemiAdesanya.Item.Items;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
/**
 *
 * @author Ugochukwudouglas
 */
public class HTFrame extends javax.swing.JFrame {
    private static final Logger LOG = Logger.getLogger(HTFrame.class.getName());
    
    private static final HTFrame Instance = new HTFrame();
    private static final javax.swing.JFrame next = HTFrame2.getInstance();
    private static final javax.swing.JFrame prev = KemiAdesanyaGUIFrame.getInstance();
    ;

    /**
     * Get the value of Instance
     *
     * @return the value of Instance
     */
    public static HTFrame getInstance() {
        return Instance;
    }


    /**
     * Creates new form HairTies
     */
    public HTFrame() {
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

        RadioButtonGroup_Type = new javax.swing.ButtonGroup();
        Label_Type = new javax.swing.JLabel();
        Label_Design = new javax.swing.JLabel();
        Description_Label = new javax.swing.JLabel();
        Price_label = new javax.swing.JLabel();
        Label_NumberofTies = new javax.swing.JLabel();
        Label_Color1 = new javax.swing.JLabel();
        Label_Color2 = new javax.swing.JLabel();
        Label_Color3 = new javax.swing.JLabel();
        Label_Color4 = new javax.swing.JLabel();
        Label_Color5 = new javax.swing.JLabel();
        TextField_Description = new javax.swing.JTextField();
        TextField_Price = new javax.swing.JFormattedTextField();
        TextField_NumberofTies = new javax.swing.JFormattedTextField();
        TextField_Color1 = new javax.swing.JTextField();
        TextField_Color2 = new javax.swing.JTextField();
        TextField_Color3 = new javax.swing.JTextField();
        TextField_Color4 = new javax.swing.JTextField();
        TextField_Color5 = new javax.swing.JTextField();
        SelectDesignComboBox = new javax.swing.JComboBox();
        Checkbox_Uniform = new javax.swing.JCheckBox();
        RadioButton_Type_Single = new javax.swing.JRadioButton();
        RadioButton_Type_Bulk = new javax.swing.JRadioButton();
        Button_CreateHairTie = new javax.swing.JButton();
        Button_Previous = new javax.swing.JButton();
        Button_Next = new javax.swing.JButton();
        BackgroundImage = new javax.swing.JLabel();

        RadioButtonGroup_Type.add(RadioButton_Type_Single);
        RadioButtonGroup_Type.add(RadioButton_Type_Bulk);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(520, 520));
        setMinimumSize(new java.awt.Dimension(510, 510));
        setModalExclusionType(null);
        getContentPane().setLayout(null);

        Label_Type.setText("Select Type");
        getContentPane().add(Label_Type);
        Label_Type.setBounds(60, 80, 80, 30);

        Label_Design.setText("Choose Design");
        getContentPane().add(Label_Design);
        Label_Design.setBounds(30, 140, 100, 30);

        Description_Label.setText("Description");
        getContentPane().add(Description_Label);
        Description_Label.setBounds(50, 180, 90, 16);

        Price_label.setText("Price");
        getContentPane().add(Price_label);
        Price_label.setBounds(80, 200, 40, 20);

        Label_NumberofTies.setText("Number of Ties");
        getContentPane().add(Label_NumberofTies);
        Label_NumberofTies.setBounds(25, 220, 110, 30);

        Label_Color1.setText("Color/Design 1");
        getContentPane().add(Label_Color1);
        Label_Color1.setBounds(30, 250, 110, 20);

        Label_Color2.setText("Color/Design 2");
        getContentPane().add(Label_Color2);
        Label_Color2.setBounds(30, 280, 110, 20);

        Label_Color3.setText("Color/Design 3");
        getContentPane().add(Label_Color3);
        Label_Color3.setBounds(30, 310, 110, 20);

        Label_Color4.setText("Color/Design 4");
        getContentPane().add(Label_Color4);
        Label_Color4.setBounds(30, 340, 110, 20);

        Label_Color5.setText("Color/Design 5");
        getContentPane().add(Label_Color5);
        Label_Color5.setBounds(30, 370, 110, 20);

        TextField_Description.setText("Enter a brief description of the product.");
        TextField_Description.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        TextField_Description.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_DescriptionActionPerformed(evt);
            }
        });
        getContentPane().add(TextField_Description);
        TextField_Description.setBounds(140, 170, 370, 30);

        TextField_Price = new JFormattedTextField(Items.getPriceFormat());
        //PriceField.setColumns(Items.getPriceColumns());
        TextField_Price.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        TextField_Price.setColumns(6);
        TextField_Price.setText("$69.99");
        TextField_Price.setToolTipText("Enter Price $99.99");
        TextField_Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_PriceActionPerformed(evt);
            }
        });
        getContentPane().add(TextField_Price);
        TextField_Price.setBounds(140, 200, 76, 20);

        TextField_NumberofTies = new JFormattedTextField(Items.getNOIFormat());
        TextField_NumberofTies.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        TextField_NumberofTies.setColumns(4);
        TextField_NumberofTies.setText("9");
        TextField_NumberofTies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_NumberofTiesActionPerformed(evt);
            }
        });
        getContentPane().add(TextField_NumberofTies);
        TextField_NumberofTies.setBounds(140, 220, 52, 30);

        TextField_Color1.setText("Enter color/design.");
        TextField_Color1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(TextField_Color1);
        TextField_Color1.setBounds(140, 250, 370, 30);

        TextField_Color2.setText("Enter color/design.");
        TextField_Color2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(TextField_Color2);
        TextField_Color2.setBounds(140, 280, 370, 30);

        TextField_Color3.setText("Enter color/design.");
        TextField_Color3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(TextField_Color3);
        TextField_Color3.setBounds(140, 310, 370, 30);

        TextField_Color4.setText("Enter color/design.");
        TextField_Color4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        TextField_Color4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_Color4ActionPerformed(evt);
            }
        });
        getContentPane().add(TextField_Color4);
        TextField_Color4.setBounds(140, 340, 370, 30);

        TextField_Color5.setText("Enter color/design.");
        TextField_Color5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(TextField_Color5);
        TextField_Color5.setBounds(140, 370, 370, 30);

        SelectDesignComboBox = new javax.swing.JComboBox(new javax.swing.DefaultComboBoxModel(Items.getDesigns()));
        SelectDesignComboBox.setModel(new javax.swing.DefaultComboBoxModel(Items.getDesigns()));
        SelectDesignComboBox.setToolTipText("Select a design from the drop down list");
        SelectDesignComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectDesignComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(SelectDesignComboBox);
        SelectDesignComboBox.setBounds(140, 140, 370, 27);

        Checkbox_Uniform.setText("Uniform Collection");
        Checkbox_Uniform.setToolTipText("is the hair tie collection uniform, all thesame ?");
        Checkbox_Uniform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Checkbox_UniformActionPerformed(evt);
            }
        });
        getContentPane().add(Checkbox_Uniform);
        Checkbox_Uniform.setBounds(140, 110, 160, 23);

        RadioButton_Type_Single.setSelected(true);
        RadioButton_Type_Single.setText("Single");
        RadioButton_Type_Single.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButton_Type_SingleActionPerformed(evt);
            }
        });
        getContentPane().add(RadioButton_Type_Single);
        RadioButton_Type_Single.setBounds(140, 80, 80, 23);

        RadioButton_Type_Bulk.setText("Bulk");
        RadioButton_Type_Bulk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButton_Type_BulkActionPerformed(evt);
            }
        });
        getContentPane().add(RadioButton_Type_Bulk);
        RadioButton_Type_Bulk.setBounds(230, 80, 59, 23);

        Button_CreateHairTie.setText("Create Product");
        Button_CreateHairTie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_CreateHairTieActionPerformed(evt);
            }
        });
        getContentPane().add(Button_CreateHairTie);
        Button_CreateHairTie.setBounds(230, 410, 140, 29);

        Button_Previous.setText("Previous");
        Button_Previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_PreviousActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Previous);
        Button_Previous.setBounds(30, 440, 97, 29);

        Button_Next.setText("Next");
        Button_Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_NextActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Next);
        Button_Next.setBounds(420, 440, 75, 29);

        BackgroundImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BackgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KemiAdesanya/Files/KemiAdesanyaLogo.jpeg"))); // NOI18N
        BackgroundImage.setToolTipText("");
        BackgroundImage.setAlignmentY(0.0F);
        BackgroundImage.setEnabled(false);
        BackgroundImage.setMaximumSize(new java.awt.Dimension(1000, 1000));
        BackgroundImage.setPreferredSize(new java.awt.Dimension(1068, 900));
        getContentPane().add(BackgroundImage);
        BackgroundImage.setBounds(0, 0, 550, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_PreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_PreviousActionPerformed
        KemiAdesanya.Utilities.Util.switchFrames(this, prev);
    }//GEN-LAST:event_Button_PreviousActionPerformed

    private void RadioButton_Type_SingleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButton_Type_SingleActionPerformed
        // TODO add your handling code here:
        Type = 'S';
    }//GEN-LAST:event_RadioButton_Type_SingleActionPerformed

    private void TextField_PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_PriceActionPerformed
        // TODO add your handling code here:
        String txt=TextField_Price.getText();
        double num = ((Number) TextField_Price.getValue()).doubleValue();
        price = ((Number) TextField_Price.getValue()).doubleValue();
        System.out.println(txt +":: number "+ num);
    }//GEN-LAST:event_TextField_PriceActionPerformed

    private void SelectDesignComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectDesignComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SelectDesignComboBoxActionPerformed

    private void Checkbox_UniformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Checkbox_UniformActionPerformed
        // TODO add your handling code here:
        uniform = Checkbox_Uniform.isSelected();
    }//GEN-LAST:event_Checkbox_UniformActionPerformed

    private void TextField_Color4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_Color4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_Color4ActionPerformed

    private void TextField_DescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_DescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_DescriptionActionPerformed

    private void Button_CreateHairTieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_CreateHairTieActionPerformed
        // TODO add your handling code here:
        // Create new hair Ties using the following params
        String diag, title;
        int t;
        if (getAll()){
            // Create new Hair Tie with the collected parameters
            // Save HairTies to file and set Dialog with SKU            
            HairTies ht;
            ht = new HairTies(Type, design, uniform, price, noi, desc);
            title = "New HairTies created!";
            diag = ht.toString();
            t = JOptionPane.INFORMATION_MESSAGE;
            KemiAdesanyaGUIFrame.addNsave(ht);
        }
        else{
            //Display not successful dialog
            title = "Not Successful!!!";
            diag = "Confirm parameters are correct!";
            t = JOptionPane.ERROR_MESSAGE;
        }
        JOptionPane.showMessageDialog(Label_Color1,diag, title, t);
     
    }//GEN-LAST:event_Button_CreateHairTieActionPerformed

    private void RadioButton_Type_BulkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButton_Type_BulkActionPerformed
        // TODO add your handling code here:
        Type = 'B';
    }//GEN-LAST:event_RadioButton_Type_BulkActionPerformed

    private void TextField_NumberofTiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_NumberofTiesActionPerformed
        // TODO add your handling code here:
        noi = ((Number) TextField_NumberofTies.getValue()).intValue();
        System.out.println("Number of items: "+noi);
    }//GEN-LAST:event_TextField_NumberofTiesActionPerformed

    private void Button_NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_NextActionPerformed
        KemiAdesanya.Utilities.Util.switchFrames(this, next);
    }//GEN-LAST:event_Button_NextActionPerformed

    /**
     * @param args the command line arguments
     */
   public static void main(String args[]) {
        /* Set the Nimbus BackgroundImaged feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel settBackgroundImagee (optionalBackgroundImage 
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
            java.util.logging.Logger.getLogger(HTFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HTFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HTFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HTFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HTFrame().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundImage;
    private javax.swing.JButton Button_CreateHairTie;
    private javax.swing.JButton Button_Next;
    private javax.swing.JButton Button_Previous;
    private javax.swing.JCheckBox Checkbox_Uniform;
    private javax.swing.JLabel Description_Label;
    private javax.swing.JLabel Label_Color1;
    private javax.swing.JLabel Label_Color2;
    private javax.swing.JLabel Label_Color3;
    private javax.swing.JLabel Label_Color4;
    private javax.swing.JLabel Label_Color5;
    private javax.swing.JLabel Label_Design;
    private javax.swing.JLabel Label_NumberofTies;
    private javax.swing.JLabel Label_Type;
    private javax.swing.JLabel Price_label;
    private javax.swing.ButtonGroup RadioButtonGroup_Type;
    private javax.swing.JRadioButton RadioButton_Type_Bulk;
    private javax.swing.JRadioButton RadioButton_Type_Single;
    private javax.swing.JComboBox SelectDesignComboBox;
    private javax.swing.JTextField TextField_Color1;
    private javax.swing.JTextField TextField_Color2;
    private javax.swing.JTextField TextField_Color3;
    private javax.swing.JTextField TextField_Color4;
    private javax.swing.JTextField TextField_Color5;
    private javax.swing.JTextField TextField_Description;
    private javax.swing.JFormattedTextField TextField_NumberofTies;
    private javax.swing.JFormattedTextField TextField_Price;
    // End of variables declaration//GEN-END:variables

    // hair Ties variable declaration & initialization
    private int noi = 9;
    private double price = 69.99;
    private String desc="Enter a description", design="Select a design";
    private final String[] color = new String [5];
    private boolean uniform=false;
    private char Type='S';
    
    private boolean getAll()
    {
        boolean ret = false;
        
        uniform = Checkbox_Uniform.isSelected();
        design = (String) SelectDesignComboBox.getSelectedItem();
        try{
            noi = ((Number) TextField_NumberofTies.getValue()).intValue();
            price = ((Number) TextField_Price.getValue()).doubleValue();
        }catch(Exception e){
            e.printStackTrace();
        }
        desc = TextField_Description.getText();
        color[0]=TextField_Color1.getText();
        color[1]=TextField_Color2.getText();
        color[2]=TextField_Color3.getText();
        color[3]=TextField_Color4.getText();
        color[4]=TextField_Color5.getText();
        ret = !design.equalsIgnoreCase("Select a design"); // A valid design was selected
        ret = ret && !design.isEmpty(); 
        ret = ret && (noi>0);
        ret = ret && (price>0.0);
        ret = ret && (Type == 'B' || Type =='S');
        return ret;
    }
    
    public void resetAll(){
        uniform = false;
        design = null;
        noi = 0;
        price = 0.00;
        desc = null;
        
        for (int i=0; i<color.length; i++){
            color[i]=null;
        }
        
    }
    
}
