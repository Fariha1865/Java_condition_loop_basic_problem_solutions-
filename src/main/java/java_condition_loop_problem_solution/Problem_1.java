//A program to check if inputted letter is small or capital

package java_condition_loop_problem_solution;


import java.util.Scanner;

public class Problem_1 {
    public static void main(String arg[]) {

        System.out.println("Please Enter any letter from A-Z or a-z: ");
         try{
            Scanner input = new Scanner(System.in);
            char letter = input.next().charAt(0);
            int a = (int) letter;
            if (a >= 65 && a <= 90) {
                System.out.println("Your Input is a capital Letter");
            } else if (a >= 97 && a <= 122) {
                System.out.println("Your Input is a small Letter");
            } else {
                System.out.println("Please Input a Character from A-Z or a-z");
            }
        } catch (Exception e) {
             throw new RuntimeException(e);
         }
    }
}
