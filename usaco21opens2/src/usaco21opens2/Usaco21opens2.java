/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usaco21opens2;
import java.util.*;
import java.io.*;
/**
 *
 * @author Edward Wang<https://github.com/edaword>
 */
public class Usaco21opens2 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
   
    public static void main(String[] args) throws IOException{
        for (int T = readInt(); T>0;T--) {
            int n = readInt(), x[] = new int[n]; Set<Integer> set = new TreeSet();
            for (int i=0;i<n;i++) {
                x[i] = readInt(); set.add(x[i]);
                for (int j = 0; j < i; j++) {
                    set.add(Math.abs(x[i]-x[j]));
                }
            }
            List<Integer> lst = new ArrayList(set); int ans = 0;
            for (int i=0;i<lst.size();i++) {
                for(int j=i;j<lst.size();j++) {
                    for (int k=j;k<lst.size();k++) {
                        int a = lst.get(i), b = lst.get(j), c = lst.get(k);
                        List<Integer> tmp = Arrays.asList(a,b,c,a+b,b+c,a+n+c); boolean flag = true;
                        for(int l=0;l<n;l++) {
                            if (tmp.indexOf(x[l])==-1) flag = false;
                        }
                        if (flag) ans++;
                    }
                }
            }
            System.out.println(ans);
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
