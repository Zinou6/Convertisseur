// Ben Said   Zine El Abidine
package ConvPack;

/**
 *
 * @author Zinou
 */
public class ConvertisseurFrame extends javax.swing.JFrame {

    private boolean ButtonClick = false;
    
    public ConvertisseurFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        GetTextField = new javax.swing.JTextField();
        SetTextField = new javax.swing.JTextField();
        SetLabel = new javax.swing.JLabel();
        getLabel = new javax.swing.JLabel();
        ChangeButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Convertisseur");
        setResizable(false);

        jPanel1.setLayout(null);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Devise", "Tamperateur" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(480, 30, 170, 30);

        GetTextField.setEditable(false);
        jPanel1.add(GetTextField);
        GetTextField.setBounds(250, 270, 170, 30);
        jPanel1.add(SetTextField);
        SetTextField.setBounds(250, 180, 170, 30);

        SetLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SetLabel.setForeground(new java.awt.Color(255, 0, 51));
        SetLabel.setText("EURO :");
        jPanel1.add(SetLabel);
        SetLabel.setBounds(140, 180, 110, 30);

        getLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getLabel.setForeground(new java.awt.Color(255, 0, 51));
        getLabel.setText("Algerian Dinar :");
        jPanel1.add(getLabel);
        getLabel.setBounds(140, 270, 110, 30);

        ChangeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ConvPack/Change.jpg"))); // NOI18N
        ChangeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ChangeButton);
        ChangeButton.setBounds(440, 210, 60, 60);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 204));
        jButton1.setText("Convert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(280, 340, 100, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 204));
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(280, 390, 100, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ConvPack/Convertisseur.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 680, 510);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ChangeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeButtonActionPerformed
       if (jComboBox1.getSelectedItem().equals("Devise")) {
        if (ButtonClick == false){
            SetLabel.setText("Algerian Dinar :");
            getLabel.setText("EURO :");
            ButtonClick = true;
        }
        else{
            getLabel.setText("Algerian Dinar :");
            SetLabel.setText("EURO :");
            ButtonClick = false;
        }
       }else{
           if (ButtonClick == false){
            SetLabel.setText("Fahrenheit °F :");
            getLabel.setText("Celsius °C :");
            ButtonClick = true;
        }
        else{
            getLabel.setText("Fahrenheit °F :");
            SetLabel.setText("Celsius °C :");
            ButtonClick = false;
        }
       }
    }//GEN-LAST:event_ChangeButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        double Calcul = Double.valueOf(SetTextField.getText());
        if (jComboBox1.getSelectedItem().equals("Devise")){
            if (SetLabel.getText().equals("EURO :")){
               GetTextField.setText("" + (Calcul * 116.39));
            }else{
                GetTextField.setText("" + (Calcul / 116.39));
            }
        }else{
            if (SetLabel.getText().equals("Celsius °C :"))
                GetTextField.setText("" + (Calcul * (9/5) + 32)); //La Formule : [°F] = [°C] x 9/5 + 32
            else
                GetTextField.setText("" + ((Calcul - 32)* 5/9)); //La Formule : [°C] = ([°F] - 32) x 5/9
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        SetTextField.setText("");
        GetTextField.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if (jComboBox1.getSelectedItem().equals("Devise")){
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ConvPack/Convertisseur.jpg")));
            SetLabel.setText("EURO :");
            getLabel.setText("Algerian Dinar :");
        }else {
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ConvPack/Convertisseur2.jpg")));
            SetLabel.setText("Celsius °C :");
            getLabel.setText("Fahrenheit °F :");
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(ConvertisseurFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConvertisseurFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConvertisseurFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConvertisseurFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConvertisseurFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChangeButton;
    private javax.swing.JTextField GetTextField;
    private javax.swing.JLabel SetLabel;
    private javax.swing.JTextField SetTextField;
    private javax.swing.JLabel getLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
