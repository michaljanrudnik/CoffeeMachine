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
        int[] shiftedNumbers = new int[size];

        for (int i = 0; i < size; i++) {
            shiftedNumbers[(i + 1) % size] = numbers[i];
        }

        for (int a : shiftedNumbers) {
            System.out.print(a + " ");
        }
    }
}
