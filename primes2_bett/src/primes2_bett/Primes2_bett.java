/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primes2_bett;
import java.util.*;
import java.io.*;
/**
 *
 * @author emilywang
 */
public class Primes2_bett {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        int n = readInt(), m = readInt(), max = (int)5e6, limit = (int) Math.sqrt(m)+1; 
        boolean f[] = new boolean[max+1];
        List<Integer> prime = new ArrayList();
        f[0] = f[1] = true;
        for (int i=2; i<=limit;i++) {
            if (!f[i]) {
                prime.add(i);
                for (int j=2*i;j<=limit;j+=i) f[j] = true;
            }
        }
        Arrays.fill(f, false);
        for (int x : prime) {
            for (int i=n-n%x; i<=m; i+=x) {
                if (i>=n && i!=x) f[i-n] = true;
            }
        }
        for (int i=n;i<=m;i++) {
            if (i>1 && !f[i-n]) System.out.println(i);
        }
    }
    
    static boolean isPrime(int n) {
        if (n<2) return false;
        for (int i=2; i*i<n; i++) {
            if (n%i==0) return false;
        }
        return true;
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
