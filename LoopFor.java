public class LoopFor {

    public static void main(String[] args) {

        System.out.print("Числа, кратные 4: ");
        for (int i = 100; i > 1; i--) {
            if (isMultipleFour(i)) {
                System.out.print(i + ", ");
            }
        }
    }

    public static boolean isMultipleFour(int i) {
        return i % 4 == 0;
    }
}