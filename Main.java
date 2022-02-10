
public class Main {

    public static void main(String[] args) {

        int[] sequence = {10, 11, 12, 13, 14, 15};
        double average = 0;
        int count = 0;
        int sum = 0;
        for (int i : sequence) {
            average += i;
        }
        System.out.println("Среднее арифметическое: " + average / sequence.length);

        for (int j = 0; j < sequence.length; j++) {
            if (sequence[j] % 2 == 0) {
                sum += sequence[j];
                count++;
            }
        }
        System.out.println("Среднее арифметическое чётных чисел: " + sum / count);
    }
}
