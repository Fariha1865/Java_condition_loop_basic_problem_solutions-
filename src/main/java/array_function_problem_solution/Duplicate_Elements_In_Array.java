/* Find the duplicate element in the given array. [1, 5, 2, 2, 3, 4, 3, 5, 2, 6, 7, 9, 8, 5]


Output:
2
3
5*/

package array_function_problem_solution;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Duplicate_Elements_In_Array {
    public static void main(String[] args) {
        int[] num = {1, 5, 2, 2, 3, 4, 3, 5, 2, 6, 7, 9, 8, 5};
        ArrayList<Integer> duplicates = new ArrayList<Integer>();

        for(int i=0;i<num.length-1;i++)
        {
            for(int j=i+1;j<num.length;j++)
            {
                if(num[i]==num[j])
                {
                    duplicates.add(num[i]);
                    //System.out.println(num[i]);
                }
            }
        }

        Set<Integer> s = new LinkedHashSet<Integer>(duplicates);
        System.out.println("\n");
        System.out.println("Duplicate Elements Are: "+s);

    }
}
