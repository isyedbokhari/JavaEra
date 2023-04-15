package day33_Exceptions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task02 {

	public static void main(String[] args) {
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("text.txt"));
			writer.write("Hey! Its me, Sid.");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
		try {
			BufferedReader reader = new BufferedReader(new FileReader("text.txt"));
			String line;
			while((line = reader.readLine()) != null) {
				System.out.println(line);
				reader.close();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.getMessage();
		}
		 
    	

	}

}
