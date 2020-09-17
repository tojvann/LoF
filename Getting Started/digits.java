
/*
----------------------------------------------------------------------------------
        Digits of a number
----------------------------------------------------------------------------------

----------------------------------------------------------------------------------
Question
----------------------------------------------------------------------------------
1. You've to display the digits of a number.
2. Take as input "n", the number for which digits have to be displayed.
3. Print the digits of the number line-wise.

----------------------------------------------------------------------------------
Input Format
----------------------------------------------------------------------------------
"n" where n is any integer.

----------------------------------------------------------------------------------
Output Format
----------------------------------------------------------------------------------
d1
d2
d3
... digits of the number

----------------------------------------------------------------------------------
Constraints
----------------------------------------------------------------------------------
1 <= n < 10^9

----------------------------------------------------------------------------------
Sample Input
----------------------------------------------------------------------------------
65784383

----------------------------------------------------------------------------------
Sample Output
----------------------------------------------------------------------------------
6
5
7
8
4
3
8
3

*/
import java.util.*;

public class digits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int temp = n;
        int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        count--;
        while (count != -1) {
            System.out.println(temp / (int) (Math.pow(10, count)));
            temp = temp % (int) (Math.pow(10, count));
            count--;
        }
    }
}
// ----------------------------------------------------------------------------------
// Problem Setter's Solution
// ----------------------------------------------------------------------------------
// import java.util.*;

// public class Main {

// public static void main(String[] args) {
// Scanner scn = new Scanner(System.in);
// int n = scn.nextInt();

// int power = 1;
// int temp = n;
// while (temp >= 10) {
// temp /= 10;
// power *= 10;
// }

// temp = n;
// while (power != 0) {
// int digit = temp / power;
// System.out.println(digit);

// temp = temp % power;
// power = power / 10;
// }
// }
// }