package GUI;

/*
* File: RegisterForm.java
* Assignment: ENSF480 Final Project
* Section: L02
* Due Date: Dec. 4, 2022
* Authors: Andrew Howe (30113096), James Platt (30130627), 
* Jenna Vlaar (30113774) and Sadman Shahriar (30121460)
*/

import javax.swing.JOptionPane;

public class RegisterForm extends javax.swing.JFrame {

    public RegisterForm() {
        initComponents();
    }
                   
    private void initComponents() { //GUI decorator

        registerFormPanel = new javax.swing.JPanel();
        registerPanel = new javax.swing.JPanel();
        registerAccountLabel = new javax.swing.JLabel();
        lastNameText = new javax.swing.JTextField();
        passwordText = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        firstNameText = new javax.swing.JTextField();
        firstNameLabel = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        paymentLabel = new javax.swing.JLabel();
        noteLabel = new javax.swing.JLabel();
        CVVText = new javax.swing.JTextField();
        CVVLabel = new javax.swing.JLabel();
        creditCardText = new javax.swing.JTextField();
        creditCardLabel = new javax.swing.JLabel();
        creditNameText = new javax.swing.JTextField();
        creditNameLabel = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();
        registerTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 620));
        setMinimumSize(new java.awt.Dimension(1000, 620));
        setPreferredSize(new java.awt.Dimension(1000, 620));

        registerFormPanel.setBackground(new java.awt.Color(41, 44, 142));

        registerPanel.setBackground(new java.awt.Color(87, 79, 198));

        registerAccountLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); 
        registerAccountLabel.setForeground(new java.awt.Color(243, 224, 52));
        registerAccountLabel.setText("Register for an Account");

        lastNameText.setBackground(new java.awt.Color(218, 215, 245));

        passwordText.setBackground(new java.awt.Color(218, 215, 245));

        lastNameLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); 
        lastNameLabel.setForeground(new java.awt.Color(243, 224, 52));
        lastNameLabel.setText("Last Name");

        passwordLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); 
        passwordLabel.setForeground(new java.awt.Color(243, 224, 52));
        passwordLabel.setText("Password");

        firstNameText.setBackground(new java.awt.Color(218, 215, 245));

        firstNameLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); 
        firstNameLabel.setForeground(new java.awt.Color(243, 224, 52));
        firstNameLabel.setText("First Name");

        emailText.setBackground(new java.awt.Color(218, 215, 245));

        emailLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); 
        emailLabel.setForeground(new java.awt.Color(243, 224, 52));
        emailLabel.setText("Email Address");

        paymentLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); 
        paymentLabel.setForeground(new java.awt.Color(243, 224, 52));
        paymentLabel.setText("Payment Details");

        noteLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); 
        noteLabel.setForeground(new java.awt.Color(255, 255, 255));
        noteLabel.setText("Note: When you register for an account you must pay a $20 annual account fee");

        CVVText.setBackground(new java.awt.Color(218, 215, 245));

        CVVLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); 
        CVVLabel.setForeground(new java.awt.Color(243, 224, 52));
        CVVLabel.setText("CVV");

        creditCardText.setBackground(new java.awt.Color(218, 215, 245));

        creditCardLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); 
        creditCardLabel.setForeground(new java.awt.Color(243, 224, 52));
        creditCardLabel.setText("Credit Card Number");

        creditNameText.setBackground(new java.awt.Color(218, 215, 245));

        creditNameLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); 
        creditNameLabel.setForeground(new java.awt.Color(243, 224, 52));
        creditNameLabel.setText("Name on the Card");

        registerButton.setBackground(new java.awt.Color(158, 155, 255));
        registerButton.setFont(new java.awt.Font("Nirmala UI", 1, 14)); 
        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout registerPanelLayout = new javax.swing.GroupLayout(registerPanel);
        registerPanel.setLayout(registerPanelLayout);
        registerPanelLayout.setHorizontalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(firstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(164, 164, 164)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(creditCardText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(creditNameLabel)
                    .addComponent(creditCardLabel)
                    .addComponent(CVVLabel)
                    .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(registerPanelLayout.createSequentialGroup()
                            .addComponent(CVVText, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(creditNameText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(93, Short.MAX_VALUE))
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addComponent(noteLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addComponent(registerAccountLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(paymentLabel)
                        .addGap(147, 147, 147))))
        );
        registerPanelLayout.setVerticalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerAccountLabel)
                    .addComponent(paymentLabel))
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lastNameLabel)
                            .addComponent(firstNameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailLabel)
                            .addComponent(creditNameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(creditNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(creditCardLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(creditCardText, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CVVLabel)
                    .addComponent(passwordLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CVVText, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(noteLabel)
                .addContainerGap())
        );

        registerTitle.setBackground(new java.awt.Color(243, 224, 52));
        registerTitle.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); 
        registerTitle.setForeground(new java.awt.Color(243, 224, 52));
        registerTitle.setText("WELCOME TO MOVIES!");

        javax.swing.GroupLayout registerFormPanelLayout = new javax.swing.GroupLayout(registerFormPanel);
        registerFormPanel.setLayout(registerFormPanelLayout);
        registerFormPanelLayout.setHorizontalGroup(
            registerFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerFormPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(registerFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        registerFormPanelLayout.setVerticalGroup(
            registerFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerFormPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(registerTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerFormPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerFormPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }                      

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {  //user pressed register                                     

        String firstName = firstNameText.getText(); //get their first name
        String lastName = lastNameText.getText(); //get their last name
        String email = emailText.getText().strip(); //get their email
        String password = passwordText.getText(); //get their password

        if(firstName.isEmpty()) //if first name text box is empty
        {
            JOptionPane.showMessageDialog(null, "Please enter a first name.", 
                        "MOVIES", JOptionPane.CLOSED_OPTION);
            return;
        }
        if(lastName.isEmpty())  //if last name text box is empty
        {
            JOptionPane.showMessageDialog(null, "Please enter a last name.", 
                        "MOVIES", JOptionPane.CLOSED_OPTION);
            return;
        }

        if(email.equals("")) //if email text box is empty
        {
            JOptionPane.showMessageDialog(null, "Please enter an email address.", 
                        "MOVIES", JOptionPane.CLOSED_OPTION);
            return;
        }
        else if(!LoginForm.theatre.validateEmail(email))  //check if there is already an account registered under this email
        {
            JOptionPane.showMessageDialog(null, "There is already an account registered under that email address!", 
                        "MOVIES", JOptionPane.CLOSED_OPTION);
            return;
        }
        else if(email.contains("@") == false)  //assert email contains @ symbol
        {
            JOptionPane.showMessageDialog(null, "Please enter a valid email address.", 
                        "MOVIES", JOptionPane.CLOSED_OPTION);
            return;
        }
        else if(!email.endsWith(".ca") && !email.endsWith(".com") //assert email ends with valid email finisher
                && !email.endsWith(".net") && !email.endsWith(".org"))
        {
            JOptionPane.showMessageDialog(null, "Please enter a valid email address.", 
                        "MOVIES", JOptionPane.CLOSED_OPTION);
            return;
        }
       
        if(password.equals("")) //if password text box is empty
        {
            JOptionPane.showMessageDialog(null, "Please enter a password.", 
                        "MOVIES", JOptionPane.CLOSED_OPTION);
            return;
        }


        String creditCardNumber = creditCardText.getText().strip(); //get credit card number
        String creditCardName = creditNameText.getText(); //get credit card name
        String creditCardCVV = CVVText.getText(); //get CVV number
        
        if(creditCardNumber == null || creditCardNumber.equals("")) //check if credit card text box is empty
        {
            JOptionPane.showMessageDialog(null, "Please a credit card number.", 
                        "MOVIES", JOptionPane.CLOSED_OPTION);
            return;
        }
        try
        {
            Long.parseLong(creditCardNumber); //try to convert credit card number to long
            if(creditCardNumber.length() < 15 || creditCardNumber.length() > 16){ //assert credit card number is 15-16 characters
                JOptionPane.showMessageDialog(null, "Invalid credit card number.", 
                        "MOVIES", JOptionPane.CLOSED_OPTION);
                return;
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Invalid credit card number.", //credit card number contained invalid characters
                        "MOVIES", JOptionPane.CLOSED_OPTION);
            return;
        }
        
        if(creditCardName == null || creditCardName.isEmpty())  //check if credit card name text box is empty
        {
            JOptionPane.showMessageDialog(null, "Please enter a name.", 
                        "MOVIES", JOptionPane.CLOSED_OPTION);
            return;
        }
        if(creditCardCVV == null || creditCardCVV.isEmpty())  //check if CVV text box is empty
        {
            JOptionPane.showMessageDialog(null, "Please enter a CVV.", 
                        "MOVIES", JOptionPane.CLOSED_OPTION);
            return;
        }
        try
        {
            Long.parseLong(creditCardCVV); //try to convert CVV to long
            if(creditCardCVV.length() != 3){ //assert CVV is 3 digits long
                JOptionPane.showMessageDialog(null, "Invalid CVV.", 
                        "MOVIES", JOptionPane.CLOSED_OPTION);
                return;
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Invalid CVV.",  //CVV contained invalid characters
                        "MOVIES", JOptionPane.CLOSED_OPTION);
            return;
        }

        JOptionPane.showMessageDialog(null, "Successfully Registered!\nYou have been charged $20.", 
                        "MOVIES", JOptionPane.CLOSED_OPTION); //registration confirmation -- annual asmission fee charged at the beginning of period

        
        LoginForm.theatre.registerUser(firstName, lastName, email, password); //register user into database
        LoginForm.registeredUser = LoginForm.theatre.grabRegisteredUser(email, password); //set registered user object
        
        this.setVisible(false); //close RegisterForm
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true); //open MainPage
            }
        });
    }                                              

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration              
    private javax.swing.JLabel CVVLabel;
    private javax.swing.JTextField CVVText;
    private javax.swing.JLabel creditCardLabel;
    private javax.swing.JTextField creditCardText;
    private javax.swing.JLabel creditNameLabel;
    private javax.swing.JTextField creditNameText;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailText;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameText;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameText;
    private javax.swing.JLabel noteLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField passwordText;
    private javax.swing.JLabel paymentLabel;
    private javax.swing.JLabel registerAccountLabel;
    private javax.swing.JButton registerButton;
    private javax.swing.JPanel registerFormPanel;
    private javax.swing.JPanel registerPanel;
    private javax.swing.JLabel registerTitle;
    // End of variables declaration                   
}