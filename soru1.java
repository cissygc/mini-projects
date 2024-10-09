import java.util.Scanner;

public class soru1 {
    public static void main(String[] args) {
        Scanner date = new Scanner(System.in);
        System.out.print("please write the date= ");
        int day = date.nextInt();
        int month = date.nextInt();
        int year = date.nextInt();

        if (month > 12) {
            System.out.println("you have entered unvalid date");
        } else if (month < 1) {
            System.out.println("you have entered unvalid date");
        } else {
            if (month == 1) {
                if (day > 31) {
                    System.out.println("you have entered unvalid date");
                } else if (1 > day) {
                    System.out.println("you have entered unvalid date");
                } else {
                    System.out.println("you have entered a valid date");
                }
            } else if (month == 3) {
                if (day > 31) {
                    System.out.println("you have entered unvalid date");
                } else if (1 > day) {
                    System.out.println("you have entered unvalid date");
                } else {
                    System.out.println("you have entered a valid date");
                }
            } else if (month == 4) {
                if (day > 30) {
                    System.out.println("you have entered unvalid date");
                } else if (1 > day) {
                    System.out.println("you have entered unvalid date");
                } else {
                    System.out.println("you have entered a valid date");
                }
            } else if (month == 5) {
                if (day > 31) {
                    System.out.println("you have entered unvalid date");
                } else if (1 > day) {
                    System.out.println("you have entered unvalid date");
                } else {
                    System.out.println("you have entered a valid date");
                }
            } else if (month == 6) {
                if (day > 30) {
                    System.out.println("you have entered unvalid date");
                } else if (1 > day) {
                    System.out.println("you have entered unvalid date");
                } else {
                    System.out.println("you have entered a valid date");
                }
            } else if (month == 7) {
                if (day > 31) {
                    System.out.println("you have entered unvalid date");
                } else if (1 > day) {
                    System.out.println("you have entered unvalid date");
                } else {
                    System.out.println("you have entered a valid date");
                }
            } else if (month == 8) {
                if (day > 31) {
                    System.out.println("you have entered unvalid date");
                } else if (1 > day) {
                    System.out.println("you have entered unvalid date");
                } else {
                    System.out.println("you have entered a valid date");
                }
            } else if (month == 9) {
                if (day > 30) {
                    System.out.println("you have entered unvalid date");
                } else if (1 > day) {
                    System.out.println("you have entered unvalid date");
                } else {
                    System.out.println("you have entered a valid date");
                }
            } else if (month == 10) {
                if (day > 31) {
                    System.out.println("you have entered unvalid date");
                } else if (1 > day) {
                    System.out.println("you have entered unvalid date");
                } else {
                    System.out.println("you have entered a valid date");
                }
            } else if (month == 11) {
                if (day > 30) {
                    System.out.println("you have entered unvalid date");
                } else if (1 > day) {
                    System.out.println("you have entered unvalid date");
                } else {
                    System.out.println("you have entered a valid date");
                }
            } else if (month == 12) {
                if (day > 31) {
                    System.out.println("you have entered unvalid date");
                } else if (1 > day) {
                    System.out.println("you have entered unvalid date");
                } else {
                    System.out.println("you have entered a valid date");
                }
            } else {

                boolean year1 = false;
                if (year % 4 == 0) {
                    if (year % 100 == 0) {
                        if (year % 400 == 0) {
                            year1 = true;
                        } else {
                            year1 = false;
                        }
                    } else {
                        year1 = true;
                    }
                }


                if (year1) {
                    if (day > 29) {
                        System.out.println("you have entered unvalid date");
                    } else if (1 > day) {
                        System.out.println("you have entered unvalid date");
                    } else {
                        System.out.println("you have entered a valid date");
                    }
                } else {
                    if (day > 28) {
                        System.out.println("you have entered unvalid date");
                    } else if (1 > day) {
                        System.out.println("you have entered unvalid date");
                    } else {
                        System.out.println("you have entered a valid date");
                    }
                }
            }
        }


    }
}
