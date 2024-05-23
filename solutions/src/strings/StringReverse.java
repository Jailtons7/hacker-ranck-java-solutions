package strings;

import java.lang.StringBuilder;
import java.util.Scanner;


public class StringReverse {
    static String reverse(String s) {
        StringBuilder reversed = new StringBuilder();
        for (int length = s.length() - 1; length >= 0; length--) {
            reversed.append(s.charAt(length));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        if (A.equals(reverse(A))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}
