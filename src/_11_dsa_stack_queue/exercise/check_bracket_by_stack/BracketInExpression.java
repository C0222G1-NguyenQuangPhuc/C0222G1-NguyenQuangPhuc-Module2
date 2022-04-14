package _11_dsa_stack_queue.exercise.check_bracket_by_stack;

import java.util.Scanner;
import java.util.Stack;

public class BracketInExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> bStack = new Stack<>();
        System.out.println("Input a expression: ");
        String str = sc.nextLine();
        char left = ' ';
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                bStack.push(str.charAt(i));
            } else if (str.charAt(i) == ')') {
                if (bStack.isEmpty()) {
                    flag = false;
                } else {
                    left = bStack.pop();
                }
                if (left != '(') {
                    flag = false;
                }
            }
        }
        if (bStack.isEmpty()) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
