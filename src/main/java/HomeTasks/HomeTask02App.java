package HomeTasks;
import java.util.Scanner;
public class HomeTask02App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any word:");
        String word = sc.nextLine();
        if (word.length() > 0) {
            char lastcharacter = word.charAt(word.length() - 1);
            System.out.println("the last character of the word :" + lastcharacter);
            if (lastcharacter == 'a' || lastcharacter == 'e' || lastcharacter == 'i' || lastcharacter == 'o' || lastcharacter == 'u') {
                System.out.println("The last character is a vowel: " + lastcharacter);
                }else {
                System.out.println("The last character is not a vowel: " + lastcharacter);
            }} else{
                System.out.println("no word");
            }


    }
}
