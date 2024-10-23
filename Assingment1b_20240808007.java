/*
@author Ceren Nur Gürcan - 20240808007
@version 1.1
@date 29.09.2024
 */
import java.util.Scanner;
public class Assingment1b_20240808007 {
    public static void main(String[] args) {

        Scanner atm = new Scanner(System.in);
        System.out.print("Please enter the balance: ");
        double balance = atm.nextDouble();

        if (balance < 0) {
            System.out.println("ERROR: Invalid balance entered.");
        } else {

            System.out.println("What would you like to do today?");
            System.out.println("1 to see your Balance");
            System.out.println("2 to Withdraw cash");
            System.out.println("3 to Deposit cash");
            System.out.println("4 to Exit");
            System.out.print("Please enter your selection: ");
            int selection = atm.nextInt();

            switch (selection) {
                case 1:
                    System.out.println("The current balance is " + balance);
                    System.out.println("Have a nice day.");
                    break;
                case 2:
                    System.out.print("Please enter the amount to withdraw: ");
                    double withdraw = atm.nextDouble();
                    if (withdraw > balance) {
                        System.out.println("ERROR: Invalid withdraw amount.");
                    }else if (withdraw<0){
                        System.out.println("ERROR: Invalid withdraw amount.");
                    }
                    else {
                        System.out.println("The current balance is " + (balance - withdraw));
                        System.out.println("Have a nice day.");
                    }
                    break;
                case 3:
                    System.out.print("Please enter the amount to deposit: ");
                    double deposit = atm.nextDouble();
                    if (deposit < 0) {
                        System.out.println("ERROR: Invalid deposit amount.");
                    } else {
                        System.out.println("The current balance is " + (balance + deposit));
                        System.out.println("Have a nice day.");
                    }
                    break;
                case 4:

                    break;
                default:
                    System.out.println("ERROR: Invalid selection. Exiting System.");


            }
        }


    }
}
