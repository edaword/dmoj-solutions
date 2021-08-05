/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package cf102951a;
import java.util.*;
import java.io.*;
/**
 *
 * @author Edward Wang<https://github.com/edaword>
 */
public class Cf102951A {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int n = readInt();
        long[]posX = new long[n];
        long[]posY = new long[n];
        for (int i = 0; i < n; i++) {
            posX[i] = readLong();
        }
        for (int i = 0; i < n; i++) {
            posY[i] = readLong();
        }
        long max = -1200;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                long c = (long) (Math.pow((posX[i]-posX[j]), 2) + Math.pow((posY[i]-posY[j]),2));
                max = Math.max(max,c);
            }
        }
        System.out.println(max);
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
