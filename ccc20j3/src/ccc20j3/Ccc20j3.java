package ccc20j3;
import java.util.*;
import java.io.*;

public class Ccc20j3 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static String code, word;
    public static void main(String[] args) throws IOException{
        int n = readInt();
        int xmax,xmin,ymax,ymin;
        xmax = Integer.MIN_VALUE;
        ymax = Integer.MIN_VALUE;
        xmin = Integer.MAX_VALUE;
        ymin = Integer.MAX_VALUE;
        for (int i=0;i<n;i++) {
            String line = readLine();
            String[] arl = line.split(",");
            int x,y;
            x = Integer.parseInt(arl[0]);
            y = Integer.parseInt(arl[1]);
            
            xmax = Math.max(xmax,x);
            xmin = Math.min(xmin,x);
            ymax = Math.max(ymax,y);
            ymin = Math.min(ymin,y);
        }
        
        System.out.println((xmin - 1) + "," + (ymin - 1));
        System.out.println((xmax + 1) + "," + (ymax + 1));
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
