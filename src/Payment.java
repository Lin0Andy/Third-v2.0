import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

interface Payment{
    void check() throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException ;
}