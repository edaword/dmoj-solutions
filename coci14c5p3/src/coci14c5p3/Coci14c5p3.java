package coci14c5p3;
import java.util.*;
import java.io.*;
/**
 *
 * @author Edward Wang <https://github.com/edaword>
 */
public class Coci14c5p3 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException{
        int n = readInt(), k =readInt(), sz = (int)1e5;
        int[] row = new int[sz+3],col = new int[sz+3], left = new int[2*sz-1 + 3], right = new int[2*sz-1 + 3];
        for (int t = 1; t <= n; t++) {
            int r = readInt(), c = readInt();
            row[r]++; col[c]++; left[r+c]++; right[r+sz-c]++;
            if(row[r]==k || col[c]==k || left[r+c]==k || right[r+sz-c]==k) {
                System.out.println(t); return;
            }
        }
        System.out.println(-1);
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
