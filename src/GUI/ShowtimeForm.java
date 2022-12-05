package GUI;

/*
* File: ShowtimeForm.java
* Assignment: ENSF480 Final Project
* Section: L02
* Due Date: Dec. 4, 2022
* Authors: Andrew Howe (30113096), James Platt (30130627), 
* Jenna Vlaar (30113774) and Sadman Shahriar (30121460)
*/

import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ShowtimeForm extends javax.swing.JFrame {
    private Vector<String> showtimes = new Vector<String>(1);
    private String[] showtimeArray = new String[1];
    private static String movie;
    private static String showTime;
  
    public ShowtimeForm(String movie) {
        ShowtimeForm.movie = SearchResults.movie;
        populateShowtimes();
        initComponents();
        populateInfo();
    }

    private void populateInfo() //display movie's poster
    {
        //get show time from database
        if(movie.equals("drSoftware"))
        {
            movieTitleLabel.setText("The Incredible Dr. Software");
            ImageIcon drSoftware = new ImageIcon(getClass().getResource("Images/drsoftware.png"));
            imageLabel.setIcon(drSoftware);
        }
        else if(movie.equals("stackOverflow"))
        {
            movieTitleLabel.setText("Stack Overflow");
            ImageIcon stackOverflow = new ImageIcon(getClass().getResource("Images/stackoverflow.png"));
            imageLabel.setIcon(stackOverflow);
        }
        else
        {
            movieTitleLabel.setText("No Decimal's Land");
            ImageIcon noDecimal = new ImageIcon(getClass().getResource("Images/nodecimal.png"));
            imageLabel.setIcon(noDecimal); 
        }
        
        String movieLength = LoginForm.theatre.getMovieLength(movie);
        movieLengthLabel.setText(movieLength);
    }
    

    private void populateShowtimes() //populate showtimes combobox
    {
        showtimes = LoginForm.theatre.getMovieShowTimes(movie);
        showtimeArray = new String[showtimes.size() + 1];

        if(showtimes.isEmpty()) //if there are no showtimes for a given movie
        {
            showtimeArray[0] = "No Available Showtimes!";
        }
        else //there are showtimes
        {
            showtimeArray[0] = "Select Showtime";
            for(int i = 1; i < showtimes.size() + 1; i++)
            {
                showtimeArray[i] = showtimes.get(i - 1); //add to combobox
            }
        }
    }
                
    private void initComponents() { //GUI decorator

        showtimeFormPanel = new javax.swing.JPanel();
        showtimePanel = new javax.swing.JPanel();
        imageLabel = new javax.swing.JLabel();
        lengthTitleLabel = new javax.swing.JLabel();
        movieLengthLabel = new javax.swing.JLabel();
        movieTitleLabel = new javax.swing.JLabel();
        selectShowtimeLabel = new javax.swing.JLabel();
        showtimesComboBox = new javax.swing.JComboBox<>();
        continueButton = new javax.swing.JButton();
        movieTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(41, 44, 142));
        setMaximumSize(new java.awt.Dimension(1000, 620));
        setMinimumSize(new java.awt.Dimension(1000, 620));
        setPreferredSize(new java.awt.Dimension(1000, 620));

        showtimeFormPanel.setBackground(new java.awt.Color(41, 44, 142));
        showtimeFormPanel.setMaximumSize(new java.awt.Dimension(1000, 620));
        showtimeFormPanel.setMinimumSize(new java.awt.Dimension(1000, 620));
        showtimeFormPanel.setPreferredSize(new java.awt.Dimension(1000, 620));

        showtimePanel.setBackground(new java.awt.Color(87, 79, 198));

        imageLabel.setBackground(new java.awt.Color(243, 224, 52));
        imageLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); 
        imageLabel.setForeground(new java.awt.Color(255, 255, 255));

        lengthTitleLabel.setBackground(new java.awt.Color(243, 224, 52));
        lengthTitleLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); 
        lengthTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        lengthTitleLabel.setText("Length:");

        movieLengthLabel.setBackground(new java.awt.Color(243, 224, 52));
        movieLengthLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); 
        movieLengthLabel.setForeground(new java.awt.Color(255, 255, 255));

        movieTitleLabel.setBackground(new java.awt.Color(243, 224, 52));
        movieTitleLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); 
        movieTitleLabel.setForeground(new java.awt.Color(255, 255, 255));

        selectShowtimeLabel.setBackground(new java.awt.Color(243, 224, 52));
        selectShowtimeLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); 
        selectShowtimeLabel.setForeground(new java.awt.Color(243, 224, 52));
        selectShowtimeLabel.setText("Please Select Showtime");

        showtimesComboBox.setFont(new java.awt.Font("Segoe UI", 0, 18)); 
        showtimesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(showtimeArray));

        continueButton.setBackground(new java.awt.Color(158, 155, 255));
        continueButton.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); 
        continueButton.setText("Continue");
        continueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout showtimePanelLayout = new javax.swing.GroupLayout(showtimePanel);
        showtimePanel.setLayout(showtimePanelLayout);
        showtimePanelLayout.setHorizontalGroup(
            showtimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showtimePanelLayout.createSequentialGroup()
                .addGroup(showtimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(showtimePanelLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(selectShowtimeLabel))
                    .addGroup(showtimePanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(showtimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(continueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(showtimesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(44, 44, 44)
                .addGroup(showtimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(showtimePanelLayout.createSequentialGroup()
                        .addComponent(lengthTitleLabel)
                        .addGap(18, 18, 18)
                        .addComponent(movieLengthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showtimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(movieTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11))
        );
        showtimePanelLayout.setVerticalGroup(
            showtimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showtimePanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(showtimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectShowtimeLabel)
                    .addComponent(movieTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addGroup(showtimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(showtimePanelLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(showtimePanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(showtimesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(showtimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(showtimePanelLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(continueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(showtimePanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(showtimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lengthTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                            .addComponent(movieLengthLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        movieTitle.setBackground(new java.awt.Color(243, 224, 52));
        movieTitle.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); 
        movieTitle.setForeground(new java.awt.Color(243, 224, 52));
        movieTitle.setText("MOVIES");

        javax.swing.GroupLayout showtimeFormPanelLayout = new javax.swing.GroupLayout(showtimeFormPanel);
        showtimeFormPanel.setLayout(showtimeFormPanelLayout);
        showtimeFormPanelLayout.setHorizontalGroup(
            showtimeFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showtimeFormPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(showtimeFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(movieTitle)
                    .addComponent(showtimePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        showtimeFormPanelLayout.setVerticalGroup(
            showtimeFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showtimeFormPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(movieTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showtimePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(showtimeFormPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(showtimeFormPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

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
            java.util.logging.Logger.getLogger(ShowtimeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowtimeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowtimeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowtimeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowtimeForm(movie).setVisible(true);
            }
        });
    }

    private void continueButtonActionPerformed(java.awt.event.ActionEvent evt) {  //user pressed continue button  
        
        if(showtimesComboBox.getSelectedIndex() == 0) //if user has not selected a showtime
        {
            JOptionPane.showMessageDialog(null, "Please select a showtime!", 
                        "MOVIES", JOptionPane.CLOSED_OPTION);
            return;
        }
        else //get selected showtime
        {
            showTime = showtimeArray[showtimesComboBox.getSelectedIndex()];
        }

        this.setVisible(false); //close ShowtimeForm
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeatForm(movie, showTime, SearchResults.registered).setVisible(true); //display SeatForm
            }
        });
    }        

    // Variables declaration                  
    private javax.swing.JButton continueButton;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel lengthTitleLabel;
    private javax.swing.JLabel movieLengthLabel;
    private javax.swing.JLabel movieTitle;
    private javax.swing.JLabel movieTitleLabel;
    private javax.swing.JLabel selectShowtimeLabel;
    private javax.swing.JPanel showtimeFormPanel;
    private javax.swing.JPanel showtimePanel;
    private javax.swing.JComboBox<String> showtimesComboBox;
    // End of variables declaration                   
}
