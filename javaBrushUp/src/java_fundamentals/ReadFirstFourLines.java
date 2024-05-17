package java_fundamentals;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFirstFourLines {

	public static void main(String[] args) {
		try {
			BufferedReader reader=new BufferedReader(new FileReader("D:\\KhalilGibran.txt"));
			String strLine="";
			int lineCount=0;
			while((strLine=reader.readLine())!= null && lineCount<4) {
				System.out.println(strLine);
				lineCount++;
			}
			reader.close();
		}
		catch (FileNotFoundException e) {
			System.err.println("File not found");
		}catch (IOException e) {
			System.err.println("Unable to read the file.");	
		}
	}

}
