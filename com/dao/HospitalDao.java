package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class HospitalDao {
   
	public void fetchAllRecord() throws  Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch425","root","root");
		Statement s = c.createStatement();
		ResultSet rs = s.executeQuery("Select * from Hospital");
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4)+"  "+rs.getString(5)+"  "+rs.getInt(6));
		}
		c.close();
	}
	public void insertData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch425","root","root");
		Statement s =c.createStatement();
		int check = s.executeUpdate("insert into Hospital(id,name,address,city,state,pincode)values(101,'JSP hospital','Pune maharashtra','hinjawadi','maharashtra',45115),(103,'City hospital','Mumbai maharashtra','Thane','Maharashtra',41225)");
		if(check>0) {
			System.out.println("Data is Inserted");
		}else {
			System.out.println("Data is not Inserted");
			
		}
		c.close();
}
	public void updateData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch425","root","root");
		Statement s =c.createStatement();
		int check = s.executeUpdate("update Hospital set name ='HSP hospital' where id =102");
		if(check>0) {
			System.out.println("Data is updated");
		}else {
			System.out.println("Data is not updated");
			
		}
		c.close();
	}
	public void deleteData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch425","root","root");
		Statement s =c.createStatement();
		int check = s.executeUpdate("delete from Hospital  where id =101");
		if(check>0) {
			System.out.println("Data is deleted");
		}else {
			System.out.println("Data is not deleted");
			
		}
		c.close();
	}


}
