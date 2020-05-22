import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int numberToFind = scanner.nextInt();

        boolean result = false;

        for (int a : numbers) {
            if (a == numberToFind) {
                result = true;
                break;
            }
        }
        System.out.println(result);
    }
}