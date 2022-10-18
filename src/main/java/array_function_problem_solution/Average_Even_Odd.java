/*Take 5 numbers from users in an array. Then find out the average number,
 how many even and how many odd numbers using these functions: average(),
 countEvenNumbers(), countOddNumbers().*/

package array_function_problem_solution;

import java.util.Scanner;

public class Average_Even_Odd {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Please Enter Your Required Array Size: ");
        n = input.nextInt();
        System.out.println("\n");
        int[] num=new int[n];
        int user_input;
        int sum=0;
        System.out.println("Enter Array Elements one by one: ");
        for(int i=0;i<num.length;i++)
        {
            user_input = input.nextInt();
            num[i]=user_input;
        }
        System.out.print("The Generated Array Is; ");
        for(int a:num)
        {
            System.out.print(a+" ");
        }
        System.out.println("\n");
        float Average = average(num,n);
        System.out.println("The Average Is: "+Average);

        int Even = countEvenNumbers(num);
        System.out.println("Total Count Of Even Numbers is: "+Even);

        int Odd = countOddNumbers(num);
        System.out.println("Total Count Of Odd Numbers is: "+Odd);


    }

    public static float average(int[] num,int n) {
        int sum=0;
        for(int a:num)
        {
            sum=sum+a;
        }
        float Average = (float) sum/n;
        return Average;
    }

    public static int countEvenNumbers(int[] num) {
        int count=0;
        for(int a:num)
        {
            if(a%2==0)
            {
                count+=1;
            }
        }

        return count;
    }
    public static int countOddNumbers(int[] num) {
        int count=0;
        for(int a:num)
        {
            if(a%2!=0)
            {
                count+=1;
            }
        }

        return count;
    }
}
