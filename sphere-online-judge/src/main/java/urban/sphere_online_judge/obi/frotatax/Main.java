package urban.sphere_online_judge.obi.frotatax;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        String saida = "G";
        String A = s.next("\\d{1,2}\\.\\d{1,2}");
        String G = s.next("\\d{1,2}\\.\\d{1,2}");
        String Ra = s.next("\\d{1,2}\\.\\d{1,2}");
        String Rg = s.next("\\d{1,2}\\.\\d{1,2}");
        
        double ARa = Double.parseDouble(Ra) / Double.parseDouble(A);
        double Grg = Double.parseDouble(Rg) / Double.parseDouble(G);
        
        if(ARa > Grg) {
            saida = "A";
        }
        
        System.out.println(saida); 
        s.close();
    }
    
}
