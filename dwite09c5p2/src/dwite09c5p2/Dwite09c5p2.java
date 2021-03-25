package dwite09c5p2;
import java.util.*;
import java.io.*;
/**
 *
 * @author edward
 */
public class Dwite09c5p2 {
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
                int n,a,b;
                n = readInt();
                a = n;
                b = n;
                boolean cont = true;
                int ac,bc;
                ac = 0;
                bc = 0;
                while (cont) {
                    a--;
                    b++;
                    if (isPrime(a)&&isPrime(b)) {
                        if (ac==1&&bc==1) {
                            cont = false;
                            if (a>b) {
                                System.out.println(a);
                            } else if (b > a) {
                                System.out.println(b);
                            }
                        } else if (ac ==1) { 
                            cont = false;
                            System.out.println(a);
                        } else if (bc == 1) {
                            cont = false;
                            System.out.println(b);
                        }
                        else {
                            ac++;
                            bc++;
                        }
                    } else if (isPrime(a)) {
                        if (ac==1) {
                            cont = false;
                            System.out.println(a);
                        } else {
                            ac++;
                        }
                    } else if (isPrime(b)) {
                        if (bc==1) {
                            cont = false;
                            System.out.println(b);
                        } else {
                            bc++;
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
