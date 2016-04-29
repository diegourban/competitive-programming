package br.com.urban.codewars.kyu8;

public class NoBoring {

	public static int noBoringZeros(int n) {
		String nStr = String.valueOf(n);
		nStr = nStr.replaceAll("0+$", "");
		if(nStr.isEmpty()) {
			return 0;
		}
		return Integer.valueOf(nStr);
	}
	
	public static int noBoringZerosBestPractice(int n) {
        if (n == 0){
            return n;
        }
            
        while (n % 10 == 0){
            n /= 10;       
        }
        
        return n;
    }

}
