package vmss7wc15c1p2;
import java.util.*;
import java.io.*;
/**
 *
 * @author debabey
 */
public class Vmss7wc15c1p2 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    
    
    public static void main(String[] args) throws IOException{
        
        for (int T = readInt(); T>0;T--) {
            int n = readInt(), a[] = new int[n+1];
            for (int i=1;i<=n;i++) a[i] = readInt();
            int swap = 0;
            for (int k=1;k<n;k++) {
                for (int i=1;i+k<=n; i++) {
                    if (a[i] > a[i+1]) {
                        int tmp = a[k]; a[k] = a[k+1]; a[k+1] = tmp;
                        swap++;
                    }
                }
                
            }
            System.out.println(swap);
        }
        
        
//        int n = readInt();
//        for (int i=0;i<n;i++) {
//            int l = readInt(), a[] = new int[l];
//            for (int j = 0; j < l; j++) {
//                a[j] = readInt();
//            }
//            int swap = 0;
//            for (int j = 1; j < n; j++) {
//                for (int k = 1; k <=n; k++) {
//                    if (a[k] > a[k+1]) {
//                        int tmp = a[k]; a[k] = a[k+1]; a[k+1] = tmp;
//                        swap++;
//                    }
//                }
//            }
//        }
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
