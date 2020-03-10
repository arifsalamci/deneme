package utilities;

import java.net.ConnectException;
import java.sql.*;

public class DBUtility2 {

    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;


    public static void createConnection() throws SQLException {
        switch (Config.getProperty("dbType")){
            case "oracle":
                connection = DriverManager.getConnection(Config.getProperty("oracleURL"), Config.getProperty("oracleUserName"), Config.getProperty("oraclePassword"));
        }
    }

    public static void executeQuery(String query) throws SQLException {
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        resultSet =  statement.executeQuery(query);

        ResultSetMetaData metaData = resultSet.getMetaData();

    }
}
