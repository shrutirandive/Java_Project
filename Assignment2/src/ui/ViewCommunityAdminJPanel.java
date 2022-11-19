/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.CommunityAdmin;
import static model.CommunityAdmin.communityDirectory;
import model.Person;
/**
 *
 * @author user
 */
public class ViewCommunityAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewCommunityAdminJPanel
     */
    CommunityAdmin ca = new CommunityAdmin();
    Person person = new Person();
    public ViewCommunityAdminJPanel() {
        initComponents();
        populateTable();
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
        tblCommunityAdmins = new javax.swing.JTable();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        comboBoxGender = new javax.swing.JComboBox<>();
        lblHouse = new javax.swing.JLabel();
        txtHouse = new javax.swing.JTextField();
        lblCommunity = new javax.swing.JLabel();
        txtCommunity = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(155, 211, 248));

        tblCommunityAdmins.setFont(new java.awt.Font("Centaur", 0, 14)); // NOI18N
        tblCommunityAdmins.setForeground(new java.awt.Color(51, 51, 255));
        tblCommunityAdmins.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Gender", "House", "Community"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCommunityAdmins.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCommunityAdminsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCommunityAdmins);

        lblName.setFont(new java.awt.Font("Centaur", 0, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(51, 51, 255));
        lblName.setText("NAME");

        txtName.setFont(new java.awt.Font("Centaur", 0, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(51, 51, 255));

        lblGender.setFont(new java.awt.Font("Centaur", 0, 14)); // NOI18N
        lblGender.setForeground(new java.awt.Color(51, 51, 255));
        lblGender.setText("GENDER");

        comboBoxGender.setFont(new java.awt.Font("Centaur", 0, 14)); // NOI18N
        comboBoxGender.setForeground(new java.awt.Color(51, 51, 255));
        comboBoxGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Female", "Male" }));

        lblHouse.setFont(new java.awt.Font("Centaur", 0, 14)); // NOI18N
        lblHouse.setForeground(new java.awt.Color(51, 51, 255));
        lblHouse.setText("HOUSE");

        txtHouse.setFont(new java.awt.Font("Centaur", 0, 14)); // NOI18N
        txtHouse.setForeground(new java.awt.Color(51, 51, 255));

        lblCommunity.setFont(new java.awt.Font("Centaur", 0, 14)); // NOI18N
        lblCommunity.setForeground(new java.awt.Color(51, 51, 255));
        lblCommunity.setText("COMMUNITY");

        txtCommunity.setFont(new java.awt.Font("Centaur", 0, 14)); // NOI18N
        txtCommunity.setForeground(new java.awt.Color(51, 51, 255));

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
        lblTitle.setText("Community Admins ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(comboBoxGender, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblCommunity)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(lblGender)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblHouse)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                                            .addComponent(txtHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblName)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(132, 132, 132)
                                .addComponent(btnUpdate)
                                .addGap(47, 47, 47)
                                .addComponent(btnDelete)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {comboBoxGender, lblCommunity, lblGender, lblHouse, lblName, txtCommunity, txtHouse, txtName});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(comboBoxGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHouse)
                    .addComponent(txtHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommunity)
                    .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(164, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblCommunityAdminsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCommunityAdminsMouseClicked
        // TODO add your handling code here:
        int selectedRowIndex = tblCommunityAdmins.getSelectedRow();
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to update");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblCommunityAdmins.getModel();

        CommunityAdmin selectedCommunityAdmin = (CommunityAdmin) model.getValueAt(selectedRowIndex, 0);
        System.out.println(selectedCommunityAdmin);

        txtName.setText(selectedCommunityAdmin.getName());
        comboBoxGender.setSelectedItem(selectedCommunityAdmin.getGender());
        txtHouse.setText(selectedCommunityAdmin.getHouse());
        txtCommunity.setText(selectedCommunityAdmin.getCommunity());
    }//GEN-LAST:event_tblCommunityAdminsMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblCommunityAdmins.getModel();
        int selectedRowIndex = tblCommunityAdmins.getSelectedRow();

        if (tblCommunityAdmins.getSelectedRowCount()==1){
            //-- if single row is selected than update--
            String name = txtName.getText();
            String gender = (String) comboBoxGender.getSelectedItem();
            String house = txtHouse.getText();
            String community = txtCommunity.getText();
            
            if (name.equals("") || gender.equals("") || house.equals("") ||
                community.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter all the fields");
            return;   
        }

            CommunityAdmin updateCommunityAdmin = new CommunityAdmin();
            //-- set updated value on the table row
            updateCommunityAdmin.setName(name);
            updateCommunityAdmin.setGender(gender);
            updateCommunityAdmin.setHouse(house);
            updateCommunityAdmin.setCommunity(community);
            
            ca.updateCommunityAdmin(updateCommunityAdmin,selectedRowIndex);
            
             //UPDATE CommunityAdmin DATA IN PERSON DIRECTORY
            Person updatePerson = new Person();

            //-- set updated value on the table row
            updatePerson.setName(name);
            updatePerson.setGender(gender);
            updatePerson.setHouse(house);
            updatePerson.setCommunity(community);
            person.updatePerson(updatePerson, selectedRowIndex);
            
            communityDirectory.set(selectedRowIndex,community);
            populateTable();

            JOptionPane.showMessageDialog(this, "Data Updated Successfully ");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblCommunityAdmins.getSelectedRow();
        if (selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this,"please select a row");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblCommunityAdmins.getModel();
        CommunityAdmin selectedCommunityAdmin = (CommunityAdmin) model.getValueAt(selectedRowIndex, 0);
        ca.deleteCommunityAdmin(selectedCommunityAdmin);
        
          //DELETE CommunityAdmin DATA IN PERSON DIRECTORY
        Person selectedPerson = (Person) model.getValueAt(selectedRowIndex, 0);
        person.deletePerson(selectedPerson);
        
        communityDirectory.remove(selectedCommunityAdmin.getCommunity());
                
        JOptionPane.showMessageDialog(this,"Community admin deleted");

        populateTable();
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> comboBoxGender;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblHouse;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblCommunityAdmins;
    private javax.swing.JTextField txtCommunity;
    private javax.swing.JTextField txtHouse;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblCommunityAdmins.getModel();
        model.setRowCount(0);
        
        for(CommunityAdmin com: CommunityAdmin.getCommunityAdminDirectory()){
            System.out.println("+===============+"+com.getCity()+com.getGender());
            Object[] row = new Object[4];
            row[0] = com;
            row[1] = com.getGender();
            row[2] = com.getHouse();
            row[3] = com.getCommunity();
            
            model.addRow(row);
        }
        
    }

}
