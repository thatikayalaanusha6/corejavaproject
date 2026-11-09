package com.exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class StudentFile {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:\\Files\\Anu.txt");
			
		}catch(FileNotFoundException e) {
			System.out.println("File Not Found");
		}

	}

}
