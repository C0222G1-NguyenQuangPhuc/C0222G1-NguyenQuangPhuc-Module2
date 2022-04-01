package _03_array.exercise;

import com.sun.scenario.animation.shared.ClipEnvelope;

import java.util.Arrays;

public class DeleteElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int x = 7;
        for (int i = 0; i < arr.length ; i++) {
            if (x == arr[i]){
                for (int j = i; j < arr.length ; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
