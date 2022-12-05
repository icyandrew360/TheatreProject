package GUI;

/*
* File: PaymentForm.java
* Assignment: ENSF480 Final Project
* Section: L02
* Due Date: Dec. 4, 2022
* Authors: Andrew Howe (30113096), James Platt (30130627), 
* Jenna Vlaar (30113774) and Sadman Shahriar (30121460)
*/

import javax.swing.JOptionPane;

public class PaymentForm extends javax.swing.JFrame {
    private static String seats;
    private static String movie;
    private String creditCardNumber;
    private String creditCardName;
    private String creditCardCVV;
    private static boolean registered;
    private static String showTime;
    private double total;

    public PaymentForm(String seats, String movie, String showTime, boolean registered) {
        PaymentForm.showTime = showTime;
        PaymentForm.seats = seats;
        PaymentForm.movie = movie;
        PaymentForm.registered = registered;
        initComponents();
        addInformation();
    }
    
    private void addInformation()
    {
        int numberOfSeats = 0;
        for(int i = 0; i < seats.length(); i++)
        {
            if(Character.isAlphabetic(seats.charAt(i)))
            {
                numberOfSeats++;
            }
        }
        numberTicketsLabel.setText(numberOfSeats + "x");
        double cost = numberOfSeats * 13.99;
        double gst = cost * 0.05;
        total = cost + gst;
        gstCostLabel.setText(String.format("%.2f", gst));
        admissionCostLabel.setText("$" + String.format("%.2f", cost));
        totalCostLabel.setText(String.format("%.2f", total));
        movieNameText.setText(movie);
    }
         
    private void initComponents() {

        paymentFormPanel = new javax.swing.JPanel();
        receiptPanel = new javax.swing.JPanel();
        admissionLabel = new javax.swing.JLabel();
        orderDetailsLabel = new javax.swing.JLabel();
        numberTicketsLabel = new javax.swing.JLabel();
        totalCostLabel = new javax.swing.JLabel();
        moviesLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        admissionCostLabel = new javax.swing.JLabel();
        gstCostLabel = new javax.swing.JLabel();
        movieNameLabel = new javax.swing.JLabel();
        movieNameText = new javax.swing.JLabel();
        paymentTitle = new javax.swing.JLabel();
        creditCardText = new javax.swing.JTextField();
        creditCardLabel = new javax.swing.JLabel();
        creditNameLabel = new javax.swing.JLabel();
        creditNameText = new javax.swing.JTextField();
        CVVText = new javax.swing.JTextField();
        CVVLabel = new javax.swing.JLabel();
        placeOrderButton = new javax.swing.JButton();
        moviesTitle = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 620));
        setMinimumSize(new java.awt.Dimension(1000, 620));
        setPreferredSize(new java.awt.Dimension(1000, 620));

        paymentFormPanel.setBackground(new java.awt.Color(41, 44, 142));
        paymentFormPanel.setMaximumSize(new java.awt.Dimension(1000, 620));
        paymentFormPanel.setMinimumSize(new java.awt.Dimension(1000, 620));
        paymentFormPanel.setPreferredSize(new java.awt.Dimension(1000, 620));

        receiptPanel.setBackground(new java.awt.Color(218, 215, 245));

        admissionLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); 
        admissionLabel.setText("General Admission . . . . . . . ");

        orderDetailsLabel.setFont(new java.awt.Font("Times New Roman", 1, 28)); 
        orderDetailsLabel.setText("Order Details");

        numberTicketsLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); 

        totalCostLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); 

        moviesLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 22)); 
        moviesLabel.setText("MOVIES");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); 
        jLabel6.setText("GST . . . . . . . . . . . . . . . . . . . . . . . . $");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); 
        jLabel7.setText("HST . . . . . . . . . . . . . . . . . . . . . . . . $  0.00");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); 
        jLabel8.setText("Total  . . . . . . . . . . . . . . . . . . . . . . . $");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); 
        jLabel9.setText("-----------------------------------------------------");

        admissionCostLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); 

        gstCostLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); 

        movieNameLabel.setFont(new java.awt.Font("Times New Roman", 1, 20)); 
        movieNameLabel.setText("Movie:");

        movieNameText.setFont(new java.awt.Font("Times New Roman", 0, 20)); 

        javax.swing.GroupLayout receiptPanelLayout = new javax.swing.GroupLayout(receiptPanel);
        receiptPanel.setLayout(receiptPanelLayout);
        receiptPanelLayout.setHorizontalGroup(
            receiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(receiptPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(receiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(receiptPanelLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(totalCostLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(receiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(receiptPanelLayout.createSequentialGroup()
                            .addComponent(numberTicketsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(admissionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(admissionCostLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(moviesLabel)
                        .addComponent(orderDetailsLabel)
                        .addGroup(receiptPanelLayout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(gstCostLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(receiptPanelLayout.createSequentialGroup()
                        .addComponent(movieNameLabel)
                        .addGap(18, 18, 18)
                        .addComponent(movieNameText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        receiptPanelLayout.setVerticalGroup(
            receiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(receiptPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(orderDetailsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(moviesLabel)
                .addGap(30, 30, 30)
                .addGroup(receiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(movieNameLabel)
                    .addComponent(movieNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(receiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(receiptPanelLayout.createSequentialGroup()
                        .addGroup(receiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(receiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(admissionLabel)
                                .addComponent(numberTicketsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(admissionCostLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addComponent(gstCostLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(receiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(totalCostLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        paymentTitle.setBackground(new java.awt.Color(158, 155, 255));
        paymentTitle.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); 
        paymentTitle.setForeground(new java.awt.Color(243, 224, 52));
        paymentTitle.setText("Payment Information");

        creditCardText.setBackground(new java.awt.Color(218, 215, 245));
        creditCardText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditCardTextActionPerformed(evt);
            }
        });

        creditCardLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); 
        creditCardLabel.setForeground(new java.awt.Color(243, 224, 52));
        creditCardLabel.setText("Credit Card Number");

        creditNameLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); 
        creditNameLabel.setForeground(new java.awt.Color(243, 224, 52));
        creditNameLabel.setText("Name on the Card");

        creditNameText.setBackground(new java.awt.Color(218, 215, 245));
        creditNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditNameTextActionPerformed(evt);
            }
        });

        CVVText.setBackground(new java.awt.Color(218, 215, 245));
        CVVText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CVVTextActionPerformed(evt);
            }
        });

        CVVLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); 
        CVVLabel.setForeground(new java.awt.Color(243, 224, 52));
        CVVLabel.setText("CVV");

        placeOrderButton.setBackground(new java.awt.Color(158, 155, 255));
        placeOrderButton.setFont(new java.awt.Font("Nirmala UI", 1, 14)); 
        placeOrderButton.setText("Place Order");
        placeOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderButtonActionPerformed(evt);
            }
        });

        moviesTitle.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); 
        moviesTitle.setForeground(new java.awt.Color(243, 224, 52));
        moviesTitle.setText("MOVIES");

        jPanel1.setBackground(new java.awt.Color(158, 155, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout paymentFormPanelLayout = new javax.swing.GroupLayout(paymentFormPanel);
        paymentFormPanel.setLayout(paymentFormPanelLayout);
        paymentFormPanelLayout.setHorizontalGroup(
            paymentFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentFormPanelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(paymentFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paymentFormPanelLayout.createSequentialGroup()
                        .addGroup(paymentFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(receiptPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paymentTitle))
                        .addGap(91, 91, 91)
                        .addGroup(paymentFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(creditCardLabel)
                            .addGroup(paymentFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(creditCardText)
                                .addComponent(creditNameLabel)
                                .addComponent(CVVLabel)
                                .addComponent(creditNameText)
                                .addComponent(placeOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CVVText, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(paymentFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(moviesTitle, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(217, Short.MAX_VALUE))
        );
        paymentFormPanelLayout.setVerticalGroup(
            paymentFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentFormPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(moviesTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paymentFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paymentTitle)
                    .addComponent(creditCardLabel))
                .addGap(12, 12, 12)
                .addGroup(paymentFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paymentFormPanelLayout.createSequentialGroup()
                        .addComponent(creditCardText, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(creditNameLabel)
                        .addGap(18, 18, 18)
                        .addComponent(creditNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CVVLabel)
                        .addGap(18, 18, 18)
                        .addComponent(CVVText, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(placeOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(receiptPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paymentFormPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1042, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paymentFormPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
        );

        pack();
    }                     

    private void placeOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                 

        creditCardNumber = creditCardText.getText().strip();
        creditCardName = creditNameText.getText();
        creditCardCVV = CVVText.getText();
        
        if(creditCardNumber == null || creditCardNumber.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please a credit card number.", 
                        "MOVIES", JOptionPane.CLOSED_OPTION);
            return;
        }
        try
        {
            Long.parseLong(creditCardNumber);
            if(creditCardNumber.length() < 15 || creditCardNumber.length() > 16){
                JOptionPane.showMessageDialog(null, "Invalid credit card number.", 
                        "MOVIES", JOptionPane.CLOSED_OPTION);
                return;
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Invalid credit card number.", 
                        "MOVIES", JOptionPane.CLOSED_OPTION);
            return;
        }
        
        if(creditCardName == null || creditCardName.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please enter a name.", 
                        "MOVIES", JOptionPane.CLOSED_OPTION);
            return;
        }
        if(creditCardCVV == null || creditCardCVV.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please enter a CVV.", 
                        "MOVIES", JOptionPane.CLOSED_OPTION);
            return;
        }
        try
        {
            Long.parseLong(creditCardCVV);
            if(creditCardCVV.length() != 3){
                JOptionPane.showMessageDialog(null, "Invalid CVV.", 
                        "MOVIES", JOptionPane.CLOSED_OPTION);
                return;
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Invalid CVV.", 
                        "MOVIES", JOptionPane.CLOSED_OPTION);
            return;
        }
        

        if(LoginForm.registeredUser != null)
        {
            LoginForm.theatre.addTicket(LoginForm.registeredUser, seats, movie, showTime);
            JOptionPane.showMessageDialog(null, "Order Placed!", 
                        "MOVIES", JOptionPane.CLOSED_OPTION);
            this.setVisible(false);
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new MainPage().setVisible(true);
                }
            });
        }
        else
        {
            sendEmailReceipt(total, seats);
            LoginForm.theatre.addTicket(LoginForm.unregisteredUser, seats, movie, showTime);
            JOptionPane.showMessageDialog(null, "Order Placed!", 
                        "MOVIES", JOptionPane.CLOSED_OPTION);
            this.setVisible(false);
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuestPage().setVisible(true);
            }
            });
        }
    }                                                

    private void creditCardTextActionPerformed(java.awt.event.ActionEvent evt) {                                               
        creditCardNumber = creditCardText.getText();
       
    }                                              

    private void creditNameTextActionPerformed(java.awt.event.ActionEvent evt) {                                               
        creditCardName = creditNameText.getText();
    }                                              

    private void CVVTextActionPerformed(java.awt.event.ActionEvent evt) {                                        
        creditCardCVV = CVVText.getText();
    }                                       

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
  
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentForm(seats, movie, showTime, registered).setVisible(true);
            }
        });
    }

    // Variables declaration               
    private javax.swing.JLabel CVVLabel;
    private javax.swing.JTextField CVVText;
    private javax.swing.JLabel admissionCostLabel;
    private javax.swing.JLabel admissionLabel;
    private javax.swing.JLabel creditCardLabel;
    private javax.swing.JTextField creditCardText;
    private javax.swing.JLabel creditNameLabel;
    private javax.swing.JTextField creditNameText;
    private javax.swing.JLabel gstCostLabel;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel movieNameLabel;
    private javax.swing.JLabel movieNameText;
    private javax.swing.JLabel moviesLabel;
    private javax.swing.JLabel moviesTitle;
    private javax.swing.JLabel numberTicketsLabel;
    private javax.swing.JLabel orderDetailsLabel;
    private javax.swing.JPanel paymentFormPanel;
    private javax.swing.JLabel paymentTitle;
    private javax.swing.JButton placeOrderButton;
    private javax.swing.JPanel receiptPanel;
    private javax.swing.JLabel totalCostLabel;
    // End of variables declaration                   
}