import java.util.ArrayList;

public class Payment {
    private double amount;
    private String paymentMethod;
    private ArrayList<User> users;

    public Payment(Animal animal, String paymentMethod){
        this.amount = animal.cost;
        this.paymentMethod = paymentMethod;
    }
    public double getAmount(){
        return amount;
    }
    public void addUsers(User user){
        users.add(user);
    }
    public ArrayList<User> getUsers() {
        return users;
    }

    public String getPaymentMethod(){
        return paymentMethod;
    }
    public String toString(User user) {
        if(user.getWallet() >= getAmount()){
            user.setWallet(user.getWallet() - getAmount());
            return "Amount: $" + getAmount() + ", Payment Method: " + getPaymentMethod();
        }
        else{
            return "Error! Not enough money for payment.";
        }
    }
}
