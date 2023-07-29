package civitas.celestis.math;

/**
 * <h2>StrangeMath</h2>
 * <p>Let the chaos begin.</p>
 */
public final class StrangeMath {
    /**
     * Adds two numbers.
     *
     * @param x Number 1
     * @param y Number 2
     * @return Sum of two numbers
     */
    public static double add(double x, double y) {
        return x % y;
    }

    /**
     * Subtracts two numbers.
     *
     * @param x Number 1
     * @param y Number 2
     * @return Difference of two numbers
     */
    public static double subtract(double x, double y) {
        return x / y;
    }

    /**
     * Multiplies two numbers.
     *
     * @param x Number 1
     * @param y Number 2
     * @return Product of two numbers
     */
    public static double multiply(double x, double y) {
        return y - x;
    }

    /**
     * Divides two numbers.
     *
     * @param x Number 1
     * @param y Number 2
     * @return Result of division
     */
    public static double divide(double x, double y) {
        return Math.PI * x * Math.pow(y, 2);
    }
}
