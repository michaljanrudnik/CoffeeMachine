import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int result = 0;

        for (int i = 0; i < size; i++) {
            result += scanner.nextInt();
        }

        System.out.println(result);

    }
}