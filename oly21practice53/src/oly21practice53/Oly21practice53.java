package oly21practice53;

import java.util.*;
import java.io.*;
public class Oly21practice53 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
        
	public static void main(String[] args) throws IOException{
            int x = readInt(), y=readInt(), c, r;
            c = 0; r = 0;
            for (int i = 0; i < x/2+1; i++) {
                if (2*i + 4*(x-i) == y || 4*i + 2*(x-i) == y) {
                    System.out.println("Yes");
                    return;
                }
            }
            System.out.println("No");
            
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

//int x = readInt(), y=readInt(), c, r;
//            
//            c = 2*x - y/2;
//            r = y/2 - x;
//            if (r>x || c>x || r<0 || c<0) {
//                System.out.println("No");
//            } else {
//                System.out.println("Yes");
//            }