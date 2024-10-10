import java.util.Scanner;

public class soru9 {
    public static void main(String[] args) {
        Scanner platform = new Scanner(System.in);
        System.out.print("please enter the base price= ");
        double basePrice = platform.nextInt();
        platform.nextLine();

        System.out.print("please enter your membership level= ");
        String membership = platform.nextLine();

        System.out.print("please enter the purchase time= ");
        String time = platform.nextLine();

        System.out.print("please enter product category= ");
        String category = platform.nextLine();  //"Electronics", "Clothing", "Groceries",
        // "Books", "Furniture".

        System.out.print("please enter the season= ");
        String season = platform.nextLine(); //"Spring", "Summer", "Autumn", "Winter"


        String[] parts = time.split(":");
        int hour = Integer.parseInt(parts[0]);   //BU KOD STRİNG İFADEYİ İNTEGER'A ÇEVİRİR!!!!!!!1
        int minute = Integer.parseInt(parts[1]);

        double discount = 0;

        if ((hour > 0 || (hour == 0 && minute >= 0)) && (hour < 6 || (hour == 6 && minute >= 0))) {
            discount += 10;
        } else if ((hour > 12 || (hour == 12 && minute >= 0)) && (hour < 14 || (hour == 14 && minute >= 0))) {
            discount += 5;
        }


        switch (category.toLowerCase()) {
            case "electronics":
                discount += 2;
                if (season.equals("winter")) {
                    discount += 10;
                }
                break;
            case "clothing":
                discount += 5;
                if (season.equals("spring")) {
                    discount += 5;
                }
                break;
            case "groceries":
                break;
            case "books":
                discount += 3;
                break;
            case "furniture":
                discount += 7;
                if (season.equals("spring")) {
                    discount += 5;
                }
                break;
            default:
                System.out.println("you have entered unvalid category.");
                return;
        }


        if (basePrice < 0) {
            System.out.println("you have entered unvalid price.");
        } else {
            switch (membership.toLowerCase()) {
                case "bronze":
                    discount += 5;
                    break;
                case "silver":
                    discount += 10;
                    break;
                case "gold":
                    discount += 15;
                    break;
                case "platinum":
                    discount += 20;
                    break;
                default:
                    System.out.println("you have entered unvalid membership.");
                    return;
            }
        }
        double price = basePrice - (basePrice * (discount / 100));
        System.out.println("final price is= " + price);

    }
}
