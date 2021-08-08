package usaco19decbronze1;
import java.util.*;
import java.io.*;

public class Usaco19decbronze1 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        int k = readInt(), n = readInt();
        ArrayList<Integer>[] ans = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            ans[i] = new ArrayList<Integer>();
        }
        //for each line
        for (int i = 0; i < k; i++) {
            //all the numbers in the row
            int[] nums = new int[n];
            for (int j = 0; j < n; j++) {
                nums[j] = readInt();
            }
            //for each in nums
            for (int j = 0; j < n; j++) {
                //fill up
                int idx = nums[j]-1;
                if (ans[idx].isEmpty()) {
                    for (int l = j+1; l < n; l++) {
                        ans[idx].add(nums[l]);
                    }
                } else {
                    ArrayList<Integer> temp = new ArrayList();
                    for (int l = j+1; l < n; l++) {
                        temp.add(nums[l]);
                    }
                    for (int l = 0; l < ans[idx].size(); l++) {
                        //gets the number at position l
                        int x = ans[idx].get(l);
                        if (!temp.contains(x)) {
                            ans[idx].remove(l);
                        }
                    }
                }
            }
        }
        int output = 0;
        for (int i = 0; i < n; i++) {
            output+= ans[i].size();
        }
        System.out.println(output);
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
