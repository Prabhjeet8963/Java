package quiz_game;

import java.util.Scanner;

public class Main {

     @SuppressWarnings("ConvertToTryWithResources")
     public static void main(String[] args) {

       //Jva Quiz Game

         //Questions array[]
         String[] questions ={"What is the main function of a router ",
         "Which part of the computer is considered the brain?",
         "What is the power house of a cell",
         "What is a LLM",
         "What was the first programming language "};

         //options array[]
         String[][] options = {{"1. Storing files","2. Encrypting data","3. Directing internet traffic ", "4. Managing passwords"}
                 ,{"1. CPU","2. Hard Drive","3. RAM ", "4. GPU"},
                 {"1. Endoplasm","2. Cell Wall","3. Ribosomes ", "4. Mitochondria"},
                 {"1. Large Language Model", "2. Linear Logic Machine", "3. Local Loop Memory", "4. Layered Learning Method"},
                 {"1. Python", "2. Fortran", "3. C", "4. COBOL"}};

         //Declare variables
         int[] answers= {3, 1 , 4 , 1, 2};
         int score = 0;
         int guess;

         Scanner scanner = new Scanner(System.in);

         //Welcome message
         System.out.print("Welcome to the java  Quiz Game \n");

         //Questions (loop)
         for(int i = 0 ; i < questions.length;i++){
             System.out.println("->" + questions[i]);

             // options (loop)
             for(String option : options[i]){
                 System.out.println(option);
             }

             // Get guess from user
             System.out.println(" ");
             System.out.print("Enter your guess: ");
             guess= scanner.nextInt();

             // Check Our Guess
             if(guess == answers[i]){
                 System.out.println();
                 System.out.println("->Correct Guess! :) ");
                 System.out.println();
                 score++;
             }
             else{
                 System.out.println();
                 System.out.println("->Wrong :/");
                 System.out.println();
             }
         }
         //Display Final Score
         System.out.println("->Your Final score is: " + score + " out of " + questions.length);
         
         scanner.close();
    }
}
