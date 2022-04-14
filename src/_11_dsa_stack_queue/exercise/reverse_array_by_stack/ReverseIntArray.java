package _11_dsa_stack_queue.exercise.reverse_array_by_stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseIntArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> arrayStack = new Stack<>();
        System.out.println("Input size of Array");
        Integer sizeArray = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < sizeArray ; i++) {
            System.out.println("Input element of: " + (i + 1));
            arrayStack.push(Integer.parseInt(sc.nextLine()));
        }
        System.out.println("Before Reverse: " +arrayStack);

        Number[] arrReverse = new Number[arrayStack.size()];
        for (int i = 0; i < arrReverse.length ; i++) {
            arrReverse[i] = arrayStack.pop();
        }
        System.out.println("After reverse " + Arrays.toString(arrReverse));
    }
}
