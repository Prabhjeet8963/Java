package user_input_1;


	import java.util.Scanner;
	
	public class Main {
	     public static void main(String[] args){
	
	          Scanner scanner = new Scanner(System.in);
	
	          System.out.print("Enter your name:");
	          String name = scanner.nextLine();   //next() could also be used
	
	          System.out.print("Enter your age: ");
	          int age = scanner.nextInt();
	
	          System.out.print("What is your gpa: ");
	          double gpa = scanner.nextDouble();
	
	          System.out.print("are you a student? (true/false): ");
	          boolean isStudent= scanner.nextBoolean();
	
	          System.out.println("HEllO " + name);
	          System.out.println("You are " + age + " years old");
	          System.out.println("Your gpa is: " + gpa );
	
	          if(isStudent){
	               System.out.println("you are enrolled as a Student");
	          }
	          else {
	               System.out.println("You are not enrolled ");
	          }
	          scanner.close();
	     }
	}
	
	
