//A program to find the factorial of a given number

package java_condition_loop_problem_solution;

import java.util.Scanner;

public class Problem_6 {
    public static void main(String[] args) {
        int n = 5;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        try {
            int number = input.nextInt();
            int factorial = 1;
            if (number < 0) {
                System.out.println("Number must be greater or equal to zero");
            } else if (number == 0) {
                System.out.println("By definition, the factorial of 0 is 1, as there is exactly 1 way to arrange 0 objects");
            } else {
                for (int i = number; i >= 1; i--) {
                    factorial = factorial * i;
                }

                System.out.println(factorial);
            }
        } catch (Exception e) {
            System.out.println("Please Enter an Integer Number");
        }
    }
}
