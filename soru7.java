import java.util.Scanner;
public class soru7 {
    public static void main(String[] args) {
        Scanner money = new Scanner(System.in);
        System.out.print("please enter your annual income= ");
        double income = money.nextDouble();
        System.out.println("1-single\n2-married\n3-head of household");
        System.out.println("please select your marital status= ");
        int status = money.nextInt();

        double taxes;

        if (income < 0) {
            System.out.println("you have entered invalid income.");
        } else {
            if (income < 10001) {
                taxes = 0;
            } else if (income < 30001) {
                double income1 = income - 10000;
                double income2 = income1 * (10.0 / 100.0);
                taxes = income2;
            } else if (income < 70001) {
                double income3 = income - 30000;
                double income4 = income3 * (20.0 / 100.0);
                taxes = 2000 + income4;
            } else {
                double income5 = income - 70000;
                double income6 = income5 * (30.0 / 100.0);
                taxes = 10000 + income6;
            }
            switch (status) {
                case 1:
                    System.out.println("Annual Income: " + income);
                    System.out.println("Marital Status: Single");
                    System.out.println("Calculated Tax: " + taxes);
                    break;
                case 2:
                    System.out.println("Annual Income: " + income);
                    System.out.println("Marital Status: Married");
                    System.out.println("Calculated Tax: " + (taxes - 1000));
                    break;
                case 3:
                    System.out.println("Annual Income: " + income);
                    System.out.println("Marital Status: Head of Household");
                    System.out.println("Calculated Tax: " + (taxes - 2000));
                    break;
            }
        }
    }
}
