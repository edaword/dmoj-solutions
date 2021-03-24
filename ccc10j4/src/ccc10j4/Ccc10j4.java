package ccc10j4;
import java.util.*;
import java.io.*;
/**
 *
 * @author edwan2505
 */
public class Ccc10j4 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException{
        int k = 1;
        int[] dat;
        int[]nums;
        Stack stk = new Stack();
        boolean cont = true;
        while (cont) {
            k = readInt();
            if(k==0) {
                cont = false;
                break;
            }
            dat = new int[k];
            for (int s=0;s<k;s++) {
                dat[s]=readInt();
            }
            nums = new int[k-1];
            for (int i=k-2;i>=0;i--) {
                nums[i] = dat[i+1] - dat[i];
            }
            if (k)
            loops:
            for (int i=1;i<(nums.length/2)+1;i++) {
                int[]first = Arrays.copyOfRange(nums,0,i);
                int[]second = Arrays.copyOfRange(nums,i,i+i);
                if(Arrays.equals(first,second)) {
                    System.out.println(i);
                    break loops;
                } else if (i==nums.length/2) {
                    System.out.println(2*i);
                    break loops;
                }
            }
            
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
