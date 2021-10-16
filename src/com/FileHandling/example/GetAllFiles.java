package com.FileHandling.example;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class GetAllFiles {
	
	public void getAllFiles() {
		System.out.println("Reading all files");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter File name || File name with path");
		
		//Example give path from where you want to read all Files 
		// like this in my system the path of my project directory is D:\\SimpliLearn\\Assignments\\SimpliLEarn_First_Assignment\\
		
		String path = scanner.nextLine();
		
		File file = new File(path);
		
		File dir[] = file.listFiles();
		
		Arrays.sort(dir);
		
		for(File e : dir){
			if(e.isFile()){
				System.out.println("File :: "+e.getName());
			}
			else if(e.isDirectory()){
				System.out.println("Directory :: "+e.getName());
			}
			else{
				System.out.println("Error...");
			}
		}
		
	}

}
