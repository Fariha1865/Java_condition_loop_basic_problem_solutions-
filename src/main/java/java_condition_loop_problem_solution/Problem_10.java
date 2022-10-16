/* A program to enter the numbers till the user wants and at the end,
 the program should display the largest and smallest numbers user entered
 */

package java_condition_loop_problem_solution;

import java.util.Scanner;

public class Problem_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number to find largest/smallest or \"q\" to quit: ");
        String in = input.next();
        int first = Integer.parseInt(in);
        int min = first;
        int max = 0;
        try {
            while (true) {

                System.out.print("Enter number to find largest/smallest or \"q\" to quit: ");
                String letter = input.next();
                // To quit when q is entered
                int a = letter.charAt(0);
                if (a == 113) {
                    break;
                } else {
                    int n = Integer.parseInt(letter);

                    if (n < min) {
                        min = n;
                    } else if (n > max) {
                        max = n;
                    }
                }


            }
            System.out.println("Largest number Is: " + max);
            System.out.println("Smallest number Is: " + min);
        } catch (NumberFormatException e) {
            System.out.println(" ");
            System.out.println("Please Enter an integer Number to add and only \"q\" to quit");
        }
    }
}

