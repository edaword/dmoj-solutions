package orzbruce2;
import java.util.*;
import java.io.*;

public class Orzbruce2 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int n = readInt(), q = readInt();
        int[] c = new int[n];
        for (int i=0;i<n;i++) {
            c[i] = readInt();
        }
        for (int k=0;k<q;k++) {
            int start1 = readInt(), stop1 = readInt(), start2 = readInt(), stop2 = readInt();
            double og1=0, og2=0;
            double min;
            for (int i=start1-1; i< stop1;i++) {
                og1+= c[i];
            }
            for (int i=start2-1;i< stop2;i++) {
                og2+= c[i];
            }
            min = Math.min((og1/2 + Math.max(0,og2-10)), (Math.max(0,og1-10) + og2/2));
            System.out.println(Math.abs(min - og1 - og2));
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
