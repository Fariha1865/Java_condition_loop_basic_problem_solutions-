/*Core i 7 HP laptop price is 76000 tk and cash payment discount 10%.
What will be the purchase price?*/

package string_manipulation_problem_solution;

public class Purchase_Price_after_Discount {
    public static void main(String[] args) {
        String str="Core i 7 HP laptop price is 76000 tk and cash payment discount 10%";
        str = str.replaceAll("[^\\d]", " ");
        str = str.trim();
        str = str.replaceAll(" +", " ");
        String[] arr=(str.split(" "));

        double Real_Price = Double.parseDouble(arr[1]);
        double discount = Double.parseDouble(arr[2]);
        double Discount_Price = Real_Price-(discount/100)*Real_Price;
        System.out.println("The purchase price is: "+Discount_Price);
    }
}
