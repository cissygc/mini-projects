import java.util.Scanner;
public class two {
    public static void main (String[] args){
Scanner scn = new Scanner(System.in);
        System.out.print("please enter a number= ");
int n = scn.nextInt();


/*
        for (int i=0;i<n;i++){
            for (int j=0;j<(n*2-1);j++){
                if (Math.abs(j-(n-1))<i+1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                    if (j==(n*2-2))
                        System.out.println();
            }
        }
*/
        for (int i=n;i>0;i--){
            for (int j=0;j<(n*2-1);j++){
                if (Math.abs(j-(n-1))<=i-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                if (j==(n*2-2))
                    System.out.println();
            }
        }



    }
}
