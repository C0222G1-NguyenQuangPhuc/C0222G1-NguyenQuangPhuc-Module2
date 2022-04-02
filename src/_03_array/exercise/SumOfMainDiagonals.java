package _03_array.exercise;

import java.util.Scanner;

public class SumOfMainDiagonals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập kích thước ma trận vuông: ");
        int size = sc.nextInt();
        double[][] arr = new double[size][size];
        for (int i = 0; i < size ; i++) {
            for (int j = 0; j < size ; j++) {
                System.out.print("Nhập phần tử hàng " + i + " cột " + j + ": ");
                arr[i][j] = sc.nextDouble();
            }
        }
        double sum = 0;
        for (int i = 0; i < size ; i++) {
            sum += arr[i][i];
        }
        System.out.println("Tổng các phần tử ở đường chéo chính là: " + sum );
    }
}
