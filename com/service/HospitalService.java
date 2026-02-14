package com.service;


import com.dao.HospitalDao;

public class HospitalService {

	public void insertData() throws Exception {
		HospitalDao hd = new HospitalDao();
		hd.insertData();
	}
	public void updateData() throws Exception {
		HospitalDao hd = new HospitalDao();
		hd.updateData();
	}
	public void deleteData() throws Exception {
		HospitalDao hd = new HospitalDao();
		hd.deleteData();
	}
	public void fetchAllRecord() throws Exception {
		HospitalDao hd = new HospitalDao();
		hd.fetchAllRecord();
	}
}


