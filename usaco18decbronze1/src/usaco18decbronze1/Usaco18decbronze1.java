//package usaco18decbronze1;
import java.util.*;
import java.io.*;

public class Usaco18decbronze1 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        int[] bucket = new int[3];
        int[] value = new int[3];
        for (int i = 0; i < 3; i++) {
            bucket[i] = readInt();
            value[i] = readInt();
        }
        for (int i = 0; i < 100; i++) {
            if (value[i%3] + value[(i+1)%3]>bucket[(i+1)%3]) {
                int holder = value[i%3];
                value[i%3] = (holder + value[(i+1)%3])%bucket[(i+1)%3];
                value[(i+1)%3] = bucket[(i+1)%3];
            } else{
                value[(i+1)%3] += value[i%3];
                value[i%3] = 0;
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(value[i]);
        }
    }
    
   

    static String next () throws IOException {
            while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine().trim());
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
