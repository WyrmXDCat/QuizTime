
package QuizTime.gui;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import QuizTime.dao.PerformanceDAO;
import QuizTime.dao.QuestionDAO;
import QuizTime.pojo.Answer;
import QuizTime.pojo.AnswerStore;
import QuizTime.pojo.Exam;
import QuizTime.pojo.Performance;
import QuizTime.pojo.Question;
import QuizTime.pojo.QuestionStore;
import QuizTime.pojo.UserProfile;

public class TakeTestFrame extends javax.swing.JFrame {
  
    private int qno, pos=0;
    private QuestionStore qstore;
    private AnswerStore astore;
    private Exam exam;
  
    
    public TakeTestFrame() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        lblUserName.setText("Hello "+UserProfile.getUSername());
        qstore=new QuestionStore();
        astore=new AnswerStore();
        qno=1;
        lblQno.setText(lblQno.getText());
        Timer t=new Timer();
        t.start();
         
    }
    
    public TakeTestFrame(Exam e) {
        this();
        this.exam=e;
        lblTitle.setText(exam.getLangauge().toUpperCase()+" PAPER");
        loadQuestions();
        showQuestions();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblQno = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtQuestion = new javax.swing.JTextArea();
        jrOption1 = new javax.swing.JRadioButton();
        jrOption2 = new javax.swing.JRadioButton();
        jrOption3 = new javax.swing.JRadioButton();
        jrOption4 = new javax.swing.JRadioButton();
        btnNext = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnDone = new javax.swing.JButton();
        sec = new javax.swing.JLabel();
        min = new javax.swing.JLabel();
        lblTimer = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        lblTitle.setFont(new java.awt.Font("Gill Sans MT", 1, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 0, 0));
        lblTitle.setText("PAPER");

        lblQno.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        lblQno.setForeground(new java.awt.Color(255, 0, 0));
        lblQno.setText("Question no.");

        lblUserName.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(255, 0, 0));
        lblUserName.setText(" ");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuizTime/gui/bebeh.gif"))); // NOI18N

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));

        txtQuestion.setEditable(false);
        txtQuestion.setColumns(20);
        txtQuestion.setRows(5);
        jScrollPane1.setViewportView(txtQuestion);

        jrOption1.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(jrOption1);
        jrOption1.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jrOption1.setForeground(new java.awt.Color(255, 0, 0));
        jrOption1.setText("jRadioButton1");

        jrOption2.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(jrOption2);
        jrOption2.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jrOption2.setForeground(new java.awt.Color(255, 0, 0));
        jrOption2.setText("jRadioButton2");

        jrOption3.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(jrOption3);
        jrOption3.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jrOption3.setForeground(new java.awt.Color(255, 0, 0));
        jrOption3.setText("jRadioButton3");

        jrOption4.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(jrOption4);
        jrOption4.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jrOption4.setForeground(new java.awt.Color(255, 0, 0));
        jrOption4.setText("jRadioButton4");

        btnNext.setBackground(new java.awt.Color(255, 0, 0));
        btnNext.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnPrevious.setBackground(new java.awt.Color(255, 0, 0));
        btnPrevious.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        btnPrevious.setForeground(new java.awt.Color(255, 255, 255));
        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(255, 0, 0));
        btnCancel.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnDone.setBackground(new java.awt.Color(255, 0, 0));
        btnDone.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        btnDone.setForeground(new java.awt.Color(255, 255, 255));
        btnDone.setText("Done");
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });

        sec.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        sec.setForeground(new java.awt.Color(255, 0, 0));
        sec.setText("00");

        min.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        min.setForeground(new java.awt.Color(255, 0, 0));
        min.setText("00");

        lblTimer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTimer.setForeground(new java.awt.Color(255, 0, 0));
        lblTimer.setText("Time Remaining:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText(":");

        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuizTime/gui/text.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(btnNext)
                .addGap(79, 79, 79)
                .addComponent(btnPrevious)
                .addGap(82, 82, 82)
                .addComponent(btnCancel)
                .addGap(65, 65, 65)
                .addComponent(btnDone)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(155, Short.MAX_VALUE)
                        .addComponent(lblQno, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jrOption1)
                                    .addComponent(jrOption3))
                                .addGap(157, 157, 157)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jrOption4)
                                    .addComponent(jrOption2)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(284, 284, 284))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTimer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(min, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sec)
                        .addGap(45, 45, 45))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(354, 354, 354))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(292, 292, 292))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sec, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(min, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTimer)
                            .addComponent(jLabel1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTitle)
                .addGap(26, 26, 26)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblQno)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrOption1)
                    .addComponent(jrOption2))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrOption4)
                    .addComponent(jrOption3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNext)
                    .addComponent(btnPrevious)
                    .addComponent(btnCancel)
                    .addComponent(btnDone))
                .addGap(65, 65, 65))
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

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
    String chosenAnswer=getUserAnswer();
        if(chosenAnswer!=null){
        Question question=qstore.getQuestionByQno(qno);
        String correctAnswer=question.getCorrectAnswer();
        Answer newanswer=new Answer(exam.getExamId(),exam.getLangauge(),qno,chosenAnswer,correctAnswer);
        System.out.println(newanswer);
        Answer answer=astore.getAnswerByQno(qno);
        if(answer==null)
            astore.addAnswer(newanswer);
        else{
            if(newanswer.getChosenAnswer().equals(answer.getChosenAnswer())==false){
                int apos=astore.removeAnswer(answer);
                astore.setAnswerAt(apos, newanswer);
            }
        }
     }
        pos--;
        if(pos<0)
        {
            pos=qstore.getCount()-1;
        }
      qno--;
        if(qno<=0){
        qno=qstore.getCount();
        
        }
        lblQno.setText("Question no:"+qno);
        showQuestions();
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
      String chosenAnswer=getUserAnswer();
        if(chosenAnswer!=null){
        Question question=qstore.getQuestionByQno(qno);
        String correctAnswer=question.getCorrectAnswer();
       Answer newanswer=new Answer(exam.getExamId(),exam.getLangauge(),qno,
chosenAnswer,correctAnswer);
        System.out.println(newanswer);
        Answer answer=astore.getAnswerByQno(qno);
        if(answer==null)
            astore.addAnswer(newanswer);
        else{
            if(newanswer.getChosenAnswer().equals(
answer.getChosenAnswer())==false){
                int apos=astore.removeAnswer(answer);
                astore.setAnswerAt(apos, newanswer);
            }
        }
     }
        pos++;
        if(pos>=qstore.getCount())
        {
            pos=0;
        }
         qno++;         
        if(qno>qstore.getCount())
                qno=1;
        lblQno.setText("Question no:"+qno);
        showQuestions();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
    String userAnswer=getUserAnswer();
        if(userAnswer!=null){
        Question question=qstore.getQuestionByQno(qno);
        String correctAnswer=question.getCorrectAnswer();
        
                
        Answer newanswer=new Answer(exam.getExamId(),exam.getLangauge(),qno,userAnswer,correctAnswer);
        System.out.println(newanswer);
        Answer answer=astore.getAnswerByQno(qno);
        if(answer==null)
            astore.addAnswer(newanswer);
        else{
            if(newanswer.getChosenAnswer().equals(answer.getChosenAnswer())==false){
                int apos=astore.removeAnswer(answer);
                astore.setAnswerAt(apos, newanswer);
            }
        }
        }
        int right=0,wrong=0;
        for(Question question:qstore.getAllQuestion()){
            int qno=question.getQno();
            Answer answer=astore.getAnswerByQno(qno);
            if(answer==null)
                continue;
            else
            {
                String chosenAnswer1=answer.getChosenAnswer();
                String correctAnswer=answer.getCorrectAnswer();
                if(chosenAnswer1.equals(correctAnswer))
                    ++right;
                else
                    ++wrong;
                    
            }
            
        }
        String reportCard="Total Questions:"+qstore.getCount();
        reportCard+="\nRight Answers:"+right;
        reportCard+="\nWrong Answers:"+wrong;
        reportCard+="\nUnAttempted  :"+(qstore.getCount()-(right+wrong));
        JOptionPane.showMessageDialog(null, reportCard,"Your Result!",JOptionPane.INFORMATION_MESSAGE);
 try{
            Performance performance=new Performance(exam.getExamId(),exam.getLangauge(),
UserProfile.getUSername(),right,wrong,
(qstore.getCount()-(right+wrong)),
(double)right/qstore.getCount()*100);

            PerformanceDAO.addPerformance(performance);
            JOptionPane.showMessageDialog(null, "Your performance has been successfully added to the database"," Performance Added!",JOptionPane.INFORMATION_MESSAGE);
            ChoosePaperFrame paperFrame=new ChoosePaperFrame();
            paperFrame.setVisible(true);
            this.dispose();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error while connecting to DB!","Exception!",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_btnDoneActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
       ChoosePaperFrame paperFrame=new ChoosePaperFrame();
        paperFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TakeTestFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDone;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jrOption1;
    private javax.swing.JRadioButton jrOption2;
    private javax.swing.JRadioButton jrOption3;
    private javax.swing.JRadioButton jrOption4;
    private javax.swing.JLabel lblQno;
    private javax.swing.JLabel lblTimer;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel min;
    private javax.swing.JLabel sec;
    private javax.swing.JTextArea txtQuestion;
    // End of variables declaration//GEN-END:variables

    private void loadQuestions()
    {
        try
        {
            ArrayList<Question>questionList=QuestionDAO.getQuestionsByExamId(exam.getExamId());
            for(Question q:questionList)
            {
                qstore.addQuestion(q);
            }

        }
        
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "DB Error", "Login Error!", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
    
 
    private void showQuestions() {
       
        Question q = qstore.getQuestion(pos);
        buttonGroup1.clearSelection();
        txtQuestion.setText(q.getQuestion());
        jrOption1.setText(q.getAnswer1());
        jrOption2.setText(q.getAnswer2());
        jrOption3.setText(q.getAnswer3());
        jrOption4.setText(q.getAnswer4());
        Answer ans=astore.getAnswerByQno(qno);
        if(ans==null)
        {
            return;
        }
        String str=ans.getChosenAnswer();
        switch(str)
        {
            case "Answer1":
                jrOption1.setSelected(true);
                break;
                case "Answer2":
                jrOption1.setSelected(true);
                break;
                case "Answer3":
                jrOption1.setSelected(true);
                break;
                case "Answer4":
                jrOption1.setSelected(true);
                break;
        }
     }
    private String getUserAnswer()
    {
        if(jrOption1.isSelected())
            return "Answer1";
        else if(jrOption2.isSelected())
            return "Answer2";
        else if(jrOption3.isSelected())
            return "Answer3";
        else if(jrOption4.isSelected())
            return "Answer4";
        else
            return null;
     }
   class Timer extends Thread
{
    public void run() 
    {
             
            int seconds=0;
              
        int minute=2;
        
              for(int i = 59; i >= seconds&&minute!=-1; i--) {
            try {
                
                sec.setText(i+"");
                min.setText(minute+"");
                if(minute<10)
                {
                    min.setText("0"+minute);
                }

                if(i<10)
                {
                    sec.setText("0"+i);
                }
                 if(i==0)
                {
                      i=59;
                    minute=minute-1;
                  
                }
                Thread.sleep(1000);
                 }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            }
             
             
             minute=qstore.getCount()-1;
            JOptionPane.showMessageDialog(null, "Time is over", "Time up!", JOptionPane.INFORMATION_MESSAGE);
            btnDone.doClick();
              
        
}
}
  
}
