import java.lang.reflect.InvocationTargetException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Scanner sc = new Scanner(System.in);
        boolean repeat = true;
        int n = 0;
        while (repeat) {
            System.out.println("Choose case:\n" +
                    "1. Log in\n" +
                    "2. Sign up");
            n = sc.nextInt();
            sc.nextLine();
            if (n == 1 || n == 2) {
                repeat = false;
            }
        }
        repeat = true;
        switch (n) {
            case 2:
                Sign_up signUp = new Sign_up();
                signUp.addNewUser();
                System.out.println("Welcome to our animal store, " + signUp.getNickname() + "!");
            case 1:
                Log_in logIn = new Log_in();
                System.out.println("Enter your nickname");
                String nickname = sc.nextLine();
                System.out.println("Enter your password");
                String password = sc.nextLine();
                switch (logIn.log_in(nickname, password)) {
                    case 1:
                        Admin admin = new Admin();
                        while (repeat) {
                            System.out.println("What do you want to change:\n" +
                                    "1. Add new animal\n" +
                                    "2. Delete animal\n" +
                                    "3. Add new admin\n" +
                                    "4. Exit");
                            n = sc.nextInt();
                            sc.nextLine();
                            switch (n) {
                                case 1:
                                    System.out.println("What type of animal you want to add?");
                                    String type = sc.nextLine();
                                    admin.addNewAnimal(type);
                                    break;
                                case 2:
                                    System.out.println("What type of animal you want delete?");
                                    System.out.println("1. Birds\n" +
                                            "2. Fish\n" +
                                            "3. Dogs\n" +
                                            "4. Cats\n" +
                                            "5. Rodents");
                                    int m = sc.nextInt();
                                    System.out.println("Enter id of the animal:");
                                    int id = sc.nextInt();
                                    admin.deleteAnimal(m, id);
                                    break;
                                case 3:
                                    admin.addAdmin();
                                    break;
                                case 4:
                                    repeat = false;
                                    break;
                                default:
                                    System.out.println("Invalid command");
                            }
                        }
                        break;
                    case 2:
                        User user = new User(nickname, password);
                        System.out.println("Welcome to our animal store, " + nickname + "!");
                        while (repeat) {
                            System.out.println("1. Show all animals\n" +
                                    "2. Buy animal\n" +
                                    "3. Show purchases\n" +
                                    "4. Exit");
                            n = sc.nextInt();
                            sc.nextLine();
                            switch (n) {
                                case 1:
                                    System.out.println("Что вы хотите заказать:\n" +
                                            "Show all:\n" +
                                            "1. Birds\n" +
                                            "2. Fish\n" +
                                            "3. Dogs\n" +
                                            "4. Cats\n" +
                                            "5. Rodents");
                                    n = sc.nextInt();
                                    sc.nextLine();
                                    user.getAnimals(n);
                                    break;
                                case 2:
                                    System.out.println("What animal you want buy?");
                                    System.out.println("1. Birds\n" +
                                            "2. Fish\n" +
                                            "3. Dogs\n" +
                                            "4. Cats\n" +
                                            "5. Rodents");
                                    int type = sc.nextInt();
                                    System.out.println("Enter id of the animal:");
                                    int id = sc.nextInt();
                                    user.buyAnimal(type, id);
                                    break;
                                case 3:
                                    user.showPurchases();
                                    break;
                                case 4:
                                    repeat = false;
                                    break;
                                default:
                                    System.out.println("Invalid syntax");
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Вы ввели не правильное имя или пароль");
                        break;
                }
                break;
        }
    }
}
