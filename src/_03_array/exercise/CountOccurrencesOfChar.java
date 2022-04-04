package _03_array.exercise;

import java.util.Scanner;

public class CountOccurrencesOfChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "deathislikewind";
        System.out.print("Nhập ký tự cần kiểm tra: ");
        char sym = sc.next().charAt(0);
        System.out.println("Số lần xuất hiện của " + sym + " là " + countOccurrencesOfChar(str1,sym) );
    }

    public static int countOccurrencesOfChar(String str, char cha){
        int count = 0;
        for (int i = 0; i < str.length() ; i++) {
            if (str.charAt(i) == cha){
                count++;
            }
        }
        return count;
    }
}
