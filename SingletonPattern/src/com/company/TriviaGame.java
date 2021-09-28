package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TriviaGame {

    private static TriviaGame triviaGame = null;
    private int score;
    private Random rand;
    private Scanner reader;
    private ArrayList<Question> questions;

    private TriviaGame() {
        score = 0;
        rand = new Random();
        //int x = ran.nextInt(6) + 5;
        //The integer x is now the random number that has a possible outcome of 5-10.
        reader = new Scanner(System.in);
        questions = DataLoader.getTriviaQuestions();
    }

    public static TriviaGame getInstance() {
        if (triviaGame == null) {
            triviaGame = new TriviaGame();
        }
        return triviaGame;
    }

    public void play() {
        String choice = "p";
        do {
            boolean result= playRound();
            if(result){
                score++;
            }
            boolean flag = false;
            do {
                System.out.print("(P)lay or (Q)uit : ");
                choice = reader.nextLine().toLowerCase();
                if (choice.compareTo("p") == 0 || choice.compareTo("q") == 0) {
                    flag = true;
                    break;
                } else {
                    System.out.println("Invalid choice");
                }
            } while (!flag);

            System.out.println();

        } while (choice.toLowerCase().compareTo("p") == 0);
        System.out.println("You won " + score + " games!");
        System.out.println("Goodbye!");
    }


    private boolean playRound(){

        int index=rand.nextInt(questions.size());
        Question question=questions.get(index);
        System.out.println(question);

        boolean flag = false;
        int userAns;
        do {
            System.out.print("Enter answer : ");
            userAns = reader.nextInt();
            reader.nextLine();
            if (userAns>0 && userAns<5) {
                flag = true;
                break;
            } else {
                System.out.println("Invalid choice");
            }
        } while (!flag);

        if(question.isCorrect(userAns)){
            System.out.println("Yay , you got it right");
            return true;
        }
        else{
            System.out.println("You got it wrong");
            System.out.println("The correct answer is "+question.getCorrectAnswer());
            return false;
        }

    }

}
