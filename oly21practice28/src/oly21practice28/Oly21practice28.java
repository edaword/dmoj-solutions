/*
    mar 25 2021
 */
package oly21practice28;
import java.util.*;
import java.io.*;

public class Oly21practice28 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int n = readInt();
        long d = readLong(), k = readLong();
        long cnt = 0;
        long[] monsters = new long[n];
        for (int i = 0; i < n; i++) {
            monsters[i] = readInt();
        }
        Arrays.sort(monsters);
        monsters = Arrays.copyOfRange(monsters, 0,  (int) (monsters.length - k));
        long numAtk;
        for (int i = 0; i < monsters.length; i++) {
            numAtk = ((monsters[i]%d) + monsters[i]) / d;
            cnt += numAtk;
        }
        System.out.println(cnt);
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
