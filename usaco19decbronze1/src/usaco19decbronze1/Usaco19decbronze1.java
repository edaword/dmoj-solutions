package usaco19decbronze1;
import java.util.*;
import java.io.*;

public class Usaco19decbronze1 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        int k = readInt(), n = readInt();
        boolean[][] ans = new boolean[20][20];
        for (int i = 0; i < k; i++) {
            int[]line = new int[n];
            for (int j = 0; j < n; j++) {
                line[j] = readInt();
            }
            for (int j = 0; j < n; j++) {
                for (int l = j+1; l < n; l++) {
                    ans[line[j]-1][line[l]-1] = true;
                }
            }
        }
        int x = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (!ans[i][j] || !ans[j][i]) {
                    x++;
                }
            }
        }
        System.out.println(x);
    }
    
   

    static String next () throws IOException {
            while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine().trim());
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
