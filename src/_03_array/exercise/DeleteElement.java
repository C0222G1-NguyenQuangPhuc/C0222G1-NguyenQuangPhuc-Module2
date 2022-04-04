package _03_array.exercise;

import com.sun.scenario.animation.shared.ClipEnvelope;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,5,8,9};
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập phần tử muốn xóa: ");
        int num = sc.nextInt();
        System.out.println(Arrays.toString(deleteElement(arr,num)));
    }

    public  static int[] deleteElement(int[] arg, int n){
        int c, i, count = 0;
        for (c = i = 0; i < arg.length; i++) {
            if (arg[i] != n){
                arg[c] = arg[i];
                c++;
            }else {
                count++;
            }
        }
        for (int j = 0; j < count ; j++) {
            arg[arg.length - (j + 1)] = 0;
        }
        return arg;
    }

//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6,7,5,9};
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập phần tử muốn xóa: ");
//        int k = sc.nextInt();
//        int c = 0, i;
//        for ( i = 0; i < arr.length ;) {
//            if (arr[i] == k){
//                c = i;
//                break;
//            }else {
//                i++;
//            }
//        }
//        for (int j = c; j < arr.length ; j++) {
//            if (j == arr.length - 1){
//                arr[j] = 0;
//            }else {
//                arr[j] = arr[j + 1];
//            }
//        }
//        arr[arr.length - 1] = 0;
//        System.out.println(Arrays.toString(arr));
//    }
}
