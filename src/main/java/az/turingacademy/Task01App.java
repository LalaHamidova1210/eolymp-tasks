package az.turingacademy;
import java.util.Scanner;

public class Task01App {                                                           //twodigitnumber
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print ( "Enter a two digit number between 10:99:");
        int a=sc.nextInt();
        int first= a/10;
        int second=a%10;
        System.out.println( first + "  " + second);
    }

}
