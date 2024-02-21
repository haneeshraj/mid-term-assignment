
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author hanee
 */
public class RegisterPanel extends javax.swing.JPanel {

    /**
     * Creates new form RegisterPanel
     */
    
    private FormScreen formScreen;
    
    public RegisterPanel(FormScreen formScreen) {
        initComponents();
        
        this.formScreen = formScreen;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        heading = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        emailInput = new javax.swing.JTextField();
        passLabel = new javax.swing.JLabel();
        passInput = new javax.swing.JTextField();
        cPassLabel = new javax.swing.JLabel();
        cPassInput = new javax.swing.JTextField();
        registerBtn = new javax.swing.JButton();

        heading.setText("Register as Patient");

        emailLabel.setText("Email");

        passLabel.setText("Password");

        cPassLabel.setText("Confirm Password");

        registerBtn.setText("Register");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(heading))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cPassInput, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                                .addComponent(cPassLabel))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(registerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(passInput, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                                .addComponent(passLabel)
                                .addComponent(emailInput)
                                .addComponent(emailLabel)))))
                .addContainerGap(226, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(heading)
                .addGap(29, 29, 29)
                .addComponent(emailLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailInput, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passInput, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(cPassLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cPassInput, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        // TODO add your handling code here:

        JOptionPane.showMessageDialog(this,
    "You have been registered as a patient! Please head to the login screen to login!",
    "Registration Successfull",
    JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_registerBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cPassInput;
    private javax.swing.JLabel cPassLabel;
    private javax.swing.JTextField emailInput;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel heading;
    private javax.swing.JTextField passInput;
    private javax.swing.JLabel passLabel;
    private javax.swing.JButton registerBtn;
    // End of variables declaration//GEN-END:variables
}