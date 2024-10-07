import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {
        Scanner digit = new Scanner(System.in);
        System.out.print("please enter 5 digit integer= ");
        int myNumber = digit.nextInt();

        double number1 = myNumber%10;   //birler basamağı
        double number2_1 = ((myNumber%100)-number1);
        double number2 = number2_1/10;  //onlar basamağı
        double number3_1 = ((myNumber%1000)-(number1+number2_1));
        double number3 = number3_1/100;  //yüzler basamağı
        double number4_1 = (myNumber%10000)-(number1+number2_1+number3_1);
        double number4 = number4_1/1000; //binler basamağı
        double number5_1 = (myNumber%100000)-(number1+number2_1+number3_1+number4_1);
        double number5 = number5_1/10000; //on binler basamağı


        if (myNumber > 99999) {
            System.out.println("the input is not 5-digit");
        } else if (myNumber < 10000) {
            System.out.println("the input is not 5-digit");
        }else{
            if ((number1==number5)&&(number2==number4)){
                System.out.println("The number is a palindrome.");
            }else{
                System.out.println("The number is not a palindrome.");
            }
        }



    }
}
