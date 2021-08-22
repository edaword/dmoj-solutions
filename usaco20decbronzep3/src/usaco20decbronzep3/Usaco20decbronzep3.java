package usaco20decbronzep3;
import java.util.*;
import java.io.*;

class cow {
    int x,  y;
    String dir;
    boolean blocked;
    public cow (int a, int b, String direction, boolean isblocked) {
        x=a;y=b;
        dir = direction;
        blocked = isblocked;
    }
}

public class Usaco20decbronzep3 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        int start = readInt();
        ArrayList<cow> east = new ArrayList();
        ArrayList<cow> north = new ArrayList();
        for (int i = 0; i < start; i++) {
            String direction = next();
            int x = readInt(), y = readInt();
            if (direction.equals("E")) {
                east.add(new cow(x,y,direction,false));
            } else {
                north.add(new cow(x,y,direction,false));
            }
        }
        for (int i = 0; i < north.size(); i++) {
            for (int j = i+1; j < east.size(); j++) {
                cow n = north.get(i), e = east.get(j);
                if (n.x<e.x || n.y>e.y) {
                    continue;
                }
                if (n.blocked || e.blocked) {
                    continue;
                }
                int xCross = n.x, yCross = e.y;
                int eDist = xCross - e.x; 
                int nDist = yCross - n.y;
                if (eDist>nDist) {
                    e.blocked = true;
                    System.out.println(eDist);
                } else if (nDist>eDist) {
                    n.blocked = true;
                    System.out.println(nDist);
                }
            }
        }
        for (cow x : north) {
            if (x.blocked = false) {
                System.out.println("Infinity");
            }
        }
        for (cow x : east) {
            if (x.blocked = false) {
                System.out.println("Infinity");
            }
        }
    }
    
    static void dbg(String s, int x) {
//        System.out.println(s + " " + x);
    }

    static String next () throws IOException {
            while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine().trim());
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
