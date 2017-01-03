package urban.sphere_online_judge.obi.soma;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        InputStreamReader in = new InputStreamReader(System.in);

        BufferedReader reader = new BufferedReader(in);
        
        int N = 0;
        
        int x = 0;
        
        N = Integer.parseInt(reader.readLine().trim());
        
        for(int i = 0; i < N ;i++) {
            x += Integer.parseInt(reader.readLine().trim());
        }
        System.out.println(x);

    }
}

