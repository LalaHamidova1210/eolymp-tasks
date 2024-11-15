package Tasks;
import java.util.Random;
import java.util.Scanner;
public class ShootingAtTheSquareApp {

    public static void main(String[] args) {
        String[][] gameField = new String[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                gameField[i][j] = "-";
            }
        }
        Random rand = new Random();
        int targetRow = rand.nextInt(5);
        int targetCol = rand.nextInt(5);

        System.out.println("Get ready to be seen ");
        Scanner scanner = new Scanner(System.in);

        boolean targetHit = false;
        while (!targetHit) {
            printGameField(gameField);

            int row = getPlayerInput(scanner, "Enter line number for fire (1-5): ");

            int col = getPlayerInput(scanner, "Enter column number for fire (1-5): ");
            row--;
            col--;
            if (row == targetRow && col == targetCol) {
                gameField[row][col] = "x";
                targetHit = true;
                printGameField(gameField);
                System.out.println("won");
            } else {
                gameField[row][col] = "*";
            }
        }
    }
    private static void printGameField(String[][] gameField) {
        System.out.println("0 | 1 | 2 | 3 | 4 |");
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " | ");
            for (int j = 0; j < 5; j++) {
                System.out.print(gameField[i][j] + " | ");
            }
            System.out.println();
        }
    }
    private static int getPlayerInput(Scanner scanner, String prompt) {
        int input;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input >= 1 && input <= 5) {
                    return input;
                } else {
                    System.out.println("please enter a number between 1 and 5");
                }
            } else {
                System.out.println("invalid input, please try again");
                scanner.next();
            }
        }
    }
}

