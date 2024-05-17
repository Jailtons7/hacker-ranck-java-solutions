/*
We use the integers a, b and n to create the following series:
(a + b), (a + b + 2¹ * b), ..., (a + b + 2¹ * b + ... + 2 **(n -1) * b)

You are given q queries. For each query, print the series corresponding to the given a, b and n.

Sample Input:
2
0 2 10
5 3 5

Sample Output:
2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
 */
package introduction;

import java.util.Scanner;


public class CreatingSeriesWithLoops {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int q = scanner.nextInt();  // the number of queries
        for (int i = 0; i < q; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            int[] elements = new int[n];
            elements[0] = a + b;
            for (int j = 1; j < n; j++) {
                elements[j] = elements[j - 1] + (int)(Math.pow(2, j) * b);
            }

            for (int el: elements) {
                System.out.print(el + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
