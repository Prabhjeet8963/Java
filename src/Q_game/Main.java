package Q_game;

import java.util.Scanner;

public class Main {
      public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
            String response= "";
            while(!response.equals("Q")){
                System.out.println("You are playing a game ");
                System.out.println("Press q ");
                response = scanner.next().toUpperCase();
            }
            System.out.println("YOu have quit the game ");

        scanner.close();     
    
}}
