import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

// Пока не работает. Доделать
public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:8080/database";
        String user = "user";
        String password = "password";
        String query = "CREATE TABLE TABLE1 (TableId int PRIMARY KEY)";

        try (Connection connection = DriverManager.getConnection(url, user,password)){
            Statement statement = connection.createStatement();
            statement.executeQuery(query);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}