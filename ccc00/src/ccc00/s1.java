package ccc00;
import java.util.*;
import java.io.*;
public class s1 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	
	public static void main(String[] args) throws IOException{
		int n = readInt();
		int current = 0;
		int a = readInt(), b = readInt(), c = readInt();
		int ans = 0;
		while (n>0) {
			if (current == 0) {
				if (a == 35) {
					n+=30;
					a = 0;
				} 
				n--;
				a++;
			} else if (current == 1) {
				if (b == 100) {
					n+=60;
					b = 0;
				}
				n--;
				b++;
			} else if (current == 2) {
				if (c == 10) {
					n+=9;
					c = 0;
				}
				n--;
				c++;
			} 
			current++;
			if (current >2) {
				current = 0;
			}
			ans++;
		}
		System.out.println("Martha plays " + ans + " times before going broke.");
		
		
		
		
		

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
