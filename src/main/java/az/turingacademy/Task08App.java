package az.turingacademy;
import java.util.Scanner;
public class Task08App {
    public static void main (String []args){
        Scanner sc=new Scanner (System.in);

        System.out.print ("Enter the three digit number:");
        int num=sc.nextInt();

        int sum=0;
        sum +=num /100;
        sum +=(num/10)%10;
        sum +=num%10;

        double squareRoot=Math.sqrt(sum);
        System.out.printf ("square root of the sum of the digits:%.3f%n", squareRoot);


    }


}
