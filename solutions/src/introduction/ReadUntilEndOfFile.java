package introduction;

import java.util.Scanner;

public class ReadUntilEndOfFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        for (int i = 1; sc.hasNextLine(); i++){
            System.out.println(count + " " + sc.nextLine());
            count++;
        }
    }
}
