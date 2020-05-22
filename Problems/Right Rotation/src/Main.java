import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] numbersInString = scanner.nextLine().split(" ");
        int rotations = scanner.nextInt();

        int[] numbers = new int[numbersInString.length];
        int[] shiftedNumbers = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(numbersInString[i]);
        }

        for (int j = 0; j < numbers.length; j++) {
            shiftedNumbers[(j + rotations) % numbers.length] = numbers[j];
        }

        for (int a : shiftedNumbers) {
            System.out.print(a + " ");
        }
    }
}
