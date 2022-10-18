/*Input an amount from the user and find out the number of notes from input amount in given array
[1000,500,100,50,20,10,5,2,1].
Input: 1256

Output:
1000 1
100 2
50 1
5 1
1 1*/


package array_function_problem_solution;

import java.util.Scanner;

public class Number_Of_Notes {
    public static void main(String[] args) {
        int[] notes = {1000, 500, 100, 50, 20, 10, 5, 2, 1};
        int user_value = 0;

        Scanner inputAmount = new Scanner(System.in);

        System.out.println("Enter your amount: ");
        user_value = inputAmount.nextInt();

        Num_of_Notes(notes, user_value);


    }

    public static void Num_of_Notes(int[] notes, int user_value) {
        int n = user_value;

        for (int i = 0; i < notes.length; i++) {

            if(n/notes[i] !=0)
            {
                System.out.println(notes[i] + " " + n / notes[i]);
            }
            n = n % notes[i];
        }
    }
}
