package com.FileHandling.example;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromFile {

	public void readData() {

		char[] data = new char[100];

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter file name");
		String fileName;

		fileName = scanner.nextLine();

		try {
			FileReader reader = new FileReader(fileName);

			reader.read(data);
			System.out.println("Data received successfully...!!");
			System.out.println(data);
			reader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
