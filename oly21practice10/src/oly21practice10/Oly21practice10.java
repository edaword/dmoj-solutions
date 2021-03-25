package oly21practice10;
import java.util.*;
import java.io.*;

public class Oly21practice10 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int n, k, maxDist;
        n = readInt();
        k = readInt();
        int[][] data = new int[n][2];
        maxDist = Integer.MIN_VALUE;
        for (int l=0;l<n;l++) {
            //num people
            data[l][0] = readInt();
            //address
            data[l][1] = readInt();
            maxDist = Math.max(maxDist, data[l][1]);
        }
        
        int counter, max;
        max = Integer.MIN_VALUE;
        for (int i=k+1; i<maxDist-k;i++) {
            counter = 0;
            for (int j=0;j<data.length;j++) {
                if (data[j][1] >= i-k && data[j][1] <=i+k) {
                    counter += data[j][0];
                }
            }
            max = Math.max(max, counter);
        }
        System.out.println(max);
    }
    
    static String next() throws IOException {
        while (st==null||!st.hasMoreTokens()) {
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
