
package QuizTime.pojo;

public class UserProfile {
    private static String username;
    private static String usertype;
    public static String getUsertype() {
        return usertype;
    }
public static void setUsername(String username) {
        UserProfile.username = username;
    }
    public static void setUsertype(String usertype) {
        UserProfile.usertype = usertype;
    }    
    public static String getUSername(){
        return username;
    }
    
}
