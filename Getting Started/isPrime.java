
/*
Question

1. You've to check whether a given number is prime or not.
2. Take a number "t" as input representing count of input numbers to be tested.
3. Take a number "n" as input "t" number of times.
4. For each input value of n, print "prime" if the number is prime and "not prime" otherwise.

Input Format

A number t
A number n
A number n
.. t number of times

Output Format

prime
not prime
not prime
.. t number of times

Constraints

1 <= t <= 10000
2 <= n < 10^9

Sample Input

5
19
21
33
37
121

Sample Output

prime
not prime
not prime
prime
not prime

*/
import java.util.*;

public class isPrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();

        while (t) {
            int n = scn.nextInt();
            int flag = 0;
            for (int i = 2; i <= (int) Math.sqrt(n); i++) {
                if (n % i == 0) {
                    ++flag;
                    break;
                }
            }
            if (flag)
                System.out.println("not prime");
            else
                System.out.println("prime");
            --t;
        }
    }

}

/*
 * Problem Setter Solution import java.util.*;
 * 
 * public class Main {
 * 
 * public static void main(String[] args) { Scanner scn = new
 * Scanner(System.in); int t = scn.nextInt();
 * 
 * for (int i = 0; i < t; i++) { int n = scn.nextInt();
 * 
 * int div = 2; while (div * div <= n) { if (n % div == 0) { break; } div++; }
 * 
 * if (div * div > n) { System.out.println("prime"); } else {
 * System.out.println("not prime"); } }
 * 
 * } }
 * 
 */
