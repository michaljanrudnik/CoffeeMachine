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
        int counter = 1;
        int maxLength = 1;


        for (int i = 0; i < size - 1; i++) {
            if (numbers[i] < numbers[i + 1]) {
                counter++;
            } else {
                if (counter > maxLength) {
                    maxLength = counter;
                }
                counter = 1;
            }
            if (i + 1 == size - 1 && counter > maxLength) {
                maxLength = counter;
            }
        }

        System.out.println(maxLength);

    }
}