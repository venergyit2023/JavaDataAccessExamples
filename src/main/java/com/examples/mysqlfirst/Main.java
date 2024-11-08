package com.examples.mysqlfirst;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("John Doe", 26);
        // Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "root");
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root")){
            Statement st = conn.createStatement();
            String query = "insert into persons values (null,'" + person.getName() + "'," + person.getAge() + ")";
            st.execute(query);
        } catch (SQLException e) {
           System.out.println("Error in database connection: \n" + e.getMessage());
        }
    }
}
