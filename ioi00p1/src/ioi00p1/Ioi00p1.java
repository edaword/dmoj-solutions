package ioi00p1;
import java.util.*;
import java.io.*;

public class Ioi00p1 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
   
    public static void main(String[] args) throws IOException{
        int n = readInt();
        String s = readLine();
        ArrayList<Character> al = new ArrayList<>();
        char c;
        for(int i=0;i<n;i++) {
            c = s.charAt(i);
            if (al.contains(c)) {
                int pos = al.indexOf(c);
                al.remove(pos);
            } else {
                al.add(c);
            }
        }
        
        if (n%2==0) {
            System.out.println(al.size());
        } else {
            System.out.println(al.size()-1);
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
