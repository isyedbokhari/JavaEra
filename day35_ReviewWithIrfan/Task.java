package day35_ReviewWithIrfan;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task {

	public static void main(String[] args) throws IOException {
		File file = new File("Location");
		FileReader fr = null;
		try {
			fr = new FileReader(file);
			
		} catch(FileNotFoundException e) {
			System.out.println("File not found. Enter a new address...");
		} finally {
			fr.close();

		}
	}

}
