//package usaco2016decbronze2;
import java.io.*;
import java.util.*;

public class Usaco2016decbronze2 {
    //BeginCodeSnip{Kattio}
    static class Kattio extends PrintWriter {
        private BufferedReader r;
        private StringTokenizer st;

        // standard input
        public Kattio() { this(System.in, System.out); }
        public Kattio(InputStream i, OutputStream o) {
            super(o);
            r = new BufferedReader(new InputStreamReader(i));
        }
        // USACO-style file input
        public Kattio(String problemName) throws IOException {
            super(new FileWriter(problemName + ".out"));
            r = new BufferedReader(new FileReader(problemName + ".in"));
        }

        // returns null if no more input
        public String next() {
            try {
                while (st == null || !st.hasMoreTokens())
                    st = new StringTokenizer(r.readLine());
                return st.nextToken();
            } catch (Exception e) { }
            return null;
        }

        public int nextInt() { return Integer.parseInt(next()); }
        public double nextDouble() { return Double.parseDouble(next()); }
        public long nextLong() { return Long.parseLong(next()); }
    }
    //EndCodeSnip
    static Kattio io;
    static {
        try {
            io = new Kattio("blocks");
        } catch(IOException e) {}
    }
    public static void main(String[] args) {
        int N = io.nextInt();
        int[] ans = new int[26];
        
        for (int i = 0; i < N; i++) {
            int[] ar = new int[26];
            int[] br = new int[26];
            int[] sum = new int[26];
            String a=io.next(), b=io.next();
            for (int j = 0; j < a.length(); j++) {
                ar[(int)(a.charAt(j) - 97)]++;
            }
            for (int j = 0; j < b.length(); j++) {
                br[(int)(b.charAt(j) - 97)]++;
            }
            for (int j = 0; j < 26; j++) {
                sum[j] = Math.max(ar[j], br[j]);
            }
            for (int j = 0; j < 26; j++) {
                ans[j] += sum[j];
            }
        }
//        io.println("ASDASDSAd");
        for (int i = 0; i < 26; i++) {
            io.println(ans[i]);
        }
        io.close();
    }
}

class Pair {
    String a, b;
    public Pair (String c, String d) {
        a = c;
        b = d;
    }
}
