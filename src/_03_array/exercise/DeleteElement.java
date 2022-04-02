package _03_array.exercise;

import com.sun.scenario.animation.shared.ClipEnvelope;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6,7,8,9};
//        int n = arr.length;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập phần tử muốn xóa: ");
//        int k = sc.nextInt();
//        int c, i;
//        for (c = i = 0; i < n ; i++) {
//            if (arr[i] != k){
//                arr[c] = arr[i];
//                c++;
//            }
//        }
//        arr[arr.length - 1] = 0;
//        System.out.println(Arrays.toString(arr));
//    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,5,9};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập phần tử muốn xóa: ");
        int k = sc.nextInt();
        int c = 0, i;
        for ( i = 0; i < arr.length ;) {
            if (arr[i] == k){
                c = i;
                break;
            }else {
                i++;
            }
        }
        for (int j = c; j < arr.length ; j++) {
            if (j == arr.length - 1){
                arr[j] = 0;
            }else {
                arr[j] = arr[j + 1];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
