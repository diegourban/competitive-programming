package urban.codewars.kyu7;

/**
 * Maximum Length Difference
 * 
 * https://www.codewars.com/kata/maximum-length-difference
 * 
 * @author Diego Leonardo Urban
 *
 */
public class MaxDiffLength {

	public static int mxdiflg(String[] a1, String[] a2) {
		if (a1.length == 0 || a2.length == 0) {
			return -1;
		}
		
		int maxA1 = 0, maxA2 = 0;
		int minA1 = Integer.MAX_VALUE, minA2 = Integer.MAX_VALUE;
		
		for(String x : a1) {
			maxA1 = Math.max(maxA1, x.length());
			minA1 = Math.min(minA1, x.length());
		}
		
		for(String y : a2) {
			maxA2 = Math.max(maxA2, y.length());
			minA2 = Math.min(minA2, y.length());
		}
		
		return Math.max(Math.abs(maxA2 - minA1), Math.abs(maxA1 - minA2));
	}

}
