package ecoo07r3p1;
import java.util.*;
import java.io.*;
/**
 *
 * @author edward
 */
public class Ecoo07r3p1 {
        static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
        
        static boolean isPrime(int n) {
            for (int i=2;i*i<=n;i++) {
                if (n%i==0) {
                    return false;
                }
            }
            return true;
        }
        
	public static void main(String[] args) throws IOException{
            for (int i=0;i<5;i++) {
                int n = readInt();
                System.out.print(n + " = ");
                if (isPrime(n)) {
                    System.out.println(n);
                } else if (n % 2 ==0) {
                    for (int p=n/2;p>=3;p--) {
                        if (isPrime(p) && isPrime(n-p)) {
                            System.out.println(p + " + " + (n-p));
                            break;
                        }
                    }
                } else {
                    loops:
                    for (int p=n/3;p>=3;p--) {
                        if(!isPrime(p)) {
                            continue;
                        }
                        int x = n-p; boolean found = false;
                        for (int q=x/2;q>=p;q--) {
                            if (isPrime(q) && isPrime(x-q)) {
                                System.out.println(p + " + " + q + " + " + (x-q));
                                break loops;
                            }
                        }
                    }
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
