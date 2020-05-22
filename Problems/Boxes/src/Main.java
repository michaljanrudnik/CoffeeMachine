import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String[] boxOneString = scanner.nextLine().split(" ");
        String[] boxTwoString = scanner.nextLine().split(" ");

        int[] boxOne = new int[boxOneString.length];
        int[] boxTwo = new int[boxTwoString.length];
        int first = 0;
        int second = 0;

        for (int i = 0; i < boxOne.length; i++) {
            boxOne[i] = Integer.parseInt(boxOneString[i]);
            boxTwo[i] = Integer.parseInt(boxTwoString[i]);
        }

        Arrays.sort(boxOne);
        Arrays.sort(boxTwo);

        for (int i = 0; i < boxOne.length; i++) {
            if (boxOne[i] > boxTwo[i]) {
                first++;
            } else if (boxOne[i] < boxTwo[i]) {
                second++;
            }
        }

        if  (first == 0 && second == 0) {
            System.out.println("Box 1 = Box 2");
        } else if (first == 0) {
            System.out.println("Box 1 < Box 2");
        } else if (second == 0) {
            System.out.println("Box 1 > Box 2");
        } else {
            System.out.println("Incomparable");
        }

    }
}
