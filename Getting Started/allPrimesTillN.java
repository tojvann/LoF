/*
----------------------------------------------------------------------------------
Question
----------------------------------------------------------------------------------

1. You've to print all prime numbers between a range. 
2. Take as input "low", the lower limit of range.
3. Take as input "high", the higher limit of range.
4. For the range print all the primes numbers between low and high (both included).

----------------------------------------------------------------------------------
Input Format
----------------------------------------------------------------------------------

low 
high

----------------------------------------------------------------------------------
Output Format
----------------------------------------------------------------------------------

n1
n2
.. all primes between low and high (both included)

----------------------------------------------------------------------------------
Constraints
----------------------------------------------------------------------------------

2 <= low < high < 10 ^ 6

----------------------------------------------------------------------------------
Sample Input
----------------------------------------------------------------------------------

6 
24

----------------------------------------------------------------------------------
Sample Output
----------------------------------------------------------------------------------

7
11
13
17
19
23

*/

import java.util.*;

public class allPrimesTillN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();

        for (int i = low; i <= high; i++) {
            int flag = 0;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    ++flag;
                    break;
                }
            }
            if (flag == 0)
                System.out.println(i);
        }
    }
}

// ----------------------------------------------------------------------------------
// Problem Setter's Solution
// ----------------------------------------------------------------------------------
// import java.util.*;

// public class Main{

// public static void main(String[] args) {
// Scanner scn = new Scanner(System.in);
// int low = scn.nextInt();
// int high = scn.nextInt();

// for(int num = low; num <= high; num++){
// int div = 2;
// while(div * div <= num){
// if(num % div == 0){
// break;
// }
// div++;
// }

// if(div * div > num){
// System.out.println(num);
// }
// }
// }
// }
