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
