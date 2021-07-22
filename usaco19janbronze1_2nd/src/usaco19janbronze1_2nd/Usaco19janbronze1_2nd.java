package usaco19janbronze1_2nd;
import java.util.*;
import java.io.*;

public class Usaco19janbronze1_2nd {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        int n;
        n = readInt();
        System.out.println(n);
        int[] spots = new int[3];
        int[] guesses = new int[3];
        for	(int i=0;i<3;i++) {
        	spots[i] = i;
        }
        
        for (int i=0;i<n;i++) {
            int first = readInt()-1, second = readInt()-1, guess = readInt()-1;
            int hold = spots[second];
            spots[second] = first;
            spots[first] = hold;
            guesses[spots[guess]]++;
        }
        
        System.out.println(Math.max(guesses[0], Math.max(guesses[1], guesses[2])));
    }
    
   

    static String next () throws IOException {
            while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine().trim());
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
