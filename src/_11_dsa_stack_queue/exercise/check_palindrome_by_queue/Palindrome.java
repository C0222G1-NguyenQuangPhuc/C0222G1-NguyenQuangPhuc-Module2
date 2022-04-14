package _11_dsa_stack_queue.exercise.check_palindrome_by_queue;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> myQueue = new LinkedList<>();
        Stack<String> myStack = new Stack<>();
        System.out.println("Input a string");
        String str = sc.nextLine();
        System.out.println(str);
        str = str.toLowerCase().replaceAll(" ","");
        String[] arrStr = str.split("");
        System.out.println(Arrays.toString(arrStr));
        for (int i = 0; i < arrStr.length ; i++) {
            myQueue.add(arrStr[i]);
            myStack.push(arrStr[i]);
        }
        String result = "";
        while (!myQueue.isEmpty()){
            if (myQueue.remove().equals(myStack.pop())){
                result = "This string is a palindrome";
            }else {
                result = "This string is not a palindrome";
                break;
            }
        }
        System.out.println(result);
    }
}
