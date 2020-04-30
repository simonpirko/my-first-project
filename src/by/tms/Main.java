package by.tms;

import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres");
        PreparedStatement preparedStatement = connection.prepareStatement("select * from users u where u.name = ?");
        preparedStatement.setString(1, "test");
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        connection.close();
    }
}
