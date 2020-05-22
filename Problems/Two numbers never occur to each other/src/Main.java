import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        boolean neverOccur = true;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        int firstToFind = scanner.nextInt();
        int secondToFind = scanner.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == firstToFind && i != 0 && i != numbers.length - 1) {
                if (numbers[i - 1] == secondToFind || numbers[i + 1] == secondToFind) {
                    neverOccur = false;
                    break;
                }
            }   else if (numbers[i] == firstToFind && i == 0 && numbers[i + 1] == secondToFind) {
                    neverOccur = false;
                    break;
                    
            }   else if (numbers[i] == firstToFind && i == numbers.length - 1 && numbers[i - 1] == secondToFind) {
                    neverOccur = false;
                    break;
            }
        }

        System.out.println(neverOccur);

    }
}
