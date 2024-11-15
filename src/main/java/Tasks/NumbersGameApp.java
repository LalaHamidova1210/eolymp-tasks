package Tasks;
import java.util.Random;
import java.util.Scanner;
public class NumbersGameApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Let the game begin");
        System.out.print("Enter the name: ");
        String name = scanner.nextLine();


        int hidenumber = random.nextInt(101);
        int[] estimates = new int[100];
        int estimatenumber = 0;
        int estimate = -1;
        while (estimate != hidenumber) {
            System.out.print("Enter your estimate): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid entry, please enter a number");
                scanner.next();
            }
            estimate = scanner.nextInt();

            estimates[estimatenumber] = estimate;
            estimatenumber++;


            if (estimate < hidenumber) {
                System.out.println("Your number is too small. Please, try again");
            } else if (estimate > hidenumber) {
                System.out.println("Your number is too big. Please, try again.."
                );
            } else {
                System.out.println("Congratulations, " + name + "!");
            }
        }
        System.out.println("Numbers:");
        for (int i = 0; i < estimatenumber; i++) {
            System.out.print(estimates[i] + " ");
        }

    }
}

