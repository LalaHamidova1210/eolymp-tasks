package az.turingacademy.lesson7;

public class ArrayApp {
    public static void main (String[] args) {

        int [] arr = {1,6,8,10};
        int max=arr[0];
        int maxIndex=0;
        for (int i =1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.println("Array max value: " + max);
        System.out.println("Max value index: " + maxIndex);
    }
}
 