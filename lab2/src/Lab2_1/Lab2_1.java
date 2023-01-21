package Lab2_1;
import java.util.Scanner;

public class Lab2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int min;
        int n_min = 0;
        int j = 0;

        while (true) {
            System.out.print("Enter array dimension: ");
            n = scanner.nextInt();
            if (n > 0) {
                break;
            }
            System.out.print("Invalid dimension! ");
        }
        System.out.print("Enter array: ");
        int array[] = new int[n];
        int numbers[] = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        min = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] < min)
                min = array[i];
        }

        for (int i = 0; i < n; i++) {
            if (array[i] == min) {
                n_min++;
                numbers[j] = i;
                j++;
            }
        }

        System.out.printf("The minimum element occurs %d times in the array%n", n_min);
        System.out.printf("Numbers of the minimum element: ");
        for (int i = 0; i < n_min; i++) {
            System.out.print(numbers[i]);
            if (i < n_min - 1)
                System.out.print(", ");
        }
        scanner.close();
    }
}

