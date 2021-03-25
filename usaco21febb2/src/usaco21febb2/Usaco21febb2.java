package usaco21febb2;
import java.util.*;
import java.io.*;

public class Usaco21febb2 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
   
    public static void main(String[] args) throws IOException{
        int n = readInt(), a[][] = new int[1004][1004], ans = 0;
        boolean cow[][] = new boolean[1004][1004];
        int d[][] = {{-1,0},{1,0},{0,-1},{0,1}};
        for (int i = 1; i <= n; i++) {
            int x = readInt(), y = readInt();
            cow[x][y] = true;
            if (a[x][y] == 3) {
                ans++;
            }
            for (int j = 0; j < 4; j++) {
                int nx = x + d[j][0], ny = y + d[j][1];
                a[nx][ny]++;
                if (cow[nx][ny] && a[nx][ny] ==3) {
                    ans++;
                }
                if (cow[nx][ny]&& a[nx][ny]==4) {
                    ans--;
                }
            }
            System.out.println(ans);
        }
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
