package com.FileHandling.example;

import java.io.File;
import java.util.Scanner;

public class DeleteGivenFile {
	
	public void deleteFile() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter file name you want to delete");
		String fileName;
		
		fileName = scanner.nextLine();
		File file = new File(fileName);
		
		if(file.delete()){
			System.out.println("File deleted...!!");
		}
		else{
			System.out.println("Error in deleting file / Check file name again..!!");
		}
	}

}
