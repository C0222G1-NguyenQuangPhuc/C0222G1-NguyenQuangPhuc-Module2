package _03_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfMainDiagonals {
    public static void main(String[] args) {
        double[][] arr = create2DArray();
        System.out.print("Mảng vừa nhập là: ");
        System.out.println(Arrays.deepToString(arr));
        System.out.println(sumOfMainDiagonals(arr));
    }

    public static double[][] create2DArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập kích thước ma trận vuông: ");
        int size = sc.nextInt();
        double[][] arg = new double[size][size];
        for (int i = 0; i < size ; i++) {
            for (int j = 0; j < size ; j++) {
                System.out.print("Nhập phần tử hàng " + i + " cột " + j + ": ");
                arg[i][j] = sc.nextDouble();
            }
        }
        return arg;
    }

    public static String sumOfMainDiagonals(double[][]arg){
        int sum = 0;
        for (int i = 0; i < arg.length ; i++) {
            sum += arg[i][i];
        }
        return "Tổng các phần tử ở đường chéo chính là: " + sum;
    }
}
