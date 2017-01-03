package urban.sphere_online_judge.obi.querm;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		int n = 0;
		int i = 0;
		int sorteado = 0;
		
		while (N != 0) {
			n++;
			for(i = 1; i <= N; i++) {
				sorteado = s.nextInt();
				if(sorteado == i) {
					System.out.println("Teste " + n);
					System.out.println(sorteado);
					System.out.println("");
					s.nextLine();
					i = N;
				}
			}
			N = s.nextInt();
		}
		
		s.close();
	}
}
