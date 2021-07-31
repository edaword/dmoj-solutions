//package usaco15decbronze2;
import java.io.*;
import java.util.*;

public class Usaco15decbronze2 {
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
            io = new Kattio("speeding");
        } catch(IOException e) {}
    }
    public static void main(String[] args) {
        int n = io.nextInt(),m = io.nextInt();
        Pair[] na = new Pair[n],ma = new Pair[m];
        int[] limits = new int[100], bspeed = new int[100];
        for (int i = 0; i < n; i++) {
            na[i] = new Pair(io.nextInt(), io.nextInt());
        }
        for (int i = 0; i < m; i++) {
            ma[i] = new Pair (io.nextInt(), io.nextInt());
        }
        int limC=0, bC = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < na[i].a; j++) {
                limits[limC] = na[i].b;
                limC++;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < ma[i].a; j++) {
                bspeed[bC] = ma[i].b;
                bC++;
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 100; i++) {
            max = Math.max(max, Math.max(0,bspeed[i]-limits[i]));
        }
        io.println(max);
        io.close();
    }
}

class Pair {
    int a, b;
    public Pair (int a, int b) {
        this.a = a; this.b = b;
    }
}