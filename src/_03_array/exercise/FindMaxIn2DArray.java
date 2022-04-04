package _03_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxIn2DArray {
    public static void main(String[] args) {
        int[][] arr = create2DArray();
        System.out.println(Arrays.deepToString(arr));
        System.out.println(findMaxIn2DArray(arr));
    }

    public static int[][] create2DArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số dòng: ");
        int row = sc.nextInt();
        System.out.print("Nhập số cột: ");
        int col = sc.nextInt();
        int[][] arg = new int[row][col];
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col ; j++) {
                System.out.println("Nhập phần tử hàng: " + i + " cột " + j + ": ");
                arg[i][j] = sc.nextInt();
            }
        }
        return arg;
    }

    public static String findMaxIn2DArray(int[][] arg){
        int max = arg[0][0];
        String index = 0 + " " + 0;
        for (int i = 0; i < arg.length ; i++) {
            for (int j = 0; j < arg[i].length ; j++) {
                if (max < arg[i][j]){
                    max = arg[i][j];
                    index = i + " " + j;
                }
            }
        }
        return "Phần tử lớn nhất trong mảng là: " + max + " tại vị trí: " + index;
    }
}
