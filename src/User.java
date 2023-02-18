import java.lang.reflect.InvocationTargetException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class User{

    private String firstName, lastName, username, password, email, address;
    private long phoneNumber;
    private double wallet;
    private boolean isLoggedIn;

    //    public User(String username, String password, String email, String firstName, String lastName, String address, String phoneNumber) {
//        this.username = username;
//        this.password = password;
//        this.email = email;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.address = address;
//        this.phoneNumber = phoneNumber;
//    }
    User(String username, String password) throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        DataBase base = new DataBase();
        this.username = username;
        this.password = password;
        ResultSet resultset = base.statement.executeQuery("SELECT * FROM users");
        while (resultset.next()) {
            if (resultset.getString(2).equals(username) && resultset.getString(4).equals(password)) {
                setEmail(resultset.getString(3));
                setFirstName(resultset.getString(5));
                setLastName(resultset.getString(6));
                setPhoneNumber(resultset.getLong(7));
                setAddress(resultset.getString(8));
            }
        }
    }
    void buyAnimal(int type, int id) throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException{};

    void getAnimals(int n) throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {};
    void showPurchases() throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        DataBase base = new DataBase();
        try{
            String sql = "SELECT * FROM purchases WHERE userName = '" + this.username + "' ";
            ResultSet resultSet = base.statement.executeQuery(sql);
            while(resultSet.next()){
                System.out.println("type of animal: " + resultSet.getString(3) + "; cost: " + resultSet.getInt(4) + "; age: " + resultSet.getInt(5) +
                        "; weight: " + resultSet.getFloat(6) + "; sex: " + resultSet.getString(7) + "; abilities: " + resultSet.getString(8) +
                        "; diet: " + resultSet.getString(9) + "; life cycle: " + resultSet.getString(10) + "; color: " + resultSet.getString(11) +
                        "; species: " + resultSet.getString(12));
            }
        }catch (Exception ex){
            System.out.println("You are not shopping in our store.");
            System.out.println(ex);
        }
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setWallet(double wallet){
        this.wallet = wallet;
    }
    public String getPassword() {
        return this.password;
    }
    public String getUsername() {
        return username;
    }
    public String getEmail() {
        return email;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }
    public double getWallet(){
        return this.wallet;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

//    public void registration(String username, String password, String email, String firstName, String lastName, String address, int phoneNumber){
//        this.username = username;
//        this.password = password;
//        this.email = email;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.address = address;
//        this.phoneNumber = phoneNumber;
//        System.out.println("User " + username + " has been registered.");
//    }
//    public boolean isLoggedIn(String username, String password){
//        if(this.username.equals(username) && this.password.equals(password)){
//            this.isLoggedIn = true;
//            return true;
//        }else
//            return false;
//    }
//    public void logout() {
//        this.isLoggedIn = false;
//    }
}
