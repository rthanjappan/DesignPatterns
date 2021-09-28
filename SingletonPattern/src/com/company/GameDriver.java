package com.company;

public class GameDriver {
    public void run(){

        TriviaGame game=TriviaGame.getInstance();
        game.play();
    }
    public static void main(String[] args) {
	// write your code here

        System.out.println(DataLoader.getTriviaQuestions());


        GameDriver driver=new GameDriver();
        driver.run();

        //System.out.println(DataLoader.getTriviaQuestions());
    }
}
