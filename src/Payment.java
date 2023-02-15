import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

interface Payment {
    public void sellTrinkets(int id);

    public void sellFood(int id);
}