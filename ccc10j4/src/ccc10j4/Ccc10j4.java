package ccc10j4;
import java.util.*;
import java.io.*;

public class Ccc10j4 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;


    public static void main(String[] args) throws IOException{
        while(true) {
            int n = readInt();
            if(n == 0) {
                break;
            }
            //numbers
            int [] t = new int[n];
            int[]dif = new int[n-1];
            //read numbers in
            for(int i=0; i<n; i++)
                t[i] = readInt();
            //if its only 1 long, there is no pattern
            if(n == 1) {
                System.out.println(0);
            }else {
                //make difference array
                for(int i=0; i<dif.length; i++) {
                    dif[i] = t[i+1] - t[i];
                }
                int cyc = 1;
                //iterate through diff array
                for(cyc = 1; cyc < dif.length; cyc++) {
                    //looks for repeat of the first difference
                    if(dif[cyc] != dif[0]) {
                        continue;
                    }
                    boolean flag = true;
                    //iterate through diff
                    for(int i=0; i<dif.length; i++) {
                        //if there are differences between first cyc and second, keep going
                        //right now i is 0 and cyc is 3
                        //i=0 0%3=0 - flag = true
                        //i=1 1%3=1 - flag = true
                        //i=2 2%3=2 - flag = true
                        //i=3 3%3=0 - flag = true (dif[3] == dif[0])
                        //i=4 4%3=1 - flag = true (dif[4] == dif[1])
                        //i=5 5%3=2 - flag = true (dif[5] == dif[2])
                        if(dif[i] != dif[i % cyc]) {
                            flag = false;
                        }
                    }
                    //otherwise, stop because it is the right answer
                    if(flag) {
                        break;
                    }
                }
                System.out.println(cyc);
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
