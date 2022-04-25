package _19_string_regex.exercise;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateClassName {
    public static final String REGEX_CLASS_NAME = "^[C|A|P]\\d{4}[G|H|K|L|M]+$";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name class: ");
        String nameClass = sc.nextLine();
        if (validate(nameClass)){
            System.out.println("Valid name.");
        }else {
            System.out.println("Invalid name.");
        }
    }

    public static boolean validate(String str){
        boolean check = Pattern.matches(REGEX_CLASS_NAME, str);
        return check;
    }
}
