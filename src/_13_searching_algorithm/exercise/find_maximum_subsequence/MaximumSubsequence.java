package _13_searching_algorithm.exercise.find_maximum_subsequence;

import java.util.LinkedList;
import java.util.Scanner;

public class MaximumSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String inputString = sc.nextLine();
        LinkedList<Character> myLinkedList = new LinkedList<>();
        myLinkedList.add(inputString.charAt(0));
        for (int i = 1; i < inputString.length() ; i++) {
            if (inputString.charAt(i) > myLinkedList.getLast()){
                myLinkedList.add(inputString.charAt(i));
            }
        }

        for (Character item: myLinkedList) {
            System.out.print(item);
        }
    }
}
