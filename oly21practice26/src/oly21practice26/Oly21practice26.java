package oly21practice26;
import java.util.*;
import java.io.*;

public class Oly21practice26 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        
        int n = readInt();
        
        Square[] can = new Square[n];
        for (int i=0;i<n;i++) {
            int x = readInt(), y = readInt(), w = readInt(), h = readInt();
            Square temp = new Square(x,y,x+w,y+h);
            can[i] = temp;
        }
        
        int x = readInt(), y = readInt();
        for (int i=n-1;i>=0;i--) {
            Square cur = can[i];
            if (x <= cur.x2 && x >= cur.x1 && y<=cur.y2 && y >= cur.y1) {
                System.out.println(i+1);
                break;
            }
            if (i==0) {
                System.out.println(-1);
            }
        }
    }
    
    static class Square {
        int x1,y1,x2,y2;
        Square (int x1, int y1, int x2, int y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
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
