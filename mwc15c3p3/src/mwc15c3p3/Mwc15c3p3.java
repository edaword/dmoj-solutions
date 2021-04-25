/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mwc15c3p3;
import java.util.*;
import java.io.*;
/**
 *
 */
public class Mwc15c3p3 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    
    static int N, Q; 
//    static String word;
    static char[][] g;
    static boolean[][] vis = new boolean[25][25];
    
    public static void main(String[] args) throws IOException{
        N = readInt(); Q = readInt();
        g = new char[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                g[i][j] = readCharacter();
            }
        }
        for (int i = 0; i < Q; i++) {
            String word = readLine(); boolean found = false;
            vis = new boolean[N][N];
            //memset(vis,0,sizeof(vis));
            for (int r = 0; r < N && !found; r++) {
                for (int c = 0; c < N && !found; c++) {
                    if (g[r][c] == word.charAt(0)) {
                        found = fun(r,c,1, word);
                    }
                }
                System.out.println(found? "good puzzle!" : "bad puzzle!");
            }
        }
    }
    
    static boolean fun (int r, int c, int id, String word) {
        if (id == word.length()) return true;
        vis[r][c] = true;
        for (int dr=-1; dr<=1;dr++) {
            for(int dc = -1; dc <=1; dc++) {
                int nr = r + dr, nc = c + dc;
                if (nr<0 || nr>=N || nc<0 || nc>=N || vis[nr][nc] || g[nr][nc]!=word.charAt(id)) {
                    continue;
                }
                if (fun(nr,nc,id+1,word)) return true;
            }
        }
        vis[r][c] = false; return false;
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
