import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int maximum = numbers[0] * numbers[1];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i != j && numbers[i] * numbers[j] > maximum) {
                    maximum = numbers[i] * numbers[j];
                }
            }
        }

        System.out.println(maximum);
    }
}
