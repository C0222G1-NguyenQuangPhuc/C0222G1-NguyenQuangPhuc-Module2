package _03_array.exercise;

import sun.security.rsa.RSAUtil;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int size1, size2, size3;
        int[] arr1, arr2, arr3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào độ dài mảng thứ nhất:");
        size1 = sc.nextInt();
        arr1 = new int[size1];
        for (int i = 0; i < arr1.length ; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr1[i] = sc.nextInt();
        }
        System.out.print("Mảng vừa nhập là: ");
        System.out.println(Arrays.toString(arr1));

        System.out.print("Nhập vào độ dài mảng thứ 2:");
        size2 = sc.nextInt();
        arr2 = new int[size2];
        for (int i = 0; i < arr2.length ; i++) {
            System.out.print("Nhập phần tử thứ" + (i + 1) + ": ");
            arr2[i] = sc.nextInt();
        }
        System.out.print("Mảng vừa nhập là: ");
        System.out.println(Arrays.toString(arr2));

        size3 = size1 + size2;
        arr3 = new int[size3];
        for (int i = 0; i < arr1.length ; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length ; i++) {
            arr3[i + arr1.length] = arr2[i];
        }
        System.out.print("Mảng sau khi gộp là: ");
        System.out.println(Arrays.toString(arr3));
    }
}
