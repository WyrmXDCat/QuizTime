/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuizTime.gui;

import java.awt.Color;
import javax.swing.JOptionPane;
import QuizTime.pojo.UserProfile;

/**
 *
 * @author Sonis
 */
public class AdminOptionsFrame extends javax.swing.JFrame {

    Color oldColor;
    public AdminOptionsFrame() {
        initComponents();
        setLocationRelativeTo(null);
        jlblUserName.setText("Hello "+UserProfile.getUSername());
        oldColor=jlblLogout.getForeground();
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jrbSetAPaper = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jrbEditAPaper = new javax.swing.JRadioButton();
        jrbRegisterStudent = new javax.swing.JRadioButton();
        jrbViewScore = new javax.swing.JRadioButton();
        btnDoTask = new javax.swing.JButton();
        jlblUserName = new javax.swing.JLabel();
        jlblLogout = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuizTime/gui/animated-teacher-image-0002.gif"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuizTime/gui/text.gif"))); // NOI18N

        jrbSetAPaper.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(jrbSetAPaper);
        jrbSetAPaper.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jrbSetAPaper.setForeground(new java.awt.Color(255, 0, 0));
        jrbSetAPaper.setText("Set A Paper");
        jrbSetAPaper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbSetAPaperActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Make A Choice");

        jrbEditAPaper.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(jrbEditAPaper);
        jrbEditAPaper.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jrbEditAPaper.setForeground(new java.awt.Color(255, 0, 0));
        jrbEditAPaper.setText("Edit A Paper");

        jrbRegisterStudent.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(jrbRegisterStudent);
        jrbRegisterStudent.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jrbRegisterStudent.setForeground(new java.awt.Color(255, 0, 0));
        jrbRegisterStudent.setText("Register Student");

        jrbViewScore.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(jrbViewScore);
        jrbViewScore.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jrbViewScore.setForeground(new java.awt.Color(255, 0, 0));
        jrbViewScore.setText("View Score");

        btnDoTask.setBackground(new java.awt.Color(255, 0, 0));
        btnDoTask.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        btnDoTask.setForeground(new java.awt.Color(255, 255, 255));
        btnDoTask.setText("Next");
        btnDoTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoTaskActionPerformed(evt);
            }
        });

        jlblUserName.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        jlblUserName.setForeground(new java.awt.Color(255, 0, 0));

        jlblLogout.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jlblLogout.setForeground(new java.awt.Color(255, 0, 0));
        jlblLogout.setText("Logout");
        jlblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlblLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlblLogoutMouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Gill Sans MT", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Teacher's Panel");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(354, 354, 354))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jlblLogout)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(377, 377, 377))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jrbEditAPaper)
                                    .addComponent(jrbSetAPaper))
                                .addGap(79, 79, 79)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrbRegisterStudent)
                                    .addComponent(jrbViewScore)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(jLabel5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnDoTask, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(112, 112, 112)))
                        .addGap(119, 119, 119))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblLogout))
                        .addGap(77, 77, 77)))
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(jLabel5)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrbSetAPaper)
                            .addComponent(jrbRegisterStudent))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrbEditAPaper)
                            .addComponent(jrbViewScore))
                        .addGap(85, 85, 85)
                        .addComponent(btnDoTask))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(111, 111, 111))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlblLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblLogoutMouseEntered
        jlblLogout.setForeground(Color.WHITE);
    }//GEN-LAST:event_jlblLogoutMouseEntered

    private void jlblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblLogoutMouseExited
        jlblLogout.setForeground(oldColor);
    }//GEN-LAST:event_jlblLogoutMouseExited

    private void jlblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblLogoutMouseClicked
        LoginFrame lf=new LoginFrame();
        lf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jlblLogoutMouseClicked

    private void jrbSetAPaperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbSetAPaperActionPerformed
        
    }//GEN-LAST:event_jrbSetAPaperActionPerformed

    private void btnDoTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoTaskActionPerformed
        if(jrbSetAPaper.isSelected())
        {
            SetPaperFrame spf=new SetPaperFrame();
            spf.setVisible(true);
            
        }
        else if(jrbEditAPaper.isSelected())
        {
            EditPaperFrame editPaper = new EditPaperFrame();
            editPaper.setVisible(true);
        }
        else if(jrbRegisterStudent.isSelected())
        {
            RegisterStudentFrame sof=new RegisterStudentFrame();
            sof.setVisible(true);
            
        }
        else if(jrbViewScore.isSelected())
        {
            ViewScoresFrame vsf=new ViewScoresFrame();
            vsf.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null,"Please,Select any option","No Selection",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        this.dispose();
    }//GEN-LAST:event_btnDoTaskActionPerformed

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
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminOptionsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoTask;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlblLogout;
    private javax.swing.JLabel jlblUserName;
    private javax.swing.JRadioButton jrbEditAPaper;
    private javax.swing.JRadioButton jrbRegisterStudent;
    private javax.swing.JRadioButton jrbSetAPaper;
    private javax.swing.JRadioButton jrbViewScore;
    // End of variables declaration//GEN-END:variables
}