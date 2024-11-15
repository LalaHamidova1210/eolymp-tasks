package Tasks;
import java.util.Scanner;

public class WeekPlannerApp {
    public static void main(String[] args) {
        String[][] Schedule = new String[7][2];
        Schedule[0][0] = "Sunday";
        Schedule[0][1] = "Go to Turing Academy for mentor day (approx. 6 hours)";
        Schedule[1][0] = "Monday";
        Schedule[1][1] = "Go to work and Turing Academy";
        Schedule[2][0] = "Tuesday";
        Schedule[2][1] = "Go to work then work on the tasks given by teacher Vusal ";
        Schedule[3][0] = "Wednesday";
        Schedule[3][1] = "Same as Tuesday";
        Schedule[4][0] = "Thursday";
        Schedule[4][1] = "Go to work and Turing Academy again";
        Schedule[5][0] = "Friday";
        Schedule[5][1] = "work, work, work";
        Schedule[6][0] = "Saturday";
        Schedule[6][1] = "Spend the whole day at the Turing Academy";


        Scanner scanner = new Scanner(System.in);

        String input;
        while (true) {
            System.out.print("Please, enter day of the week (type exit for 'exit'): ");
            input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program");
                break;
            }
            boolean validDay = false;
            for (int i = 0; i < 7; i++) {
                if (Schedule[i][0].equalsIgnoreCase(input)) {
                    System.out.println(input + "your tasks for: " + Schedule[i][1]);
                    validDay = true;
                    break;
                }
            }
            if (!validDay) {
                System.out.println("please, try again");
                continue;
            }
                }
            }
        }



