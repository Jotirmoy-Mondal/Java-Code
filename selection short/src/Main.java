public class MathUtils {
    // Static variable
    static int callCount = 0;

    // Static method to calculate the square of a number
    public static int square() {
        return callCount++;
    }

    }

    // Static method to print the number of times the square method has been called


public class Main {
    public static void main(String[] args) {
        // Calling static methods without creating an object of MathUtils
        System.out.println("Square of 5: " + MathUtils.square()); // Outputs: 25
        System.out.println("Square of 10: " + MathUtils.square()); // Outputs: 100
    }
}

