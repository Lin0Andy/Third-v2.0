import java.lang.reflect.InvocationTargetException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
public class Cat extends Animal {
    private int id;
    private int cost;
    private int age;
    private float weight;
    private String sex;
    private String color;
    private String species;
    private String diet;
    private String life_cycle;

    protected Cat(int cost, int age, float weight, String sex, String color, String species, String diet, String life_cycle) {
        this.id = id;
        this.age = age;
        this.color = color;
        this.cost = cost;
        this.sex = sex;
        this.weight = weight;
        this.species = species;
        this.diet = diet;
        this.life_cycle = life_cycle;
    }

    @Override
    void setDatabase() throws ClassNotFoundException, SQLException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        DataBase base = new DataBase();
        try {
            ResultSet resultset = base.statement.executeQuery("SELECT * FROM cats");
            int maxId = 0;
            try (ResultSet last_id = base.statement.executeQuery("SELECT max(id) FROM cats")) {
                if (last_id.next()) {
                    maxId = last_id.getInt(1);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            String sql = "INSERT birds(id , cost , age, weight, sex, color,diet, species, Life_cycle) values (?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = base.connection.prepareStatement(sql);
            preparedStatement.setInt(1, maxId + 1);
            preparedStatement.setInt(2, this.cost);
            preparedStatement.setInt(3, this.age);
            preparedStatement.setFloat(4, this.weight);
            preparedStatement.setString(5, this.sex);
            preparedStatement.setString(6, this.color);
            preparedStatement.setString(7, this.diet);
            preparedStatement.setString(8, this.species);
            preparedStatement.setString(9, this.life_cycle);
            preparedStatement.executeUpdate();
        } catch (SQLIntegrityConstraintViolationException ex) {
            System.out.println("Что то пошло не так(");
        }
    }
}
