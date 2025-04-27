/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import FlightReservationExceptions.EmptyFieldException;
import FlightReservationExceptions.InvalidEmailFormatException;
import FlightReservationExceptions.PasswordDoesntMatchEmailException;
import FlightReservationExceptions.PersonNotFoundException;
import OperationsAndServices.AdminOperations;
import OperationsAndServices.CustomerOperations;
import OperationsAndServices.EmailValidator;
import OperationsAndServices.FlightDataLists;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import reservationObjects.Admin;
import reservationObjects.Customer;

/**
 *
 * @author Zahera
 */
public class LoginPage extends javax.swing.JPanel {

    /**
     * Creates new form LoginPage
     */
    MainFrame mainFrame;
    FlightDataLists flightDataLists;
    AdminOperations adminOperations;
    CustomerOperations customerOperations;
    private Customer loggedCustomer;
    public LoginPage(MainFrame mainFrame, FlightDataLists flightDataLists) {
        this.mainFrame = mainFrame;
        this.flightDataLists = flightDataLists;
        initComponents();

        txt_email.setName(" email ");
        txt_password.setName(" password ");

        adminOperations = new AdminOperations(flightDataLists);
        customerOperations = new CustomerOperations(flightDataLists);
    }

    public LoginPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        lbl_loginPage = new javax.swing.JLabel();
        lbl_email = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        lbl_password = new javax.swing.JLabel();
        txt_password = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btn_Login = new javax.swing.JButton();
        lbl_haventYouRegistered = new javax.swing.JLabel();
        btn_goToRegisterPage = new javax.swing.JButton();
        checkBox_i_am_an_admin = new javax.swing.JCheckBox();
        btn_goToAdminPageForTest = new javax.swing.JButton();

        lbl_loginPage.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        lbl_loginPage.setForeground(new java.awt.Color(0, 153, 153));
        lbl_loginPage.setText("Login Page");

        lbl_email.setText("Email");

        lbl_password.setText("password");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Help: already registered users\n\n admin1= \"admin1@example.com\", pass= \"admin1\"\n admin2= \"admin2@example.com\", pass= \"admin2\"\n admin3=\"admin3@example.com\", pass= \"admin3\"\n   \ncustomer1= \"customer1@example.com\", pass= \"customer1\"\ncustomer2= \"customer2@example.com\", pass= \"customer2\"\ncustomer3=\"customer3@example.com\", pass= \"customer3\"");
        jScrollPane1.setViewportView(jTextArea1);

        btn_Login.setText("Login");
        btn_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LoginActionPerformed(evt);
            }
        });

        lbl_haventYouRegistered.setText("Haven't you registered yet? ");

        btn_goToRegisterPage.setText("go to register page");
        btn_goToRegisterPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_goToRegisterPageActionPerformed(evt);
            }
        });

        checkBox_i_am_an_admin.setText("I am an Admin");

        btn_goToAdminPageForTest.setText("go to admin page for test");
        btn_goToAdminPageForTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_goToAdminPageForTestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbl_haventYouRegistered)
                                .addComponent(btn_goToAdminPageForTest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(31, 31, 31)
                            .addComponent(btn_goToRegisterPage, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lbl_loginPage, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbl_password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_email, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_email)
                                .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(checkBox_i_am_an_admin)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lbl_loginPage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_email)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_password)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Login)
                    .addComponent(checkBox_i_am_an_admin))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_haventYouRegistered)
                    .addComponent(btn_goToRegisterPage))
                .addGap(27, 27, 27)
                .addComponent(btn_goToAdminPageForTest)
                .addContainerGap(95, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_goToRegisterPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_goToRegisterPageActionPerformed
        // TODO add your handling code here:
        mainFrame.showPanelMethod("RegisterPage");
    }//GEN-LAST:event_btn_goToRegisterPageActionPerformed

    private void btn_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LoginActionPerformed
        // TODO add your handling code here:
        ArrayList<JTextField> textFieldsList = new ArrayList<>();
        textFieldsList.add(txt_email);
        textFieldsList.add(txt_password);
        try {
            for (JTextField jTextField : textFieldsList) {
                if (jTextField.getText().trim().isEmpty()) {
                    throw new EmptyFieldException(jTextField.getName());
                }
            }
        } catch (EmptyFieldException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return;
        }
        try {
            if (!EmailValidator.isValid(txt_email.getText())) {
                throw new InvalidEmailFormatException(txt_email.getText());
            }

        } catch (InvalidEmailFormatException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return;
        }
        if (checkBox_i_am_an_admin.isSelected()) {
            try {
                if (adminOperations.getAdminByEmail(txt_email.getText()) == null) {
                    throw new PersonNotFoundException(txt_email.getText());
                } else {
                    Admin admin = adminOperations.getAdminByEmail(txt_email.getText());
                    if (admin.getPassword().equals(txt_password.getText())) {
                        int answer = JOptionPane.showConfirmDialog(null, "You will be directed to Admin Management Page.\n Click Yes if you agree.", "navigate to the next page", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                        if (answer == JOptionPane.YES_OPTION) {
                            AdminManagementPage amp= new AdminManagementPage(mainFrame, flightDataLists, admin);
                            mainFrame.mainPanel.add(amp,"AdminManagementPage");
                            mainFrame.showPanelMethod("AdminManagementPage");
                            admin.setLoggedIn(true);
                        }
                    }else{
                        throw new PasswordDoesntMatchEmailException(txt_email.getText(),txt_password.getText());
                    }
                }

            } catch (PersonNotFoundException | PasswordDoesntMatchEmailException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
                return;
            }
        } else {
            try {
                if (customerOperations.getCustomerByEmail(txt_email.getText()) == null) {
                    throw new PersonNotFoundException(txt_email.getText());
                } else {
                    loggedCustomer = customerOperations.getCustomerByEmail(txt_email.getText());
                    if (loggedCustomer.getPassword().equals(txt_password.getText())) {
                        int answer = JOptionPane.showConfirmDialog(null, "You will be directed to Customer Reservation Page.\n Click Yes if you agree.", "navigate to the next page", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                        if (answer == JOptionPane.YES_OPTION) {
                            CustomerReservationPage crp= new CustomerReservationPage(mainFrame, flightDataLists, loggedCustomer);
                            mainFrame.mainPanel.add(crp,"CustomerReservationPage");
                            mainFrame.showPanelMethod("CustomerReservationPage");
                            loggedCustomer.setLoggedIn(true);
                        }
                    }else{
                        throw new PasswordDoesntMatchEmailException(txt_email.getText(),txt_password.getText());
                    }
                }

            } catch (PersonNotFoundException | PasswordDoesntMatchEmailException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
                return;
            }
        }
    }//GEN-LAST:event_btn_LoginActionPerformed

    private void btn_goToAdminPageForTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_goToAdminPageForTestActionPerformed
        // TODO add your handling code here:
        mainFrame.showPanelMethod("AdminManagementPage");
    }//GEN-LAST:event_btn_goToAdminPageForTestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Login;
    private javax.swing.JButton btn_goToAdminPageForTest;
    private javax.swing.JButton btn_goToRegisterPage;
    private javax.swing.JCheckBox checkBox_i_am_an_admin;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_haventYouRegistered;
    private javax.swing.JLabel lbl_loginPage;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_password;
    // End of variables declaration//GEN-END:variables

    public Customer getLoggedCustomer() {
        return loggedCustomer;
    }

    public void setLoggedCustomer(Customer loggedCustomer) {
        this.loggedCustomer = loggedCustomer;
    }
}
