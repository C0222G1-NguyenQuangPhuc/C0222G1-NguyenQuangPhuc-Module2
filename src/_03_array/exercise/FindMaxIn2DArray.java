package _03_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số dòng: ");
        int row = sc.nextInt();
        System.out.print("Nhập số cột: ");
        int col = sc.nextInt();
        int[][] array = new int[row][col];
        int max = array[0][0];
        String index = 0 + " " + 0;
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col ; j++) {
                System.out.print("Nhập phần tử hàng: " + i + " cột: " + j + ": ");
                array[i][j] = sc.nextInt();
                if (max < array[i][j]){
                    max = array[i][j];
                    index = i + " " + j;
                }
            }
        }
        System.out.print("Mảng vừa nhập là: ");
        System.out.println(Arrays.toString(array));
        System.out.print("Phần tử lớn nhất trong mảng là: " + max + " ở vị trí " + index);
    }
}
