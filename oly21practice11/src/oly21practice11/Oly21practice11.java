package oly21practice11;
import java.util.*;
import java.io.*;

public class Oly21practice11 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        
        int n = readInt();
        int[] ls = new int[n];
        for (int i=0;i<n;i++) {
            ls[i] = readInt();
        }
        
        int start=0, end=0, max1;
        max1 = count(ls,start,end);
        
        for (int i=start;i<=end;i++) {
            if (ls[i]==1) {
                ls[i] = 0;
            } else {
                ls[i] = 1;
            }
        }
        
        int max2 = count(ls,0,0);
        
        System.out.println(max2);
        
    }
    
    static int count (int[]ls, int start, int end) {
        int max, cnt;
        max = 0; cnt = 0; end = 0;
        for (int i=1;i<ls.length;i++) {
            if (ls[i] != ls[i-1]) {
                cnt++;
            } else {
                if (cnt > max) {
                    max = cnt;
                    end = i;
                }
                cnt = 0;
            }
        }
        end--;
        start = end - max;
        return max;
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
