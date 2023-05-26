package org.jsp;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExcecuteQuery1 {
	public static void main(String[] args) {
		 Connection con=null;
		Statement st=null;
		String url,username,password;
		url="jdbc:mysql://localhost:3306/jdbc_demo";
username="root";
password="root";
String query="create table address(id int not null,name varchar(45)null,phone bigint(20)null,primary key(id))";
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	con=DriverManager.getConnection(url,username,password);
	st=con.createStatement();
	boolean res=st.execute(query);
	System.out.println(res+"is the returned value and table is created");
}
catch(ClassNotFoundException|SQLException e){
	e.printStackTrace();	
}
finally {
	if(con!=null) {
		try {
			con.close(); 
			System.out.println("Connection is closed");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	if(st!=null) {
		try {
			st.close();
			System.out.println("Statement is closed ");
					}
					catch(SQLException e) {
						e.printStackTrace();
					}
					
				}
			}
		}

	}

