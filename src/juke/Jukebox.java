/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juke;

import jaco.mp3.player.MP3Player;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;



/**
 *
 * @author mkurs
 */
public final class Jukebox extends javax.swing.JFrame {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet;
    static String dbURL = "jdbc:mysql://localhost/songs?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    
    
    public Jukebox() {
        initComponents();
        showTableData();
    }
    
    public final String Song = "C:\\Users\\mkurs\\Documents\\NetBeansProjects\\Juke\\music\\The Moody Blues - Melancholy Man.mp3";
    MP3Player player = new MP3Player(new File(Song));
    public String SongName = "The Moody Blues - Melancholy Man";
    
    public void showTableData(){
        try{
            connection = DriverManager.getConnection(dbURL,"root","");
            String sql = "SELECT * FROM song";
            preparedStatement = connection.prepareStatement(sql);
            resultSet=preparedStatement.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);   
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        playButton = new javax.swing.JButton();
        pauseButton = new javax.swing.JButton();
        stopButton = new javax.swing.JButton();
        nowPlayingText = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        user = new javax.swing.JMenu();
        logout = new javax.swing.JMenuItem();
        playlist = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        searchSong = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        addSong = new javax.swing.JMenuItem();
        deleteSong = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "SongName", "Artist", "Genre", "Duration"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tableMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        playButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juke/Materials/play-button.png"))); // NOI18N
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });

        pauseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juke/Materials/pause.png"))); // NOI18N
        pauseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseButtonActionPerformed(evt);
            }
        });

        stopButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juke/Materials/stop.png"))); // NOI18N
        stopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopButtonActionPerformed(evt);
            }
        });

        nowPlayingText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nowPlayingText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        user.setText("User");

        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        user.add(logout);

        playlist.setText("Playlist");
        playlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playlistActionPerformed(evt);
            }
        });
        user.add(playlist);

        jMenuBar1.add(user);

        jMenu2.setText("Search");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        searchSong.setText("Search Song");
        searchSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchSongActionPerformed(evt);
            }
        });
        jMenu2.add(searchSong);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("Song");

        addSong.setText("Add Song");
        addSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSongActionPerformed(evt);
            }
        });
        jMenu5.add(addSong);

        deleteSong.setText("Delete Song");
        deleteSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteSongActionPerformed(evt);
            }
        });
        jMenu5.add(deleteSong);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(playButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pauseButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stopButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(nowPlayingText, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nowPlayingText, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playButton)
                    .addComponent(pauseButton)
                    .addComponent(stopButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void addSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSongActionPerformed
        AddSong addSong = new AddSong();
        addSong.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addSongActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void deleteSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteSongActionPerformed
        DeleteSong deleteSong = new DeleteSong();
        deleteSong.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_deleteSongActionPerformed

    private void tableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tableMousePressed

    private void pauseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseButtonActionPerformed
        player.pause();
        nowPlayingText.setText("Paused");
    }//GEN-LAST:event_pauseButtonActionPerformed

    private void stopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopButtonActionPerformed
        player.stop();
        nowPlayingText.setVisible(false);
    }//GEN-LAST:event_stopButtonActionPerformed

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        player.play();
        nowPlayingText.setText("Now playing: "+ SongName);
    }//GEN-LAST:event_playButtonActionPerformed

    private void searchSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchSongActionPerformed
        SearchSong searchSong = new SearchSong();
        searchSong.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_searchSongActionPerformed

    private void playlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playlistActionPerformed
        Playlist playlist = new Playlist();
        playlist.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_playlistActionPerformed

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
            java.util.logging.Logger.getLogger(Jukebox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jukebox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jukebox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jukebox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jukebox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addSong;
    private javax.swing.JMenuItem deleteSong;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem logout;
    private javax.swing.JLabel nowPlayingText;
    private javax.swing.JButton pauseButton;
    private javax.swing.JButton playButton;
    private javax.swing.JMenuItem playlist;
    private javax.swing.JMenuItem searchSong;
    private javax.swing.JButton stopButton;
    private javax.swing.JTable table;
    private javax.swing.JMenu user;
    // End of variables declaration//GEN-END:variables
}
