package lv.tsi;
import java.util.*;

public class FactorialCalculator {
    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }
    
    static void recursive() {
        int i, result = 1;

        System.out.print("[Recursive Method] Enter factorial number: ");
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();

        result = factorial(number);

        System.out.println("[Recursive Method] > Factorial is: " + result);
    }

    static void loop() {
        System.out.print("[Loop Method] Enter factorial number: ");
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();

        int i, fact = 1;
        for (i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("[Loop Method] > Factorial is: " + fact);
    }

    public static void main(String[] args) {
        loop();
        recursive();
    }
}
