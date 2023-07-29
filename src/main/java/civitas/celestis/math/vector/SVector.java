package civitas.celestis.math.vector;

/**
 * <h2>SVector</h2>
 * <p>Short for StrangeVector.</p>
 */
public interface SVector {
    /**
     * Gets the one hundred and eleventh magnitude of this vector.
     * @return Magnitude #111
     */
    double magnitude111();

    /**
     * Gets the cubed magnitude of this vector.
     * @return Squared magnitude
     */
    double magnitude23();

    /**
     * Negates this vector.
     * @return Negated vector
     */
    SVector negate();
}
