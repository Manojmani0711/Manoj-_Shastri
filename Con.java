package bank.management.system;


import javax.swing.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;
import java.sql.*;

public class Con {
        Connection connection;
        Statement statement;
    public Con()
    {
        try
        {

             connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","Mani0711@");
             statement= connection.createStatement();
            System.out.println(connection);
        }catch (Exception e)
        {
            e.printStackTrace();

        }
    }
    public static void main(String[] args) {



           new Con();
    }
}
