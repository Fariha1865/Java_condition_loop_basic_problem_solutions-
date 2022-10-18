/* Create your todays bazar list/pocket expenditure which includes the item name and price.
Then create a function named searchItem(String item) which will be used to search any item
from your HashMap and return the price. If found no item, then print message as
"No item found" and create another function named totalSum() which will return total price of items.*/

package array_function_problem_solution;

import java.util.HashMap;
import java.util.Scanner;

public class Search_Bazar_List_Hashmap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your products name: ");

        String itemsName = input.nextLine();

        searchItem(itemsName);
        totalSum(itemsName);
        input.close();
    }

    public static void searchItem(String itemsName) {
        HashMap<String, Integer> itemsList = new HashMap<>();

        itemsList.put("potato", 35);
        itemsList.put("onion", 45);
        itemsList.put("bread", 60);
        itemsList.put("milk", 150);

        int result = 0;

        if (itemsList.containsKey(itemsName)) {
            result = itemsList.get(itemsName);
            System.out.println("Items price: " + result);
        } else {
            System.out.println("No item found");
        }
    }
    public static void totalSum(String itemsName) {
        HashMap<String, Integer> itemsList = new HashMap<>();

        itemsList.put("potato", 35);
        itemsList.put("onion", 45);
        itemsList.put("bread", 60);
        itemsList.put("milk", 150);

        int sum = 0;
        for (int f : itemsList.values()) {
            sum += f;
        }

        System.out.println("Total Sum of All Items Prices is: "+sum);

    }
}
