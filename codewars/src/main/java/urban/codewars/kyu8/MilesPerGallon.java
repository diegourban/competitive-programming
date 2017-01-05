package urban.codewars.kyu8;

public class MilesPerGallon {

    public static float mpgToKPM(final float mpg) {
        return Math.round(((mpg * 1.609344f) / 4.54609188f) * 100f) / 100f;
    }

}
