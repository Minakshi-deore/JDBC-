package com.service;

import com.dao.EmployeeDao;


public class EmployeeService {
    
	public void insertData() throws Exception {
		EmployeeDao sd = new EmployeeDao();
		sd.insertData();
	}
	public void updateData() throws Exception {
		EmployeeDao sd = new EmployeeDao();
		sd.updateData();
	}
	public void deleteData() throws Exception {
		EmployeeDao sd = new EmployeeDao();
		sd.deleteData();
	}
	public void fetchAllRecord() throws Exception {
		EmployeeDao sd = new EmployeeDao();
		sd.fetchAllRecord();
	}
}
