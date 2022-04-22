package _17_binary_file_serialization.exercise;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private String branch;
    private double price;
    private String describe;

    public Product() {
    }

    public Product(int id, String name, String branch, double price, String describe) {
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.price = price;
        this.describe = describe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Id: " + id +
                " ,Name product: " + name +
                " ,Branch: " + branch +
                " ,Price: " + price +
                " ,Describe: " + describe;
    }
}
