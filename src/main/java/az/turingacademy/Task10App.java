package az.turingacademy;
import java.util.Scanner;
public class Task10App {
    public static void main (String [] args){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the number of month:");
        int month=sc.nextInt();

        String quarter;
        if (month>= 1 && month <=3){
            quarter="First";
        } else if (month>=4 && month <=6){
            quarter="Second";
        }else if (month>=7 && month <=9){
            quarter="Third";
        }else if (month>=10 && month <=12){
            quarter="Fourth";
        }else {
            quarter="unknown";
        }
        System.out.println (quarter);
    }

}
