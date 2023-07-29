package civitas.celestis;

import civitas.celestis.math.vector.SVector3;

public class Main {
    public static void main(String[] args) {
        final SVector3 v3 = new SVector3(3, 0, 4);
        System.out.println(v3.magnitude23());
    }
}