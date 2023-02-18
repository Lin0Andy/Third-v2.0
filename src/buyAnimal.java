import java.lang.reflect.InvocationTargetException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class buyAnimal extends User{

    buyAnimal() throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        super(null,null);
    }
    @Override
    void buyAnimal(int type, int id) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, SQLException {
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
                        preparedStatement.setString(1, getUsername());
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
                    PreparedStatement preparedStatement = base.connection.prepareStatement("INSERT purchases(userName, typeOfAnimal, cost, age, weight, sex, diet, Life_cycle, color, species, abilities)" +
                            "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ? ,?)");
                    while (resultSet.next()){
                        preparedStatement.setString(1, getUsername());
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
                    }

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
                    PreparedStatement preparedStatement = base.connection.prepareStatement("INSERT purchases(userName, typeOfAnimal, cost, age, weight, sex, diet,Life_cycle, color,abilities,   species)" +
                            "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                    while (resultSet.next()){
                        preparedStatement.setString(1, getUsername());
                        preparedStatement.setString(2, "Dog");
                        preparedStatement.setInt(3, resultSet.getInt(2));
                        preparedStatement.setInt(4, resultSet.getInt(3));
                        preparedStatement.setFloat(5, resultSet.getFloat(4));
                        preparedStatement.setString(6, resultSet.getString(5));
                        preparedStatement.setString(7, resultSet.getString(6));
                        preparedStatement.setString(8, resultSet.getString(7));
                        preparedStatement.setString(9, resultSet.getString(8));
                        preparedStatement.setString(10, resultSet.getString(9));
                        preparedStatement.setString(11, resultSet.getString(10));
                        preparedStatement.executeUpdate();
                    }

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
                    PreparedStatement preparedStatement = base.connection.prepareStatement("INSERT purchases(userName, typeOfAnimal, cost, age, weight, sex,diet, Life_cycle, color,  species)" +
                            "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                    while(resultSet.next()){
                        preparedStatement.setString(1, getUsername());
                        preparedStatement.setString(2, "Cat");
                        preparedStatement.setInt(3, resultSet.getInt(2));
                        preparedStatement.setInt(4, resultSet.getInt(3));
                        preparedStatement.setFloat(5, resultSet.getFloat(4));
                        preparedStatement.setString(6, resultSet.getString(5));
                        preparedStatement.setString(7, resultSet.getString(6));
                        preparedStatement.setString(8, resultSet.getString(7));
                        preparedStatement.setString(9, resultSet.getString(8));
                        preparedStatement.setString(10, resultSet.getString(9));
                        preparedStatement.executeUpdate();
                    }

                    String sql = "DELETE FROM cats where id = " +  id;
                    base.statement.executeUpdate(sql);
                }
                catch(Exception ex){
                    System.out.println("Введен неверный id :(");
                    System.out.println(ex);
                }
                break;
            case 5:
                try {
                    String sql1 = "SELECT * FROM rodents WHERE id = " + id;
                    ResultSet resultSet = base.statement.executeQuery(sql1);
                    PreparedStatement preparedStatement = base.connection.prepareStatement("INSERT purchases(userName, typeOfAnimal, cost, age, weight, sex, diet, Life_cycle,  color, species)" +
                            "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                    while(resultSet.next()){
                        preparedStatement.setString(1, getUsername());
                        preparedStatement.setString(2, "Rodent");
                        preparedStatement.setInt(3, resultSet.getInt(2));
                        preparedStatement.setInt(4, resultSet.getInt(3));
                        preparedStatement.setFloat(5, resultSet.getFloat(4));
                        preparedStatement.setString(6, resultSet.getString(5));
                        preparedStatement.setString(7, resultSet.getString(6));
                        preparedStatement.setString(8, resultSet.getString(7));
                        preparedStatement.setString(9, resultSet.getString(8));
                        preparedStatement.setString(10, resultSet.getString(9));
                        preparedStatement.executeUpdate();
                    }

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
}
