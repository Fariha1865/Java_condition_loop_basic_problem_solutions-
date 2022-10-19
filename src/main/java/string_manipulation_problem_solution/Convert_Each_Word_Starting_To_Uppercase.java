/*Write a program to convert each 1st char to uppercase from a string
Input: rahim lives in sylhet
Output: Rahim Lives in Sylhet*/


package string_manipulation_problem_solution;

public class Convert_Each_Word_Starting_To_Uppercase {
    public static void main(String[] args) {
        String line = "rahim lives in sylhet";
        System.out.println("Input: " + line);

        StringBuilder string = new StringBuilder(line);
        char first = line.charAt(0);


        string.setCharAt(0, Character.toUpperCase(first));

        char up = ' ';
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ' ') {
                char ch = string.charAt(i);
                up = string.charAt(i + 1);
                string.setCharAt(i + 1, Character.toUpperCase(up));
            }
        }
        System.out.println("Output: " + string);
    }
}
