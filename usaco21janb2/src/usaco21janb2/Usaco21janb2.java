/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usaco21janb2;
import java.util.*;
import java.io.*;
/**
 *
 * @author sonic
 */
public class Usaco21janb2 {

        static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
        
        static int group(int o, int e) {
            int diff = o-e;
            if (diff == 0) {
                return o+e;
            } else if (diff==1) {
                return o+e-2;
            } else if (diff==2) {
                return e + o -1;
            } else {
                o -= 2;
                e+=1;
                return group(o,e);
            }
        }
        
	public static void main(String[] args) throws IOException{
            int n;
            n = readInt();
            int odd, even;
            odd = 0;
            even = 0;
            for (int i=0;i<n;i++) {
                int x = readInt();
                if (x % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
            if (even > odd) {
                System.out.println(2*odd + 1);
            } else {
                System.out.println(group(odd,even));
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
