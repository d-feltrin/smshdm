package de.hdm.sms.server.db;

import com.google.appengine.api.rdbms.AppEngineDriver;
import java.sql.*;


public class DatebaseConnection {
 		  
	private static Connection con = null;

	public static Connection connection() {
		  
		/**Falls die DB-Connection noch nicht besteht, führe nachfolgende Befehle aus.*/
		if (con == null) {
				 
			try {
				DriverManager.registerDriver(new AppEngineDriver());
		    

con = DriverManager.getConnection("jdbc:mysql://feltrin-immobilien.de:3306/sms_db", "sms", "smsdb");

//				con = DriverManager.getConnection("jdbc:google:rdbms://hdm1337:hdmsql/hotelverwaltung", "root", ""); // Create connection with user-credentials
		   } 
		   
		   catch (SQLException e1) {
		    con = null;
		   
		    e1.printStackTrace();
		   }
		  }
		  
		  return con;
		 }

}