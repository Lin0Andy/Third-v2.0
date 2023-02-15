import java.lang.reflect.InvocationTargetException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Admin {
  Scanner sc = new Scanner(System.in);
    void addNewAnimal(String type) throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        switch (type) {
            case "bird":
                System.out.println("Enter the species:");
                String species = sc.nextLine();
                System.out.println("Enter the cost:");
                int cost = sc.nextInt();
                System.out.println("Enter the age:");
                int age = sc.nextInt();
                System.out.println("Enter the weight:");
                float w = (float) sc.nextDouble();
                sc.nextLine();
                System.out.println("Enter the sex:");
                String sex = sc.nextLine();
                System.out.println("Enter the abilities");
                String abilities = sc.nextLine();
                System.out.println("Enter the color:");
                String color = sc.nextLine();
                System.out.println("Enter the diet:");
                String diet = sc.nextLine();
                System.out.println("Enter the life_cycle:");
                String life_cycle = sc.nextLine();
                Animal bird = new Bird(cost,age, w ,sex , abilities,color, species, diet, life_cycle);
                bird.setDatabase();
                break;
            case "fish":
                System.out.println("Enter the species:");
                String speciesF = sc.nextLine();
                System.out.println("Enter the cost:");
                int costF = sc.nextInt();
                System.out.println("Enter the age:");
                int ageF = sc.nextInt();
                System.out.println("Enter the weight:");
                float wF = (float) sc.nextDouble();
                sc.nextLine();
                System.out.println("Enter the sex:");
                String sexF = sc.nextLine();
                System.out.println("Enter the color:");
                String colorF = sc.nextLine();
                System.out.println("Enter the diet:");
                String dietF = sc.nextLine();
                System.out.println("Enter the life_cycle:");
                String life_cycleF = sc.nextLine();
                Animal fish = new Fish(costF,ageF, wF ,sexF ,colorF, speciesF, dietF, life_cycleF);
                fish.setDatabase();
                break;
            case "dog":
                System.out.println("Enter the species:");
                String speciesD = sc.nextLine();
                System.out.println("Enter the cost:");
                int costD = sc.nextInt();
                System.out.println("Enter the age:");
                int ageD = sc.nextInt();
                System.out.println("Enter the weight:");
                float wD = (float) sc.nextDouble();
                sc.nextLine();
                System.out.println("Enter the sex:");
                String sexD = sc.nextLine();
                System.out.println("Enter the abilities");
                String abilitiesD = sc.nextLine();
                System.out.println("Enter the color:");
                String colorD = sc.nextLine();
                System.out.println("Enter the diet:");
                String dietD = sc.nextLine();
                System.out.println("Enter the life_cycle:");
                String life_cycleD = sc.nextLine();
                Animal dog = new Dog(costD,ageD, wD ,sexD , abilitiesD,colorD, speciesD, dietD, life_cycleD);
                dog.setDatabase();
                break;
            case "cat":
                System.out.println("Enter the species:");
                String speciesC = sc.nextLine();
                System.out.println("Enter the cost:");
                int costC = sc.nextInt();
                System.out.println("Enter the age:");
                int ageC = sc.nextInt();
                System.out.println("Enter the weight:");
                float wC = (float) sc.nextDouble();
                sc.nextLine();
                System.out.println("Enter the sex:");
                String sexC = sc.nextLine();
                System.out.println("Enter the abilities");
                String abilitiesC = sc.nextLine();
                System.out.println("Enter the color:");
                String colorC = sc.nextLine();
                System.out.println("Enter the diet:");
                String dietC = sc.nextLine();
                System.out.println("Enter the life_cycle:");
                String life_cycleC = sc.nextLine();
                Animal cat = new Cat(costC,ageC, wC ,sexC , colorC, speciesC, dietC, life_cycleC);
                cat.setDatabase();
                break;
            case "rodent":
                System.out.println("Enter the species:");
                String speciesR = sc.nextLine();
                System.out.println("Enter the cost:");
                int costR = sc.nextInt();
                System.out.println("Enter the age:");
                int ageR = sc.nextInt();
                System.out.println("Enter the weight:");
                float wR = (float) sc.nextDouble();
                sc.nextLine();
                System.out.println("Enter the sex:");
                String sexR = sc.nextLine();
                System.out.println("Enter the color:");
                String colorR = sc.nextLine();
                System.out.println("Enter the diet:");
                String dietR = sc.nextLine();
                System.out.println("Enter the life_cycle:");
                String life_cycleR = sc.nextLine();
                Animal rodent = new Rodent(costR,ageR, wR ,sexR  ,colorR, speciesR, dietR, life_cycleR);
                rodent.setDatabase();
                break;

        }
    }
  
  void deleteAnimal(int m, int n) throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        DataBase base = new DataBase();
        switch (m){
            case 1:
                try{
                    String sql = "DELETE FROM birds where id = " + n;
                    base.statement.executeUpdate(sql);
                    }
                catch(Exception ex) {
                    System.out.println("Введен неверный id");
                    System.out.println(ex);
                }
                break;
            case 2:
                try {
                    String sql = "DELETE FROM fish where id = " + n;
                    base.statement.executeUpdate(sql);
                }
                catch(Exception ex) {
                    System.out.println("Введен неверный id");
                    System.out.println(ex);
                }
                break;
            case 3:
                try{
                    String sql = "DELETE FROM dogs where id = " + n;
                    base.statement.executeUpdate(sql);
                }
                catch(Exception ex){
                    System.out.println("Введен неверный id");
                    System.out.println(ex);
                }
                break;
            case 4:
                try{
                    String sql = "DELETE FROM cats where id = " +  n;
                    base.statement.executeUpdate(sql);
                }
                catch(Exception ex){
                        System.out.println("Введен неверный id");
                        System.out.println(ex);
                        }
                break;
            case 5:
                try {
                    String sql = "DELETE FROM rodents where id = " + n;
                    base.statement.executeUpdate(sql);
                }
                catch(Exception ex){
                    System.out.println("Введен неверный id");
                    System.out.println(ex);
                }
                break;
        }
    }
  
  
  void addAdmin() throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        DataBase base = new DataBase();
        System.out.println("Enter nickname:");
        String nickname = sc.nextLine();
        System.out.println("Enter email:");
        String email = sc.nextLine();
        System.out.println("Enter password:");
        String password = sc.nextLine();
        PreparedStatement preparedStatement = base.connection.prepareStatement("INSERT admin (nickname, email, password_) values (?, ?, ?)");
        preparedStatement.setString(1,nickname);
        preparedStatement.setString(2, email);
        preparedStatement.setString(3,password);
        preparedStatement.executeUpdate();
    }
}
