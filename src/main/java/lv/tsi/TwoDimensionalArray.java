package lv.tsi;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int x = console.nextInt();

        int[][] randomArray = createRandomArray(x);

        showAverage(randomArray);

    }

    // p2
    public static int[][] createRandomArray(int size) {
        int[][] array = new int[size][size];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++)
                array[i][j] = (int)(Math.random() * 100);
        }

        return array;
    }

    // p3
    public static double mean(int[] array) {
        double sum = 0;

        for (int i = 0; i < array.length; i++)
            sum = sum + array[i];

        double average = sum / array.length;

        return average;
    }

    // p4
    public static void showAverage(int[][] array) {
        // p4.1
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++)
                System.out.print(array[i][j] + "\t");

            System.out.println("\n");
        }

        // p4.2
        for (int i = 0; i < array.length; i++) {
            int[] row = new int[array.length];

            for (int j = 0; j < array.length; j++)
                row[j] = array[i][j];

            System.out.println("Average value of row #" + (i + 1) + " is: " + mean(row));
        }

        // p4.3
        for (int i = 0; i < array.length; i++) {
            int[] col = new int[array.length];

            for (int j = 0; j < array.length; j++)
                col[j] = array[j][i];

            System.out.println("Average value of column #" + (i + 1) + " is: " + mean(col));
        }
    }
}