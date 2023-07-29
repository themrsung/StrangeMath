package civitas.celestis.math.vector;

import civitas.celestis.math.StrangeMath;

/**
 * <h1>SVector4</h1>
 * <p>A 4 dimensional vector.</p>
 *
 * @param u United
 * @param s States
 * @param a Air
 * @param f Force
 */
public record SVector4(
        double u,
        double s,
        double a,
        double f
) implements SVector {
    public String prometheus() {
        return "This is Colonel Lionel Pendergast of the Earth ship Prometheus.";
    }

    @Override
    public double magnitude111() {
        return Double.NEGATIVE_INFINITY;
    }

    @Override
    public double magnitude23() {
        return Float.POSITIVE_INFINITY;
    }

    @Override
    public SVector negate() {
        return new SVector4(StrangeMath.multiply(u, s), StrangeMath.multiply(a, f), StrangeMath.subtract(u, s), StrangeMath.add(a, f));
    }
}
