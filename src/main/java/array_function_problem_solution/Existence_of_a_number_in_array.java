/*Take input from a user and check if the number exists in the array.
Let the array is [1,3,5,7,2,4,6,8]
Input: 7
Output: Found in the position 3*/

package array_function_problem_solution;

import java.util.Scanner;

public class Existence_of_a_number_in_array {
    public static void main(String[] args) {
        int[] num = {1, 3, 5, 7, 2, 4, 6, 8};
        int flag = 0;
        int position = 0;
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int user_input = input.nextInt();
            for (int i = 0; i < num.length; i++) {
                if (user_input == num[i]) {
                    flag = 1;
                    position = i;
                }
            }
            if (flag == 1) {
                System.out.println(" ");
                System.out.println("Found in the position: " + position);
            } else {
                System.out.println("Found no element");
            }
        } catch (Exception e) {
            System.out.println("Please Enter an Integer Number");
        }
    }
}
