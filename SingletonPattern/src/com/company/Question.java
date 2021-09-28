package com.company;

import java.util.Arrays;

public class Question {
    private String question ;
    private String[] answers;
    private int correctAnswer;

    public Question(String question, String ans1,String ans2, String ans3, String ans4,int correctAnswer) {
        this.question = question;
        answers=new String[4];
        answers[0]=ans1;
        answers[1]=ans2;
        answers[2]=ans3;
        answers[3]=ans4;
        this.correctAnswer = correctAnswer;
    }
    public boolean isCorrect(int userAnswer){

           if((userAnswer-1)==correctAnswer){
               return true;
           }
           else{
               return false;
           }
    }
    public String getCorrectAnswer(){
        return answers[correctAnswer];
    }

    @Override
    public String toString() {
        return question +
                "\n" + Arrays.toString(answers)+"\n"
               // ", correctAnswer=" + correctAnswer +
                ;
    }
}
