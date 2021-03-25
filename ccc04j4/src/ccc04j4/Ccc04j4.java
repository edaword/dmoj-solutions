package ccc04j4;
import java.util.*;
import java.io.*;

public class Ccc04j4 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static String code, word;
    public static void main(String[] args) throws IOException{
        code = next().toUpperCase().replaceAll(" ", "").replaceAll("[^a-zA-Z0-9]","");
        word = readLine().toUpperCase().replaceAll(" ", "").replaceAll("[^a-zA-Z0-9]","");
        int cnt = 0;
        for (int i=0;i<word.length();i++) {
            if (cnt >= code.length()) {
                cnt = 0;
            }
            int add = 0;
            int iC = code.charAt(cnt) - 'A';
            int iW = word.charAt(i) - 'A';
            
            if (iC + iW > 26) {
                add = code.charAt(cnt) - 'A' - 26;
            } else {
                add = code.charAt(cnt) - 'A';
            }
            
            char ou = (char)(word.charAt(i) + add);
            System.out.print(ou);
            cnt++;
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
