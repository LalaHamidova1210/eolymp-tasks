package az.turingacademy;
import java.util.Scanner;

public class Test02App {                                                         //median number
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print ("Enter a:");
        int a=sc.nextInt();
        System.out.print ("Enter b:");
        int b=sc.nextInt();
        System.out.print ("Enter c:");
        int c=sc.nextInt();

        int median;
        if ((a>b && a<c) || (a<b && a>c)) {
            median=a;
        }else if ((b>a && b<c) || (b<a && b>c)){
            median=b;
        } else {
            median=c;
        }
        System.out.println ("median"+median);




    }






    }
