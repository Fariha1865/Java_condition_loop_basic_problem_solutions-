/*Suppose a software system excepts valid credentials from user to logged in to the system.
if the user inputs wrong password for 3 times, system will say that "Your user has been
temporary locked". Let the username: admin, password: adm1n*/
package array_function_problem_solution;

import java.util.Scanner;

public class Password_Validation {
    public static void main(String[] args) {

        int c;
        int count = 0;
        Scanner input = new Scanner(System.in);


        while(count<3) {
            System.out.print("Please Enter Username: ");
            String name = input.next();
            System.out.print("\nPlease Enter Password: ");
            String password = input.next();

            c = password(name, password);
            if (c == 0) {
                System.out.println("Access Granted! Welcome!");
                break;
            } else if (c == 1) {
                System.out.println("Wrong Credential !! Please Try Again");

            } else if (c == 2) {
                ++count;
                System.out.println("Wrong Credential !! Please Try Again");
                System.out.println(count);
                if (count == 3) {
                    System.out.println("Your user has been temporary locked");
                    break;
                }
            }
        }


    }

    public static int password(String name, String pass) {
        String System_Password = "adm1n";
        String System_username = "admin";
        if (name.equals(System_username) && pass.equals(System_Password)) {
            return 0;
        } else if (!name.equals(System_username) && pass.equals(System_Password)) {
            return 1;
        } else if (name.equals(System_username) && !pass.equals(System_Password)) {
            return 2;
        } else {
            return 2;
        }

    }

}
