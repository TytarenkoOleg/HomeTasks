package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnector {

//    public static void DataBaseConnector() {
//        String path = "danit.cukm9c6zpjo8.us-west-2.rds.amazonaws.com";
//        String name = "fs5";
//        String port1 = "3306"; // mysql
//        //String port2 = "5432"; // postgresql
//        String driver1 = "jdbc:mysql";
    //String driver2 = "jdbc:postgresql";

//        String fullURI = driver1 + "://" + path + ":"+port1+"/"+name;
//        System.out.println(fullURI);

    private static final String DB_URL = "jdbc:mysql://danit.cukm9c6zpjo8.us-west-2.rds.amazonaws.com:3306/fs5";
    private static final String USERNAME = "fs5_user";
    private static final String USER_PASS = "bArceloNa";


    protected static Connection getConnection() {

        Connection connection = null;

        try {
            connection = DriverManager.getConnection(DB_URL, USERNAME, USER_PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

}

