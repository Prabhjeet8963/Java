package substring;

//.substring() = A method used to extract a portion of a string 
//.substring(start , end)
//Email slicer program

import java.util.Scanner;

public class Main {
     @SuppressWarnings("ConvertToTryWithResources")
     public static void main(String[] args){

         Scanner scanner = new Scanner(System.in);

         String email;
         String username;
         String domain;
         System.out.println("Enter your email:");

         email = scanner.nextLine();

         if(email.contains("@")){
             username = email.substring(0, email.indexOf("@"));
             domain = email.substring(email.indexOf("@") + 1);

             System.out.println(username);
             System.out.println(domain);
         }
         else {
             System.out.println("Emails must contain @");
         }



         //String username = email.substring(0,email.indexOf("@"));
         //String username = email.substring(0,6);
         //String domain= email.substring(7);
         //String domain= email.substring(email.indexOf("@"));
         //String domain= email.substring(7,16);
         //String domain= email.substring(email.indexOf("@") + 1);// most flexible


         //System.out.println(domain);
         scanner.close();


     }
}



