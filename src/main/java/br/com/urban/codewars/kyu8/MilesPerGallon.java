package br.com.urban.codewars.kyu8;

public class MilesPerGallon {

	public static float mpgToKPM(final float mpg) {
		return Math.round(((mpg * 1.609f) / 4.546f) * 100f) / 100f;
	}

}
