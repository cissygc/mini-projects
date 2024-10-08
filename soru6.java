import java.util.Scanner;
public class soru6 {
    public static void main(String[] args){
        Scanner function = new Scanner(System.in);
        System.out.print("please enter the value of x= ");
        double x = function.nextDouble();

        if(x<=0){
            System.out.println("f("+x+") = "+ (x*x));
        }else if ((0<x)&&(x<10)){
            System.out.println("f("+x+") = "+ (2*x+1));
        }else{
            System.out.println("f("+x+") = "+ ((x*x*x)-x));
        }
    }
}