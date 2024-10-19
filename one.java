import java.util.Scanner;
class one {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("please enter a number= ");
        int n = scn.nextInt();
        if (n < 0) {
            System.out.println("you have entered unvalid number");
        } else {

            for (int i = 0; i <= n; i++) {
                System.out.println();
                for(int k=0; k<n-i;k++)
                    System.out.print(" ");
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }


            }

        }
    }
}