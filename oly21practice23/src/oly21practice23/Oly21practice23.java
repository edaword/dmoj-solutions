package oly21practice23;
import java.util.*;
import java.io.*;

public class Oly21practice23 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        
        String a, b, newA,newB;
        a = next();
        b = next();
        newA = "";
        newB = "";
        for (int i=a.length()-1;i>=0;i--) {
            newA += a.charAt(i);
        }
        for (int i=b.length()-1;i>=0;i--) {
            newB += b.charAt(i);
        }
        long na, nb;
        na = Long.parseLong(newA);
        nb = Long.parseLong(newB);
        
        if (na>nb) {
            System.out.println(nb);
        } else {
            System.out.println(na);
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
