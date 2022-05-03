package lv.tsi;
import java.util.Arrays;
import java.util.Scanner;

public class OneDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int x = sc.nextInt();

        int[] randomArray = createRandomArray(x);

        // p4
        System.out.println("Array values: " + Arrays.toString(randomArray));
        System.out.println("Average value of the array elements is : " + mean(randomArray));

        Arrays.sort(randomArray);
        System.out.println("Smallest value of the array is: " + randomArray[0]);
        System.out.println("Largest value of the array is: " + randomArray[randomArray.length - 1]);
    }

    // p3
    public static double mean(int[] array) {
        double sum = 0;

        for (int i = 0; i < array.length; i++)
            sum = sum + array[i];

        double average = sum / array.length;

        return average;
    }

    // p2
    public static int[] createRandomArray(int x) {
        int[] array = new int[x];

        for (int i = 0; i < array.length; i++)
            array[i] = (int)(Math.random() * 100);

        return array;
    }
}