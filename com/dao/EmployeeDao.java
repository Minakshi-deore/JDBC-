package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class EmployeeDao {
	
	public void fetchAllRecord() throws  Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch425","root","root");
		Statement s = c.createStatement();
		ResultSet rs = s.executeQuery("Select * from employee");
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getLong(4)+"  "+rs.getString(5)+"  "+rs.getString(6)+"  "+rs.getString(7)+"  "+rs.getString(8)+" "+rs.getString(9)+" "+rs.getString(10));
		}
		c.close();
	}
	
	public void insertData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch425","root","root");
		Statement s =c.createStatement();
		int check = s.executeUpdate("insert into employee(empid,name,email,phoneNo,salary,department,joinDate,City,gender,age)values(121,'Minaksh','minakshi@gmail.com',9876543221,'5LPA','Java Developer','2026-6-2','pune','female',22)");
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
		int check = s.executeUpdate("update employee set City ='Mumbai' where empid =121");
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
		int check = s.executeUpdate("delete from employee  where id =121");
		if(check>0) {
			System.out.println("Data is updated");
		}else {
			System.out.println("Data is not updated");
			
		}
		c.close();
	}

}

