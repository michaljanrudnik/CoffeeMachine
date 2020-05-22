import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] income = new int[size];
        int[] taxesRate = new int[size];
        double[] taxesPayed = new double[size];
        for (int i = 0; i < size; i++) {
            income[i] = scanner.nextInt();
        }
        for (int i = 0; i < size; i++) {
            taxesRate[i] = scanner.nextInt();
        }

        double maxTax = 0;

        for (int i = 0; i < size; i++) {
            taxesPayed[i] = (double) (income[i] * taxesRate[i]) / 100;
            if (taxesPayed[i] > maxTax) {
                maxTax = taxesPayed[i];
            }
        }

        int companyNumber = 0;
        for (int i = 0; i < size; i++) {
            if (taxesPayed[i] == maxTax) {
                companyNumber = i + 1;
            }
        }

        System.out.println(companyNumber);
    }
}