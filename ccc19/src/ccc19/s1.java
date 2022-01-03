package ccc19;
import java.util.*;
import java.io.*;
public class s1 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	
	public static void main(String[] args) throws IOException{
		
		String s = readLine();
		long h = 0, v = 0;
		for (long i=0;i<s.length();i++) {
			if (s.charAt((int)i) == 'H') {
				h++;
			} else if(s.charAt((int)i) == 'V') {
				v++;
			}
		}
		
		if (h%2==0 && v%2==0) {
			System.out.println("1 2\n3 4");
		} else if (h%2==0 && v%2!=0) {
			System.out.println("2 1\n4 3");
		} else if (h%2!=0 && v%2==0) {
			System.out.println("3 4\n1 2");
		} else if (h%2!=0 && v%2!=0) {
			System.out.println("4 3\n2 1");
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
