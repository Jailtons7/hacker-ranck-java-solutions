/*
In this challenge, you must read an integer, a double, and a String from stdin,
then print the values according to the instructions in the Output Format section below.

Sample Input:
42
3.1415
Welcome to HackerRank's Java tutorials!

Sample Output:
String: Welcome to HackerRank's Java tutorials!
Double: 3.1415
Int: 42
 */
package introduction;

import java.util.Locale;
import java.util.Scanner;


public class JavaStdInStdOut2 {
    private static final Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        int i = scanner.nextInt();
        double d = scanner.nextDouble();
        scanner.nextLine();
        String s = scanner.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        scanner.close();
    }
}
