/*Write a program that will count how many vowels in the given string:
Input: "roadtosdet"
Output: 4*/


package string_manipulation_problem_solution;

import java.util.ArrayList;
import java.util.Scanner;

public class Number_of_vowels {
    public static void main(String[] args) {
        System.out.print("Input: ");
        Scanner input = new Scanner(System.in);
        String line = input.next();
        char[] charArray = line.toCharArray();
        int count = 0;
        ArrayList<Object> vowel = new ArrayList<>();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'A' || charArray[i] == 'E' || charArray[i] == 'I' || charArray[i] == 'O' || charArray[i] == 'U') {
                count++;
                vowel.add(charArray[i]);
            } else if (charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'i' || charArray[i] == 'o' || charArray[i] == 'u') {
                count++;
                vowel.add(charArray[i]);
            }
        }
        System.out.println("Total Vowels in the given input is: " + count);
        System.out.print("Vowels in the given input are: ");
        for (Object a : vowel) {
            System.out.print(a);
        }

    }
}
