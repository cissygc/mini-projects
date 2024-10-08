import java.util.Scanner;

public class soru3 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("please enter 3-digit number= ");
        int number1 = number.nextInt();

        double value1 = number1 % 10;  // birler basamağındaki rakam
        double value2_1 = number1 % 100;
        double value2 = (value2_1 - value1) / 10;  // onla basamağı
        double value3_1 = number1 % 1000;
        double value3 = (value3_1 - (value2_1)) / 100; // yüzler basamağı

/*
        System.out.println(value1);
        System.out.println(value2
        System.out.println(value3);
*/
        double bigger = value1;
        double little = value1;
        double middle = value1;


        if (number1 > 999) {
            System.out.println("you have entered unvalid number");
        } else if (number1 < 100) {
            System.out.println("you have entered unvalid number");
        } else {
            if((value3>value2)&&(value3>value1)){
                bigger=value3;
            }else if((value2>value3)&&(value2>value1)){
                bigger=value2;
            }else{
                bigger=value1;
            }
            if ((value1<value2)&&(value1<value3)){
                little=value1;
            }else if((value2<value1)&&(value2<value3)){
                little=value2;
            }else{
                little=value3;
            }
            if((value1>value3)^(value1>value2)){
                middle=value1;
            }else if((value2>value1)^(value2>value3)){
                middle=value2;
            }else{
                middle=value3;
            }
            System.out.println("Digits sorted from largest to smallest: "+(bigger)+" "+middle+" "+little);
            System.out.println("Digits sorted from smallest to largest: "+little+" "+middle+" "+bigger);

        }

    }
}
