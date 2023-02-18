package User;
import DataBase.DataBase;
import java.lang.reflect.InvocationTargetException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class showPurcheses extends User{
    public showPurcheses(String username, String password) throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        super(username, password);
    }
    @Override
    public void showPurchases() throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        DataBase base = new DataBase();
        System.out.println(getUsername());
        try{
            String sql = "SELECT * FROM purchases WHERE userName = '" + getUsername() + "' ";
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
}
