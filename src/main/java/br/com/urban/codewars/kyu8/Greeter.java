package br.com.urban.codewars.kyu8;

public class Greeter {

	public static String greet(String name) {
		if ("Johnny".equals(name)) {
			return "Hello, my love!";
		}

		return String.format("Hello, %s!", name);
	}

}
