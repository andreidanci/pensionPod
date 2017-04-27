package database;

import com.sun.jna.platform.win32.Netapi32Util;
import data.Users;

import javax.jws.soap.SOAPBinding;
import java.sql.*;
import java.util.ArrayList;

public class ConnecToDatabase {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

//        final static String URL = "jdbc:mysql://localhost:3306/pensioen_strings";
//        final static String USERNAME = "root";
//        final static String PASSWORD = "";


        ArrayList<Users> user = new ArrayList<Users>();
        //Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"
        String dbUrl = "jdbc:mysql://localhost:3306/pensioen_strings";

        //Database Username
        String username = "root";

        //Database Password
        String password = "";

        //Query to Execute
        String query = "SELECT * FROM `users`;";

        //Load mysql jdbc driver
        Class.forName("com.mysql.jdbc.Driver");

        //Create Connection to DB
        Connection con = DriverManager.getConnection(dbUrl, username, password);

        //Create Statement Object
        Statement stmt = con.createStatement();

        // Execute the SQL Query. Store results in ResultSet
        ResultSet rs = stmt.executeQuery(query);

        // While Loop to iterate through all data and print results
        while (rs.next()) {
            Users userDB = new Users();
            String id = rs.getString("id");
            userDB.setFirstName(rs.getString("firstName"));
            userDB.setMiddleName(rs.getString("middleName"));
            userDB.setLastName(rs.getString("lastName"));
            userDB.setDate(rs.getString("date"));
            System.out.println(id + "  " + userDB.getFirstName() + " " + userDB.getLastName() + " " + userDB.getMiddleName() + " " + userDB.getDate());
            user.add(userDB);
        }


        System.out.println("User : " + user.get(1).getFirstName());
        // closing DB Connection
        con.close();
    }
}

