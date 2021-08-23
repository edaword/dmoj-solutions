package usaco20janbronze1;
import java.util.*;
import java.io.*;

public class Usaco20janbronze1 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        int n = readInt(), k = readInt();
        String[] words = new String[n];
        ArrayList<String> ans = new ArrayList();
        for (int i = 0; i < n; i++) {
           words[i] = next(); 
        }
        String line = "";
        for (int i = 0; i < n; i++) {
            String word = words[i];
            String temp = line.replaceAll("\\s+", "");
            int len = temp.length() + word.length();
            if (len<=k) {
                line += word + " ";
            } else {
                ans.add(line);
                line = word + " ";
            }
            if (i==n-1) {
                ans.add(line);
            }
        }
        for (String x : ans) {
            System.out.println(x.trim());
        }
    }
    
    static void dbg(String s, int x) {
//        System.out.println(s + " " + x);
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
