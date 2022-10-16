// A program to print prime numbers from 2 to n
package java_condition_loop_problem_solution;

import java.util.Scanner;

public class Problem_7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int lower = 2;
        try {
            System.out.print("Enter the upper bound: ");
            int upper = input.nextInt();

            System.out.println(" ");
            System.out.print("Prime numbers from range 2 to " + upper + " are: ");
            for (int i = lower; i <= upper; i++) {
                int flag = 0;
                for (int j = 2; j <= i / 2; ++j) {
                    if (i % j == 0) {
                        flag = 1;
                        break;
                    }
                }

                if (flag == 0) {
                    System.out.print(i + ", ");
                }

            }

        } catch (Exception e) {
            System.out.println(" ");
            System.out.println("Please enter an integer number as upper bound");
        }
    }
}

