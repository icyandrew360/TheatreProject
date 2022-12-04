package GUI;

import java.util.Vector;

import javax.swing.JOptionPane;

/**
 *
 * @author Jenna
 */
public class ShowtimeForm extends javax.swing.JFrame {
    private String[] showtimeArray;
    private static String movie;
    private static String showTime;
    /**
     * Creates new form ShowtimeForm
     */
    public ShowtimeForm(String movie) {
        ShowtimeForm.movie = SearchResults.movie;
        populateShowtimes();
        initComponents();
        populateInfo();
    }

    private void populateInfo()
    {
        //get show time from database
        if(movie.equals("drSoftware"))
        {
            movieTitleLabel.setText("The Incredible Dr. Software");
            imageLabel.setIcon(new javax.swing.ImageIcon("GUI\\Images\\drsoftware.png")); // NOI18N
        }
        else if(movie.equals("stackOverflow"))
        {
            movieTitleLabel.setText("Stack Overflow");
            imageLabel.setIcon(new javax.swing.ImageIcon("GUI\\Images\\stackoverflow.png"));
        }
        else
        {
            movieTitleLabel.setText("No Decimal's Land");
            imageLabel.setIcon(new javax.swing.ImageIcon("GUI\\Images\\nodecimal.png")); // NOI18N
        }
        

        movieLengthLabel.setText("");
    }
    

    private void populateShowtimes()
    {
        Vector<String> showtimes = LoginForm.theatre.getMovieShowTimes(movie);
        showtimeArray = new String[showtimes.size() + 1];

        if(showtimes.isEmpty())
        {
            showtimeArray[0] = "No Available Showtimes!";
        }
        else
        {
            showtimeArray[0] = "Select Showtime";
            for(int i = 1; i < showtimes.size() + 1; i++)
            {
                showtimeArray[i] = showtimes.get(i - 1);
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

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
        imageLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        imageLabel.setForeground(new java.awt.Color(255, 255, 255));

        lengthTitleLabel.setBackground(new java.awt.Color(243, 224, 52));
        lengthTitleLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lengthTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        lengthTitleLabel.setText("Length:");

        movieLengthLabel.setBackground(new java.awt.Color(243, 224, 52));
        movieLengthLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        movieLengthLabel.setForeground(new java.awt.Color(255, 255, 255));

        movieTitleLabel.setBackground(new java.awt.Color(243, 224, 52));
        movieTitleLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        movieTitleLabel.setForeground(new java.awt.Color(255, 255, 255));

        selectShowtimeLabel.setBackground(new java.awt.Color(243, 224, 52));
        selectShowtimeLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        selectShowtimeLabel.setForeground(new java.awt.Color(243, 224, 52));
        selectShowtimeLabel.setText("Please Select Showtime");

        showtimesComboBox.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        showtimesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(showtimeArray));

        continueButton.setBackground(new java.awt.Color(158, 155, 255));
        continueButton.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
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
        movieTitle.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
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
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
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

    private void continueButtonActionPerformed(java.awt.event.ActionEvent evt) {    
        if(showtimesComboBox.getSelectedIndex() == 0)
        {
            JOptionPane.showMessageDialog(null, "Please select a showtime!", 
                        "MOVIES", JOptionPane.CLOSED_OPTION);
            return;
        }
        else
        {
            showTime = showtimeArray[showtimesComboBox.getSelectedIndex()];
        }

        this.setVisible(false);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeatForm(movie, showTime, SearchResults.registered).setVisible(true);
            }
        });
    }        


    // Variables declaration - do not modify                     
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
