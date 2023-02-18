import java.lang.reflect.InvocationTargetException;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class User extends Log_in{

    private String firstName, lastName, username, password, email, address;
    private long phoneNumber;
    private double wallet;
    private boolean isLoggedIn;

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
    void buyAnimal(int type, int id) throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {};
    void getAnimals(int n) throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {};
    void showPurchases() throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {};
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
}
