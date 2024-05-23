/*
Two strings, a and, b are called anagrams if they contain all the same characters in the same frequencies.
For this challenge, the test is not case-sensitive.
For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

Sample Input 0:
anagram
margana

Sample Output 0:
Anagrams

Sample Input 1:
anagramm
marganaa

Sample Output 1:
Not Anagrams
 */
package strings;

import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        char[] arrayCharA = a.toCharArray();
        char[] arrayCharB = b.toCharArray();
        java.util.Arrays.sort(arrayCharA);
        java.util.Arrays.sort(arrayCharB);
        return java.util.Arrays.equals(arrayCharA, arrayCharB);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
