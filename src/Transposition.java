import java.util.Random;
import java.util.Scanner;

public class Transposition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Введіть кількість рядків: ");
        int m = scanner.nextInt();
        System.out.print("Введить кількість стовбців: ");
        int n = scanner.nextInt();
        System.out.println("Ось ваша матриця с рандомними числами: ");
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Ось транспонована матриця: ");
        int[][] matrixTrans = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrixTrans[i][j] = matrix[j][i];
                System.out.print(matrixTrans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
