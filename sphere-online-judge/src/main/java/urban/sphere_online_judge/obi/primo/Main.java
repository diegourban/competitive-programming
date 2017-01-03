package urban.sphere_online_judge.obi.primo;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if(isPrime(N)) {
            System.out.println("sim");
        } else {
            System.out.println("nao");    
        }
        scanner.close();
    }
    
    static boolean isPrime(int n) {
        if(n < 0) {
            return isPrime(-n);
        }
        if(n < 5 || n % 2 == 0 || n % 3 == 0) {
            return (n == 2 || n == 3);
        }
        
        int maxP = (int) (Math.sqrt(n) + 2);
        for(int p = 5; p < maxP; p+= 6) {
            if(n % p == 0 || n % (p + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
