package Sign_up;

import DataBase.DataBase;

import java.lang.reflect.InvocationTargetException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Sign_up {
    private String nickname;
    private String password;

    public void addNewUser() throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        DataBase base = new DataBase();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the username");
        String username = sc.nextLine();
        this.nickname = username;
        System.out.println("Enter the firstname");
        String firstName = sc.nextLine();
        System.out.println("Enter the lastname");
        String lastName = sc.nextLine();
        System.out.println("Enter the password");
        String password = sc.nextLine();
        this.password = password;
        System.out.println("Enter the email");
        String email = sc.nextLine();
        System.out.println("Enter the address");
        String address = sc.nextLine();
        System.out.println("Enter the phone number");
        long phoneNumber = sc.nextLong();
        int maxId = 0;
        try (ResultSet last_id = base.statement.executeQuery("SELECT max(id) FROM users")) {
            if (last_id.next()) {
                maxId = last_id.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        PreparedStatement preparedStatement = base.connection.prepareStatement("INSERT users (id, username, email, passwordU, firstname, lastname, phoneNumber, address)" +
                " values (?,?,?,?,?,?,?,?)");
        preparedStatement.setInt(1, maxId + 1);
        preparedStatement.setString(2, username);
        preparedStatement.setString(3, email);
        preparedStatement.setString(4, password);
        preparedStatement.setString(5, firstName);
        preparedStatement.setString(6, lastName);
        preparedStatement.setLong(7, phoneNumber);
        preparedStatement.setString(8, address);
        preparedStatement.executeUpdate();
    }

    public String getNickname() {
        return this.nickname;
    }

    String getPassword() {
        return this.password;
    }
}
