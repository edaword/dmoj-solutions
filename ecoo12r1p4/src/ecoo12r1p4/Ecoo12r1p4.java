/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecoo12r1p4;
import java.util.*;
import java.io.*;
/**
 *
 * @author Edward Wang <https://github.com/edaword>
 */
public class Ecoo12r1p4 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int n; static char g[][]; static boolean vis[][];
    public static void main(String[] args) throws IOException{
        for (int t = 1; t <=5; t++) {
            g = new  char[4][4];
            for (int i = 0; i < 4; i++) {
                g[i] = readLine().toCharArray();
            }
            n = readInt(); Set<String> set = new HashSet();
            int gd = 0, ts = 0, rp = 0, nf = 0, score = 0;
            for (int i = 0; i < n; i++) {
                String s = readLine(); boolean found = false; vis = new boolean[4][4];
                if(s.length() < 3) {
                    ts++; continue;
                }
                if (set.contains(s)) {
                    rp++;continue;
                }
                for (int r = 0; r < 4 && !found; r++) {
                    for (int c = 0; c < 4 && !found; c++) {
                        if(g[r][c] == s.charAt(0)) found = fun(0,r,c,s);
                    }
                }
                if (found) {
                    gd++; score += getPoint(s);
                } else {
                    nf++;
                }
                set.add(s);
            }
            System.out.println("Your score: " + score+ " (" +gd+" good, " +nf+" not found, "+ts+" too short, " +rp+ " repeated)");
        } 
    }
    
    static int getPoint(String s) {
        if (s.length() <=4) return 1;
        if (s.length() <=7) return s.length() - 3;
        return 11;
    }
    
    static boolean fun(int i, int r, int c, String s) {
        if (i==s.length()-1) return true;
        vis[r][c] = true;
        for (int dr=-1;dr<=1;dr++) {
            for (int dc = -1; dc <=1; dc++) {
                int nr = r + dr, nc = c + dc;
                if (nr < 0 || nr >= 4 || nc < 0 || nc >= 4 || vis[nr][nc] || g[nr][nc] != s.charAt(i+1)) continue;
                if (fun(i+1,nr,nc,s)) return true;
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
