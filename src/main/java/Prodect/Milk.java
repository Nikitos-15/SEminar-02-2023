package Prodect;

public class Milk extends Product {

    private int milk = 0;
    public Milk(String name, double price) {

        super(name, price);

    }

    public Milk (String name, double price, int milk) {
        this(name, price);
        this.milk = milk;
    }
    @Override
    public String toString() {
        return String.format("%s Milk = %d ", super.toString(), milk);
    }
}



