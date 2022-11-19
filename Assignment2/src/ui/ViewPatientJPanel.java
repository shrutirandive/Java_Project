/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static model.CommunityAdmin.communityDirectory;
import model.Patient;
import model.Person;

/**
 *
 * @author user
 */
public class ViewPatientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewPatientJPanel
     */
    Person person = new Person();
    Patient patient = new Patient();
    public ViewPatientJPanel() {
        initComponents();
        
        populateTable();
        populateTableCommunity();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatient = new javax.swing.JTable();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        comboGender = new javax.swing.JComboBox<>();
        lblAge = new javax.swing.JLabel();
        lblHouse = new javax.swing.JLabel();
        lblCommunity = new javax.swing.JLabel();
        txtHouse = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        comboBoxCommunity = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));

        tblPatient.setForeground(new java.awt.Color(51, 51, 255));
        tblPatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Age", "Gender", "House", "Community"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPatientMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPatient);

        lblName.setFont(new java.awt.Font("Centaur", 0, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(51, 51, 255));
        lblName.setText("NAME");

        txtName.setFont(new java.awt.Font("Centaur", 0, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(51, 51, 255));

        lblGender.setFont(new java.awt.Font("Centaur", 0, 14)); // NOI18N
        lblGender.setForeground(new java.awt.Color(51, 51, 255));
        lblGender.setText("GENDER");

        comboGender.setFont(new java.awt.Font("Centaur", 0, 14)); // NOI18N
        comboGender.setForeground(new java.awt.Color(51, 51, 255));
        comboGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Female", "Male" }));

        lblAge.setFont(new java.awt.Font("Centaur", 0, 14)); // NOI18N
        lblAge.setForeground(new java.awt.Color(51, 51, 255));
        lblAge.setText("AGE");

        lblHouse.setFont(new java.awt.Font("Centaur", 0, 14)); // NOI18N
        lblHouse.setForeground(new java.awt.Color(51, 51, 255));
        lblHouse.setText("HOUSE");

        lblCommunity.setFont(new java.awt.Font("Centaur", 0, 14)); // NOI18N
        lblCommunity.setForeground(new java.awt.Color(51, 51, 255));
        lblCommunity.setText("COMMUNITY");

        txtHouse.setFont(new java.awt.Font("Centaur", 0, 14)); // NOI18N
        txtHouse.setForeground(new java.awt.Color(51, 51, 255));

        txtAge.setFont(new java.awt.Font("Centaur", 0, 14)); // NOI18N
        txtAge.setForeground(new java.awt.Color(51, 51, 255));

        btnUpdate.setBackground(new java.awt.Color(155, 211, 248));
        btnUpdate.setFont(new java.awt.Font("Centaur", 0, 14)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/edit-icon.png"))); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(155, 211, 248));
        btnDelete.setFont(new java.awt.Font("Centaur", 0, 14)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Close-2-icon.png"))); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Centaur", 0, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(51, 51, 255));
        lblTitle.setText("Patients");

        comboBoxCommunity.setForeground(new java.awt.Color(51, 51, 255));
        comboBoxCommunity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(lblAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHouse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCommunity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(comboBoxCommunity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtHouse, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                    .addComponent(comboGender, javax.swing.GroupLayout.Alignment.LEADING, 0, 106, Short.MAX_VALUE))
                                .addGap(127, 127, 127)
                                .addComponent(btnUpdate)
                                .addGap(48, 48, 48)
                                .addComponent(btnDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 317, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate)
                            .addComponent(btnDelete))
                        .addGap(18, 18, 18)
                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblAge)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGender))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHouse)
                    .addComponent(txtHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommunity)
                    .addComponent(comboBoxCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(127, 127, 127))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblPatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPatientMouseClicked
        // TODO add your handling code here:
        int selectedRowIndex = tblPatient.getSelectedRow();
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to update");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblPatient.getModel();

        Patient selectedPatient = (Patient) model.getValueAt(selectedRowIndex, 0);
        System.out.println(selectedPatient);

        txtName.setText(selectedPatient.getName());
        comboGender.setSelectedItem(selectedPatient.getGender());
        txtAge.setText(Integer.toString(selectedPatient.getAge()));
        txtHouse.setText(selectedPatient.getHouse());
        comboBoxCommunity.setSelectedItem(selectedPatient.getCommunity());
        
    }//GEN-LAST:event_tblPatientMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblPatient.getModel();
        int selectedRowIndex = tblPatient.getSelectedRow();

        if (tblPatient.getSelectedRowCount()==1){
            //-- if single row is selected than update--
            String name = txtName.getText();
            int age = Integer.parseInt(txtAge.getText());
            String gender = (String) comboGender.getSelectedItem();
            String house = txtHouse.getText();
            String community = (String) comboBoxCommunity.getSelectedItem();
            
            //UPDATE PATIENTS DATA IN PATIENT DIRECTORY
            Patient updatePatient = new Patient();

            //-- set updated value on the table row
            updatePatient.setName(name);
            updatePatient.setGender(gender);
            updatePatient.setAge(age);
            updatePatient.setHouse(house);
            updatePatient.setCommunity(community);
            patient.updatePatient(updatePatient, selectedRowIndex);
            
            
            //UPDATE PATIENT DATA IN PERSON DIRECTORY
            Person updatePerson = new Person();

            //-- set updated value on the table row
            updatePerson.setName(name);
            updatePerson.setGender(gender);
            updatePerson.setAge(age);
            updatePerson.setHouse(house);
            updatePerson.setCommunity(community);
            person.updatePerson(updatePerson, selectedRowIndex);
            
            communityDirectory.set(selectedRowIndex,community);
            
            populateTable();
            JOptionPane.showMessageDialog(this, "Patient Data Updated Successfully ");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblPatient.getSelectedRow();
        if (selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this,"please select a row");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblPatient.getModel();

        //DELETE PATIENT FROM PATIENT DIRECTORY
        Patient selectedPatient = (Patient) model.getValueAt(selectedRowIndex, 0);
        patient.deletePatient(selectedPatient);
        communityDirectory.remove(selectedPatient.getCommunity());
        
        //DELETE PATIENT FROM PERSON DIRECTORY
        Person selectedPerson = (Person) model.getValueAt(selectedRowIndex, 0);
        person.deletePerson(selectedPerson);
        JOptionPane.showMessageDialog(this,"Patient deleted");

        populateTable();
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> comboBoxCommunity;
    private javax.swing.JComboBox<String> comboGender;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblHouse;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblPatient;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtHouse;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblPatient.getModel();
        model.setRowCount(0);
        
        for(Patient pa: Patient.getPatientDirectory()){
            Object[] row = new Object[5];
            row[0] = pa;
            row[1] = pa.getAge();
            row[2] = pa.getGender();
            row[3] = pa.getHouse();
            row[4] = pa.getCommunity();
            model.addRow(row);}
        
    }
    private void populateTableCommunity() {
        
         comboBoxCommunity.setModel(new DefaultComboBoxModel<String>(communityDirectory.toArray(new String[0])));

    }
}
