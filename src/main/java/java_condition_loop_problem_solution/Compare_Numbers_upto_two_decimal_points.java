/*Input 2 decimal numbers. Check if they are both same or different up to two decimal places.

Input: 120.546 & 120.241
Output: The numbers are not same.

Input: 54.6987 & 54.6949
Output: The numbers are same.*/

package java_condition_loop_problem_solution;

import java.util.Scanner;

public class Compare_Numbers_upto_two_decimal_points {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        float first = input.nextFloat();
        System.out.println("Enter Second Number: ");
        float second = input.nextFloat();
        System.out.println(" ");
        //Cutting all digits after 2 decimal points for 1st number
        first = (float) (first * 100);
        first = (int) first;
        first = (float) (first / 100);
        System.out.println("First Number upto two decimal points: " + first);
        //Cutting all digits after 2 decimal points for 2nd number
        second = (float) (second * 100);
        second = (int) second;
        second = (float) (second / 100);
        System.out.println("Second Number upto two decimal points: " + second);

        if (first == second) {
            System.out.println("The numbers are same");
        } else {
            System.out.println("The numbers are not same");
        }
    }
}
