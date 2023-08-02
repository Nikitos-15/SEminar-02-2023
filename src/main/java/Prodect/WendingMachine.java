package Prodect;

import jdk.swing.interop.LightweightContentWrapper;

import java.util.ArrayList;
import java.util.List;
public class WendingMachine {



    public Double getMoney() {

        return money;
    }

    private Double money = 0.0;
    public List<Product> getProducts() {
        return products;
    }

    private List<Product> products = new ArrayList<>();

       //Product("Lays" , 123.55)


   public WendingMachine addProduct(Product product){
       this.products.add(product);
       return this;
   }
   public Product findProduct(String name){
       for (Product prod: getProducts()){
           if (prod.getName().equals(name)){
               return prod;
           }
       }
       return null;
   }

   public Product buy(String name, Double price ){
       Product somthing = findProduct(name);
       if (somthing == null) return null;
       if (price.equals(somthing.getPrice())){
          products.remove(somthing);
          money += price;
          return somthing;
       }
       System.out.println("price is wrong");
     return null;
   }

    @Override
    public String toString(){
       StringBuilder wdProduct = new StringBuilder ();
        for (Product prod : this.getProducts())  {
           wdProduct.append(prod.toString());
            wdProduct.append("\n");
        }
        wdProduct.append(money);
        return wdProduct.toString();
    }

    //public WendingMachine ad
}
