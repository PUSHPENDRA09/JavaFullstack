package Jdbc;


import java.sql.*;

public class MysqlSelectionDemo {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/pushpendra";
        String username = "root";
        String password = "Pushpendra@01";
        final String SELECT_QUERY = "select * from emp;";
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(url,username,password);
        Statement st = con.createStatement();
        ResultSet rs= st.executeQuery(SELECT_QUERY);
        System.out.println("Id "+ " Name "+" Job "+ " MGR ");
        while (rs.next()){
            System.out.print(rs.getInt(1)+" ");
            System.out.print(rs.getString(2)+" ");
            System.out.print(rs.getString(3)+" ");
            System.out.println(rs.getString("mgr"));
        }
    }


}