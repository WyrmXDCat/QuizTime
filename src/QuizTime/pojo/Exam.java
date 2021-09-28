package QuizTime.pojo;
public class Exam {
private String ExamId;
private String langauge;
private int totalQuestions;

    public String getExamId() {
        return ExamId;
    }

    public void setExamId(String ExamId) {
        this.ExamId = ExamId;
    }

    public String getLangauge() {
        return langauge;
    }

    public void setLangauge(String langauge) {
        this.langauge = langauge;
    }

    public int getTotalQuestions() {
        return totalQuestions;
    }

    public Exam(String ExamId, String langauge, int totalQuestions) {
        this.ExamId = ExamId;
        this.langauge = langauge;
        this.totalQuestions = totalQuestions;
    }

    public void setTotalQuestions(int totalQuestions) {
        this.totalQuestions = totalQuestions;
    }
}
