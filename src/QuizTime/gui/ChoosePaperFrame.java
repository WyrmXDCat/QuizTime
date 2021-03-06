/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuizTime.gui;

import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import QuizTime.dao.ExamDAO;
import QuizTime.pojo.Exam;
import QuizTime.pojo.UserProfile;

/**
 *
 * @author hi
 */
public class ChoosePaperFrame extends javax.swing.JFrame {

    /**
     * Creates new form ChoosePaperFrame
     */
    
    String subjectName;
   Color oldColor;

    public ChoosePaperFrame() {
        initComponents();
        setLocationRelativeTo(null);
       this.setResizable(false);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jcSubject = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jcExamId = new javax.swing.JComboBox<>();
        btnTakeQuiz = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jlblLogout = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 0, 0));

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("PAPER SELECTION PANEL");

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fill Paper Details");

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Fill Paper Details");

        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Choose the subject");

        jcSubject.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jcSubject.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "    ", "Java", "C", "C++", "Python" }));
        jcSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcSubjectActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("Choose the exam ID");

        jcExamId.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jcExamId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcExamIdActionPerformed(evt);
            }
        });

        btnTakeQuiz.setBackground(new java.awt.Color(255, 0, 0));
        btnTakeQuiz.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        btnTakeQuiz.setForeground(new java.awt.Color(255, 255, 255));
        btnTakeQuiz.setText("Take the quiz");
        btnTakeQuiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTakeQuizActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuizTime/gui/paper.gif"))); // NOI18N

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

        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuizTime/gui/text.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 336, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jlblLogout)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(335, 335, 335))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(461, 461, 461))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(259, 259, 259)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcExamId, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcSubject, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTakeQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(445, 445, 445))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(104, 104, 104)
                .addComponent(jLabel2)
                .addGap(35, 35, 35)
                .addComponent(jLabel5)
                .addGap(27, 27, 27)
                .addComponent(jcSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel6)
                .addGap(27, 27, 27)
                .addComponent(jcExamId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(btnTakeQuiz)
                .addGap(104, 104, 104))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jlblLogout))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(206, 206, 206))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTakeQuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTakeQuizActionPerformed

        // TODO add your handling code here:
        boolean result=validateInput();
        if(!result)
        {
            JOptionPane.showMessageDialog(null, "Please select a subject!","Error!",JOptionPane.ERROR_MESSAGE);
            return;
        }
        int count=jcExamId.getItemCount();
        if(count==0)
        {
            JOptionPane.showMessageDialog(null, "Please select an exam!", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String examId=jcExamId.getSelectedItem().toString();
        int ans=JOptionPane.showConfirmDialog(null, "You have selected "+subjectName+" and "+examId+" paper\nIs this OK?", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(ans==JOptionPane.YES_OPTION)
        {
            try
            {
                int totalQuest=ExamDAO.getQuestionCountByExam(examId);
                Exam exam=new Exam(examId, subjectName, totalQuest);
                TakeTestFrame takeTest=new TakeTestFrame(exam);
                takeTest.setVisible(true);
                this.dispose();
            }
            catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "DB Error", "Edit Paper Error!", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        }
    }//GEN-LAST:event_btnTakeQuizActionPerformed

    private void jcSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcSubjectActionPerformed

        // TODO add your handling code here:
        jcExamId.removeAllItems();
        boolean result=validateInput();
        if(!result)
        {
            JOptionPane.showMessageDialog(null,"Please select a subject!","Error!",JOptionPane.ERROR_MESSAGE);
            return;
        }
        try
        {
            if(ExamDAO.isPaperSet(subjectName)==false)
                    {
                        JOptionPane.showMessageDialog(null,"Sorry! No exam set for given subject!","Error!",JOptionPane.ERROR_MESSAGE);
                        return;
                    }
            ArrayList<String>examList=ExamDAO.getExamIdBySubject(UserProfile.getUSername(),subjectName);
            if(examList.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "You have already appeared for all exams of " + subjectName, "No paper left", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            for(String examId:examList)
            {
                jcExamId.addItem(examId);   
            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "DB Error", "Choose Paper Error!", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_jcSubjectActionPerformed

    private void jcExamIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcExamIdActionPerformed
        // TODO add your handling code here:
              
    }//GEN-LAST:event_jcExamIdActionPerformed

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
            java.util.logging.Logger.getLogger(ChoosePaperFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChoosePaperFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChoosePaperFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChoosePaperFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChoosePaperFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTakeQuiz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcExamId;
    private javax.swing.JComboBox<String> jcSubject;
    private javax.swing.JLabel jlblLogout;
    // End of variables declaration//GEN-END:variables


private boolean validateInput()
    {
        int selectedIndex=jcSubject.getSelectedIndex();
        if(selectedIndex==0)
            return false;
        subjectName=jcSubject.getSelectedItem().toString();
        return true;
    }

}
