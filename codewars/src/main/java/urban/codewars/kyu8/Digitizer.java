package urban.codewars.kyu8;

public class Digitizer {
	
	public static int[] digitize(long n) {
		char[] charArray = new StringBuilder(String.valueOf(n)).reverse().toString().toCharArray();
		int[] intArray = new int[charArray.length];
		for(int i = 0; i < charArray.length; i++) {
			intArray[i] = Character.getNumericValue(charArray[i]);
		}
		return intArray;
	}

}
