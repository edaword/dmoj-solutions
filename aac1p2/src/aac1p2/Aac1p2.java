/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aac1p2;
import java.util.*;
import java.io.*;
/**
 *
 * @author Edward Wang <https://github.com/edaword>
 */
public class Aac1p2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException{
        int n = readInt(); long d = readLong(), k = readLong(), x = readLong();
        long a[] = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = readLong();
        }
        long p = readLong(), cnt = 0;
        
        for (int i=0;i<n;i++) {
            while(a[i]>=p) {
                cnt++;
                a[i] = a[i] * (100-x)/100;
                if (cnt > k) {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");
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
