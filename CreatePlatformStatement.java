package org.jsp;
import com.mysql.cj.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class CreatePlatformStatement {
	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		String url,username,password;
		url="jdbc:mysql://localhost:3306";
		username="root";
		password="root";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is loaded and Registered Succesfully");
			con=DriverManager.getConnection(url,username,password);
			System.out.println("Connection Established");
			st=con.createStatement();
			System.out.println("Platform created");	
		}
		catch(ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(con!=null) {
				try {
					con.close();
					System.out.println("Connection Closed");
				}
				catch(SQLException e) {
					e.printStackTrace();	
				}
			}
				if(st!=null) {
					try {
						st.close();
						System.out.println("Statement closed");
					}
					catch(SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}


