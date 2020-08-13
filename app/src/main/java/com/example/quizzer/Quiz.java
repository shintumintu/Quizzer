package com.example.quizzer;

public class Quiz {
    private int tqCode;
    private String tqQuestion;
    private String tqOption1;
    private String tqOption2;
    private String tqOption3;
    private String tqOption4;
    String tqCorrectAnswer;

    public int getTqCode() {
        return tqCode;
    }

    public void setTqCode(int tqCode) {
        this.tqCode = tqCode;
    }

    public Quiz(String tqQuestion, String tqOption1, String tqOption2, String tqOption3, String tqOption4, String tqCorrectAnswer, int tqCode){
               this.tqCode=tqCode;
                this.tqQuestion=tqQuestion;
                this.tqOption1=tqOption1;
                this.tqOption2=tqOption2;
                this.tqOption3=tqOption3;
                this.tqOption4=tqOption4;
                this.tqCorrectAnswer=tqCorrectAnswer;
    }

    public Quiz() {}

    public String getTqQuestion() {
        return tqQuestion;
    }

    public String getTqOption1() {
        return tqOption1;
    }

    public String getTqOption2() {
        return tqOption2;
    }

    public String getTqOption3() {
        return tqOption3;
    }
    public String getTqOption4() {
        return tqOption4;
    }

    public String getTqCorrectAnswer() {
        return tqCorrectAnswer;
    }
    public void setTqQuestion(String tqQuestion) {
        this.tqQuestion = tqQuestion;
    }

    public void setTqOption1(String tqOption1) {
        this.tqOption1 = tqOption1;
    }

    public void setTqOption2(String tqOption2) {
        this.tqOption2 = tqOption2;
    }

    public void setTqOption3(String tqOption3) {
        this.tqOption3 = tqOption3;
    }

    public void setTqOption4(String tqOption4) {
        this.tqOption4 = tqOption4;
    }

    public void setTqCorrectAnswer(String tqCorrectAnswer) {
        this.tqCorrectAnswer = tqCorrectAnswer;
    }

}
