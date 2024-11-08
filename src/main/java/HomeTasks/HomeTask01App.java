package HomeTasks;
import java.util.Scanner;
public class HomeTask01App {                                               //lastcharacter
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  any word:");
        String word = sc.nextLine();
        if (word.length() > 0) {
            char lastcharacter = word.charAt(word.length() - 1);
            System.out.println("the last character of the word:" + lastcharacter);
        } else {
            System.out.println ("no word");

        }
    }
}