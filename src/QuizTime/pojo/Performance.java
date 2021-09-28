/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuizTime.pojo;

/**
 *
 * @author hi
 */
public class Performance {
    private String examId;
    private String language;
    private String userId;
    private int right;
    private int wrong;
    private int unattempted;
    private double per;
    
    public String getexamId()
    {
        return examId;
    }

    public Performance(String examId, String language, String userId, int right, int wrong, int unattempted, double per) {
        this.examId = examId;
        this.language = language;
        this.userId = userId;
        this.right = right;
        this.wrong = wrong;
        this.unattempted = unattempted;
        this.per = per;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public void setWrong(int wrong) {
        this.wrong = wrong;
    }

    public void setUnattempted(int unattempted) {
        this.unattempted = unattempted;
    }

    public void setPer(double per) {
        this.per = per;
    }

    public String getExamId() {
        return examId;
    }

    public String getLanguage() {
        return language;
    }

    public String getUserId() {
        return userId;
    }

    public int getRight() {
        return right;
    }

    public int getWrong() {
        return wrong;
    }

    public int getUnattempted() {
        return unattempted;
    }

    public double getPer() {
        return per;
    }
}
