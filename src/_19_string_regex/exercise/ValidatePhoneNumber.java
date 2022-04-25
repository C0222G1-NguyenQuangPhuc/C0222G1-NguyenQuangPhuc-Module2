package _19_string_regex.exercise;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    public static final String PHONE_REGEX = "^[(]84[)][-][(][0]\\d{9}[)]$";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Phone number:");
        String phoneNumber = sc.nextLine();
        boolean check = Pattern.matches(PHONE_REGEX,phoneNumber);
        if (check){
            System.out.println("Valid phone number");
        }else {
            System.out.println("Invalid phone number");
        }
    }

}
