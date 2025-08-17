package rock_paper_scissors;

import java.util.Scanner;
import java.util.Random;

public class Main {

    static Scanner scanner  = new Scanner(System.in);
    static Random random = new Random();
     public static void main(String[] args) {

         //Get Choices from user
         String[] choices ={"rock" , "paper" , "scissors"};
         String playerChoice;
         String computerChoice;
         String playAgain = "yes";

         do {
             System.out.print("Enter your move(rock , paper , scissors): ");
             playerChoice = scanner.nextLine().toLowerCase();

             if(!playerChoice.equals("rock")
                     && !playerChoice.equals("paper")
                     && !playerChoice.equals("scissors")){
                 System.out.println("Invalid Choice");
                 continue;
             }


             //Get random choice for the computer
             computerChoice = choices[random.nextInt(3)];
             System.out.println("-> Computer Choice " + computerChoice);

             // check win condition
             if(playerChoice.equals(computerChoice)){
                 System.out.println("->Its a tie! ");
             }
             else if (playerChoice.equals("rock") && computerChoice.equals("scissors") ||
                     playerChoice.equals("paper") && computerChoice.equals("rock") ||
                     playerChoice.equals("scissors") && computerChoice.equals("paper")){
                 System.out.println("->You win! ");
             }
             else {
                 System.out.println("->You lose! ");
             }
             // ask to play again
             System.out.print("play again(yes/no): ");
             playAgain=scanner.nextLine().toLowerCase();
         }while(playAgain.equals("yes"));

         // goodbye message
         System.out.println("Thanks for playing! ");

         scanner.close();
    }
}
