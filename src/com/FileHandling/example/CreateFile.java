package com.FileHandling.example;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {

	public void createFile() throws IOException {

		System.out.println("File Handling Write Example");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter file name");
		String fileName;
		fileName = scanner.next();
		File file = new File(fileName);

		try {
			boolean flag = file.createNewFile();
			if (flag) {
				System.out.println("File is created...!!");
			} else {
				System.out.println("File is already present please try with another name..");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
