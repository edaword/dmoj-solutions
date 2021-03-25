/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac20p1;
import java.util.*;
import java.io.*;
/**
 *
 * @author sonic
 */
public class Ac20p1 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
        
	public static void main(String[] args) throws IOException{
            int n = readInt();
            for (int i=0;i<n;i++) {
                double a,b,c;
                a = readDouble();
                b = readDouble();
                c = readDouble();
                double max = Double.MIN_VALUE;
                double min = 0;
                max = Math.max(max,a);
                max = Math.max(max,b);
                max = Math.max(max,c);
                if (max == a) {
                    min = b*b + c*c;
                } else if (max ==b) {
                    min = a*a + c*c;
                } else if (max==c) {
                    min = a*a+b*b;
                }
                max = Math.pow(max,2);
                if (max == min) {
                    System.out.println("R");
                } else if (max>min) {
                    System.out.println("O");
                } else if (max<min) {
                    System.out.println("A");
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










//double max = Double.MIN_VALUE;
//                double min = 0;
//                max = Math.max(max,a);
//                max = Math.max(max,b);
//                max = Math.max(max,c);
//                if (max == a) {
//                    min = b*b + c*c;
//                } else if (max ==b) {
//                    min = a*a + c*c;
//                } else if (max==c) {
//                    min = a*a+b*b;
//                }
//                max *=max;
//                if (max == min) {
//                    System.out.println("R");
//                } else if (max>min) {
//                    System.out.println("O");
//                } else if (max<min) {
//                    System.out.println("A");
//                }