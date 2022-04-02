package _03_array.exercise;

import java.util.Scanner;

public class CountOccurrencesOfChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "deathislikewind";
        System.out.print("Nhập ký tự cần kiểm tra: ");
        char sym = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length() ; i++) {
            if (str.charAt(i) == sym){
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của " + sym + " là " + count );
    }
}
