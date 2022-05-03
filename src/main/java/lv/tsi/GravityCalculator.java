package lv.tsi;

public class GravityCalculator {
    static final double GRAVITY = -9.81; // Earth's gravity in m / s ^ 2

    public static void main(String[] args) {
        int fallingTime = 0;
        double initialPosition = 0;
        double initialVelocity = 0;

        if (args.length == 0) {
            System.out.println("Please specify parameters [fallingTime, initialPosition, initialVelocity]");
            return;
        }

        fallingTime = Integer.parseInt(args[0]);

        if (args.length > 1)
            initialPosition = Integer.parseInt(args[1]);
        if (args.length > 2)
            initialVelocity = Integer.parseInt(args[2]);

        double finalPosition = (
            Math.pow(fallingTime, 2))
            * GRAVITY
            * 0.5 + (
                initialVelocity
                * fallingTime
            )
            + initialPosition;

        System.out.println("Position in " + fallingTime + " seconds:" + finalPosition);
    }
}
