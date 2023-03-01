package com.dgbi.DAL;


import com.dgbi.Models.RequestParam;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class DAL {
    //    private final String connectionString = "jdbc:sqlserver://DESKTOP-2I3LGMF;databaseName=testDB;encrypt=true;trustServerCertificate=true;";
//	    private String connectionString = "jdbc:sqlserver://localhost;databaseName=testDB;encrypt=true;trustServerCertificate=true; user=sa; password=P@ssw0rd;";
	    private String connectionString;
//    private final String user = "sa";
//    private String password = "P@ssw0rd";

    public DAL() throws FileNotFoundException, IOException
    {
    	String con = new Config().getConnectionString();
    	System.out.println("Connection ----->>>> " + con);
    	connectionString = con;
    }
    public Connection getConnection() {

        try {
            Connection connection = DriverManager.getConnection(connectionString);
            return connection;

        } catch (Exception e) {
            System.out.println();
            e.printStackTrace();
        }
        return null;
    }

    public ResultSet executeSelectQuery(String query) {
        ResultSet rs = null;
        List<RequestParam> params = null;

        try {
            Statement stmt = getConnection().createStatement();
            rs = stmt.executeQuery(query);
        } catch (Exception e) {
            System.out.println();
            e.printStackTrace();
        }

        return rs;
    }

    public boolean executeInsertQuery(String query) {
        try {
            Statement stmt = getConnection().createStatement();
            return stmt.execute(query);
        } catch (Exception e) {
            System.out.println();
            e.printStackTrace();
        }
        return false;
    }
}
