/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usaco21febb1;
import java.util.*;
import java.io.*;
/**
 *
 * @author edwan2505
 */
public class Usaco21febb1 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException{
        int n = readInt();
        for (int i=0;i<n;i++) {
             
       }
    }
    
    static class Pair implements Comparable<Pair> {
        String name;
        int t;
        Pair (String name , int t) {
            this.name = name;
            this.t = t;
        }
        public int compareTo(Pair x) {
            return Integer.compare(t,x.t);
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
