/* Extract the transaction ID from the following HTML body

Input:
<html>
<title>Test</title>
<body>
Your trnx is successful. Trnx Id is: TXN123456
</body>
</html>

Output: TXN123456*/


package string_manipulation_problem_solution;

public class Extract_Transaction_Id {
    public static void main(String[] args) {
        String s ="";
        String html = "<html>\n" +
                "<title>Test</title>\n" +
                "<body>\n" +
                "Your trnx is successful. Trnx Id is: TXN123456\n" +
                "</body>\n" +
                "</html>";

        int index = html.indexOf("TXN");
        StringBuilder string = new StringBuilder(html);
        while(true) {
            char ch = html.charAt(index);
            if (ch != '\n') {
                s = s + ch;
                index++;
            } else
            {
                break;
            }
        }
        System.out.println("Transaction Id is: "+s);
    }
}
