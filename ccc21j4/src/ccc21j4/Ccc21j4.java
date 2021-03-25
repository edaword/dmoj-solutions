package ccc21j4;
import java.util.*;
import java.io.*;

public class Ccc21j4 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        String line = readLine();
        String[] sh = new String[line.length()];
        int l, m, s, notL,notM;
        l=0;
        m=0;
        s=0;
        for (int i=0;i<line.length();i++) {
            if (line.substring(i,i+1).equals("L")) {
                l++;
            } else if (line.substring(i,i+1).equals("M")) {
                m++;
            } else {
                s++;
            }
            sh[i] = line.substring(i,i+1);
        }
        
        for (int j=0;j<l;j++) {
            if (sh[j].equals("L")) {
                
            } else if (sh[j].equals("M")) {
                
            } else {
                
            }
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
