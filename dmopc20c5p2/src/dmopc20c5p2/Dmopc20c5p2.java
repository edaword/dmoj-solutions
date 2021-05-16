/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dmopc20c5p2;
import java.util.*;
import java.io.*;
/**
 *
 * @author Edward Wang <https://github.com/edaword>
 */
public class Dmopc20c5p2 {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException{
        long n = readLong(), m = readLong();
        System.out.println(n + m - gcd(n,m));
        for (int i = 0; i < n; i++) {
            long left = (i-1)*m / n + 1;
            long right = (i*m+n-1)/n;
            for (long j = left; j < right+1; j++) {
                System.out.println(i + " " + j);
            }
        }
    }
    
    static long gcd(long m, long n) {
        return n==0 ? m : gcd(n,m%n);
    }
    
    static String next() throws IOException {
        while (st==null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine().trim());
        }
        return st.nextToken();
    }
    static long readLong() throws IOException {
        return Long.parseLong(next());
    }
    static int readInt() throws IOException {
        return Integer.parseInt(next());
    }
    static double readDouble() throws IOException {
        return Double.parseDouble(next());
    }
    static char readCharacter() throws IOException {
        return next().charAt(0);
    }
    static String readLine() throws IOException {
        return br.readLine().trim();
    }
    
}
