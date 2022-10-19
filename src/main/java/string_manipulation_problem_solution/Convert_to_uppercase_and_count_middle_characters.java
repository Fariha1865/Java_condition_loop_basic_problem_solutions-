/*Write a program that will give following output:
        Input: Chattogram
        Output: C8M*/

package string_manipulation_problem_solution;

import java.util.ArrayList;
import java.util.Scanner;

public class Convert_to_uppercase_and_count_middle_characters {
    public static void main(String[] args) {
        System.out.print("Input: ");
        Scanner input = new Scanner(System.in);
        int count = 0;
        String word = input.next();
        char[] charArray = word.toCharArray();
        ArrayList<Object> hold = new ArrayList<>();
        for (int i = 0; i < charArray.length; i++) {
            if (i == 0 || i == charArray.length - 1) {
                charArray[i] = Character.toUpperCase(charArray[i]);

            } else {
                count++;
            }

        }

        hold.add(charArray[0]);
        hold.add(count);
        hold.add(charArray[charArray.length - 1]);

        System.out.print("Output: ");
        for (Object a : hold) {
            System.out.print(a);
        }
    }
}
