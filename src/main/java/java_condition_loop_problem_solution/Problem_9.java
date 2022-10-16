//A program to sum of user input until users input ‘q’ from keyboard.

package java_condition_loop_problem_solution;

import java.util.Scanner;

public class Problem_9 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner input = new Scanner(System.in);
        try {
            while (true) {
                System.out.println("Current SUM iS: " + sum);
                System.out.print("Enter number to add or \"q\" to quit: ");
                String letter = input.next();
                // To quit when q is entered
                int a = letter.charAt(0);
                if (a == 113) {
                    break;
                } else {
                    int n = Integer.parseInt(letter);
                    sum = sum + n;
                }


            }
            System.out.println("Your Total Sum Is: " + sum);
        } catch (NumberFormatException e) {
            System.out.println(" ");
            System.out.println("Please Enter an integer Number to add and only \"q\" to quit");
        }
    }
}

