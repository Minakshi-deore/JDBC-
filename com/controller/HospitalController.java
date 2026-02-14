package com.controller;


import com.service.HospitalService;

public class HospitalController {
 
	public static void main(String[] args) throws Exception {
		HospitalService hs = new HospitalService();
		//hs.insertData();
		//hs.updateData();
		//hs.fetchAllRecord();
		hs.deleteData();
	}

}


