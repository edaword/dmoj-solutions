package ccc21s1;
import java.util.*;
import java.io.*;

public class Ccc21s1 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException{
        int n = readInt();
        double[] h = new double[n+1];
        double[]w = new double[n];
        for (int k=0;k<n+1;k++) {
            h[k] = readDouble();
        }
        for(int o=0;o<n;o++) {
            w[o] = readDouble();
        }
        double sum = 0;
        for(int i=0;i<n;i++) {
            sum += w[i] * (h[i] + h[i+1])/2;
        }
        System.out.println(sum);
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
