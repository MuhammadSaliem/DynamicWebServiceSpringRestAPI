package com.dgbi.DAL;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {

	private String server;
	private String database;
	private String username;
	private String password;
	
	public Config() throws FileNotFoundException, IOException {
		//LoadConfigurations();
	}
	
	Config(String server, String database, String username, String password) {
		super();
		this.server = server;
		this.database = database;
		this.username = username;
		this.password = password;
	}
	
	
	public String getConnectionString()
	{
		String con2 = String.format("jdbc:sqlserver://localhost; databaseName=testDB; encrypt=true; trustServerCertificate=true; user=sa; password=P@ssw0rd;");
		String con = String.format("jdbc:sqlserver://%s; databaseName=%s; encrypt=true; trustServerCertificate=true; "
				+ "user=%s; password=%s",this.server, this.database, this.username, this.password);
		
		
		
		return con2;
		
	}
	
	private void LoadConfigurations() throws FileNotFoundException, IOException {
        Properties prop = new Properties();
//        String path = getClass().getResource("/com.dgbi.Resource/config.properties").getPath();
//        FileInputStream input = new FileInputStream(path);
        InputStream input = Config.class.getResourceAsStream("config.properties");
        prop.load(input);
 

        try
        {
        	this.server = prop.getProperty("server").trim();
        	this.database = prop.getProperty("database").trim();
        	this.username = prop.getProperty("username").trim();
        	this.password = prop.getProperty("password").trim();
        }
        
        catch(Exception ex)
        {
        	ex.printStackTrace();
        	System.out.println("Cannot Load configurations!");
        }
        
	}
	
	public String getServer() {
		return server;
	}
	public void setServer(String server) {
		this.server = server;
	}
	public String getDatabase() {
		return database;
	}
	public void setDatabase(String database) {
		this.database = database;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
