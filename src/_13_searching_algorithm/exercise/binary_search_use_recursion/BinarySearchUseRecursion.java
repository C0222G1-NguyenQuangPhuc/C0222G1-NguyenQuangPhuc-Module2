package _13_searching_algorithm.exercise.binary_search_use_recursion;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchUseRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] myArr = {5, 1, 3, 9, 7, 6, 8, 11, 10, 13};
        Arrays.sort(myArr);
        System.out.println(Arrays.toString(myArr));
        System.out.println("Enter a value: ");
        int value = Integer.parseInt(sc.nextLine());
        int first = 0;
        int last = myArr.length - 1;
        System.out.println(binarySearchUseRecursion(myArr, first, last, value));;
    }

    public static int binarySearchUseRecursion(int[] arg, int left, int right, int value) {
        int middle = (left + right) / 2;
        while (left <= right) {
            if (value > arg[middle]) {
                left = middle + 1;
                binarySearchUseRecursion(arg, left, right, value);
            } else if (value < arg[middle]) {
                right = middle - 1;
                binarySearchUseRecursion(arg, left, right, value);
            } else {
                return middle;
            }
        }
        return -1;
    }
}
