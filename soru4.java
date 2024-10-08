import java.util.Scanner;

public class soru4 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("please enter 4-digit number= ");
        int myNumber = number.nextInt();


        int onesPlace = myNumber % 10;
        int tensPlace = (myNumber / 10) % 10;
        int hundredsPlace = (myNumber / 100) % 10;
        int thousandsPlace = (myNumber / 1000) % 10;
/*
        System.out.println(onesPlace);
        System.out.println(tensPlace);
        System.out.println(hundredsPlace);
        System.out.println(thousandsPlace);
*/
        if (myNumber > 9999) {
            System.out.println("you have entered unvalid number");
        } else if (myNumber < 1000) {
            System.out.println("you have entered unvalid number");
        } else {
            int sum = onesPlace + tensPlace + hundredsPlace + thousandsPlace;
            int product = onesPlace * tensPlace * hundredsPlace * thousandsPlace;
            System.out.println("product of digits of a number= " + product);
            System.out.println("sum of digits of the number= " + sum);
            if (sum>product){
                System.out.println("Sum is greater than the product");
            }else if (product>sum){
                System.out.println("Product is greater than the sum.");
            }else {
                System.out.println("Sum and product are equal.");
            }

        }

    }
}
