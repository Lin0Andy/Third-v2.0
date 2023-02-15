import java.util.ArrayList;

public class Inventory {
    private String storeName;
    private String Trinkets = "toys";
    private String FoodItems = "food";
    private double trinketPrice = 0;
    private double foodPrice = 0;
    double balance = 0;

    public Inventory(String trinkets, double tPrice, String food, double fPrice) {
        Trinkets = trinkets;
        FoodItems = food;
        trinketPrice = tPrice;
        foodPrice = fPrice;
    }

    public void sellTrinkets(int id){
        if(balance >= trinketPrice){
            System.out.println(Trinkets + " sold for " + trinketPrice);
        }
        else{
            System.out.println("Not enough balance for trade!");
        }
    }

    public void sellFood(int id){
        if(balance >= foodPrice){
            System.out.println(FoodItems + " sold for " + foodPrice);
        }
        else{
            System.out.println("Not enough balance for trade!");
        }
    }
}
