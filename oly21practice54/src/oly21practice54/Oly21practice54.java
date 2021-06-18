package oly21practice54;
import java.util.*;
import java.io.*;
public class Oly21practice54 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
        
	public static void main(String[] args) throws IOException{
            int x = readInt(), n=readInt();
            Set<Integer> nums = new HashSet();
            for (int i = 0; i < n; i++) {
                nums.add(readInt());
            }
            int gap = 0;
            while (true) {
                if (!nums.contains(x-gap)) {
                    System.out.println(x-gap);
                    return;
                } else if (!nums.contains(x+gap)) {
                    System.out.println(x+gap);
                    return;
                }
                gap++;
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

//int x = readInt(), n=readInt(), spot=0,last=0;
//            int[] nums = new int[n];
//            ArrayList<Integer> holes = new ArrayList();
//            for (int i = 0; i < n; i++) {
//                int number = readInt();
//                if (number==x) {
//                    spot = i;
//                }
//                
//                if (number-last>1) {
//                    if (number < x) {
//                        holes.add(number);
//                    } else {
//                        holes.add(last);
//                    }
//                }
//                
//                nums[i] = number;
//                last = number;
//            }
//            int diff, min=0, minDiff=Integer.MAX_VALUE;
//            for (int hole : holes) {
//                diff = Math.abs(x-hole);
//                if (diff<minDiff) {
//                    min = hole;
//                    minDiff = diff;
//                }
//            }
//            System.out.println(min);
