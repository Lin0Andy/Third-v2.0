package Animal;

import Animal.Animal;
import DataBase.DataBase;

import java.lang.reflect.InvocationTargetException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
public class Rodent extends Animal {
    public Rodent(int cost, int age, float weight, String sex, String colour, String species, String diet, String life_cycle){
        this.name =name;
        this.age = age;
        this.colour = colour;
        this.cost = cost;
        this.sex = sex;
        this.weight = weight;
        this.species = species;
        this.diet = diet;
        this.life_cycle = life_cycle;

    }
    public void setDatabase() throws ClassNotFoundException, SQLException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        DataBase base = new DataBase();
        try {
            ResultSet resultset = base.statement.executeQuery("SELECT * FROM rodents");
            int maxId = 0;
            try (ResultSet last_id = base.statement.executeQuery("SELECT max(id) FROM rodents")) {
                if (last_id.next()) {
                    maxId = last_id.getInt(1);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            String sql = "INSERT rodents(id , cost , age, weight, sex, color,diet, species, Life_cycle) values (?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = base.connection.prepareStatement(sql);
            preparedStatement.setInt(1, maxId + 1);
            preparedStatement.setInt(2, this.cost);
            preparedStatement.setInt(3, this.age);
            preparedStatement.setFloat(4, this.weight);
            preparedStatement.setString(5, this.sex);
            preparedStatement.setString(6, this.colour);
            preparedStatement.setString(7, this.diet);
            preparedStatement.setString(8, this.species);
            preparedStatement.setString(9, this.life_cycle);
            preparedStatement.executeUpdate();
        } catch (SQLIntegrityConstraintViolationException ex) {
            System.out.println("Что то пошло не так(");
        }
    }
}
