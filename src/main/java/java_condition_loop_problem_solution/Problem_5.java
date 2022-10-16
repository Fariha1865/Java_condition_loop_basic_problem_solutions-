//Sum of numbers which are only divisible by 5, from 1 to 100
package java_condition_loop_problem_solution;

public class Problem_5 {
    public static void main(String[] args) {
        int sum = 0;
        try {
            for (int i = 1; i <= 100; i++) {
                if (i % 5 == 0) {
                    sum = sum + i;
                }
            }
            System.out.println(" ");
            System.out.println("Sum of numbers which are only divisible by 5, from 1 to 100 is: " + sum);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
