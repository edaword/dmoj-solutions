/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coci15c2p2;
import java.util.*;
import java.io.*;
/**
 *
 * @author sonic
 */
public class Coci15c2p2 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int n, m, count = 0; static boolean pair[][];
    public static void main(String[] args) throws IOException{
        n = readInt(); m = readInt(); pair = new boolean[n+1][n+1];
        List<Integer> comb = new ArrayList();
        for (int i = 1; i <=m; i++) {
            int x = readInt(), y = readInt();
            pair[x][y] = pair[y][x] = true;
        }
        getCombinations(1,comb);
        System.out.println(count);
    }
    static void getCombinations (int idx, List<Integer> comb) {
        if (idx > n) {
            count++;
            return;
        }
        getCombinations (idx+1,comb);
        boolean valid = true;
        for (int x:comb) {
            if (pair[x][idx]) valid = false;
        }
        
        if (valid) {
            comb.add(idx); getCombinations(idx+1,comb); comb.remove(comb.size()-1);
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
