package GUI;

/*
* File: LoginForm.java
* Assignment: ENSF480 Final Project
* Section: L02
* Due Date: Dec. 4, 2022
* Authors: Andrew Howe (30113096), James Platt (30130627), 
* Jenna Vlaar (30113774) and Sadman Shahriar (30121460)
*/

import static java.lang.String.valueOf;
import javax.swing.JOptionPane;
import model.RegisteredUser;
import model.Theatre;
import model.UnRegisteredUser;

public class LoginForm extends javax.swing.JFrame {
    public static String email;
    public static Theatre theatre;
    public static RegisteredUser registeredUser;
    public static UnRegisteredUser unregisteredUser;

    public LoginForm() {
        theatre = new Theatre(); //initialize theatre object
        initComponents(); // call GUI decorator
    }
                   
    private void initComponents() { //GUI decorator

        loginFormPanel = new javax.swing.JPanel();
        welcomeLabel = new javax.swing.JLabel();
        loginPanel = new javax.swing.JPanel();
        passwordLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        accountLabel = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();
        guestButton = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 620));
        setMinimumSize(new java.awt.Dimension(1000, 620));
        setPreferredSize(new java.awt.Dimension(1000, 620));

        loginFormPanel.setBackground(new java.awt.Color(41, 44, 142));
        loginFormPanel.setMaximumSize(new java.awt.Dimension(1000, 620));
        loginFormPanel.setMinimumSize(new java.awt.Dimension(1000, 620));
        loginFormPanel.setPreferredSize(new java.awt.Dimension(1000, 620));

        welcomeLabel.setBackground(new java.awt.Color(0, 0, 0));
        welcomeLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); 
        welcomeLabel.setForeground(new java.awt.Color(243, 224, 52));
        welcomeLabel.setText("WELCOME TO MOVIES!");

        loginPanel.setBackground(new java.awt.Color(87, 79, 198));

        passwordLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); 
        passwordLabel.setForeground(new java.awt.Color(243, 224, 52));
        passwordLabel.setText("Password");

        emailLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); 
        emailLabel.setForeground(new java.awt.Color(243, 224, 52));
        emailLabel.setText("Email Address");

        emailText.setBackground(new java.awt.Color(218, 215, 245));
        emailText.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        emailText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextActionPerformed(evt);
            }
        });

        accountLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); 
        accountLabel.setForeground(new java.awt.Color(243, 224, 52));
        accountLabel.setText("Don't have an account?");

        registerButton.setBackground(new java.awt.Color(158, 155, 255));
        registerButton.setFont(new java.awt.Font("Nirmala UI", 1, 14)); 
        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        loginButton.setBackground(new java.awt.Color(158, 155, 255));
        loginButton.setFont(new java.awt.Font("Nirmala UI", 1, 14)); 
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        guestButton.setBackground(new java.awt.Color(158, 155, 255));
        guestButton.setFont(new java.awt.Font("Nirmala UI", 1, 14)); 
        guestButton.setText("Continue as Guest");
        guestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guestButtonActionPerformed(evt);
            }
        });

        passwordField.setBackground(new java.awt.Color(218, 215, 245));
        passwordField.setFont(new java.awt.Font("Segoe UI", 0, 14)); 

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passwordField)
                    .addComponent(loginButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(guestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(emailText)
                    .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountLabel))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(emailLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emailText, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(accountLabel)
                .addGap(18, 18, 18)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        emailText.getAccessibleContext().setAccessibleName("usernameText");

        javax.swing.GroupLayout loginFormPanelLayout = new javax.swing.GroupLayout(loginFormPanel);
        loginFormPanel.setLayout(loginFormPanelLayout);
        loginFormPanelLayout.setHorizontalGroup(
            loginFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginFormPanelLayout.createSequentialGroup()
                .addContainerGap(300, Short.MAX_VALUE)
                .addGroup(loginFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginFormPanelLayout.createSequentialGroup()
                        .addComponent(welcomeLabel)
                        .addGap(33, 33, 33)))
                .addGap(273, 273, 273))
        );
        loginFormPanelLayout.setVerticalGroup(
            loginFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginFormPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(welcomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginFormPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginFormPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void emailTextActionPerformed(java.awt.event.ActionEvent evt) {                                          
    }                                         

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // User pressed LOGIN
        email = emailText.getText().strip();
        String password = valueOf(passwordField.getPassword());
        
        //TODO CHECK IF EMAIL IS ALREADY IN DATABASE
        if(email.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter an email address.", 
                        "MOVIES", JOptionPane.CLOSED_OPTION);
            return;
        }
        else if(email.contains("@") == false)
        {
            JOptionPane.showMessageDialog(null, "Please enter a valid email address.", 
                        "MOVIES", JOptionPane.CLOSED_OPTION);
            return;
        }
        else if(!email.endsWith(".ca") && !email.endsWith(".com")
                && !email.endsWith(".net") && !email.endsWith(".org"))
        {
            JOptionPane.showMessageDialog(null, "Please enter a valid email address.", 
                        "MOVIES", JOptionPane.CLOSED_OPTION);
            return;
        }
       
        if(password.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter a password.", 
                        "MOVIES", JOptionPane.CLOSED_OPTION);
            return;
        }
       
       if(theatre.verifyUser(email, password))
       {
            registeredUser = theatre.grabRegisteredUser(email, password);
            this.setVisible(false);
            
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
            });
       }
       else
       {
            JOptionPane.showMessageDialog(null, "Sorry! No user associated with that email/password.", 
                            "MOVIES", JOptionPane.CLOSED_OPTION);
            return;
       }
    }                                           

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        this.setVisible(false);
        
        java.awt.EventQueue.invokeLater(new Runnable() {
          public void run() {
            new RegisterForm().setVisible(true);
          }
        });
    }                                              

    private void guestButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        email = JOptionPane.showInputDialog("Please enter your email address.");
        if(email.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter an email address.", 
                        "MOVIES", JOptionPane.CLOSED_OPTION);
            guestButtonActionPerformed(evt);
        }
        else if(email.contains("@") == false)
        {
            JOptionPane.showMessageDialog(null, "Please enter a valid email address.", 
                        "MOVIES", JOptionPane.CLOSED_OPTION);
            guestButtonActionPerformed(evt);
        }
        else if(!email.endsWith(".ca") && !email.endsWith(".com")
                && !email.endsWith(".net") && !email.endsWith(".org"))
        {
            JOptionPane.showMessageDialog(null, "Please enter a valid email address.", 
                        "MOVIES", JOptionPane.CLOSED_OPTION);
            guestButtonActionPerformed(evt);
        }

        unregisteredUser = LoginForm.theatre.addUnregisteredUser("", "", email);
        //ADD EMAIL TO DATABASE
        this.setVisible(false);
        
        java.awt.EventQueue.invokeLater(new Runnable() {
          public void run() {
            new GuestPage().setVisible(true);
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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration                
    private javax.swing.JLabel accountLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailText;
    private javax.swing.JButton guestButton;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel loginFormPanel;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration                   
}