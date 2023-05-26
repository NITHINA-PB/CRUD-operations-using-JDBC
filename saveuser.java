package org.jsp;

	import java.sql.Connection;
	import java.sql.Statement;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	public class saveuser{
		public static void main(String[] args) {
			 Connection con=null;
			Statement st=null;
			String url,username,password;
			url="jdbc:mysql://localhost:3306/jdbc_demo";
	username="root";
	password="root";
	String query="insert into address values(1,'john',918843)";
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection(url,username,password);
		st=con.createStatement();
		int r=st.executeUpdate(query);
		System.out.println(r+"number of rows are affected");
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

