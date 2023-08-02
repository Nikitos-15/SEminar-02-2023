package Prodect;

public class CurcedProducts extends Product {

    private int longevity;
    public CurcedProducts(String name, double price, int longevity) {
        super(name, price);
        this.longevity = longevity;

    }
    @Override
    public String toString(){
        return String.format("%s longevity %d \n" , super.toString(),  longevity);
    }

}
