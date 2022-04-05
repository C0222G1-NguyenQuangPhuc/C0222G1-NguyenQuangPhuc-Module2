package _04_object_and_class.exercise.stop_watch;

import java.util.Scanner;

public class MainStopWatch {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = (int)(Math.floor(Math.random()*1000));
        }
        StopWatch sw = new StopWatch();
        sw.start();
        System.out.println(sw.getStartTime());
        arr = selectionSort(arr);
        sw.end();
        System.out.println(sw.getEndTime());
        System.out.println("Time: " + sw.getElapsedTime());
        for (int item: arr) {
            System.out.println(item);
        }
    }

    public static int[] selectionSort(int[] arg){
        for (int i = 0; i < arg.length ; i++) {
            for (int j = i + 1; j < arg.length ; j++) {
                if (arg[j] < arg[i]){
                    int temp = arg[i];
                    arg[i] = arg[j];
                    arg[j] = temp;
                }
            }
        }
        return arg;
    }
}
