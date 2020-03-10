import java.sql.*;

public class DataBaseExample {

    public static void main(String[] args) {


        String url = "jdbc:oracle:thin:@ec2-18-221-149-180.us-east-2.compute.amazonaws.com:1521:xe";
        String username = "hr";
        String password = "hr";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet resultSet = statement.executeQuery("select first_name, last_name from employees");
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Connection failed!!");
        }
    }
}
