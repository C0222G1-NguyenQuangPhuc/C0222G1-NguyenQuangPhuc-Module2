package _11_dsa_stack_queue.exercise.reverse_array_by_stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        Stack<String> wStack = new Stack<>();
        System.out.println("Input a string: ");
        String mWord = sc.nextLine();
        System.out.println(mWord);
        String[] arrayWords = mWord.split(" ");
        System.out.println(Arrays.toString(arrayWords));
        for (int i = 0; i < arrayWords.length ; i++) {
            wStack.push(arrayWords[i]);
        }
        System.out.println(wStack);
        while (!wStack.isEmpty()){
            str += wStack.pop() + " ";
        }
        System.out.println(str);
    }
}
