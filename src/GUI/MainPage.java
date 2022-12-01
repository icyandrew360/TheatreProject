package GUI;

/**
 *
 * @author Jenna Vlaar
 */
public class MainPage extends javax.swing.JFrame {

    /**
     * Creates new form MainPage
     */
    public MainPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        mainPagePanel = new javax.swing.JPanel();
        moviesTitle = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        stackOverflowLabel = new javax.swing.JLabel();
        wordsLabel = new javax.swing.JLabel();
        drSoftwarePoster = new javax.swing.JLabel();
        stackOverflowPoster = new javax.swing.JLabel();
        wowLabel1 = new javax.swing.JLabel();
        drSoftwareLabel = new javax.swing.JLabel();
        searchText = new javax.swing.JTextField();
        accountButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        theatreComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(41, 44, 142));

        mainPagePanel.setBackground(new java.awt.Color(41, 44, 142));

        moviesTitle.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        moviesTitle.setForeground(new java.awt.Color(243, 224, 52));
        moviesTitle.setText("MOVIES");

        mainPanel.setBackground(new java.awt.Color(87, 79, 198));
        mainPanel.setForeground(new java.awt.Color(87, 79, 198));

        stackOverflowLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        stackOverflowLabel.setForeground(new java.awt.Color(243, 224, 52));
        stackOverflowLabel.setText("Stack Overflow - Rated R");

        wordsLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        wordsLabel.setForeground(new java.awt.Color(255, 255, 255));
        wordsLabel.setText("Subscribe to MOVIE NEWS to get updates on upcoming movies!");

        drSoftwarePoster.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/gui/movieposters/drsoftware.png"))); // NOI18N

        stackOverflowPoster.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/gui/movieposters/stackoverflow.png"))); // NOI18N

        wowLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        wowLabel1.setForeground(new java.awt.Color(243, 224, 52));
        wowLabel1.setText("WOW! Check out this week's MOVIE news!");

        drSoftwareLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        drSoftwareLabel.setForeground(new java.awt.Color(243, 224, 52));
        drSoftwareLabel.setText("The Incredible Dr. Software - Rated E");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(drSoftwarePoster, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(drSoftwareLabel)))
                .addGap(90, 90, 90)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stackOverflowPoster, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(stackOverflowLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(wordsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(wowLabel1)
                    .addContainerGap(445, Short.MAX_VALUE)))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(drSoftwarePoster)
                    .addComponent(stackOverflowPoster))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(drSoftwareLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stackOverflowLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(wordsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(wowLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(426, Short.MAX_VALUE)))
        );

        searchText.setBackground(new java.awt.Color(218, 215, 245));
        searchText.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        searchText.setForeground(new java.awt.Color(146, 146, 159));
        searchText.setText("Search movie...");

        accountButton.setBackground(new java.awt.Color(158, 155, 255));
        accountButton.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        accountButton.setText("Account");
        accountButton.setActionCommand("");

        logoutButton.setBackground(new java.awt.Color(158, 155, 255));
        logoutButton.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        logoutButton.setText("Logout");
        logoutButton.setActionCommand("");

        theatreComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        theatreComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                theatreComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPagePanelLayout = new javax.swing.GroupLayout(mainPagePanel);
        mainPagePanel.setLayout(mainPagePanelLayout);
        mainPagePanelLayout.setHorizontalGroup(
            mainPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPagePanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(moviesTitle)
                .addGap(26, 26, 26)
                .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(theatreComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(accountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(mainPagePanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        mainPagePanelLayout.setVerticalGroup(
            mainPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPagePanelLayout.createSequentialGroup()
                .addGroup(mainPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPagePanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(mainPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(accountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPagePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(moviesTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPagePanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(mainPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(theatreComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 339, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void theatreComboBoxActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton accountButton;
    private javax.swing.JLabel drSoftwareLabel;
    private javax.swing.JLabel drSoftwarePoster;
    private javax.swing.JButton logoutButton;
    private javax.swing.JPanel mainPagePanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel moviesTitle;
    private javax.swing.JTextField searchText;
    private javax.swing.JLabel stackOverflowLabel;
    private javax.swing.JLabel stackOverflowPoster;
    private javax.swing.JComboBox<String> theatreComboBox;
    private javax.swing.JLabel wordsLabel;
    private javax.swing.JLabel wowLabel1;
    // End of variables declaration                   
}
