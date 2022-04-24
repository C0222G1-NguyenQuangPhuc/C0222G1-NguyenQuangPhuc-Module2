package _17_binary_file_serialization.exercise;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    public static final String sourceFile = "src/_17_binary_file_serialization/exercise/product_list.txt";
    public static List<Product> listProduct = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

    public void display() throws IOException {
        listProduct = (List<Product>) ReadAndWriterBinaryFile.readBinaryFile(sourceFile);
        for (Product item : listProduct) {
            System.out.println(item);
        }
    }

    public void addNewProduct() throws IOException {
        listProduct = (List<Product>) ReadAndWriterBinaryFile.readBinaryFile(sourceFile);
        try {
            System.out.println("Enter id: ");
            int id = Integer.parseInt(sc.nextLine());
            System.out.println("Enter name product: ");
            String name = sc.nextLine();
            System.out.println("Enter branch: ");
            String brand = sc.nextLine();
            System.out.println("Enter price: ");
            double price = Double.parseDouble(sc.nextLine());
            System.out.println("Describe product: ");
            String describe = sc.nextLine();
            Product newProduct = new Product(id, name, brand, price, describe);
            listProduct.add(newProduct);
            ReadAndWriterBinaryFile.writeBinaryFile("src/_17_binary_file_serialization/exercise/product_list.txt", listProduct);
            System.out.println("Add new successful");
        } catch (NumberFormatException e) {
            System.out.println("Retry");
        }
    }

    public void findById() throws IOException {
        listProduct = (List<Product>) ReadAndWriterBinaryFile.readBinaryFile(sourceFile);
        System.out.println("Enter Id of Product: ");
        try {
            int id = Integer.parseInt(sc.nextLine());
            boolean check = false;
            for (Product item : listProduct) {
                if (item.getId() == id) {
                    System.out.println(item.toString());
                    check = true;
                }
            }
            if (!check) {
                System.out.println("Not Found");
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter right Id Product");
        }
    }
}
