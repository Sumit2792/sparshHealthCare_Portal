package com.healthCare.common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;


public class BaseUtil {

	//readDatabaseProperties
	public void readDataBaseProperties() throws IOException {
		try {
			Properties props = new Properties();
			FileInputStream in = new FileInputStream("src/main/Resources/databaseProperties/dBCredentials.properties");
			props.load(in);
			in.close();
			Connection con =null;
		
			String driver = props.getProperty("jdbc.driverClassName");
			if (driver != null) {
			    Class.forName(driver) ;
			}

			String url = props.getProperty("jdbc.url");
			String username = props.getProperty("jdbc.username");
			 String password = props.getProperty("jdbc.password");

			con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection ="+con);
		} catch (FileNotFoundException err) {
			err.printStackTrace();
		} catch (IOException err) {
			err.printStackTrace();
		} catch ( SQLException err ) {
			System.out.println( err.getMessage( ) );
		} catch ( ClassNotFoundException err ) {
			System.out.println( err.getMessage( ) );
		}
	}
	

}
