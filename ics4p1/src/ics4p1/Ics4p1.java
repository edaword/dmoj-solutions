/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ics4p1;
import java.io.*;
import java.util.*;
/**
 *
 * @author sonic
 */
public class Ics4p1 {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    
    static ArrayList<String> ls = new ArrayList<>();
    
    public static void main(String[] args) throws IOException {
        String n = next();
        print(n,"");
        Collections.sort(ls);
        for (String s: ls) {
            System.out.println(s);
        }
    }
    
    static void print(String s, String ans) {
        if (s.length()==0) {
            ls.add(ans);
            return;
        }
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            String ros = s.substring(0,i) + s.substring(i+1);
            print(ros,ans + c);
        }
    }
    
    static String next () throws OIException {
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
