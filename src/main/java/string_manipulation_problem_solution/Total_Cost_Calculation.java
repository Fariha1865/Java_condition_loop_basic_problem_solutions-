/* Price of a formal shirt is 1200 tk and Sharee is 3500 tk.
 If you buy 2 shirt and 1 sharee, then 400 tk will be discounted.
 After your purchase what will be your total cost?*/


package string_manipulation_problem_solution;

public class Total_Cost_Calculation {
    public static void main(String[] args) {
        String str="Price of a formal shirt is 1200 tk and Sharee is 3500 tk. If you buy 2 shirt and 1 sharee, then 400 tk will be discounted";
        str = str.replaceAll("[^\\d]", " ");
        str = str.trim();
        str = str.replaceAll(" +", " ");
        String[] arr=(str.split(" "));

        int Real_Price = Integer.parseInt(arr[0])*Integer.parseInt(arr[2]) + Integer.parseInt(arr[1])*Integer.parseInt(arr[3]);

        int Discount_Price = Real_Price - Integer.parseInt(arr[4]);
        System.out.println("After Purchase,total cost is: "+Discount_Price);
    }
}
