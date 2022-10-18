/*Suppose, in a company, here are some employee salaries in an array,
[35000, 25000, 28000, 32500, 44000, 32800]. Find out the 3rd highest salary.*/


package array_function_problem_solution;
import java.util.Arrays;

public class Third_Highest_Salary {
    public static void main(String[] args) {
        int[] num = {35000, 25000, 28000, 32500, 44000, 32800};
        int max = num [0];
        int third=0;
        int c=0;
        Arrays.sort(num);
        System.out.print("Salaries in descending order: ");
        for(int i=num.length-1;i>=0;i--)
        {
            System.out.print(num[i]+" ");
        }
        System.out.println("\n");
        System.out.println("Third Highest Salary is: "+num[num.length-3]);
    }
}
