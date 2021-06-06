/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olyabc125p3;
import java.util.*;
import java.io.*;
/**
 *
 * @author emilywang
 */
public class Olyabc125p3 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        int MM = (int) 1e5+3;
        int n, ans;
        int a[] = new int[MM];int pre[] = new int[MM]; int suf[] = new int [MM];
        
        n= readInt();
        
        for (int i=1;i<=n;i++) {
            a[i] = readInt();
            pre[i] =
        }
        
    }
    
    public static int gcd(int bigger, int smaller) {
        if (bigger > smaller) {
            
        }
        int remainder = bigger % smaller;
        if (remainder == 0) {
         return smaller;
        } else {
         return gcd(smaller, remainder);
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
