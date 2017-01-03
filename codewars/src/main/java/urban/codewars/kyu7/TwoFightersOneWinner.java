package urban.codewars.kyu7;

/*
 * https://www.codewars.com/kata/two-fighters-one-winner
 */
public class TwoFightersOneWinner {

	public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
		double totalAttacksToFighter1Win = Math.ceil(fighter2.health / (fighter1.damagePerAttack * 1.0));
		double totalAttacksToFighter2Win = Math.ceil(fighter1.health / (fighter2.damagePerAttack * 1.0));

		if (totalAttacksToFighter1Win < totalAttacksToFighter2Win) {
			return fighter1.name;
		}

		if (totalAttacksToFighter2Win < totalAttacksToFighter1Win) {
			return fighter2.name;
		}

		// if they need the same amount of hits, the first to attack wins
		return firstAttacker;
	}

}
