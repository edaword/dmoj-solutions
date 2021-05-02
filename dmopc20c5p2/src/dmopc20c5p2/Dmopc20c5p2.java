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
        int n = readInt(), m = readInt();
        double slope = 1;
        boolean bigSlope = false;
        
        if (n<m) {
            bigSlope = false;
            slope = (double)(n) / (double)(m);
        } else if (n>m) {
            bigSlope = true;
            slope = (double)(m) / (double)(n);
        } 
        
        
        
        //m = width
        //n = height
        
        String first, last;
        int cnt = 0;
        
        last = "";
        
        String ans = "";
        
        if (!bigSlope) {
            for (int x = 1; x < m; x++) {
                if (slope * x % 1 != 0) {
                    int y = (int)Math.ceil(slope * x);

                    //1st
                    first = (String.valueOf(y) + " " + x);
                    if (!first.equals(last)) {
                        ans += first + "\n";
                        cnt++;
                    }
                    //2nd
                    last = (String.valueOf(y) + " " + (x+1));
                    ans += last + "\n";
                    cnt++;
                }
            }
        } else if (bigSlope) {
            //note n
            for (int x = 1; x < n; x++) {
                if (slope * x % 1 != 0) {
                    int y = (int)Math.ceil(slope * x);

                    //1st
                    first = (String.valueOf(x) + " " + y);
                    if (!first.equals(last)) {
                        ans += first + "\n";
                        cnt++;
                    }
                    //2nd
                    last = (String.valueOf(x+1) + " " + (y));
                    ans += last + "\n";
                    cnt++;
                }
            }
        }
        
        
        
        System.out.println(cnt);
        System.out.println(ans.trim());
        
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
