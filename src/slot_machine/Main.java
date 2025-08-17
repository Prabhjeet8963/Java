package slot_machine;

import java.util.Random;
import java.util.Scanner;
public class Main {

    static Scanner scanner  = new Scanner(System.in);
    static Random random = new Random();
     public static void main(String[] args) {

         //Java Slot Machine

         //Declare variables
         int balance = 100;
         int bet;
         int payout;
         String[] row;
         String playAgain;


         //display Welcome message
         System.out.println("****************************");
         System.out.println(" Welcome to Java Slots!     ");
         System.out.println(" Symbols: 🍒 🍉 🍋 🔔 ⭐   ");



         //play if balance > 0
         while(balance > 0){
             System.out.println("****************************");
             System.out.println(" Current balance: ₹" + balance );

             // enter bet amount
             System.out.print(" Place your bet amount:");
             bet= scanner.nextInt();
             scanner.nextLine();

             // verify if Bet > balance
             if(bet > balance){
                 System.out.println("*************************  ");
                 System.out.println(" INSUFFICIENT FUNDS ");
                 continue;
             }
             // verify if Bet > 0
             else if (bet <= 0 ) {
                 System.out.println("*************************  ");
                 System.out.println(" Bet must be Greater than zero ");
                 continue;
             }
             // subtract bet from balance
             else {
                 balance -= bet;
             }

             System.out.println(" Spinning.....");
             row = spinRow();
             printRow(row);
             payout= getPayout(row, bet);

             if(payout> 0 ){
                 System.out.println("You won ₹" + payout);
                 balance += payout;
             }
             else{
                 System.out.println("Sorry you lost this round!");
             }
             // ask to play again
             System.out.println("*******************");
             System.out.print("Do you want to play again? (Y/N): ");
             playAgain= scanner.nextLine().toUpperCase();
             if(!playAgain.equals("Y")){
                 break;
             }
         }

         // dis[play exit message
         System.out.println("GAME OVER! Your final balance is ₹" + balance);

         scanner.close();
    }
    // Spin row
    static String[] spinRow(){

         String[] symbols = {"🍒 ","🍉", "🍋"," 🔔", "⭐"};
         String[] row = new String[3];

         for(int i = 0; i < 3; i++){
             row[i] = symbols[random.nextInt(symbols.length)];
         }
         return row;
    }
    // print row
    static void printRow(String[] row){
        System.out.println("*******************");
        System.out.println(" "+ String.join(" | ", row));
        System.out.println("*******************");
    }
    // get payout
    static int getPayout(String[] row, int bet ){

         if(row[0].equals(row[1]) && row[1].equals(row[2])){
             return switch(row[0]){
                 case "🍒 " -> bet*3;
                 case "🍉" -> bet *4;
                 case "🍋" -> bet*5;
                 case "🔔 " -> bet*10;
                 case "⭐" -> bet*20;
                 default -> 0;
             };
         }
else if(row[0].equals(row[1])){
    return switch(row[0]){
        case "🍒 " -> bet*2;
        case "🍉" -> bet *3;
        case "🍋" -> bet*4;
        case "🔔 " -> bet*5;
        case "⭐" -> bet*10;
        default -> 0;
    };
}
 else if(row[1].equals(row[2])){
     return switch(row[1]){
         case "🍒 " -> bet*2;
         case "🍉" -> bet *3;
         case "🍋" -> bet*4;
         case "🔔 " -> bet*5;
         case "⭐" -> bet*10;
         default -> 0;
     };}
 else if(row[0].equals(row[2])){
     return switch(row[0]){
         case "🍒 " -> bet*2;
         case "🍉" -> bet *3;
         case "🍋" -> bet*4;
         case "🔔 " -> bet*5;
         case "⭐" -> bet*10;
         default -> 0;
     };}
         return 0;
    }
}
