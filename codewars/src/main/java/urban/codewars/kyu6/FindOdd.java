package urban.codewars.kyu6;

import java.util.Arrays;

public class FindOdd {

	public static int findIt(int[] numeros) {
		if(numeros.length == 1) {
			return numeros[0];
		}
		
		Arrays.sort(numeros);
		int contagem = 0;
		for(int i = 0; i < numeros.length; i++) {
			if(i+1 >= numeros.length) {
				return numeros[i];
			}
			contagem++;
			if(numeros[i] != numeros[i+1]) {
				if(contagem % 2 == 1) {
					return numeros[i];
				} else {
					contagem = 0;
				}
			}
		}
		return 0;
	}
}
