/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alexquiz2;
import java.util.*;
import java.io.*;
/**
 *
 * @author sonic
 */
public class Alexquiz2 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;


    public static void main(String[] args) throws IOException{
        int maxV = (int)1e5; 
        boolean f[] = new boolean[maxV+1];
        long psa[] = new long[maxV+1];
        for (int i=2;i<maxV;i++) {
            psa[i] = psa[i-1];
            if(!f[i]) {
                psa[i] +=i;
                for(int j=2*i;j<=maxV;j+=i) {
                    f[j] = true;
                }
            }
        }
        for(int Q = readInt(); Q>0;Q--) {
            int a = readInt(); 
            int b = readInt();
            System.out.println(psa[b] - psa[a-1]);
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
