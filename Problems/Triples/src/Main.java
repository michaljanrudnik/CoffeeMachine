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

        int counter = 0;

        for (int i = 0; i < size - 2; i++) {
            boolean test = true;
            for (int j = i; j < i + 2; j++) {
                if (numbers[j + 1] - numbers[j] != 1) {
                    test = false;
                    break;
                }
            }
            if (test) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}