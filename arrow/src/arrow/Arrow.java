package arrow;
import java.io.*;
import java.util.*;

public class Arrow {

    static ArrayList<Range> targets = new ArrayList<>();
    static ArrayList<Point> points = new ArrayList<>();
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
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
            Path x = calc(points);
//            System.out.println("round: " + i);
//            System.out.println(x.a);
//            System.out.println(x.b);
            //check if path goes through all points
            for (int j=0;j<targets.size();j++) {
                boolean check = hit(x,targets.get(j));
                if (!check) {
//                    System.out.println("did not hit");
                    System.out.println(i-1);
                    return;
                }
            } 
        }
        System.out.println(n);
    }
    
    //check if path intersects with target
    static boolean hit (Path arrow, Range target) {
        double arrowY = (arrow.a * Math.pow(target.xVal, 2)) + (arrow.b * target.xVal);
        if (arrowY > target.max || arrowY < target.min) {
            return false;
        } else {
            return true;
        }
    }
    
    //calculate path with least squares
    static Path calc (ArrayList<Point> points) {
        
        //testing data - 5 points
        //(0,305)
        //(1,367)
        //(2,397)
        //(3,395)
        //(4,361)
        
        double sumX = 0, sumX2 = 0, sumX3 = 0, sumX4 = 0;
        double sumY = 0;
        double sumXY = 0, sumX2Y = 0;
        
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
        
        double a, b;
        a = ((sumX2Y * sumX2) - (sumXY * sumX3)) / ((sumX2 * sumX4) - Math.pow(sumX3,2));
        b = ((sumXY * sumX4) - (sumX2Y * sumX3)) / ((sumX2 * sumX4) - Math.pow(sumX3,2));

        Path p = new Path(a,b);
        return p;
    }
    
    static public class Path {
        double a, b;
        public Path (double a, double b) {
            this.a = a;
            this.b = b;
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
