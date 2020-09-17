/*
----------------------------------------------------------------------------------
    Pythagorean Triplet
----------------------------------------------------------------------------------

----------------------------------------------------------------------------------
Question
----------------------------------------------------------------------------------
1. You are required to check if a given set of numbers is a valid pythagorean triplet.
2. Take as input three numbers a, b and c.
3. Print true if they can form a pythagorean triplet and false otherwise.

----------------------------------------------------------------------------------
Input Format
----------------------------------------------------------------------------------
a, an integer
b, an integer
c, an integer

----------------------------------------------------------------------------------
Output Format
----------------------------------------------------------------------------------
true if the numbers form a pythagorean triplet and false otherwise

----------------------------------------------------------------------------------
Constraints
----------------------------------------------------------------------------------
1 <= a <= 10^9
1 <= b <= 10^9
1 <= c <= 10^9

----------------------------------------------------------------------------------
Sample Input
----------------------------------------------------------------------------------
5 3 4

----------------------------------------------------------------------------------
Sample Output
----------------------------------------------------------------------------------
true

*/

import java.util.*;

public class pythagoreanTriplet {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        if (a >= b && a >= c) {
            if (a * a == b * b + c * c)
                System.out.println("true");
            else
                System.out.println("false");

        } else if (b >= a && b >= c) {
            if (b * b == a * a + c * c)
                System.out.println("true");
            else
                System.out.println("false");
        } else if (c * c == a * a + b * b)
            System.out.println("true");
        else
            System.out.println("false");

    }

}

// Problem Setters Solution
// import java.util.*;

// public class Main {

// public static void main(String[] args) {
// Scanner scn = new Scanner(System.in);
// int a = scn.nextInt();
// int b = scn.nextInt();
// int c = scn.nextInt();

// int max = a;
// if (b >= max)
// max = b;

// if (c >= max)
// max = c;

// if (max == a) {
// System.out.println((b * b + c * c) == (a * a));
// } else if (max == b) {
// System.out.println((a * a + c * c) == (b * b));
// } else {
// System.out.println((a * a + b * b) == (c * c));
// }
// }
// }