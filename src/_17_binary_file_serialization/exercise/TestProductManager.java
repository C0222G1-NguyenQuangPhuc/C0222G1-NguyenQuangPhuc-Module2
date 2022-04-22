package _17_binary_file_serialization.exercise;

import java.io.IOException;
import java.util.Scanner;

public class TestProductManager {
    private static ProductManager productManager = new ProductManager();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        boolean check = true;
        while (check){
            System.out.println("1. Show list Product.");
            System.out.println("2. Add new Product.");
            System.out.println("3. Find Product by ID.");
            System.out.println("0. Exit.");
            System.out.println("Choose your option: ");
            try {
                switch (Integer.parseInt(sc.nextLine())){
                    case 1:
                        productManager.display();
                        break;
                    case 2:
                        productManager.addNewProduct();
                        break;
                    case 3:
                        productManager.findById();
                        break;
                    case 0:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Retry.");
                }
            }catch (NumberFormatException e){
                System.out.println("Please enter number");
            }
        }
    }
}
