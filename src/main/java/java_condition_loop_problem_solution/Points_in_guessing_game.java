/* A program to generate 2 random numbers which will not be shown to the user.
Take a user input and match it with any of the random numbers. If correct give
it 1 point and if incorrect, do not give it any point. Finally, repeat this for
10 times and count the total points user achieved at the end of 10 cycle*/


package java_condition_loop_problem_solution;

import java.util.Scanner;

public class Points_in_guessing_game {
    public static void main(String[] args) {
        int marks = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("***Welcome to guessing game. You will get 10 chances***");
        try {
            for (int i = 1; i <= 10; i++) {
                int random_1 = (int) (Math.random() * (30 - 10) + 10);
                int random_2 = (int) (Math.random() * (30 - 10) + 10);
                System.out.println(random_1 + ", " + random_2);

                System.out.println(" ");
                System.out.print("Enter a number to guess within 10 to 30: ");
                int user_input = input.nextInt();

                if (user_input == random_1 || user_input == random_2) {
                    System.out.println(" ");
                    System.out.println("Right Guess!! You get 1 point ..");
                    marks = marks + 1;
                } else {
                    System.out.println(" ");
                    System.out.println("Sorry Wrong Guess!! You get no point ..");
                }
            }
            System.out.println(" ");
            System.out.println("10 chances are over !!.... ");
            System.out.println(" ");
            System.out.println("Your Total Marks Is: " + marks);

        } catch (Exception e) {
            System.out.println("Please Enter an Integer Number to Guess");
        }
    }
}
