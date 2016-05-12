package br.com.urban.codewars.kyu8;

public class Banjo {

	public static String areYouPlayingBanjo(String name) {
		if(Character.toUpperCase(name.charAt(0)) == 'R') {
			return name + " plays banjo";
		}
		return name + " does not play banjo";
	}

}
