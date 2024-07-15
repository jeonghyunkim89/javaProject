package com.kh.practice.file.controller;

import com.kh.practice.file.dao.FileDAO;

public class FileController {
	
	private FileDAO fd = new FileDAO();
	
	public boolean checkName(String file) {
		return fd.checkName(file); //호출한 결과를 그대로 return
		
		//boolean result = fd.checkName(file);
		//return result;
	}

	public void fileSave(String file, StringBuilder sb) {
		String s= sb.toString();
		fd.fileSave(file, s);
		
		//fd.fileSave(file, sb.toStrig());
	}
	
	public StringBuilder fileOpen(String file) {
		return fd.fileOpen(file);
	}
	
	public void fileEdit(String file, StringBuilder sb) {
		fd.fileEdit(file, sb.toString());
	}
	
}
