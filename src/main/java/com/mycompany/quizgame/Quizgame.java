/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quizgame;

/**
 *
 * @author lenovo
 */
import java.util.Scanner;

public class Quizgame {
    // Questions and Answers Data
    static String[] questions = {
        "Which planet is known as the Red Planet?",
        "What is the capital of France?",
        "Which element does 'O' represent in the periodic table?",
        "Who wrote the novel '1984'?",
        "What is the largest mammal?"
    };

    static String[][] options = {
        {"1) Earth", "2) Mars", "3) Jupiter", "4) Saturn"},
        {"1) Berlin", "2) Madrid", "3) Paris", "4) Rome"},
        {"1) Oxygen", "2) Hydrogen", "3) Nitrogen", "4) Helium"},
        {"1) Mark Twain", "2) George Orwell", "3) J.K. Rowling", "4) Ernest Hemingway"},
        {"1) Elephant", "2) Blue Whale", "3) Giraffe", "4) Polar Bear"}
    };

    static int[] correctAnswers = {2, 3, 1, 2, 2}; // Correct option numbers

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0; // Keeps track of the user's score

        System.out.println("Welcome to the Quiz Game!");
        System.out.println("You will be presented with 5 multiple-choice questions.");
        System.out.println("For each question, type the number of your answer and press Enter.\n");

        // Loop through each question
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i]);
            // Display options for the current question
            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Your answer: ");
            int userAnswer = scanner.nextInt();

            // Check if the answer is correct
            if (userAnswer == correctAnswers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer was: " + correctAnswers[i] + "\n");
            }
        }

        // Display final score
        System.out.println("Quiz over! Your final score is: " + score + "/" + questions.length);
        scanner.close();
    }
}
