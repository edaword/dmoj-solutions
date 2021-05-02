package dmopc20c5p1;
import java.util.*;
import java.io.*;
/**
 *
 * @author Edward Wang <https://github.com/edaword>
 */
public class Dmopc20c5p1 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException{
        String a = readLine(), b = readLine();
        int cnt = 0;
        int minLength = Math.min(a.length(), b.length());
        while (cnt<minLength && a.charAt(cnt)==b.charAt(cnt)) {
            cnt++;
        }
        System.out.println(a.length() + b.length() - (2*cnt));
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
