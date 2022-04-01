package _02_loop.exercise;

import java.util.Scanner;

public class ShowPrimeSmallerThan100 {
    public static void main(String[] args) {
       int count = 1;
       int n = 2;
       while (n < 100){
          boolean check = true;
           for (int i = 2; i < n ; i++) {
               if (n % i == 0){
                   check = false;
                   break;
               }
           }
           if (check){
               System.out.println(n);
           }
           n++;
       }
    }
}
