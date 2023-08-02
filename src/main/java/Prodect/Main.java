package Prodect;

public class Main {

    public static void main(String[] args){

        WendingMachine store = new WendingMachine();

        store.addProduct(new Product("Lays",123))
                .addProduct(new Product( "fanta", 98))
                 .addProduct(new CurcedProducts( "milk", 65.78, 7))
                 .addProduct(new beer( "notbeer", 67.89,99 ));

        System.out.println(store);;

        System.out.println("searching for Lay's ");
        System.out.println(store.findProduct("Lays"));

        System.out.println("Buying Lay's");
        store.buy("Lays",123.0);
        System.out.println(store);

        System.out.println("Buying fanta");
        store.buy("fanta",98.0);
        System.out.println(store);

        System.out.println("Buying fta");
        store.buy("fta",8.0);
        System.out.println(store);

        System.out.println("Buying milk");
        store.buy("milk",65.78);
        System.out.println(store);



    }
}
