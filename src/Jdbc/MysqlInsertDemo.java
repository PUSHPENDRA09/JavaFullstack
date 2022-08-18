package Jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;


public class MysqlInsertDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {




        String url = "jdbc:mysql://localhost:3306/pushpendra";
        String username = "root";
        String password = "Pushpendra@01";
        final String SELECT_QUERY = "select * from emp;";
        Class.forName("com.mysql.cj.jdbc.Driver");
    }
}
