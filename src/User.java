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
    void buyAnimal(int type, int id) throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        DataBase base = new DataBase();
        switch (type){
            case 1:
                try{
                    String sql1 = "SELECT * FROM birds WHERE id = " + id;
                    System.out.println(sql1);
                    ResultSet resultSet = base.statement.executeQuery(sql1);
                    PreparedStatement preparedStatement = base.connection.prepareStatement("INSERT purchases(userName, typeOfAnimal, cost, age, weight, sex, abilities, diet, Life_cycle, color, species)" +
                            "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ? ,?)");
                    while(resultSet.next()){
                        preparedStatement.setString(1, this.username);
                        preparedStatement.setString(2, "Bird");
                        preparedStatement.setInt(3, resultSet.getInt(2));
                        preparedStatement.setInt(4, resultSet.getInt(3));
                        preparedStatement.setFloat(5, resultSet.getFloat(4));
                        preparedStatement.setString(6, resultSet.getString(5));
                        preparedStatement.setString(7, resultSet.getString(6));
                        preparedStatement.setString(8, resultSet.getString(7));
                        preparedStatement.setString(9, resultSet.getString(8));
                        preparedStatement.setString(10, resultSet.getString(9));
                        preparedStatement.setString(11,resultSet.getString(10));
                        preparedStatement.executeUpdate();
                    }

                    String sql = "DELETE FROM birds where id = " + id;
                    base.statement.executeUpdate(sql);
                }
                catch(Exception ex) {
                    System.out.println("Введен неверный id");
                    System.out.println(ex);
                }
                break;
            case 2:
                try {
                    String sql1 = "SELECT * FROM fish WHERE id = " + id;
                    ResultSet resultSet = base.statement.executeQuery(sql1);
                    PreparedStatement preparedStatement = base.connection.prepareStatement("INSERT purchases(userName, typeOfAnimal, cost, age, weight, sex, abilities, diet, Life_cycle, color, species)" +
                            "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ? ,?)");
                    preparedStatement.setString(1, this.username);
                    preparedStatement.setString(2, "fish");
                    preparedStatement.setInt(3, resultSet.getInt(2));
                    preparedStatement.setInt(4, resultSet.getInt(3));
                    preparedStatement.setFloat(5, resultSet.getFloat(4));
                    preparedStatement.setString(6, resultSet.getString(5));
                    preparedStatement.setString(7, resultSet.getString(6));
                    preparedStatement.setString(8, resultSet.getString(7));
                    preparedStatement.setString(9, resultSet.getString(8));
                    preparedStatement.setString(10, resultSet.getString(9));
                    preparedStatement.setString(11,resultSet.getString(10));
                    preparedStatement.executeUpdate();
                    String sql = "DELETE FROM fish where id = " + id;
                    base.statement.executeUpdate(sql);
                }
                catch(Exception ex) {
                    System.out.println("Введен неверный id");
                    System.out.println(ex);
                }
                break;
            case 3:
                try{
                    String sql1 = "SELECT * FROM dogs WHERE id = " + id;
                    ResultSet resultSet = base.statement.executeQuery(sql1);
                    PreparedStatement preparedStatement = base.connection.prepareStatement("INSERT purchases(userName, typeOfAnimal, cost, age, weight, sex, color, abilities,  species)" +
                            "values (?, ?, ?, ?, ?, ?, ?, ?, ?)");
                    preparedStatement.setString(1, this.username);
                    preparedStatement.setString(2, "Dog");
                    preparedStatement.setInt(3, resultSet.getInt(2));
                    preparedStatement.setInt(4, resultSet.getInt(3));
                    preparedStatement.setFloat(5, resultSet.getFloat(4));
                    preparedStatement.setString(6, resultSet.getString(5));
                    preparedStatement.setString(7, resultSet.getString(6));
                    preparedStatement.setString(8, resultSet.getString(7));
                    preparedStatement.setString(9, resultSet.getString(8));
                    preparedStatement.executeUpdate();
                    String sql = "DELETE FROM dogs where id = " + id;
                    base.statement.executeUpdate(sql);
                }
                catch(Exception ex){
                    System.out.println("Введен неверный id");
                    System.out.println(ex);
                }
                break;
            case 4:
                try{
                    String sql1 = "SELECT * FROM cats WHERE id = " + id;
                    ResultSet resultSet = base.statement.executeQuery(sql1);
                    PreparedStatement preparedStatement = base.connection.prepareStatement("INSERT purchases(userName, typeOfAnimal, cost, age, weight, sex,  species)" +
                            "values (?, ?, ?, ?, ?, ?, ?, ?)");
                    preparedStatement.setString(1, this.username);
                    preparedStatement.setString(2, "Bird");
                    preparedStatement.setInt(3, resultSet.getInt(2));
                    preparedStatement.setInt(4, resultSet.getInt(3));
                    preparedStatement.setFloat(5, resultSet.getFloat(4));
                    preparedStatement.setString(6, resultSet.getString(5));
                    preparedStatement.setString(7, resultSet.getString(6));
                    preparedStatement.setString(8, resultSet.getString(7));
                    preparedStatement.executeUpdate();
                    String sql = "DELETE FROM cats where id = " +  id;
                    base.statement.executeUpdate(sql);
                }
                catch(Exception ex){
                    System.out.println("Введен неверный id");
                    System.out.println(ex);
                }
                break;
            case 5:
                try {
                    String sql1 = "SELECT * FROM rodents WHERE id = " + id;
                    ResultSet resultSet = base.statement.executeQuery(sql1);
                    PreparedStatement preparedStatement = base.connection.prepareStatement("INSERT purchases(userName, typeOfAnimal, cost, age, weight, sex, color, species)" +
                            "values (?, ?, ?, ?, ?, ?, ?, ?)");
                    preparedStatement.setString(1, this.username);
                    preparedStatement.setString(2, "Bird");
                    preparedStatement.setInt(3, resultSet.getInt(2));
                    preparedStatement.setInt(4, resultSet.getInt(3));
                    preparedStatement.setFloat(5, resultSet.getFloat(4));
                    preparedStatement.setString(6, resultSet.getString(5));
                    preparedStatement.setString(7, resultSet.getString(6));
                    preparedStatement.setString(8, resultSet.getString(7));
                    preparedStatement.executeUpdate();
                    String sql = "DELETE FROM rodents where id = " + id;
                    base.statement.executeUpdate(sql);
                }
                catch(Exception ex){
                    System.out.println("Введен неверный id");
                    System.out.println(ex);
                }
                break;
        }
    }
    void getAnimals(int n) throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        DataBase base = new DataBase();
        switch (n){
            case 1:
                ResultSet resultSet = base.statement.executeQuery("SELECT * FROM birds");
                while (resultSet.next()){
                    System.out.println("id: " + resultSet.getInt(1) + "; cost: " + resultSet.getInt(2) + "; age: " + resultSet.getInt(3) +
                            "; weight: " + resultSet.getFloat(4) + "; sex: " + resultSet.getString(5) + "; abilities: " + resultSet.getString(6) +
                            "; diet: " + resultSet.getString(7) + "; life cycle: " + resultSet.getString(8) + "; color: " + resultSet.getString(9) +
                            "; species: " + resultSet.getString(10));
            }
                break;
            case 2:
                ResultSet resultSetF = base.statement.executeQuery("SELECT * FROM fish");
                while (resultSetF.next()) {
                    System.out.println("id: " + resultSetF.getString(1) + "; cost: " + resultSetF.getInt(2) + "; age: " + resultSetF.getInt(3) +
                            "; weight: " + resultSetF.getFloat(4) + "; sex: " + resultSetF.getString(5) + "; diet: " + resultSetF.getString(6) +
                            "; life cycle: " + resultSetF.getString(7) + "; color: " + resultSetF.getString(8) +
                            "; species: " + resultSetF.getString(9));
                }
                break;
            case 3:
                ResultSet resultSetD = base.statement.executeQuery("SELECT * FROM dogs");
                while (resultSetD.next()) {
                    System.out.println("id: " + resultSetD.getInt(1) + "; cost: " + resultSetD.getInt(2) + "; age: " + resultSetD.getInt(3) +
                            "; weight: " + resultSetD.getFloat(4) + "; sex: " + resultSetD.getString(5) + "; diet: " + resultSetD.getString(6) +
                            "; life cycle: " + resultSetD.getString(7) + "; color: " + resultSetD.getString(8) + "; abilities: " + resultSetD.getString(9) +
                            "; species: " + resultSetD.getString(10));
                }
                break;
            case 4:
                ResultSet resultSetC = base.statement.executeQuery("SELECT * FROM cats");
                while (resultSetC.next()) {
                    System.out.println("id: " + resultSetC.getInt(1) + "; cost: " + resultSetC.getInt(2) + "; age: " + resultSetC.getInt(3) +
                            "; weight: " + resultSetC.getFloat(4) + "; sex: " + resultSetC.getString(5) +
                            "; diet: " + resultSetC.getString(6) + "; life cycle: " + resultSetC.getString(7) + "; color: " + resultSetC.getString(8) +
                            "; species: " + resultSetC.getString(9));
                }
                break;
            default:
                ResultSet resultSetR = base.statement.executeQuery("SELECT * FROM rodents");
                while (resultSetR.next()) {
                    System.out.println("id: " + resultSetR.getInt(1) + "; cost: " + resultSetR.getInt(2) + "; age: " + resultSetR.getInt(3) +
                            "; weight: " + resultSetR.getFloat(4) + "; sex: " + resultSetR.getString(5) +
                            "; diet: " + resultSetR.getString(6) + "; life cycle: " + resultSetR.getString(7) + "; color: " + resultSetR.getString(8) +
                            "; species: " + resultSetR.getString(9));
                }
                break;
        }

    }
    void showPurchases() throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        DataBase base = new DataBase();
        try{
            String sql = "SELECT * FROM purchases WHERE userName = " + this.username;
            ResultSet resultSet = base.statement.executeQuery(sql);
            while(resultSet.next()){
                System.out.println("type of animal: " + resultSet.getString(3) + "; cost: " + resultSet.getInt(4) + "; age: " + resultSet.getInt(5) +
                        "; weight: " + resultSet.getFloat(6) + "; sex: " + resultSet.getString(7) + "; abilities: " + resultSet.getString(8) +
                        "; diet: " + resultSet.getString(9) + "; life cycle: " + resultSet.getString(10) + "; color: " + resultSet.getString(11) +
                        "; species: " + resultSet.getString(12));
            }
        }catch (Exception ex){
            System.out.println("You are not shopping in our store.");
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
