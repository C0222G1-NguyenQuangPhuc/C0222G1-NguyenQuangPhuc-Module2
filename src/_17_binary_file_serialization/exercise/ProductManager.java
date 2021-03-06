package _17_binary_file_serialization.exercise;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    public static final String SOURCE_FILE = "src/_17_binary_file_serialization/exercise/product_list.txt";
    public static List<Product> listProduct = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

    public void display() throws IOException {
        listProduct = (List<Product>) ReadAndWriterBinaryFile.readBinaryFile(SOURCE_FILE);
        for (Product item : listProduct) {
            System.out.println(item);
        }
    }

    public void addNewProduct() throws IOException {
        listProduct = (List<Product>) ReadAndWriterBinaryFile.readBinaryFile(SOURCE_FILE);
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
            ReadAndWriterBinaryFile.writeBinaryFile(SOURCE_FILE, listProduct);
            System.out.println("Add new successful");
        } catch (NumberFormatException e) {
            System.out.println("Retry");
        }
    }

    public void findByName() throws IOException {
        listProduct = (List<Product>) ReadAndWriterBinaryFile.readBinaryFile(SOURCE_FILE);
        System.out.println("Enter Name of Product: ");
        String nameProduct = sc.nextLine();
        boolean check = false;
        for (Product item : listProduct) {
            if (item.getName().toLowerCase().contains(nameProduct.toLowerCase())) {
                System.out.println(item.toString());
                check = true;
            }
        }
        if (!check) {
            System.out.println("Not Found");
        }
    }
}
