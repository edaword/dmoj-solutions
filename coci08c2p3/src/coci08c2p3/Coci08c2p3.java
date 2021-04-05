/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coci08c2p3;
import java.util.*;
import java.io.*;
/**
 *
 * @author sonic
 */
public class Coci08c2p3 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    
    static int n, sour[], bitter[], ans = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException{
        n = readInt(); sour = new int[n+1]; bitter = new int[n+1];
        List<Integer> comb = new ArrayList();
        for (int i = 1; i <= n; i++) {
            sour[i] = readInt(); bitter[i] = readInt();
        }
        getCombinations(1,comb);
        System.out.println(ans);
    }
    
    static void getCombinations (int idx, List<Integer> comb) {
        if (idx > n) {
            if (comb.isEmpty()) return;
            int totSour = 1, totBitter = 0;
            for(int i:comb) {
                totSour *= sour[i]; totBitter += bitter[i];
            }
            int curDif = Math.abs(totSour-totBitter);
            if (curDif < ans) ans = curDif;
            return;
        }
        getCombinations (idx+1,comb);
        
        comb.add(idx); getCombinations(idx+1,comb); comb.remove(comb.size()-1);
        
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
