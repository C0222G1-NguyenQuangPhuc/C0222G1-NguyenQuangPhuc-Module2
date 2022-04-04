package _03_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SumElementOfCol {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập số hàng: ");
//        int row = sc.nextInt();
//        System.out.println("Nhập số cột: ");
//        int col = sc.nextInt();
//        double[][] arr = new double[row][col];
//        for (int i = 0; i < row ; i++) {
//            for (int j = 0; j < col; j++) {
//                System.out.print("Nhập phần tử hàng " + i + " cột " + j + ": ");
//                arr[i][j] = sc.nextDouble();
//            }
//        }
//        System.out.print("Nhập thứ tự một cột: ");
//        int k = sc.nextInt();
//        double sum = 0;
//        for (int i = 0; i < row ; i++) {
//            for (int j = 0; j < col ; j++) {
//                if (j == k){
//                    sum += arr[i][j];
//                }
//            }
//        }
//        System.out.println("Tổng các số cột " + k + " là: " + sum);
//    }
    public static void main(String[] args) {
        double[][] newArr= create2DArray();
        System.out.println(Arrays.deepToString(newArr));
        System.out.println();
        System.out.println(sumElementsOfColumn(newArr));
    }

    public static double[][] create2DArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số hàng: ");
        int row = sc.nextInt();
        System.out.println("Nhập số cột: ");
        int col = sc.nextInt();
        double[][] arg = new double[row][col];
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Nhập phần tử hàng " + i + " cột " + j + ": ");
                arg[i][j] = sc.nextDouble();
            }
        }
        return arg;
    }

    public static String sumElementsOfColumn(double[][] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cột muốn tính tổng: ");
        int indexOfCol = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < arg.length ; i++) {
            for (int j = 0; j < arg[i].length ; j++) {
                if (j == indexOfCol){
                    sum += (int)arg[i][j];
                }
            }
        }
        return "Tổng các phần tử cột " + indexOfCol + " là: " + sum;
    }
}
