package urban.codewars.kyu8;

public class Barycenter {

    public static double[] barTriang(double[] x, double[] y, double[] z) {
        double x0 = (x[0] + y[0] + z[0]) / 3.0;
        double y0 = (x[1] + y[1] + z[1]) / 3.0;
        x0 = (double) Math.round(x0 * 10000d) / 10000d;
        y0 = (double) Math.round(y0 * 10000d) / 10000d;
        return new double[]{x0, y0};
    }

}
