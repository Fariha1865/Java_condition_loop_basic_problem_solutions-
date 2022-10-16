/*Write a program according to the following output:

        ********************Welcome to the Guessing Game! ********************
        ********************A number is already generated. ********************
        *****To win, you have 5 chances to guess the generated number. *****

        Please, enter an Integer value that you can guess, between 1 to 100: 56 (User input)
        Your input is higher than the generated number.

        Please, enter an Integer value that you can guess, between 1 to 100: 23 (User input)
        Your input is higher than the generated number.

        Please, enter an Integer value that you can guess, between 1 to 100: 10 (User input)
        Your input is lower than the generated number.

        Please, enter an Integer value that you can guess, between 1 to 100: 21 (User input)
        Your input is higher than the generated number.

        Please, enter an Integer value that you can guess, between 1 to 100: 20 (User input)
        Great! You have guessed the correct number.

        Congratulation!! You win!!*/

package java_condition_loop_problem_solution;

import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {
        System.out.println("********************Welcome to the Guessing Game! ********************");
        System.out.println(" ********************A number is already generated. ********************");
        System.out.println("*****To win, you have 5 chances to guess the generated number. *****");
        System.out.println(" ");
        int min = 1;
        int max = 100;
        int flag = 0;
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Please, enter an Integer value that you can guess, between 1 to 100:");
                int random = (int) (Math.random() * (max - min) + min);

                Scanner input = new Scanner(System.in);
                int user_input = input.nextInt();
                if (user_input > random) {
                    System.out.println("Your input is higher than the generated number.");
                } else if (user_input < random) {
                    System.out.println("Your input is lower than the generated number.");
                } else if (user_input == random) {
                    System.out.println("Great! You have guessed the correct number.");
                    System.out.println(" ");
                    System.out.println("Congratulation!! You win!!");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(" ");
                System.out.println("Sorry, your chances are over !!...Try Again later");
            }
        } catch (Exception e) {
            System.out.println("Please enter an integer number between 1-100");
        }
    }
}

