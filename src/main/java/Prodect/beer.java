package Prodect;

public class beer extends Product{

    private int alcohol=0;
    public beer(String name, double price) {

        super(name, price);
    }

    public beer(String name, double price, int alcohol) {
        this(name, price);
        this.alcohol = alcohol;
    }

    @Override
    public String toString() {
        return String.format("%s alcohol = %d ", super.toString(), alcohol);
    }
}
