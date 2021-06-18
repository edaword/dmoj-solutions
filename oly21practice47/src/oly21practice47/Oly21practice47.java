package oly21practice47;

import java.util.*;
import java.io.*;
public class Oly21practice47 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
        
	public static void main(String[] args) throws IOException{
            String a = readLine(), b=readLine();
            int cnt = 0;
            for (int i = 0; i < Math.min(a.length(), b.length()); i++) {
                if ((a.charAt(i)!=b.charAt(i))) {
                    cnt++;
                    if (a.length()>b.length()) {
                        a.replaceFirst(a.substring(1),"");
                    } else {
                        b.replaceFirst(b.substring(1),"");
                    }
                }
                if (cnt>1) {
                    System.out.println("No");
                    return;
                } 
            }
            System.out.println("Yes");
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
