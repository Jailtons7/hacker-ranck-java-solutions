/*
In this problem, you are given a regex pattern. You have to check whether the syntax of the given pattern is valid.
Note: In this problem, a regex is only valid if you can compile it using the Pattern.compile method.

Sample Input:
3
([A-Z])(.+)
[AZ[a-z](a-z)
batcatpat(nat

Sample Output:
Valid
Invalid
Invalid
 */
package strings;

import java.util.Scanner;
import java.util.regex.*;

public class PatternSyntaxChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        for (int idx = 1; idx <= Math.abs(testCases); idx++) {
            String pattern = in.nextLine();
            try {
                Pattern comp = Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException exc) {
                System.out.println("Invalid");
            }
        }
    }
}
