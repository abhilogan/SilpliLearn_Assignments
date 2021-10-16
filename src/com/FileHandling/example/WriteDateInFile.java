package com.FileHandling.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteDateInFile {
	public void write() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter file name");
		String fileName;
		fileName = scanner.nextLine();
		File file = new File(fileName);

		// checking file already exist
		if (file.exists()) {
			System.out.println("File Name Already Exists.....!");

			System.out.println("Enter Content you want to write");
			String content = scanner.nextLine();

			// For Appending Data to file pass true
			FileWriter fileWriter;
			try {
				fileWriter = new FileWriter(file, true);

				// \n :: every time data add in new line
				fileWriter.write("\n" + content);
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		} else {
			// creating new file

			try {
				file.createNewFile();

				System.out.println("New File Created");
				System.out.println("Enter Data to Write in File ");
				String text_data = scanner.nextLine();

				FileWriter fileWriter = new FileWriter(file);
				fileWriter.write(text_data);
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}
}
