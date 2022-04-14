package _11_dsa_stack_queue.exercise.decimal_to_binary;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> myStack = new Stack<>();
        String strBinary = "";
        System.out.println("Input a number");
        int number = Integer.parseInt(sc.nextLine());
        while (number > 0){
            myStack.push(number % 2);
            number = number / 2;
        }
        System.out.println(myStack);
        while (!myStack.isEmpty()){
            strBinary += myStack.pop();
        }
        System.out.println(strBinary);
    }
}
