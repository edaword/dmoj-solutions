/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bf3;
import java.util.*;
import java.io.*;

/**
 *
 * @author edward
 */
public class Bf3 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    
    static boolean isPrime(int n) {
        for (int i=2;i*i<=n;i++) {
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) throws IOException{
        int n = readInt();
        boolean cont = true;
        if (isPrime(n)&&n!=1) {
            cont = false;
            System.out.println(n);
        }
        int count = 1;
        while (cont) {
            if (isPrime(n + count)) {
                // if its prime
                System.out.println(n + count);
                //print out what it is
                cont = false;
                //stop loop
            } else {
                count++;
//                System.out.println("count is now " + count);
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
