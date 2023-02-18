package User;
import DataBase.DataBase;
import java.lang.reflect.InvocationTargetException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class getAnimal extends User {
    private String  username, password;
    public getAnimal() throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        super(null,null);

    }
    @Override
    public void getAnimals(int n) throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
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
}
