package ccc05j5;
import java.util.*;
import java.io.*;
/**
 *
 * @author sonic
 */
public class Ccc05j5 {

    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        while (true) {
            String s = readLine();
            if(s.equals("X")) break;
            while(s.indexOf("ANA")!= -1 || s.indexOf("BAS") != -1)  {
                s.replaceAll("ANA|BAS", "A");
            }
            System.out.println(s.equals("A")?"YES" : "NO");
            break;
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
