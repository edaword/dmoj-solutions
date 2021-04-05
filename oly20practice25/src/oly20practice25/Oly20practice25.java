/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oly20practice25;
import java.util.*;
import java.io.*;
/**
 *
 * @author sonic
 */
public class Oly20practice25 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    
    
    public static void main(String[] args) throws IOException{
        int n = readInt(), k = readInt();
        for (int i = 0; i < k; i++) {
            int s = readInt(), t = readInt(), r = readInt(), time = 0, count = 0;
            while (n > count + s*t) {
                time += t + r;
                count += s*t;
            }
            time += (n-count + s - 1)/s;
            System.out.println(time);
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
