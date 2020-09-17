
/*
----------------------------------------------------------------------------------
Question
----------------------------------------------------------------------------------
1. You are given a number following certain constraints.
2. The key constraint is if the number is 5 digits long, it'll contain all the digits from 1 to 5 without missing any and without repeating any. e.g. 23415 is a 5 digit long number containing all digits from 1 to 5 without missing and repeating any digit from 1 to 5.Take a look at few other valid numbers - 624135, 81456273 etc.Here are a few invalid numbers - 139, 7421357 etc.
3. The inverse of a number is defined as the number created by interchanging the face value and index of digits of number.e.g. for 426135 (reading from right to left, 5 is in place 1, 3 is in place 2, 1 is in place 3, 6 is in place 4, 2 is in place 5 and 4 is in place 6), the inverse will be 416253 (reading from right to left, 3 is in place 1, 5 is in place 2,2 is in place 3, 6 is in place 4, 1 is in place 5 and 4 is in place 6) More examples - inverse of 2134 is 1243 and inverse of 24153 is 24153    
4. Take as input number "n", assume that the number will follow constraints.
5. Print it's inverse.

----------------------------------------------------------------------------------
Input Format
----------------------------------------------------------------------------------
"n" where n is any integer, following constraints defined above.

----------------------------------------------------------------------------------
Output Format
----------------------------------------------------------------------------------
"i", the inverted number

----------------------------------------------------------------------------------
Constraints
----------------------------------------------------------------------------------
1 <= n < 10^8, and follwing other constraints defined above.

----------------------------------------------------------------------------------
Sample Input
----------------------------------------------------------------------------------
426135

----------------------------------------------------------------------------------
Sample Output
----------------------------------------------------------------------------------
416253

*/
import java.util.*;

public class inverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int temp = n;
        int count = 0;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        int nod = 1;
        while (count != nod - 1) {
            temp += nod * ((int) Math.pow(10, (n % 10) - 1));
            n /= 10;
            nod++;
        }
        System.out.println(temp);

    }

}

// Dry run
// 15234 temp=0 + 1 * 10 ^ 3 = 1000
// 1523 temp = 1000 + 2* 10 ^ 2 = 1200
// 152 temp = 1200 + 3* 10 ^ 1 = 1230
// 15 temp = 1230 + 4 *10 ^ 4 =41230
// 1 temp = 41230 + 4* 10 ^0 = 41235

// ----------------------------------------------------------------------------------
// Problem Setter's Solution
// ----------------------------------------------------------------------------------

// public static void main(String[] args) {
// Scanner scn = new Scanner(System.in);
// int n = scn.nextInt();
// int inverse = 0;
// int originalPosition = 1;
// while (n != 0) {
// int originalDigit = n % 10;
// int inversePosition = originalDigit;
// int inverseDigit = originalPosition;
// inverse += inverseDigit * (int) Math.pow(10, inversePosition - 1);
// n /= 10;
// originalPosition++;
// }
// System.out.println(inverse);