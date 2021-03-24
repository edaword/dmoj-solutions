package ccc21s2;
import java.util.*;
import java.io.*;
/**
 *
 * @author edwan2505
 */
public class Ccc21s2 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        int m,n,k;
        m = readInt();
        n = readInt();
        k = readInt();
        
        //HOW MANY ROWS (4)
        int[] row = new int[m];
        //HOW MANY COLUMNS (5)
        int[] col = new int[n];
        for (int i=0;i<k;i++) {
            String com;
            int pos;
            com = next();
            pos = readInt() - 1;
            
            if (com.equals("R")) {
                row[pos]++;
            } else if (com.equals("C")) {
                col[pos]++;
            }
        }
        
        int oc, or;
        int ec, er;
        oc = 0;
        or = 0;
        ec = 0;
        er = 0;
        for (int j=0;j<m;j++) {
            if (row[j]%2==0) {
                er++;
            } else {
                or++;
            }
        }
        
        for (int a=0;a<n;a++) {
            if (col[a]%2==0) {
                ec++;
            } else {
                oc++;
            }
        }
        
        int ans;
        ans = (m * oc) + (n * or) - 2*(oc*or);
        System.out.println(ans);
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
