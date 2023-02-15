import java.lang.reflect.InvocationTargetException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public abstract class Log_in {
    Scanner sc = new Scanner(System.in);

    int log_in(String nickname, String password) throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        DataBase base = new DataBase();
        ResultSet resultset = base.statement.executeQuery("SELECT nickname, passwordA FROM admin");
        while (resultset.next()) {
            if (resultset.getString(1).equals(nickname) && resultset.getString(2).equals(password)) {
                return 1;
            }
        }
        ResultSet resultset2 = base.statement.executeQuery("SELECT username, passwordU FROM users");
        while (resultset2.next()) {
            if (resultset2.getString(1).equals(nickname) && resultset2.getString(2).equals(password)) {
                return 2;
            }
        }
        return 3;
    }
}
