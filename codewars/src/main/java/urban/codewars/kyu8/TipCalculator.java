package urban.codewars.kyu8;

public class TipCalculator {

	public static Integer calculateTip(double amount, String rating) {
		final String ratingToLower = rating.toLowerCase();
		switch (ratingToLower) {
		case "terrible":
			return 0;
		case "poor":
			return (int) Math.ceil((amount * 5) / 100d);
		case "good":
			return (int) Math.ceil((amount * 10) / 100d);
		case "great":
			return (int) Math.ceil((amount * 15) / 100d);
		case "excellent":
			return (int) Math.ceil((amount * 20) / 100d);
		default:
			return null;
		}
	}

}
