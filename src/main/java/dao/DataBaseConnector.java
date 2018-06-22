package dao;

public class DataBaseConnector {

    public static void main(String[] args) {
        String path = "danit.cukm9c6zpjo8.us-west-2.rds.amazonaws.com";
        String name = "fs5";
        String port1 = "3306"; // mysql
        //String port2 = "5432"; // postgresql
        String driver1 = "jdbc:mysql";
        //String driver2 = "jdbc:postgresql";

        String fullURI = driver1 + "://" + path + ":"+port1+"/"+name;
        System.out.println(fullURI);
    }
}
