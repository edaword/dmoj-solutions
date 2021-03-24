/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dwite07c3p1;

/**
 *
 * @author edwan2505
 */


public class Dwite07c3p1 {

    int max = 1007;
    boolean isPrime[];
    isPrime = new boolean[max];
    static void sieve (int max) {
        int i,j;
        for (i=2;i<max;i++) {
            isPrime[i] = true;
        }
        for (i=2;i<max;i++) {
            if (isPrime[i]) {
                for(j=i+i;j<max;j+=i) {
                    isPrime[j] = false;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        sieve(max);
        for(int i=0;i<isPrime.length;i++) {
            if (isPrime[i]) {
                System.out.println(i + " is prime");
            } else {
                System.out.println(i + " is not prime");
            }

        }
    }
    
}
