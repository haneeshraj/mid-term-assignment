
import DataPackage.Hospital;
import java.util.Calendar;
import java.util.Date;
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
public class DoctorPatientEncounteredPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorPatientEncounteredPanel
     */
    public DoctorPatientEncounteredPanel() {
        initComponents();
        initalHistory();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        name = new javax.swing.JLabel();
        nameDropdown = new javax.swing.JComboBox<>();
        date = new javax.swing.JLabel();
        dateCalender = new com.toedter.calendar.JCalendar();
        diagnosis = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        temp = new javax.swing.JLabel();
        tempInput = new javax.swing.JTextField();
        heartRate = new javax.swing.JLabel();
        heartRateInput = new javax.swing.JTextField();
        bp = new javax.swing.JLabel();
        bpInput = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();

        heading.setText("Encounter History");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Appointment Date", "Diagnosis", "Body Temperature", "Heart Rate", "Blood Pressure"
            }
        ));
        jScrollPane1.setViewportView(table);

        name.setText("Patient");

        nameDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Anil", "Aditya", "Pranav" }));

        date.setText("Date of appointment");

        diagnosis.setText("Diagnosis");

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane2.setViewportView(textArea);

        temp.setText("Body temperature (F)");

        heartRate.setText("Heart rate (BPM)");

        bp.setText("Blood Pressure (mmHg)");

        addBtn.setText("Add Encountered Patient");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(heading)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name)
                            .addComponent(date)
                            .addComponent(dateCalender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(diagnosis)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(temp)
                                .addGap(18, 18, 18)
                                .addComponent(heartRate))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tempInput, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(heartRateInput, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2)
                            .addComponent(bp)
                            .addComponent(bpInput, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(addBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(heading)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name)
                    .addComponent(diagnosis))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(date)
                        .addGap(18, 18, 18)
                        .addComponent(dateCalender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(temp)
                            .addComponent(heartRate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tempInput, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(heartRateInput, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bpInput, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:

        String patientName = nameDropdown.getSelectedItem().toString();
        Calendar selectedCalendar = dateCalender.getCalendar();

        String appointmentDate = selectedCalendar.getTime().toString();
        String diagnosis = textArea.getText();
        String bodyTemp = tempInput.getText();
        String bp = bpInput.getText();
        String heartRate = heartRateInput.getText();

        if (appointmentDate.isEmpty() || diagnosis.isEmpty() || bodyTemp.isEmpty() || bp.isEmpty() || heartRate.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please make sure you fill out all the details before adding!", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
         
          try {
            int parseTemp = Integer.parseInt(bodyTemp);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Invalid body temperature input! Make sure it is a number!", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            int parseHr = Integer.parseInt(heartRate);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Invalid Heart rate input! Make sure it is a number!", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            int parseBp = Integer.parseInt(bp);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Invalid blood pressure input! Make sure it is a number!", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
       
          
        PatientsEncountered pe = new PatientsEncountered(patientName, appointmentDate, bodyTemp, heartRate, bp, diagnosis);

        populatePatientEncounterDetails(pe);
    }//GEN-LAST:event_addBtnActionPerformed

    private void initalHistory() {
        PatientsEncountered pe1 = new PatientsEncountered("Patient 1", "Fri Feb 13 17:09:18 EST 2024", "99", "123", "110/80", "Cancer");
        PatientsEncountered pe2 = new PatientsEncountered("Patient 2", "Fri Feb 20 19:23:34 EST 2024", "102", "108", "90/60", "Fever");
        populatePatientEncounterDetails(pe1);
        populatePatientEncounterDetails(pe2);
    }

    private void populatePatientEncounterDetails(PatientsEncountered pe) {

        String data[] = {pe.getName(), pe.getDate(), pe.getDiagnosis(), pe.getBodyTemp(), pe.getHeartRate(), pe.getBloodPressure()};

        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();

        tableModel.addRow(data);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel bp;
    private javax.swing.JTextField bpInput;
    private javax.swing.JLabel date;
    private com.toedter.calendar.JCalendar dateCalender;
    private javax.swing.JLabel diagnosis;
    private javax.swing.JLabel heading;
    private javax.swing.JLabel heartRate;
    private javax.swing.JTextField heartRateInput;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel name;
    private javax.swing.JComboBox<String> nameDropdown;
    private javax.swing.JTable table;
    private javax.swing.JLabel temp;
    private javax.swing.JTextField tempInput;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
