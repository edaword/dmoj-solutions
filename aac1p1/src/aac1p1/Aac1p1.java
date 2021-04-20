package aac1p1;
import java.util.*;
import java.io.*;
/**
 *
 * @author Edward Wang<https://github.com/edaword>
 */
public class Aac1p1 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException{
        int a = readInt(), b = readInt();
        if (a*a> (double) 3.14 * b * b) {
            System.out.println("SQUARE");
        } else {
            System.out.println("CIRCLE");
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
