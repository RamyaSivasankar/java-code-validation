import java.util.Scanner;

public class HourglassSum {
    public static void main(String[] args) {
        int[][] a = new int[9][9];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the elements:");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i <= 6; i++) {
            for (int j = 0; j <= 6; j++) {
                int currentSum = a[i][j] + a[i][j + 1] + a[i][j + 2]
                                 + a[i + 1][j + 1]
                                 + a[i + 2][j] + a[i + 2][j + 1] + a[i + 2][j + 2];
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        System.out.println("Largest Hourglass Value: " + maxSum);
        sc.close();
    }
}
