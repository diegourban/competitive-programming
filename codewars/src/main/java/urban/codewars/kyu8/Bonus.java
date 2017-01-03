package urban.codewars.kyu8;

public class Bonus {

	public static String bonusTime(final int salary, final boolean bonus) {
		if(bonus) {
			return "\u00A3" + salary*10;
		}
		return "\u00A3" + salary;
	}

}
