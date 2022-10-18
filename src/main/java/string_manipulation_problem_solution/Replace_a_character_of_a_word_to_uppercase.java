/*Replace "R" from Rahim with "F" from the given String:
Input: Ratul and Rahim live in Rangpur
Output: Ratul and Fahim lives in Rangpur*/

package string_manipulation_problem_solution;

public class Replace_a_character_of_a_word_to_uppercase {
    public static void main(String[] args) {
        String s = "Ratul and Rahim live in Rangpur";
        System.out.println("Input: " + s);
        int index = s.indexOf("Rahim");
        StringBuilder string = new StringBuilder(s);
        string.setCharAt(index, 'F');
        System.out.print("Output: " + string);

    }
}
