package _03_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class FindMinInArray {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập độ dài của mảng: ");
            size = sc.nextInt();
        }while (size < 1);
        arr = new int[size];
        for (int i = 0; i < size ; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Mảng vừa nhập là: ");
        System.out.println(Arrays.toString(arr));
        int min = arr[0];
        for (int i = 0; i < size ; i++) {
            if (min > arr[i]){
                min = arr[i];
            }
        }
        System.out.print("Phần tử nhỏ nhất trong mảng là: " + min);
    }
}
