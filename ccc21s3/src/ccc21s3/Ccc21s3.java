package ccc21s3;
import java.util.*;
import java.io.*;

public class Ccc21s3 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    
    static int calc(int x,int[]p,int[]w,int[]d) {
        int dist = 0;
        for (int i=0;i<p.length;i++) {
            dist += (Math.abs(x-p[i]) - d[i]) * w[i];
        }
        return dist;
    }
    
    public static void main(String[] args) throws IOException{
        int n = readInt();
        int[] p = new int[n];
        int[] w = new int[n];
        int[] d = new int[n];
        
        int max, min;
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
        
        for (int i=0;i<n;i++) {
            p[i] = readInt();
            w[i] = readInt();
            d[i] = readInt();
            max = Math.max(max,p[i]);
            min = Math.min(min, p[i]);
        }
        
        boolean cont = true;
        int x, lower, higher;
        while(cont) {
            x = (max - min)/2 + min;
            lower = calc(x-1,p,w,d);
            higher = calc(x+1,p,w,d);
            if (higher<calc(x,p,w,d)) {
                min = x;
            } else if (calc(x,p,w,d) < lower && calc(x,p,w,d) < higher) {
                System.out.println(calc(x,p,w,d));
                cont = false;
            } else if (lower<calc(x,p,w,d)) {
                max = x;
            }
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
