package factoring1.pkg;
import java.util.*;
import java.io.*;
/**
 *
 * @author edwan2505
 */

public class Factoring1 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    
    static boolean isPrime(int n) {
        for (int i=2;i*i<=n;i++) {
            if (n % i==0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) throws IOException{
        int x,last, total;
        double y;
        x = readInt();
        y = Math.sqrt(x);
        last = 0;
        total = 1;
        Stack stk = new Stack();
        for (int i=2;i<=y;i++) {
            if (isPrime(i) && x % i==0) {
                x /=i;
                stk.push(i);
                i--;
            }
        }
        if (counter==3) {
            System.out.println("valid");
        } else {
            System.out.println("not");
        }
        
    }
    
    
    
    
    static String next () throws IOException {
            while (st == null || !st.hasMoreTokens())
                    st = new StringTokenizer(br.readLine().trim());
            return st.nextToken();
    }
    static long readLong () throws IOException {
            return Long.parseLong(next());
    }
    static int readInt () throws IOException {
            return Integer.parseInt(next());
    }
    static double readDouble () throws IOException {
            return Double.parseDouble(next());
    }
    static char readCharacter () throws IOException {
            return next().charAt(0);
    }
    static String readLine () throws IOException {
            return br.readLine().trim();
    }
    
}
