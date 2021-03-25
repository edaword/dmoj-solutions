package ccc21j3;
import java.util.*;
import java.io.*;
/**
 *
 * @author sonic
 */
public class Ccc21j3 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
   
    public static void main(String[] args) throws IOException{
        while (true) {
            String s = readLine();
            String last = "";
            if (s.equals("99999")) {
                break;
            } else {
                int a, b;
                a = Integer.parseInt(s.substring(0,1));
                b = Integer.parseInt(s.substring(1,2));
                int dir = a + b;
                if (dir%2==0) {
                    System.out.println("right " + s.substring(2));
                    last = "right";
                } else if (dir==0) {
                    System.out.println(last + " " + s.substring(2));
                } else {
                    last = "left";
                    System.out.println("left " + s.substring(2));
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
