package _11_dsa_stack_queue.exercise.count_occurrences_of_string;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MyTreeMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a string: ");
        String str = sc.nextLine();
        str = str.replaceAll(" ","").toUpperCase();
        String[] arrString = str.split("");
        System.out.println(Arrays.toString(arrString));
        String key = "";
        Integer value;
        TreeMap<String, Integer> myTreeMap = new TreeMap<>();
        for (int i = 0; i < arrString.length ; i++) {
            key = arrString[i];
            if (!myTreeMap.containsKey(key)){
                myTreeMap.put(key,1);
            }else {
                value = myTreeMap.get(key);
                myTreeMap.put(key, value + 1);
            }
        }
        for (Map.Entry<String, Integer> item: myTreeMap.entrySet()) {
            System.out.println("Ký tự: " + item.getKey() + " xuất hiện " + item.getValue() + " lần");
        }
    }
}
