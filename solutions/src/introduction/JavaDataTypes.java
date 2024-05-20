/*
Task:
Given an input integer T, you must read T long numbers and must determine which primitive
data types are capable of properly storing each of the numbers.
For this exercise consider primitives used to hold integers: byte, short, int and long

Sample Input:
5
-150
150000
1500000000
213333333333333333333333333333333333
-100000000000000

Sample Output:
-150 can be fitted in:
* short
* int
* long
150000 can be fitted in:
* int
* long
1500000000 can be fitted in:
* int
* long
213333333333333333333333333333333333 can't be fitted anywhere.
-100000000000000 can be fitted in:
* long

 */
package introduction;

import java.util.*;


class JavaDataTypes {
    public static void main(String []argh) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i < t; i++) {
            try {
                long x = sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x >= -128 && x <= 127) {
                    System.out.println("* byte");
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                } else if (x >= -32768 && x <= 32767) {
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                } else if (x >= Math.pow(-2, 31) && x <= Math.pow(2, 31) - 1) {
                    System.out.println("* int");
                    System.out.println("* long");
                } else {
                    System.out.println("* long");
                }
            }
            catch(Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }
}
