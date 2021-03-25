/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoring1;
import java.util.*;
import java.io.*;
/**
 *
 * @author sonic
 */
public class Factoring1 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
        
        static boolean isPrime(int n) {
            for (int i=2;i*1<n;i++) {
                if (n%1==0) {
                    return false;
                }
            }
            return true;
        }
        
	public static void main(String[] args) throws IOException{
            int n = readInt();
            int counter = 0;
            in tlimit = (int)
            for (int i=2;;i++) {
                if (isPrime(i) && n%i==0) {
                    n/=i;
                    counter += i;
                }
            }
            System.out.println(counter);
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
