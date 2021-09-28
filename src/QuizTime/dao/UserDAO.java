
package QuizTime.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import QuizTime.dbutil.DBConnection;
import QuizTime.pojo.User;

public class UserDAO {
    public static boolean validateUser(User user) throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("Select * from users where userid=? and password=? and usertype=?");
        ps.setString(1, user.getUserId());
        ps.setString(2, user.getPassword());
        ps.setString(3, user.getUserType());
        ResultSet rs=ps.executeQuery();
        return rs.next();
    }
    public static boolean registerUser(User user)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into users values(?,?,?)");
        ps.setString(1, user.getUserId());
        ps.setString(2, user.getPassword());
        ps.setString(3, user.getUserType());
        int result=ps.executeUpdate();
        if(result==1)
            return true;
        return false;
    }
     public static boolean changePassword(User user)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update users set password=? where userid=? ");
        ps.setString(1, user.getPassword());
        ps.setString(2, user.getUserId());
     
        int result=ps.executeUpdate();
        if(result==1)
            return true;
        return false;
    }
}
