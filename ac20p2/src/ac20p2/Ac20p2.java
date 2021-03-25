/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac20p2;
import java.util.*;
import java.util.ArrayList;
import java.io.*;
/**
 *
 * @author sonic
 */
public class Ac20p2 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
        
	public static void main(String[] args) throws IOException{
            long n, q;
            n = readLong();
            q = readLong();
            ArrayList dou = new ArrayList();
            for (int j=0;j<n;j++) {
                dou.add(readDouble());
            }
            System.out.println(dou);
            for (int i=0;i<q;i++) {
                int counter =0;
                int act;
                long ball;
                act = readInt();
                ball = readLong();
                if (act == 1) {
                    dou.removeAll(ball);
                    dou.add(ball/2);
                    dou.add(ball/2);
                } else if (act ==2) {
                    for (int j=0;j<dou.size();j++) {
                        System.out.println("IM AT " + j);
                        if ((long) (dou.get(j)) == ball) {
                           counter++;
                       } 
                    }
                    System.out.println(counter);
                }
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
