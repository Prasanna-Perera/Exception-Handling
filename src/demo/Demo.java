/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demo;
import java.sql.*;
class DBConnection{
	private static DBConnection dbConnection;
	private Connection connection;
	
	private DBConnection()throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection=DriverManager.getConnection("jdbc:mysql://localhost/thogaKade","root","1234");
	}
	public static DBConnection getInstance()throws ClassNotFoundException,SQLException{
		if(dbConnection==null){
			dbConnection=new DBConnection();
		}
		return dbConnection;
	}
	public Connection getConnection(){
		return connection;
	}
}
class CustomerControll{
	public static boolean addCustomer(String id, String name, String address, double salary)throws ClassNotFoundException,SQLException{
		PreparedStatement stm=DBConnection.getInstance().getConnection().prepareStatement("Insert into Customer Values(?,?,?,?)");
		//
		//
		return stm.executeUpdate()>0;
	}
}



class Demo{	
	public static void main(String args[]){
		try{
			CustomerControll.addCustomer("C0001","Niroth","Panadura",56000);
		}catch(SQLException ex){
			
		}catch(ClassNotFoundException ex){
			//
		}
	}
}
