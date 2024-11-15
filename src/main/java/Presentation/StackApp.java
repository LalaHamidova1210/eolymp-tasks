package Presentation;

public class StackApp {

    public static void main(String[] args) {

        int x = 5;
        int y = 10;

        int result = addNumbers(x, y);
        System.out.println("Result: " + result);
    }

    public static int addNumbers(int a, int b) {

        return a + b;
    }
}
