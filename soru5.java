import java.util.Scanner;

public class soru5 {
    public static void main(String[] args) {
        Scanner color = new Scanner(System.in);
        System.out.print("please enter RGB= ");
        int R = color.nextInt();
        int G = color.nextInt();
        int B = color.nextInt();
        if (((R < 0) || (G < 0)) || (B < 0)) {
            System.out.println("you have entered unvalid number");
        } else if (((R > 255) || (G > 255)) || (B > 255)) {
            System.out.println("you have entered unvalid number");
        }else{
            if ((R>B)&&(R>G)){
                System.out.println("The dominant color is red.");
            }else if ((B>R)&&(B>G)){
                System.out.println("The dominant color is blue.");
            }else if ((G>R)&&(G>B)){
                System.out.println("The dominant color is green.");
            }else if ((R==B)&&(B==G)){
                System.out.println("Colors are equal in intensity.");
            }else if(((R==G)^(G==B))^(R==B)){
                System.out.println("No dominant color, two or more colors are equal and highest.");
            }
        }

    }
}
