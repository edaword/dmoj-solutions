package ccc14s2;
import java.util.*;
import java.io.*;

public class Ccc14s2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static String code, word;
    public static void main(String[] args) throws IOException{
        int n;
        n = readInt();
        String[] r1 = new String[n];
        String[] r2 = new String[n];
        for (int k=0;k<n;k++) {
            r1[k] = next();
        }
        for(int t=0;t<n;t++) {
            r2[t] = next();
        }
        boolean cont, right;
        
        right = true;
        loops:
        for (int i=0;i<n;i++) {
            cont = true;
            String top, bot, ctop, cbot;
            top = r1[i];
            bot = r2[i];
            int cnt = 0;
            while(cont) {
                if (cnt == n) {
                    right = false;
                    System.out.println("bad");
                    break loops;
                }
                ctop = r2[cnt];
                cbot = r1[cnt];
                if (top.equals(ctop) && bot.equals(cbot)) {
                    cont = false;
                }
                cnt++;
            }
        }
        if (right) {
            System.out.println("good");
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
