package strings;

import java.util.Scanner;

public class SubStringComparison {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        int startSlice = 0;
        int endSlice = k;
        while (endSlice <= s.length() - 1) {
            endSlice = startSlice + k;
            if (smallest.compareTo(s.substring(startSlice, endSlice)) > 0) {
                smallest = s.substring(startSlice, endSlice);
            }
            if (largest.compareTo(s.substring(startSlice, endSlice)) < 0) {
                largest = s.substring(startSlice, endSlice);
            }
            startSlice++;
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
