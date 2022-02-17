import java.util.Scanner;

public class DigitsOfNumber {

    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int a = scanner1.nextInt();
        int sum = 0;
        int sum1 = 0;
        int max = 0;

        for (int n = Math.abs(a); n != 0; n /= 10) {
            sum += (n % 10);
            if (n % 2 != 0) {
                sum1 += (n % 10);
            }
            if (max < (n % 10)) {
                max = (n % 10);
            }
        }
        System.out.println("Сумма цифр числа: " + sum);
        System.out.println("Сумма нечётных цифр числа: " + sum1);
        System.out.println("Максимальная цифра: " + max);

    }
}