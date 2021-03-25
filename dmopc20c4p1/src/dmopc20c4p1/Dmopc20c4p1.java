package dmopc20c4p1;
import java.util.*;
import java.io.*;

public class Dmopc20c4p1 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int t = readInt();
        
        for (int k = 0; k < t; k++) {
            int n = readInt(), s = readInt();
            int sum = n * (n+1)/2;

            int dif = sum-s;

            int nums = 0;

            int second = 0;
            for (int i = 1; i <= n; i++) {
                if (i<dif) {
                    second = dif - i;
                    
                }
            }

            System.out.println(nums);
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
