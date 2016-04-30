package br.com.urban.codewars.kyu8;

public class RockPaperScissors {
	
	private static final String SCISSORS = "scissors";
	private static final String PAPER = "paper";
	private static final String ROCK = "rock";
	
	private static final String PLAYER_ONE_WON_MESSAGE = "Player 1 won!";
	private static final String PLAYER_TWO_WON_MESSAGE = "Player 2 won!";
	
	public static String rps(String p1, String p2) {
		switch (p1) {
		case SCISSORS:
			if(p2.equals(PAPER)) {
				return PLAYER_ONE_WON_MESSAGE;
			}
			if(p2.equals(ROCK)) {
				return PLAYER_TWO_WON_MESSAGE;
			}
			break;
		case PAPER:
			if(p2.equals(ROCK)) {
				return PLAYER_ONE_WON_MESSAGE;
			}
			if(p2.equals(SCISSORS)) {
				return PLAYER_TWO_WON_MESSAGE;
			}
			break;
		case ROCK:
			if(p2.equals(SCISSORS)) {
				return PLAYER_ONE_WON_MESSAGE;
			}
			if(p2.equals(PAPER)) {
				return PLAYER_TWO_WON_MESSAGE;
			}
			break;
		}
		return "Draw!";
	}

}
