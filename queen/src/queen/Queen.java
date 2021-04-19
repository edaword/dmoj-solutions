/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queen;
import java.util.*;
/**
 *
 * @author Edward Wang <https://github.com/edaword>
 */

public class Queen {
    static int n, row[]; static boolean col[], left[],right[];
    static         int count = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt(); row = new int[n]; col = new boolean[n]; left = new boolean[2*n-1]; right = new boolean[2*n-1];
        putQ(0);
        System.out.println("there are " + count + " solutions");
    }
    
    static void putQ(int r) {
        if (r==n) {
            System.out.println("==================================");
            for (int i=0;i<n;i++) {
                for (int j=0;j<n;j++) {
                    if (j==row[i]) System.out.print("Q ");
                    else System.out.print(". ");
                }
                System.out.println("");
            }
            count++; return;
        } 
        for(int c=0;c<n;c++) {
            if (!col[c] && !left[r+c] && !right[r+n-1-c]) {
                row[r] = c;
                col[c] = left[r+c] = right[r+n-1-c] = true;
                putQ(r+1);
                col[c] = left[r+c] = right[r+n-1-c] = false;
            }
        }
    }
}
