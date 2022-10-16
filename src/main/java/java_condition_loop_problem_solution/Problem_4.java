//A program to check Balance, Deposit balance and Withdraw balance from ATM booth
package java_condition_loop_problem_solution;

import java.util.Scanner;

public class Problem_4 {
    public static void main(String[] args) {
        int balance = 10000;
        while (true) {
            System.out.println("ATM Booth");
            System.out.println("*************************");
            System.out.println("Enter 1 for Withdraw");
            System.out.println("Enter 2 for Deposit");
            System.out.println("Enter 3 for Check Balance");
            System.out.println("Enter 4 for EXIT");
            System.out.println("*************************");
            System.out.println(" ");
            System.out.print("Input number according to the operation you want to perform:");
            Scanner input = new Scanner(System.in);

            try {
                int option = input.nextInt();
                switch (option) {
                    case 1:
                        System.out.print("Enter the amount you want to withdraw:");
                        int withdraw = input.nextInt();
                        if (balance >= withdraw) {

                            balance = balance - withdraw;
                            System.out.println("Please collect your money");
                            System.out.println("Remaining Balance: " + balance);
                        } else {

                            System.out.println("Insufficient Balance");
                        }
                        System.out.println("");
                        break;
                    case 2:
                        System.out.println(" ");
                        System.out.print("Enter the amount of money to be deposited:");
                        System.out.println("");

                        int deposit = input.nextInt();
                        balance = balance + deposit;
                        System.out.println("Your Money has been deposited successfully");
                        System.out.println("");
                        System.out.println("Current Balance: " + balance);
                        System.out.println("");
                        break;
                    case 3:

                        System.out.println("Account Balance : " + balance);
                        System.out.println("");
                        break;

                    case 4:
                        System.out.println(" ");
                        System.out.println("Exiting from system. Thank You..");
                        System.out.println(" ");
                        System.exit(0);
                    default:
                        System.out.println(" ");
                        System.out.println("Please choose a number from the given menu, according to the action you want to perform");
                }
            } catch (Exception e) {
                System.out.println(" ");
                System.out.println("Please enter integer value \n" + e);
            }
        }

    }
}
