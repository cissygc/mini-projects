/*
@author Ceren Nur Gurcan 20240808007
@date 19.10.2024
@version 1.2
*/

import java.util.Scanner;

public class Assignment2_20240808007 {
    public static void main(String[] args) {
        Scanner atm = new Scanner(System.in);
        System.out.print("Please enter your first name= ");
        String name0 = atm.nextLine();
        System.out.print("Please enter your surname= ");
        String surname0 = atm.nextLine();

        double balance = -1;
        boolean truefalse = true;

        while (truefalse) {
            System.out.print("Please enter the balance: ");
            balance = atm.nextDouble();
            atm.nextLine();
            if (balance >= 0) {
                truefalse = false;
            } else {
                System.out.println("Value is not acceptable");
            }
        }

        truefalse = true;

        String name1 = name0.toLowerCase();
        String a = name1.substring(0, 1);
        String b = a.toUpperCase();
        String myname = name1.substring(1);
        String name = b.concat(myname);
        String surname = surname0.toUpperCase();
        System.out.println("Hello " + name + " " + surname);

        while (truefalse) {
            System.out.println("What would you like to do today?");
            System.out.println("B to see (B)alance in your account");
            System.out.println("W to (W)ithdraw cash");
            System.out.println("D to (D)eposit cash");
            System.out.println("Q to (Q)uit");
            System.out.println("P to (P)ay a bill");
            System.out.print("Please enter your selection: ");
            String selection = atm.nextLine();

            switch (selection.toUpperCase()) {
                case "B":
                    System.out.println("The current balance is " + balance);
                    break;
                case "W":
                    System.out.print("Please enter the amount to withdraw: ");
                    double withdrawamount = atm.nextDouble();
                    atm.nextLine();
                    if ((withdrawamount > balance) || (withdrawamount < 0)) {
                        System.out.print("");
                        System.out.println("ERROR: Invalid withdraw amount.");
                    } else {
                        System.out.println("You will receive=");
                        double withdraw = (withdrawamount * 100);

                        int wd200 = (int) withdraw / 20000;
                        withdraw = withdraw % 20000;
                        int wd100 = (int) withdraw / 10000;
                        withdraw = withdraw % 10000;
                        int wd50 = (int) withdraw / 5000;
                        withdraw = withdraw % 5000;
                        int wd20 = (int) withdraw / 2000;
                        withdraw = withdraw % 2000;
                        int wd10 = (int) withdraw / 1000;
                        withdraw = withdraw % 1000;
                        int wd5 = (int) withdraw / 500;
                        withdraw = withdraw % 500;
                        int wd1 = (int) withdraw / 100;
                        withdraw = withdraw % 100;
                        int wd0_5 = (int) withdraw / 50;
                        withdraw = withdraw % 50;
                        int wd0_25 = (int) withdraw / 25;
                        withdraw = withdraw % 25;
                        int wd0_1 = (int) withdraw / 10;
                        withdraw = withdraw % 10;
                        int wd0_05 = (int) withdraw / 5;
                        withdraw = withdraw % 5;
                        int wd0_01 = (int) withdraw / 1;
                        withdraw = withdraw % 1;


                        if (wd200 > 0) System.out.println(wd200 + (" piece 200TL"));
                        if (wd100 > 0) System.out.println(wd100 + (" piece 100TL"));
                        if (wd50 > 0) System.out.println(wd50 + (" piece 50TL"));
                        if (wd20 > 0) System.out.println(wd20 + (" piece 20TL"));
                        if (wd10 > 0) System.out.println(wd10 + (" piece 10TL"));
                        if (wd5 > 0) System.out.println(wd5 + (" piece 5TL"));
                        if (wd1 > 0) System.out.println(wd1 + (" piece 1TL"));
                        if (wd0_5 > 0) System.out.println(wd0_5 + (" piece 0.5TL"));
                        if (wd0_25 > 0) System.out.println(wd0_25 + (" piece 0.25TL"));
                        if (wd0_1 > 0) System.out.println(wd0_1 + (" piece 0.1TL"));
                        if (wd0_05 > 0) System.out.println(wd0_05 + (" piece 0.05TL"));
                        if (wd0_01 > 0) System.out.println(wd0_01 + (" piece 0.01TL"));


                        System.out.println("The current balance is " + (balance - withdrawamount));
                        balance = balance - withdrawamount;
                    }
                    break;
                case "D":
                    System.out.print("Please enter the amount to deposit: ");
                    double deposit = atm.nextDouble();
                    atm.nextLine();
                    if (deposit < 0) {
                        System.out.println("ERROR: Invalid deposit amount.");
                    } else {
                        System.out.println("The current balance is " + (balance + deposit));
                        balance += deposit;
                    }

                    break;
                case "Q":
                case "5":
                    System.out.println("Exiting system. Have a nice day!");
                    truefalse = false;
                    break;
                case "P":
                    System.out.println("Which of the following bills would you like to pay?");
                    System.out.println("1 - Electricity");
                    System.out.println("2 - Water");
                    System.out.println("3 - Internet");
                    System.out.println("Please enter your selection: ");
                    int bills = atm.nextInt();
                    atm.nextLine();

                    double bill = (Math.random() * 100);
                    bill = (int) (bill * 100) / 100.0;
                    switch (bills) {
                        case 1:
                            System.out.println("Your electrcity bill is " + bill);
                            if (bill > balance) {
                                System.out.println("You don't have sufficient funds to pay this bill.");
                            } else {
                                System.out.println("Do you wish to pay this bill now (Y/N)");
                                char wish = atm.next().charAt(0);
                                atm.nextLine();
                                if ((wish == 'Y') || (wish == 'y')) {
                                    System.out.println("Thank you for your payment");
                                    balance = balance - bill;
                                    System.out.println("Your current balance is = " + balance);
                                } else if ((wish == 'n') || (wish == 'N')) {

                                } else {
                                    System.out.println("ERROR: Invalid selection.");
                                }

                            }
                            break;
                        case 2:
                            System.out.println("Your water bill is " + bill);
                            if (bill > balance) {
                                System.out.println("You don't have sufficient funds to pay this bill.");
                            } else {
                                System.out.println("Do you wish to pay this bill now (Y/N)");
                                char wish = atm.next().charAt(0);
                                atm.nextLine();
                                if ((wish == 'Y') || (wish == 'y')) {
                                    System.out.println("Thank you for your payment");
                                    balance = balance - bill;
                                    System.out.println("Your current balance is = " + balance);
                                } else if ((wish == 'n') || (wish == 'N')) {

                                } else {
                                    System.out.println("ERROR: Invalid selection.");
                                }

                            }
                            break;
                        case 3:
                            System.out.println("Your internet bill is " + bill);
                            if (bill > balance) {
                                System.out.println("You don't have sufficient funds to pay this bill.");
                            } else {
                                System.out.println("Do you wish to pay this bill now (Y/N)");
                                char wish = atm.next().charAt(0);
                                atm.nextLine();
                                if ((wish == 'Y') || (wish == 'y')) {
                                    System.out.println("Thank you for your payment");
                                    balance = balance - bill;
                                    System.out.println("Your current balance is = " + balance);
                                } else if ((wish == 'n') || (wish == 'N')) {

                                } else {
                                    System.out.println("ERROR: Invalid selection.");
                                }

                            }
                            break;
                        default:
                            System.out.println("ERROR: Invalid selection.");

                    }

                    break;

                default:
                    System.out.println("ERROR: Invalid selection. Exiting System.");
                    truefalse = false;


            }

        }
    }
}
