/*
Given an integer, n, print its first 10 multiples.
Each multiple n * i (where 1 <= i <= 10) should be printed on a new line in the form: N x i = result.

Sample Input:
2

Sample Output
2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20
 */
package introduction;

import java.util.Scanner;

public class JavaLoops {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", n, i, n * i);
        }
        scanner.close();
    }
}
