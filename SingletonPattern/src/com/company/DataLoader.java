package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataLoader {

public static ArrayList<Question> getTriviaQuestions() {

    ArrayList<Question> questions = new ArrayList<>();

    try {
        File file = new File("questions.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String[] data = scanner.nextLine().split(", ");
            questions.add(new Question(data[0], data[1], data[2], data[3], data[4], Integer.parseInt(data[5])));
        }


    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }

    return questions;
}


}
