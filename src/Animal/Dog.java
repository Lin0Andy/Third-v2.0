package Animal;

import Animal.Animal;
import DataBase.DataBase;

import java.lang.reflect.InvocationTargetException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
public class Dog extends Animal {
    private int id;
    private int cost;
    private int age;
    private float weight;
    private String sex;
    private String color;
    private String abilities;
    private String species;
    private String diet;
    private String life_cycle;
    public Dog(int cost, int age, float weight, String sex, String color, String abilities, String species, String diet, String life_cycle){
        this.id = id;
        this.age = age;
        this.color = color;
        this.abilities = abilities;
        this.cost = cost;
        this.sex = sex;
        this.weight = weight;
        this.species = species;
        this.diet = diet;
        this.life_cycle = life_cycle;
    }
    @Override
    public void setDatabase() throws ClassNotFoundException, SQLException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        DataBase base = new DataBase();
        try {
            ResultSet resultset = base.statement.executeQuery("SELECT * FROM dogs");
            int maxId = 0;
            try (ResultSet last_id = base.statement.executeQuery("SELECT max(id) FROM dogs")) {
                if (last_id.next()) {
                    maxId = last_id.getInt(1);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            String sql = "INSERT dogs(id , cost , age, weight, sex, color, abilities, diet, species, Life_cycle) values (?, ?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = base.connection.prepareStatement(sql);
            preparedStatement.setInt(1, maxId + 1);
            preparedStatement.setInt(2, this.cost);
            preparedStatement.setInt(3, this.age);
            preparedStatement.setFloat(4, this.weight);
            preparedStatement.setString(5, this.sex);
            preparedStatement.setString(6, this.color);
            preparedStatement.setString(7, this.abilities);
            preparedStatement.setString(8, this.diet);
            preparedStatement.setString(9, this.species);
            preparedStatement.setString(10, this.life_cycle);
            preparedStatement.executeUpdate();
        } catch (SQLIntegrityConstraintViolationException ex) {
            System.out.println("?????? ???? ?????????? ???? ??????(");
        }
    }
}
