
import DataPackage.Hospital;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
/**
 *
 * @author hanee
 */
public class AdminAddHospPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminAddHospPanel
     */
    public AdminAddHospPanel() {
        initComponents();
        addInitRows();
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
        hospNamelabel = new javax.swing.JLabel();
        hospNameInput = new javax.swing.JTextField();
        hospCommLabel = new javax.swing.JLabel();
        hospCommDropdown = new javax.swing.JComboBox<>();
        addDocBtn = new javax.swing.JButton();
        hospCityLabel = new javax.swing.JLabel();
        hospCityDropdown = new javax.swing.JComboBox<>();
        scrolTable = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        delDocBtn = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(700, 440));

        heading.setText("Add a Hospital");

        hospNamelabel.setText("Hospital Name");

        hospCommLabel.setText("Community");

        hospCommDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Old Town", "North York", "East York", "Downtown" }));

        addDocBtn.setText("Add hospital");
        addDocBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDocBtnActionPerformed(evt);
            }
        });

        hospCityLabel.setText("City");

        hospCityDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Toronto", "Ottawa" }));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Community", "City"
            }
        ));
        scrolTable.setViewportView(table);

        delDocBtn.setText("Delete hospital");
        delDocBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delDocBtnMouseClicked(evt);
            }
        });
        delDocBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delDocBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrolTable)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hospNamelabel)
                            .addComponent(hospNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hospCommLabel)
                            .addComponent(hospCommDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hospCityLabel)
                            .addComponent(hospCityDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(heading))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(addDocBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delDocBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(heading)
                .addGap(18, 18, 18)
                .addComponent(scrolTable, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(hospCityLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hospCityDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(hospCommLabel)
                            .addGap(32, 32, 32))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(hospCommDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(hospNamelabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hospNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addDocBtn)
                    .addComponent(delDocBtn))
                .addGap(13, 13, 13))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addDocBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDocBtnActionPerformed
        // TODO add your handling code here:
        
        

        String hospName = hospNameInput.getText();
        
        if(hospName.isEmpty()) {
             JOptionPane.showMessageDialog(this, "Please enter the Hospital name", "validation error", JOptionPane.ERROR_MESSAGE);
             return;
        }
        
        String hospComm = hospCommDropdown.getSelectedItem().toString();
        String hospCity = hospCityDropdown.getSelectedItem().toString();

        Hospital h = new Hospital(hospName, hospComm, hospCity);

        populateHospitalDetails(h);

        JOptionPane.showMessageDialog(this, "Hospital Added!");
    }//GEN-LAST:event_addDocBtnActionPerformed

    private void delDocBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delDocBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delDocBtnActionPerformed

    private void delDocBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delDocBtnMouseClicked
        // TODO add your handling code here:

        int selectedRowIndex = table.getSelectedRow();
        if (selectedRowIndex < 0) {

            JOptionPane.showMessageDialog(this,
                    "Select one item to delete",
                    "Selection error",
                    JOptionPane.ERROR_MESSAGE);

        } else {
            DefaultTableModel model = (DefaultTableModel) table.getModel();

            model.removeRow(selectedRowIndex);

            JOptionPane.showMessageDialog(this,
                    "Hospital successfully deleted",
                    "Hospital Operation",
                    JOptionPane.INFORMATION_MESSAGE);
        }


    }//GEN-LAST:event_delDocBtnMouseClicked

    private void addInitRows() {

        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();

        String data[] = {"XYZ", "Brampton", "Toronto"};

        tableModel.addRow(data);
        
        String data2[] = {"abc", "North York", "Toronto"};
        
        tableModel.addRow(data2);
    }

    private void populateHospitalDetails(Hospital hospital) {

        String data[] = {hospital.getName(), hospital.getCommunity(), hospital.getCity()};

        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();

        tableModel.addRow(data);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDocBtn;
    private javax.swing.JButton delDocBtn;
    private javax.swing.JLabel heading;
    private javax.swing.JComboBox<String> hospCityDropdown;
    private javax.swing.JLabel hospCityLabel;
    private javax.swing.JComboBox<String> hospCommDropdown;
    private javax.swing.JLabel hospCommLabel;
    private javax.swing.JTextField hospNameInput;
    private javax.swing.JLabel hospNamelabel;
    private javax.swing.JScrollPane scrolTable;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
