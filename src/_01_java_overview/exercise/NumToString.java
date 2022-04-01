package _01_java_overview.exercise;

import java.util.Scanner;

public class NumToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number:");
        int input = sc.nextInt();
        int num1 = input % 10;
        int num2 = (input / 10) % 10;
        int num3 = input / 100;

        String str1 = "";
        String str2 = "";
        String str3 = "";

        if (num1 > 0){
            switch (num1){
                case 1:
                    str1 = "One";
                    break;
                case 2:
                    str1 = "Two";
                    break;
                case 3:
                    str1 = "Three";
                    break;
                case 4:
                    str1 = "Four";
                    break;
                case 5:
                    str1 = "Five";
                    break;
                case 6:
                    str1 = "Six";
                    break;
                case 7:
                    str1 = "Seven";
                    break;
                case 8:
                    str1 = "Eight";
                    break;
                case 9:
                    str1 = "Nine";
                    break;
            }
        }
        if (num2 == 1){
            switch (num1){
                case 0:
                    str2 = "Ten";
                    break;
                case 1:
                    str2 = "Eleven";
                    break;
                case 2:
                    str2 = "Twelve";
                    break;
                case 3:
                    str2 = "Thirteen";
                    break;
                case 4:
                    str2 = "Fourteen";
                    break;
                case 5:
                    str2 = "Fifteen";
                    break;
                case 6:
                    str2 = "Sixteen";
                    break;
                case 7:
                    str2 = "Seventeen";
                    break;
                case 8:
                    str2 = "Eightteen";
                    break;
                case 9:
                    str2 = "Nineteen";
                    break;
            }
        }else {
            switch (num2){
                case 2:
                    str2 = "Twenty";
                    break;
                case 3:
                    str2 = "Thirty";
                    break;
                case 4:
                    str2 = "Forty";
                    break;
                case 5:
                    str2 = "Fifty";
                    break;
                case 6:
                    str2 = "Sixty";
                    break;
                case 7:
                    str2 = "Seventy";
                    break;
                case 8:
                    str2 = "Eightty";
                    break;
                case 9:
                    str2 = "Ninety";
                    break;
            }
        }
        if (num3 > 0){
            switch (num3){
                case 1:
                    str3 = "One hundred";
                    break;
                case 2:
                    str3 = "Two hundred";
                    break;
                case 3:
                    str3 = "Three hundred";
                    break;
                case 4:
                    str3 = "Four hundred";
                    break;
                case 5:
                    str3 = "Five hundred";
                    break;
                case 6:
                    str3 = "Six hundred";
                    break;
                case 7:
                    str3 = "Seven hundred";
                    break;
                case 8:
                    str3 = "Eight hundred";
                    break;
                case 9:
                    str3 = "Nine hundred";
                    break;
            }
        }

        if (num2 == 1 && num1 != 0){
            System.out.println("The number is: " + str2);
        }else if (num2 != 1 && num1 != 0){
            System.out.println("The number is: " + str2 + " " + str1);
        }else if (num3 != 0){
            System.out.println("The number is: " + str3);
        }else if (num3 != 0 || num2 != 0 || num1 != 0 ){
            System.out.println("The number is: " + str3 + " and " + str2 + " " + str1 );
        }
        else {
            System.out.println("Out of ability");
        }
    }
}
