import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите начало диапазона от 10 до 20: ");
        double a = scanner.nextInt();
        System.out.print("Введите конец диапазона от 10 до 20: ");
        double b = scanner.nextInt();
        double count = 0;
        double count1 = 0;
        double sum = 0;
        double sum1 = 0;

        for (int i = 10; i >= a && i <= b; i++, count++) {
            sum += i;
        }
        System.out.println("Среднее арифметическое: " + sum / count);

        for (int j = 10; j >= a && j <= b; j++) {
            if (j % 2 == 0) {
                sum1 += j;
                count1++;
            }
        }
        System.out.println("Среднее арифметическое чётных чисел: " + sum1 / count1);
    }
}
