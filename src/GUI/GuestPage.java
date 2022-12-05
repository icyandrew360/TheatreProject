package GUI;

/*
* File: GuestPage.java
* Assignment: ENSF480 Final Project
* Section: L02
* Due Date: Dec. 4, 2022
* Authors: Andrew Howe (30113096), James Platt (30130627), 
* Jenna Vlaar (30113774) and Sadman Shahriar (30121460)
*/

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import model.*;

public class GuestPage extends javax.swing.JFrame {
    private String[] ticketArray;
    private String[] theatreArray = {"Select Theatre", "Software Theatre"};

    public GuestPage() {
        fillComboBoxes();
        initComponents();
    }

    private void fillComboBoxes()
    {
        ArrayList<Ticket> tickets = new ArrayList<Ticket>();
        tickets = LoginForm.unregisteredUser.getTickets();
        if(tickets == null)
            tickets = new ArrayList<Ticket>(0);
        ticketArray = new String[tickets.size() + 1];

        if(tickets.isEmpty())
        {
            ticketArray[0] = "No Booked Tickets";
        }
        else
        {
            ticketArray[0] = "Select Ticket";
            for(int i = 1; i < tickets.size() + 1; i++)
            {
                ticketArray[i] = tickets.get(i - 1).getMovieName();
            }
        }
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        stackOverflowLabel = new javax.swing.JLabel();
        wordsLabel = new javax.swing.JLabel();
        drSoftwarePoster = new javax.swing.JLabel();
        stackOverflowPoster = new javax.swing.JLabel();
        wowLabel1 = new javax.swing.JLabel();
        drSoftwareLabel = new javax.swing.JLabel();
        moviesTitle = new javax.swing.JLabel();
        searchText = new javax.swing.JTextField();
        ticketComboBox = new javax.swing.JComboBox<>();
        cancelTicketButton = new javax.swing.JButton();
        theatreComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 620));
        setMinimumSize(new java.awt.Dimension(1000, 620));
        setPreferredSize(new java.awt.Dimension(1000, 620));

        jPanel1.setBackground(new java.awt.Color(41, 44, 142));
        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 620));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 620));

        mainPanel.setBackground(new java.awt.Color(87, 79, 198));
        mainPanel.setForeground(new java.awt.Color(87, 79, 198));

        stackOverflowLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); 
        stackOverflowLabel.setForeground(new java.awt.Color(243, 224, 52));
        stackOverflowLabel.setText("Stack Overflow - Rated R");

        wordsLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); 
        wordsLabel.setForeground(new java.awt.Color(255, 255, 255));
        wordsLabel.setText("Subscribe to MOVIE NEWS to get updates on upcoming movies!");

        ImageIcon drSoftware = new ImageIcon(getClass().getResource("Images/drsoftware.png"));
        drSoftwarePoster.setIcon(drSoftware); 

        ImageIcon stackOverflow = new ImageIcon(getClass().getResource("Images/stackoverflow.png"));
        stackOverflowPoster.setIcon(stackOverflow); 
        
        wowLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); 
        wowLabel1.setForeground(new java.awt.Color(243, 224, 52));
        wowLabel1.setText("WOW! Check out this week's MOVIE news!");

        drSoftwareLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); 
        drSoftwareLabel.setForeground(new java.awt.Color(243, 224, 52));
        drSoftwareLabel.setText("The Incredible Dr. Software - Rated E");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(drSoftwarePoster, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(drSoftwareLabel)))
                        .addGap(52, 52, 52)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stackOverflowPoster)
                            .addComponent(stackOverflowLabel)))
                    .addComponent(wordsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wowLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(wowLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(drSoftwarePoster)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(drSoftwareLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(stackOverflowPoster)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(stackOverflowLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(wordsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        moviesTitle.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); 
        moviesTitle.setForeground(new java.awt.Color(243, 224, 52));
        moviesTitle.setText("MOVIES");

        searchText.setBackground(new java.awt.Color(218, 215, 245));
        searchText.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); 
        searchText.setForeground(new java.awt.Color(146, 146, 159));
        searchText.setText("Search movie...");
        searchText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextActionPerformed(evt);
            }
        });

        ticketComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(ticketArray));
        ticketComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticketComboBoxActionPerformed(evt);
            }
        });

        cancelTicketButton.setBackground(new java.awt.Color(158, 155, 255));
        cancelTicketButton.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); 
        cancelTicketButton.setText("Cancel Ticket");
        cancelTicketButton.setActionCommand("");
        cancelTicketButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelTicketButtonActionPerformed(evt);
            }
        });

        theatreComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(theatreArray));
        theatreComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                theatreComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(moviesTitle)
                        .addGap(18, 18, 18)
                        .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(theatreComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ticketComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelTicketButton)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ticketComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cancelTicketButton, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                        .addComponent(theatreComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(moviesTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 436, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>   
    
    private void cancelTicketButtonActionPerformed(java.awt.event.ActionEvent evt)
    {
        if(ticketComboBox.getItemCount() == 1)
        {
            JOptionPane.showMessageDialog(null, "You have no booked tickets!", 
                        "MOVIES", JOptionPane.CLOSED_OPTION);
            return;
        }
        if(ticketComboBox.getSelectedIndex() == 0)
        {
            JOptionPane.showMessageDialog(null, "Please select a ticket to cancel.", 
                        "MOVIES", JOptionPane.CLOSED_OPTION);
            return;
        }

        //REMOVE TICKET FROM DATABASE, UPDATE SEATS
        fillComboBoxes();
        JOptionPane.showMessageDialog(null, "Ticket Canceled!", 
                        "MOVIES", JOptionPane.CLOSED_OPTION);
    }

    private void ticketComboBoxActionPerformed(java.awt.event.ActionEvent evt) {                                               
    }                                              

    private void theatreComboBoxActionPerformed(java.awt.event.ActionEvent evt) {                                                
    }    
    
    private void searchTextActionPerformed(java.awt.event.ActionEvent evt) {                                           
        //GET MOST RELEVANT MOVIE FROM DATABASE, return ID
        if(theatreComboBox.getSelectedIndex() == 0)
        {
            JOptionPane.showMessageDialog(null, "Please select a theatre!", 
                        "MOVIES", JOptionPane.CLOSED_OPTION);
            return;

        }
        if(searchText.getText().equals("Search movie...") || searchText.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please search for a movie!", 
                        "MOVIES", JOptionPane.CLOSED_OPTION);
            return;
        }
        else
        {
            String search = searchText.getText();
            String movie = LoginForm.theatre.searchMovie(search);
            this.setVisible(false);
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new SearchResults(movie, false, search).setVisible(true);
                }
            });
        }
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
            java.util.logging.Logger.getLogger(GuestPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuestPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuestPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuestPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuestPage().setVisible(true);
            }
        });
    }

    // Variables declaration                 
    private javax.swing.JButton cancelTicketButton;
    private javax.swing.JLabel drSoftwareLabel;
    private javax.swing.JLabel drSoftwarePoster;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel moviesTitle;
    private javax.swing.JTextField searchText;
    private javax.swing.JLabel stackOverflowLabel;
    private javax.swing.JLabel stackOverflowPoster;
    private javax.swing.JComboBox<String> theatreComboBox;
    private javax.swing.JComboBox<String> ticketComboBox;
    private javax.swing.JLabel wordsLabel;
    private javax.swing.JLabel wowLabel1;
    // End of variables declaration                   
}