/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dwite07c3p1.pkg1;
import java.util.*;
import java.io.*;
/**
 *
 * @author edwan2505
 */

public class Dwite07c3p11 {

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
        for (int abc = 0;abc<5;abc++) {
            int x, counter;
            double y;
            counter = 0;
            x = readInt();
            y = Math.sqrt(x);
            for (int i=2;i<=y;i++) {
                if (isPrime(i) && x % i==0) {
                    x /=i;
                    counter++;
                }
            }
            if (counter==3) {
                System.out.println("valid");
            } else {
                System.out.println("not");
            }
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
