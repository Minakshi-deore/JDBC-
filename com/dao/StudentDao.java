package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {

	public void insertData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch425", "root", "root");
		Statement s = c.createStatement();
		int check = s.executeUpdate("insert into studentInfo(id,name,email,phoneNo)values('121','minakshi','minakshi@gmail.com','12344')");
        if(check>0) {
        	System.out.println("Data is Inserted");
        }else {
        	System.out.println("Data is Not Inserted");
        }
		
		c.close();
	}
	
	public void updateData()throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch425","root","root");
		Statement s = c.createStatement();
		int check=s.executeUpdate("update StudentInfo set name ='Minu' where id = 121");
		if(check>0) {
			System.out.println("Data is update...");
		}else {
			System.out.println("Data is not update");
		}
		c.close();
	}
	
	public void deleteData()throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost3306/batch425","root","root");
		Statement s = c.createStatement();
		int check = s.executeUpdate("Delete from StudentInfo where id= 121");
		if(check>0) {
			System.out.println("Data is deleted");
		}else {
			System.out.println("Data is not deleted");
				
		}
		c.close();
	}
	 
	public void fetchAllRecord() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch425","root","root");
		Statement s = c.createStatement();
		ResultSet rs = s.executeQuery("Select * From StudentInfo");
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getInt(4));
		}
		c.close();
	}

}
