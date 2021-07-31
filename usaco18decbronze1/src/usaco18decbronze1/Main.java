//package usaco18decbronze1;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Kattio io = new Kattio("mixmilk");

        int[] bucket = new int[3];
        int[] value = new int[3];
        for (int i = 0; i < 3; i++) {
            bucket[i] = io.nextInt();
            value[i] = io.nextInt();
        }
        for (int i = 0; i < 100; i++) {
            int diff = Math.min(value[i%3], bucket[(i+1)%3] - value[(i+1)%3]);
            value[i%3] -= diff;
            value[(i+1)%3] += diff;
        }

        for (int i = 0; i < 3; i++) {
//            System.out.println(value[i]);
                io.println(value[i]);
        }
        io.close();
    }

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
}