package mccc1s2;
import java.util.*;
import java.io.*;

public class Mccc1s2 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int n;
        n = readInt();
        boolean[][]t=new boolean[n][n];
        List<String>ans=new ArrayList();
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                int x = readInt();
                t[i][j] = (x==1);
            }
        }

        //flip cols
        for(int j=0;j<n;j++) {
            if(t[0][j]) {
                ans.add("C " + (j+1));
                for(int i=0;i<n;i++) {
                    t[i][j] = !t[i][j];
                }
            }
        }

        //flip rows
        for(int i=0;i<n;i++) {
            if(t[i][0]) {
                ans.add("R " + (i+1));
                for(int j=0;j<n;j++) {
                    t[i][j] = !t[i][j];
                }
            }
        }

        int left = 0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(t[i][j]) {
                    left++;
                }
            }
        }
        if(left>0) {
            System.out.println(-1);
        } else {
            System.out.println(ans.size());
            for (String x : ans) {
                System.out.println(x);
            }
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
