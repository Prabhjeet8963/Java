package age_Checker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age;
        do {
            System.out.print("Enter your age: ");
            age = scanner.nextInt();

            if (age < 0) {
                System.out.println("Your age can't be negative. Please try again.");
            }
        } while (age < 0);

        System.out.println("You are " + age + " years old.");

        scanner.close();
    }
}
