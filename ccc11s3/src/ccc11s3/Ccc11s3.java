
package ccc11s3;

/**
 *
 * @author sonic
 */
import java.util.*;
import java.io.*;

public class Ccc11s3 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
   
    public static void main(String[] args) throws IOException{
        int t = readInt();
        int a[][] = new int[5][5];
        a[1][0]=1;
        a[2][0]=1;
        a[3][0]=1;
        a[2][1]=1;
        a[1][1]=-1;
        a[2][2]=-1;
        a[3][1]=-1;
        
        for (int j = 1; j <= t; j++) {
            int m = readInt();
            int x = readInt();
            int y = readInt();
            for (int i = m; i >= 1; i--) {
                int blockSz = (int)Math.pow(5,i-1);
                int bx = x/blockSz;
                int by = y/blockSz;
                if(a[bx][by]==1) {
                    System.out.println("crystal");
                    break;
                }  else if (a[bx][by]==0) {
                    System.out.println("empty");
                    break;
                } else {
                    if (i==1) {
                        System.out.println("empty");
                        break;
                    }
                    x = x%blockSz;
                    y = y%blockSz;
                }
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
