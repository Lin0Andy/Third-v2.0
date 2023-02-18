package Animal;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
public abstract class Animal{

    String name,colour,sex,diet,life_cycle,species;
    float weight;
    int age,cost;
    public abstract void  setDatabase() throws SQLException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, ClassNotFoundException;
}

