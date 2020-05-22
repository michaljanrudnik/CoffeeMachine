import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] stringsToCheck = scanner.nextLine().split(" ");
        boolean check = false;

        for (int i = 0; i < stringsToCheck.length - 1; i++) {
            if (stringsToCheck[i].compareTo(stringsToCheck[i + 1]) <= 0) {
                check = true;
            } else {
                check = false;
                break;
            }
        }

        System.out.println(check);
    }
}
