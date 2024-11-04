package az.turingacademy;
import java.util.Scanner;

public class Task04App {                                 //sumofsquares
    public static void main (String[] args) {
        Scanner sc=new Scanner (System.in);

        System.out.print ("Enter the first number (a):");
        int a=sc.nextInt();
        System.out.print ("Enter the second number (b):");
        int b=sc.nextInt();

        int sumofsquares = (a*a)+(b*b);
        System.out.println ("Sum :" + sumofsquares);

    }



}
