package ccc98s2;
import java.io.*;
import java.util.*;

public class Ccc98s2 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
   
    public static void main(String[] args) throws IOException{
        Set<Integer> sum = new HashSet(), dif = new HashSet();
        int x = readInt();
        boolean flag = false;
        for(int j=1;j*j<=x;j++) {
            if (x%j==0) {
                int a = j, b = x/j;
                if (dif.contains(a+b) || sum.contains(b-a)) {
                    flag = true;
                }
                sum.add(a+b);
            }
            if (flag) {
                System.out.println(x + " is nasty");
            } else {
                System.out.println(x + " is not nasty");
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
