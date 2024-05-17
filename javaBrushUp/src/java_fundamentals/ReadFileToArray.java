package java_fundamentals;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadFileToArray {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		String line="";
		try {
			BufferedReader reader=new BufferedReader(new FileReader("D:\\example.txt"));
			while((line = reader.readLine())!= null) {
				list.add(line);
			}
			System.out.println(Arrays.toString(list.toArray()));
			reader.close();
		}
		catch (FileNotFoundException e) {
			System.err.println("File not found");
		}catch (IOException e) {
			System.err.println("Unable to read the file.");	
		}
	}
}
