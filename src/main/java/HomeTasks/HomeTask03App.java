package HomeTasks;
import java.util.Scanner ;
public class HomeTask03App {
    public static void main (String [] args){
    Scanner sc=new Scanner (System.in);
    System.out.println ("Enter any word:");
    String word=sc.nextLine ();
    if (word.length()>0){
        StringBuilder reverseword=new StringBuilder(word);
        reverseword.reverse();
        String uppercasereverseword=reverseword.toString().toUpperCase();
        System.out.println ("Reversed and uppercased word:"+ uppercasereverseword);
    } else {
        System.out.println ("No word");
    }
    }
}
