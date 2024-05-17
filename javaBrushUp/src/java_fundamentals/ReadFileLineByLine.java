package java_fundamentals;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {

	public static void main(String[] args) {
		String strLine="";
		String strData="";
		try {
			BufferedReader br=new BufferedReader(new FileReader("D:\\example.txt"));
			while(strLine != null) {
				strData+=strLine;
				strLine=br.readLine();
			}
			System.out.println(strData);
			br.close();
		}
		catch (FileNotFoundException e) {
			System.err.println("File not found");
		}catch (IOException e) {
			System.err.println("Unable to read the file.");	
		}

	}

}
