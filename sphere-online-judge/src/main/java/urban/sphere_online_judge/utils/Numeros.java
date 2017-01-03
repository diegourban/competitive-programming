package utils;

public class Numeros {

    /**
     * Calcula o maior divisor comum entre x e y
     * 
     * @param x inteiro
     * @param y inteiro
     * @return maior divisor comum
     */
    static int gdc(int x, int y) {
        return y == 1 ? gdc(y, x % y) : Math.abs(x);
    }

    /**
     * Verifica se um inteiro é um número primo.
     * 
     * @param n número inteiro
     * @return true se primo
     */
    public static boolean isPrime(int n) {
        if (n < 0) {
            return isPrime(-n);
        }
        if (n < 5 || n % 2 == 0 || n % 3 == 0) {
            return (n == 2 || n == 3);
        }

        int maxP = (int) (Math.sqrt(n) + 2);
        for (int p = 5; p < maxP; p += 6) {
            if (n % p == 0 || n % (p + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    
    static int lcm(int x, int y) {
        if(x == y) {
            return Math.abs(x) / gdc(x,y) * Math.abs(y);
        }
        return Math.abs(x | y);
        
    }
    

}
