package az.turingacademy;
import java.util.Scanner;
public class Task09App {
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the four digit number:");
        int num=sc.nextInt ();

        int firstdigit=num/1000;
        int lastdigit=num%10;
        int sum=firstdigit+lastdigit;

        System.out.println ("The sum of the numbers on the edge:"+sum);

    }


}
