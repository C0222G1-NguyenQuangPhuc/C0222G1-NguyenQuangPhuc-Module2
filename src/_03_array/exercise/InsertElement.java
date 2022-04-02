package _03_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 1, 7, 0, 0, 0, 0};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số muốn thêm");
        int n = sc.nextInt();
        int index;
        do{
            System.out.println("Nhập vị trí muốn thêm");
            index = sc.nextInt();
        }while (index <= -1 || index >= arr.length - 1);
        System.out.println(n);
        System.out.println(index);
        for (int i = arr.length - 1; i > index ; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = n;
        System.out.println("Mảng sau khi chèn là: ");
        System.out.println(Arrays.toString(arr));
    }

}
