package com.kh.phone.controller;

import java.io.File;
import java.io.IOException;

import com.kh.phone.model.dao.PhoneDAO;
import com.kh.phone.model.vo.PhoneBook;

public class PhoneController {
	
	PhoneDAO pd = new PhoneDAO();
	
	public void makeFile() {
		File f = new File("PhoneBook.txt");
		if(!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public void readPhone(PhoneBook pb) {
		return;
	}
	public PhoneBook[] updatePhone(PhoneBook pb) {
		return pArr;
	}
	public PhoneBook[] deletePhone(PhoneBook pb) {
		return pArr; 
		
	}
}
