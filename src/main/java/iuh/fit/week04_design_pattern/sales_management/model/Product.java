package iuh.fit.week04_design_pattern.sales_management.model;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    public void displayInfor(){
        System.out.println("Product Name: " + name + " Price: " + price);
    }
}
