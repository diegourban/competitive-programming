package urban.sphere_online_judge.obi.par;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
				
	public static void main(String[] args) throws NumberFormatException, IOException {
		final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		final PrintWriter writer = new PrintWriter(System.out);
		int N = 0;
		int n = 0;
		String j1 = null;
		String j2 = null;	
		String[] valores = null;
				
		N = Integer.parseInt(reader.readLine());
		while(N != 0) {
			n++;
			writer.append("Teste " + n + "\n");
			
			j1 = reader.readLine();
			j2 = reader.readLine();
			
			for(int i = 0; i < N; i++) {
				valores =  reader.readLine().split(" ");			
				if((Integer.parseInt(valores[0]) + Integer.parseInt(valores[1])) % 2 == 0) {
					writer.append(j1 + "\n");
				} else {
					writer.append(j2 + "\n");				
				}
			}
			writer.append("\n");
			N = Integer.parseInt(reader.readLine());
			
		}		
		writer.close();
	}
}
