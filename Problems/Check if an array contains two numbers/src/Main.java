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
        int firstToFind = scanner.nextInt();
        int secondToFind = scanner.nextInt();
        int indexOfFirst = -2;
        int indexOfSecond = -2;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == firstToFind) {
                indexOfFirst = i;
            }
            if (numbers[i] == secondToFind) {
                indexOfSecond = i;
            }
        }

        if (Math.abs(indexOfFirst - indexOfSecond) == 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}