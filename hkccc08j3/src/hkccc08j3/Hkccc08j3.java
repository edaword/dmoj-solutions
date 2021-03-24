package hkccc08j3;
import java.util.*;
import java.io.*;
/**
 *
 * @author edwan2505
 */
public class Hkccc08j3 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException{
        int n = readInt();
        Map<Integer,Pair> m = new HashMap<>();
        for(int i=0;i<n;i++) {
            Pair p = new Pair(next(), 0);
            m.put(readInt(),p);
        }
        
        int d = readInt();
        for(int i=0;i<d;i++) {
            int num = readInt();
            Pair p = m.get(num);
            if (p!=null) {
                p.t++;
                m.replace(num,p);
            }
        }
        
        Pair max = new Pair ("",-1);
        
        for (Pair c : m.values()) {
            if (c.t > max.t) {
                max.t = c.t;
                max.name = c.name;
            }
        }
        
        System.out.println(max.name);
    }
    
    static class Pair implements Comparable<Pair> {
        String name;
        int t;
        Pair (String name , int t) {
            this.name = name;
            this.t = t;
        }
        public int compareTo(Pair x) {
            return Integer.compare(t,x.t);
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

