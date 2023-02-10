import java.util.ArrayList;

public class Inventory {
    private ArrayList<Animal> products;

    public Inventory(){
        products = new ArrayList<Animal>();
    }
    public void addProduct(Animal product){
        products.add(product);
    }
    public ArrayList<Animal> getProducts(){
        return products;
    }
    public Animal getProduct(String pName){
        for (Animal product : products){
            if(product.name.equals(pName)){
                return product;
            }
        }
        return null;
    }
    public void listProducts(){
        System.out.println("Product List: ");
        for (Animal product : products){
            System.out.println(product.toString());
        }
    }
}
