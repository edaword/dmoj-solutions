package ccoprepp3p3;
import java.io.*;
import java.util.*;
public class Ccoprepp3p3 {
    public static void main(String[] args) {
        double a, b;
        Range t = new Range(5,6,3);
        Path arrow = new Path(0.5,6);
        System.out.println(dist(arrow,t));
    }
    
    //y = -A(x)(x-B)
    //where 
    static double dist (Path arrow, Range target) {
        double arrowY = -1 * arrow.a * target.xVal * (target.xVal-arrow.b);
        if (arrowY > target.max) {
            return arrowY - target.max;
        } else if (arrowY < target.min) {
            return target.min - arrowY;
        } else {
            return 0;
        }
    }
    
    static Path regresison (Path arrow, Range target) {
        double rate = 10;
        double current = dist(arrow,target);
        if (current > 0) {
            Path plusA = new Path(arrow.a + arrow.a/rate, arrow.b);
            if (dist(plusA, target) < current) {
                
            }
        }
        
    }
    
    static public class Path {
        double a, b;
        public Path (double a, double b) {
            this.a = a;
            this.b = b;
        }
    }
    
    static public class Range {
        int max, min, xVal;
        public Range (int m, int n, int x) {
            min = m;
            max = n;
            xVal = x;
        }
    }
    
}
