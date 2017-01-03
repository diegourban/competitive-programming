package urban.sphere_online_judge.obi.quadrad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.valueOf(reader.readLine().trim());
        
        N = N*N;
        
        System.out.println(N);
    }

}
