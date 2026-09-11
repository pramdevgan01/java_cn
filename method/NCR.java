package method;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Represents the concept of NCR, which is used to calculate
 * the number of ways to choose r items from n items.
 * In mathematics, NCR is commonly known as a combination.
 * Formula: nCr = n! / (r! * (r - n)!)
 *
 * BigInteger is used here instead of int or long because factorials
 * can grow very large very quickly, and int/long may overflow.
 * BigInteger supports arbitrary-precision integers, so it can handle
 * large values safely.
 */
public class NCR {

    public static BigInteger factorial(int n ){
        // long res = 1;

        BigInteger res = BigInteger.ONE;
        while(n > 0){
            // res *= n;
            res = res.multiply(BigInteger.valueOf(n));
            n--;
        }
        return res;
    }

    public static BigInteger nCr(int n , int r){
        // long res = factorial(n) / (factorial(r) * factorial(n - r));
        // return res;

        return factorial(n).divide(factorial(r).multiply(factorial(n-r)));
    }
    public static void main(String[] args) {
        // int res = factorial(4);
        // System.out.println(res);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(nCr(n, r));
        sc.close();
    }
}
