package arrow;
import java.io.*;
import java.util.*;

public class Arrow {

    static ArrayList<Range> targets = new ArrayList<>();
    static ArrayList<Point> points = new ArrayList<>();
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        Path x;
        
        int n = readInt();
        loops:
        for (int i = 1; i <= n; i++) {
            //read in points
            int xVal = readInt();
            int min = readInt();
            int max = readInt();
            Point lowPoint = new Point (xVal, min);
            Point hiPoint = new Point (xVal, max);
            Range target = new Range (xVal, min, max);
            targets.add(target);
            points.add(lowPoint);
            points.add(hiPoint);
            //calculate path
            x = calc(points);
            System.out.println("round: " + i);
            System.out.println(x.a);
            System.out.println(x.b);
            System.out.println(x.c);
            System.out.println("");
            //check if path goes through all points
            for (int j=0;j<targets.size();j++) {
                boolean check = hit(x,targets.get(j));
                if (!check) {
                    System.out.println(i);
                    break loops;
                }
            } 
            if (i==n-1) {
                System.out.println(i);
            }
        }
        
//        Range r = new Range(2,8,12); targets.add(r); 
//        r = new Range (5,4,5); targets.add(r); 
//        r = new Range (3,8,10); targets.add(r); 
//        r = new Range (6,2,3); targets.add(r); 
//        r = new Range (1,3,7); targets.add(r);
    
    }
    
    static boolean hit (Path arrow, Range target) {
        double arrowY = (arrow.a * Math.pow(target.xVal, 2)) + (arrow.b * target.xVal) + arrow.c;
        if (arrowY > target.max || arrowY < target.min) {
            return false;
        } else {
            return true;
        }
    }
    
    static Path calc (ArrayList<Point> points) {
        
        //testing data - 5 points
        //(0,305)
        //(1,367)
        //(2,397)
        //(3,395)
        //(4,361)
        
        //step 1
        double sumX = 0, sumX2 = 0, sumX3 = 0, sumX4 = 0;
        double sumY = 0;
        double sumXY = 0, sumX2Y = 0;
        
        //step 2
        double xx , xx2, x2x2;
        double xy, x2y;
        
        double n = points.size();
        
        sumX = 0;
        for (int i=0;i<n;i++) {
            sumX += points.get(i).xVal; // 10
            sumY += points.get(i).yVal; // 1825
            sumX2 += Math.pow(points.get(i).xVal, 2); // 30
            sumX3 += Math.pow(points.get(i).xVal,3); // 100
            sumX4 += Math.pow(points.get(i).xVal,4); // 354
            sumXY += (points.get(i).xVal) * (points.get(i).yVal); // 3790
            sumX2Y += Math.pow(points.get(i).xVal,2) * points.get(i).yVal; //11286
        }
        
        xx = sumX2 - (sumX * sumX)/n; //10
        xy = sumXY - (sumX * sumY)/n; //140
        xx2 = sumX3 - (sumX2 * sumX)/n; //40
        x2y = sumX2Y - (sumX2 * sumY)/n; //336
        x2x2 = sumX4 - (sumX2 * sumX2)/n; //174
        
        double a, b, c;
        a = ((x2y * xx) - (xy * xx2))/((xx * x2x2) - (xx2 * xx2)); // -16
        b = ((xy * x2x2) - (x2y * xx2))/((xx * x2x2) - (xx2 * xx2)); // 78
        c = ((sumY / n) - (b * (sumX/n)) - (a * (sumX2/n))); // 305
//        c =0;
        Path p = new Path(a,b,c);
        return p;
    }
    
    static public class Path {
        double a, b,c;
        public Path (double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    
    static public class Point {
        int xVal, yVal;
        public Point (int x, int y) {
            xVal = x;
            yVal = y;
        }
    }
    
    static public class Range {
        
        int xVal, min, max;
        
        public Range (int x, int min, int max) {
            xVal = x;
            this.min = min;
            this.max = max;
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
