package QuizTime.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import QuizTime.dbutil.DBConnection;
import QuizTime.pojo.Question;
import QuizTime.pojo.QuestionStore;

public class QuestionDAO {
  public static void addQuestion(QuestionStore qstore)throws SQLException
  {
      Connection conn=DBConnection.getConnection();
      PreparedStatement ps=conn.prepareStatement("insert into questions values(?,?,?,?,?,?,?,?,?)");
      ArrayList<Question> questionsList=qstore.getAllQuestion();
      for(Question q:questionsList)
      {
          ps.setString(1,q.getExamId());
          ps.setInt(2,q.getQno());
          ps.setString(3, q.getQuestion());
          ps.setString(4, q.getAnswer1());
          ps.setString(5, q.getAnswer2());
          ps.setString(6, q.getAnswer3());
          ps.setString(7, q.getAnswer4());
          ps.setString(8, q.getCorrectAnswer());
          ps.setString(9, q.getLangauge());
          ps.executeUpdate();
      }
  }
  
  public static ArrayList<Question> getQuestionsByExamId(String examId)throws SQLException
  {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("Select * from Questions where examId=?");
        ps.setString(1, examId);
        ResultSet rs=ps.executeQuery();
        ArrayList<Question> questionList=new ArrayList<>();
        while(rs.next())
        {
            int qno = rs.getInt(2);
            String question = rs.getString(3);
            String option1 = rs.getString(4);
            String option2 = rs.getString(5);
            String option3 = rs.getString(6);
            String option4 = rs.getString(7);
            String correctAnswer=rs.getString(8);
            String language=rs.getString(9);
            Question obj=new Question(examId,language,qno,question,option1,option2,option3,option4,correctAnswer);
            questionList.add(obj);
        }
        return questionList;
  }
  
  public static void updateQuestions(QuestionStore qstore)throws SQLException{
        String qry="Update questions set question=?,answer1=?,answer2=?,answer3=?,answer4=?,correct_answer=? where examid=? and qno=?";
       ArrayList <Question> questionList=qstore.getAllQuestion();
       
        
           Connection conn=DBConnection.getConnection();
           PreparedStatement ps=conn.prepareStatement(qry);
           for(Question obj:questionList){
           ps.setString(1, obj.getQuestion());
           ps.setString(2, obj.getAnswer1());
           ps.setString(3, obj.getAnswer2());
           ps.setString(4, obj.getAnswer3());
           ps.setString(5, obj.getAnswer4());
           ps.setString(6, obj.getCorrectAnswer());
           ps.setString(7, obj.getExamId());
           ps.setInt(8,obj.getQno());
           ps.executeUpdate();
           }
    }
}
