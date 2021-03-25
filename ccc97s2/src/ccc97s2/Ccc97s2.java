/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccc97s2;
import java.io.*;
import java.util.*;
/**
 *
 * @author sonic
 */
public class Ccc97s2 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
   
    public static void main(String[] args) throws IOException{
        int n = readInt();
            for(int i=1; i<=n; i++) {
                Set<Integer> sum = new HashSet(), dif = new HashSet();
                int x = readInt();  boolean flag = false;
                for(int j=1; j*j <= x; j++) {
                    if(x % j == 0) {
                        int a = j , b = x / j;
                        if(dif.contains(a+b) || sum.contains(b - a)) {
                            flag = true;
                            break;
                        }
                        sum.add(a+b); dif.add(b-a);
                    }
                }
                if(flag) System.out.println(x + " is nasty");
                else System.out.println(x + " is not nasty");
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



//int n = readInt();
//        for (int i = 0; i < n; i++) {
//            Set<Integer> sum = new HashSet(), dif = new HashSet();
//            int x = readInt();
//            boolean flag = false;
//            for(int j=1;j*j<=x;j++) {
//                if (x%j==0) {
//                    int a = j, b = x/j;
//                    if (dif.contains(a+b) || sum.contains(b-a)) {
//                        flag = true;
//                        break;
//                    }
//                    sum.add(a+b);
//                    dif.add(b-a);
//                }
//                if (flag) {
//                    System.out.println(x + " is nasty");
//                } else {
//                    System.out.println(x + " is not nasty");
//                }
//            }
//        }