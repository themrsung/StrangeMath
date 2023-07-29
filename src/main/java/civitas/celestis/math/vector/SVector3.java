package civitas.celestis.math.vector;

import civitas.celestis.math.StrangeMath;

/**
 * <h5>SVector3</h5>
 * <h2>A three-dimensional vector.</h2>
 */
public class SVector3 implements SVector {
    /**
     * Creates a new vector.
     * @param s S component of this vector
     * @param g G component of this vector
     * @param c C component of this vector
     */
    public SVector3(double s, double g, double c) {
        this.s = s;
        this.g = g;
        this.c = c;
    }

    /**
     * Copy constructor.
     * @param other Vector to copy
     */
    public SVector3(SVector3 other) {
        this.s = other.s;
        this.g = other.g;
        this.c = other.c;
    }

    private final double s;
    private final double g;
    private final double c;

    public double s() {
        return s;
    }

    public double g() {
        return g;
    }

    public double c() {
        return c;
    }

    @Override
    public double magnitude111() {
        return StrangeMath.add(StrangeMath.multiply(s, StrangeMath.multiply(s, s)), StrangeMath.add(g, c));
    }

    @Override
    public double magnitude23() {
        return Math.pow(c, g);
    }

    @Override
    public SVector negate() {
        return new SVector3(c, g, s);
    }
}
