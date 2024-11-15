package Tasks;
import java.util.Random;
import java.util.Scanner;
public class RandomApp {
    public static void main(String[] args) {
        String[] students = {"Lalə", "Sənubər", "Ella", "Gülər", "Rəna", "Yetər","Aynur", "Günay", "Dilbər", "Raminə", "Pərvin", "Fəxri", "Rəvan Ağayev", "Əli", "Seyran", "Famil", "İbrahim", "Məhəmməd", "Nicat", "Ömər", "Rəvan Əliyev", "Ruslan", "Tural", "Nihat"};
        int totalSeats = 25;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the student's name: ");
        String studentName = scanner.nextLine();
        boolean studentFound = false;
        Random random = new Random();
        for (String student : students) {
            if (student.equalsIgnoreCase(studentName)) {
                studentFound = true;
                int seatNumber = random.nextInt(totalSeats) + 1;
                System.out.println(studentName + " random seat number: " + seatNumber);
                break;
            }
        }
        if (!studentFound) {
            System.out.println("Student not found");
        }


    }
}

