/*
You are given an integer n, you have to convert it into a string.
 */
package introduction;

import java.util.Scanner;


public class JavaIntToString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        in.close();

        String s = n + "";

        if (n == Integer.parseInt(s)) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer.");
        }
    }
}
