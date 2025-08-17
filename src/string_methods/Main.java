package string_methods;

import java.util.Scanner;

public class Main {
     public static void main(String[] args){

         Scanner scanner = new Scanner(System.in);

         String name = "Password";

         //int length = name.length();//length of string
         //char letter = name.charAt(0);//letter at index
         //int index = name.indexOf("j");//tells the first index of the letter
         //int lastIndex = name.lastIndexOf("h");// finds last index
         //name = name.toUpperCase();
         //name = name.toLowerCase();
         //name = name.trim();
         //name= name.replace("h" , "a");  Replaces letters with other letter

         //System.out.println(name.isEmpty());

         /*if(name.contains(" ")){
             System.out.printf("your name %s contains spaces", name);
         }
         else{
             System.out.print("Your name does not contain spaces ");
         }*/

         if(name.equalsIgnoreCase("password")){  //name.equals() is case sensetive to bypass it use name.equalsIgnoreCase()
             System.out.println("your name can't be password ");
         }
         else {
             System.out.println("Hello " + name);
         }

         scanner.close();


     }
}
