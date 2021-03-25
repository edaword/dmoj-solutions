
package tle16c6s1;
import java.util.*;
import java.io.*;
/**
 *
 * @author sonic
 */
public class Tle16c6s1 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int T = readInt(); Map<String, List<Integer>> map = new HashMap();
        List<String> type = new ArrayList();
        for (int i=1;i<=T;i++) {
            String t = readLine();
            type.add(t); map.put(t,new ArrayList());
        }
        int N = readInt();
        for (int i=1;i<=N;i++) {
            String t = readLine();
            map.get(t).add(i);
        }
        for (String t:type) {
            for (int id:map.get(t)) {
                System.out.println(id);
            }
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
