package az.turingacademy;
import java.util.Scanner;
public class Task06App {                    //rectangular or not?
    public static void main (String [] args){
        Scanner sc=new Scanner (System.in);

        System.out.print ("Enter the 3 lengths of the triangle: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int max= Math.max(a, Math.max(b,c));
        int min1, min2;

        if (max==a){
            min1=b;
            min2=c;
        } else if ( max==b){
            min1=a;
            min2=c;
        }else {
            min1=a;
            min2=b;
        }
        if (max*max==min1*min1+min2*min2) {
            System.out.println("YES");
        } else {
            System.out.println ("NO");

        }


    }



}
