package com.FileHandling.example;

import java.io.IOException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String check;
		do {

			System.out.println("1. To Create file");
			System.out.println("2. To Read Data in File");
			System.out.println("3. To Write data in File");
			System.out.println("4. To Update Existing file");
			System.out.println("5. To Delete File");
			System.out.println("6. To Search All Files in Existing directory");
			int a = scanner.nextInt();

			switch (a) {
			case 1:
				CreateFile createFile = new CreateFile();
				try {
					createFile.createFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;

			case 2:
				ReadDataFromFile readDataFromFile = new ReadDataFromFile();
				readDataFromFile.readData();
				break;

			case 3:// this method is used for both write or update if their is
					// no data , method write data in file and if data exists
					// it will update or append it.
				WriteDateInFile writeData = new WriteDateInFile();
				writeData.write();
				break;

			case 4:// this method is used for both write or update if their is
					// no data , method write data in file and if data exists
					// it will update or append it.
				WriteDateInFile writeData1 = new WriteDateInFile();
				writeData1.write();
				break;

			case 5:
				DeleteGivenFile deleteGivenFile = new DeleteGivenFile();
				deleteGivenFile.deleteFile();
				break;

			case 6:
				System.out.println("Enter File name or Directory name with path");
				System.out.println("For an example :: D:\\SimpliLearn\\Assignments\\SimpliLEarn_First_Assignment\\");
				GetAllFiles allFiles = new GetAllFiles();
				allFiles.getAllFiles();
				break;

			default:
				System.out.println("Please enter valid option");

			}
			System.out.println("\n\nDo You want to continue yes or no");
			check = scanner.next();
		} while (check.equals("yes"));

	}
}
