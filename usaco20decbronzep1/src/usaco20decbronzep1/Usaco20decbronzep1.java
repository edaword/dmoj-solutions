package usaco20decbronzep1;
import java.util.*;
import java.io.*;

public class Usaco20decbronzep1 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        // a + b + c is biggest
        long[] nums = new long[7];
        for (int i = 0; i < 7; i++) nums[i] = readLong();
        Arrays.sort(nums);
        long a = nums[0];
        long b = nums[1];
        long abc = nums[6];
        System.out.println(a + " " + b + " " + (abc-a-b));
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
