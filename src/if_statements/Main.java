package if_statements;


import java.util.Scanner;

public class Main {
     public static void main(String[] args){

         // if statement = performs a block of code if its condition is true
         Scanner scanner = new Scanner(System.in);


         int age;
         String name;
         boolean isStudent;


         System.out.print("Enter your name: ");
         name= scanner.nextLine();

         System.out.print("Enter your age: ");
         age= scanner.nextInt();

         System.out.println("Are you a student (true/false): ");
         isStudent = scanner.nextBoolean();


         // group1
         if(name.isEmpty()){
             System.out.println("you didn't enter your name ");
         }
         else {
             System.out.println("Hello " + name + "!");
         }



         //group2
         if(age>= 18){
              System.out.println("You are an adult");
          }
          else if (age<0){
              System.out.println(" you haven't been born yet! :/");
          }
          else if (age == 0){  //"==" is a comparison operator "=" it is  an assignment operator
              System.out.println("You are a baby");
          }
          else{
              System.out.println("you are a child");
          }


          //group3
         if(isStudent){//we don't need to write the whole condition bcz isStudent holds a value
             System.out.println("you are a student "); //"windows + ;" for emojis
         }
         else {
             System.out.println("You are not a student ");
         }
          scanner.close();

     }
}
