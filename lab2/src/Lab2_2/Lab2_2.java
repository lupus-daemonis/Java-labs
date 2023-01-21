package Lab2_2;
import java.util.Arrays;
import java.util.Scanner;

public class Lab2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int k;
        int m = -1;

        while (true) {
            System.out.print("Введите размерность матрицы: ");
            n = scanner.nextInt();
            if (n > 0) {
                break;
            }
            System.out.print("Неверная размерность матрицы. ");
        }

        int[][] A = new int[n][n];
        System.out.println("Введите матрицу: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Введите число k: ");
        k = scanner.nextInt();

        System.out.println("Введенная матрица: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }


        int B[] = new int[100];
        //Находим количество подходящих элементов
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((A[i][j] < k) && (j % 2 != 0)) {
                    m++;
                    B[m] = A[i][j];
                }
            }
        }

        if (m == -1)
            System.out.println("Нет элементов, меньших k и находящихся в нечетных столбцах");
        else {
            System.out.println("Вектор из элементов, меньших числа k и находящихся в нечетных столбцах: ");
            System.out.println(Arrays.toString(B));

            //Сортировка вектора методом пузырька
            boolean isSorted = false;
            int temp;
            while(!isSorted) {
                isSorted = true;
                for (int i = 0; i < B.length - 1; i++) {
                    if(B[i] > B[i+1]){
                        isSorted = false;

                        temp = B[i];
                        B[i] = B[i+1];
                        B[i+1] = temp;
                    }
                }
            }

            //Сортировка методом sort()
            Arrays.sort(B);

            System.out.println("Вектор после сортировки по возрастанию: ");
            System.out.println(Arrays.toString(B));
        }
        scanner.close();
    }
}