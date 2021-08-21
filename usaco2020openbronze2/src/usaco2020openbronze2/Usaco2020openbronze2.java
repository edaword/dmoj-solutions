package usaco2020openbronze2;
import java.util.*;
import java.io.*;

public class Usaco2020openbronze2 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        int n = readInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = readInt();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int numFlowers = j-i+1;
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                if (sum%numFlowers !=0) {
                    continue;
                }
                int avg = sum/numFlowers;
                for (int k = i; k <= j; k++) {
                    if (avg==arr[k]) {
                        dbg("DONE",0);
                        ans++;
                        break;
                    }
                }
            }
        }
        System.out.println(ans);
    }
    
    static void dbg(String s, int x) {
//        System.out.println(s + " " + x);
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
