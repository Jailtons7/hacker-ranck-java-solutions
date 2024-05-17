/*
Given a double-precision number, payment, denoting an amount of money,
use the NumberFormat class' getCurrencyInstance method to convert payment into the
US, Indian, Chinese, and French currency formats. Then print the formatted values as follows:
    US: formattedPayment
    India: formattedPayment
    China: formattedPayment
    France: formattedPayment

Sample Input:
12324.134

Sample Output:
US: $12,324.13
India: Rs.12,324.13
China: ￥12,324.13
France: 12 324,13 €
 */
package introduction;

import java.text.NumberFormat;
import java.util.Scanner;
import java.util.Locale;


public class CurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double payment = scanner.nextDouble();
        scanner.close();
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india = NumberFormat.getCurrencyInstance(
                new Locale("en", "IN")
        ).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
