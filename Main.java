
public class Main {

    public static void main(String[] args) {

        int[] sequence = {10, 11, 12, 13, 14, 15};
        double average = 0;

        for (int i : sequence) {
            average += i;
        }

        System.out.println("Среднее арифметическое: " + average / sequence.length);
    }
}
