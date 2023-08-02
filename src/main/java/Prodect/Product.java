package Prodect;

public class Product {

    private String name;

    private Double price;

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

    @Override
    public String toString(){
        return String.format("Name = %s ; price  %2.2f;  " , name,price); //%s строка  %f с плавающтй точкой
    }
}
