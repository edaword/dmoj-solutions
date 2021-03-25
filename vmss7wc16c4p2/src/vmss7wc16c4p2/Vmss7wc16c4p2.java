package vmss7wc16c4p2;
import java.util.*;
import java.io.*;

public class Vmss7wc16c4p2 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    
    static int N, L;
    static List<String> list[];
    public static void main(String[] args) throws IOException{
        N = readInt(); L = readInt();
        list = new ArrayList[N+1];
        List<String> ans = new ArrayList();
        for (int i=1;i<=N;i++) {
            list[i] = new ArrayList();
            int m = readInt();
            for(int j=1;j<=m;j++) {
                list[i].add(next());
            }
            if (i>1) {
                list[i].add("");
            }
        }
        fun(1,"", ans);
        Collections.sort(ans);
        for (String word: ans) {
            System.out.println(word);
        }
    }
    
    static void fun(int id, String word, List<String> ans) {
        if (id>N||word.length()==L) {
            ans.add(word); return;
        }
        
        for (String x: list[id]) {
            fun(id+1, word+x, ans);
        }
    }
    
    static String next() throws IOException {
        while (st==null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine().trim());
        }
        return st.nextToken();
    }
    static long readLong() throws IOException {
        return Long.parseLong(next());
    }
    static int readInt() throws IOException {
        return Integer.parseInt(next());
    }
    static double readDouble() throws IOException {
        return Double.parseDouble(next());
    }
    static char readCharacter() throws IOException {
        return next().charAt(0);
    }
    static String readLine() throws IOException {
        return br.readLine().trim();
    }
    
}
