package valentines18j5s2;
import java.util.*;
import java.io.*;
/**
 *
 * @author sonic
 */
public class Valentines18j5s2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    
    static int n,m,price[],deal[],a[][],need[],ans = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException{
        n = readInt(); m = readInt(); price = new int[n+1]; deal = new int[m+1]; a = new int[m+1][n+1]; need = new int[n+1];
        for (int i = 1; i <= n; i++) {
            price[i] = readInt();
        }
        for (int i = 1; i <=m; i++) {
            deal[i] = readInt();
            for (int j = 1; j <=n; j++) {
                a[i][j] = readInt();
            }
        }
        for (int i = 1; i <=n; i++) {
            need[i] = readInt();
        }
        List<Integer> comb = new ArrayList();
        getComb(1,comb);
        System.out.println(ans);
    }
    
    static void getComb(int id, List<Integer> comb) {
        if (id > m) {
            int cnt[] = new int[n+1], cost = 0;
            for(int x : comb) {
                cost += deal[x];
                for (int i = 1; i <= n; i++) {
                    cnt[i] += a[x][i];
                    if(cnt[i] > need[i]) return;
                }
            }
            for (int i=1;i<=n;i++) {
                cost+=(need[i]-cnt[i]) * price[i];
            }
            ans = Math.min(ans,cost); return;
        }
        getComb(id+1,comb);
        comb.add(id); getComb(id+1, comb); comb.remove(comb.size()-1);
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
