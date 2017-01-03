package urban.codewars.kyu8;

import java.util.Random;

public class Ghost {
	
	private static final String[] COLORS = {"white","yellow","purple","red"};
	
	private String color;
	
	public Ghost() {
		Random random = new Random();
		color = COLORS[random.nextInt(4)];
	}
	
	public String getColor() {
		return color;
	}

}
