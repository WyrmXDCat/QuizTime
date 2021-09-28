package QuizTime.gui;

import java.awt.Color;
import javax.swing.JOptionPane;
import QuizTime.pojo.UserProfile;

public class StudentOptionFrame extends javax.swing.JFrame {
Color oldColor;
    public StudentOptionFrame() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        jlblUserName.setText("Hello "+UserProfile.getUSername());
        oldColor=jlblLogout.getForeground();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jlblUserName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jrTakeTest = new javax.swing.JRadioButton();
        jrViewScores = new javax.swing.JRadioButton();
        jrChangePassword = new javax.swing.JRadioButton();
        btnDoTask = new javax.swing.JButton();
        jlblLogout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jlblUserName.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jlblUserName.setForeground(new java.awt.Color(255, 0, 0));
        jlblUserName.setText("   ");

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuizTime/gui/bebeh.gif"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("QUIZ STUDENT PANEL");

        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Make a choice:-");

        jrTakeTest.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(jrTakeTest);
        jrTakeTest.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jrTakeTest.setForeground(new java.awt.Color(255, 0, 0));
        jrTakeTest.setText("Take a test");

        jrViewScores.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(jrViewScores);
        jrViewScores.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jrViewScores.setForeground(new java.awt.Color(255, 0, 0));
        jrViewScores.setText("View scores");

        jrChangePassword.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(jrChangePassword);
        jrChangePassword.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jrChangePassword.setForeground(new java.awt.Color(255, 0, 0));
        jrChangePassword.setText("Change password");

        btnDoTask.setBackground(new java.awt.Color(255, 0, 0));
        btnDoTask.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        btnDoTask.setForeground(new java.awt.Color(255, 255, 255));
        btnDoTask.setText("Do Task");
        btnDoTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoTaskActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(540, 643, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jlblLogout)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(274, 274, 274))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnDoTask, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(431, 431, 431))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrTakeTest, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrChangePassword, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrViewScores, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(408, 408, 408))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblLogout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(jLabel3)
                .addGap(123, 123, 123)
                .addComponent(jLabel4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jrTakeTest)
                        .addGap(18, 18, 18)
                        .addComponent(jrViewScores)
                        .addGap(18, 18, 18)
                        .addComponent(jrChangePassword))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(85, 85, 85)
                .addComponent(btnDoTask, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDoTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoTaskActionPerformed

        // TODO add your handling code here:
        if(!validateInput())
        {
            JOptionPane.showMessageDialog(null, "Please select an option","Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(jrTakeTest.isSelected())
        {
            ChoosePaperFrame choosePaper=new ChoosePaperFrame();
            choosePaper.setVisible(true);
            this.dispose();
        }
        
        else if(jrViewScores.isSelected())
        {
            ViewSScoreFrame vsf=new ViewSScoreFrame();
            vsf.setVisible(true);
            this.dispose();
        }
        
        else if(jrChangePassword.isSelected())
        {
            ChangePasswordFrame cpf=new ChangePasswordFrame();
            cpf.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnDoTaskActionPerformed

    private void jlblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblLogoutMouseClicked
        LoginFrame lf=new LoginFrame();
        lf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jlblLogoutMouseClicked

    private void jlblLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblLogoutMouseEntered
        jlblLogout.setForeground(Color.WHITE);
    }//GEN-LAST:event_jlblLogoutMouseEntered

    private void jlblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblLogoutMouseExited
        jlblLogout.setForeground(oldColor);
    }//GEN-LAST:event_jlblLogoutMouseExited

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
            java.util.logging.Logger.getLogger(StudentOptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentOptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentOptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentOptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentOptionFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoTask;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlblLogout;
    private javax.swing.JLabel jlblUserName;
    private javax.swing.JRadioButton jrChangePassword;
    private javax.swing.JRadioButton jrTakeTest;
    private javax.swing.JRadioButton jrViewScores;
    // End of variables declaration//GEN-END:variables

private boolean validateInput()
{
    if(jrTakeTest.isSelected()==false && jrViewScores.isSelected()==false && jrChangePassword.isSelected()==false)
        return false;
    return true;
}
}
