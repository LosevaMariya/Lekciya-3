import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите начало диапазона: ");
        int a = scanner.nextInt();
        System.out.print("Введите конец диапазона: ");
        int b = scanner.nextInt();
        int count = 0;
        int count1 = 0;
        int sum = 0;
        int sum1 = 0;

        for (int i = a; i <= b; i++) {
            sum += i;
            count++;
            for (int j = a; j <= b; j++)
                if (j % 2 == 0) {
                    sum1 += j;
                    count1++;
                }
        }
        System.out.println("Среднее арифметическое: " + (double) sum / count);
        System.out.println("Среднее арифметическое чётных чисел: " + (double) sum1 / count1);
    }
}


