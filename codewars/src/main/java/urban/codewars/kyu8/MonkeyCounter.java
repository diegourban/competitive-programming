package urban.codewars.kyu8;

import java.util.stream.IntStream;

public class MonkeyCounter {
	
	public static int[] monkeyCount(final int n){
		int[] result = new int[n];
		for(int i = 1; i <= n; i++) {
			result[i-1] = i;
		}
		return result;
	}
	
	public static int[] monkeyCountBestPractice(final int n){
		return IntStream.rangeClosed(1, n).toArray();
	}

}
