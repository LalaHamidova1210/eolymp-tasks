package az.turingacademy;
import java.util.Scanner;
public class Task05App {                      //first or last?
    public static void main (String [] args){
        Scanner sc= new Scanner (System.in);
        System.out.print ("Enter the third digit number:");
        int num=sc.nextInt();

        int firstdigit=num/100;
        int lastdigit=num%10;

        if(firstdigit>lastdigit) {
            System.out.println (firstdigit);
        } else if (firstdigit<lastdigit) {
            System.out.println (lastdigit);
        } else {
            System.out.println ("=");
        }


    }





}
