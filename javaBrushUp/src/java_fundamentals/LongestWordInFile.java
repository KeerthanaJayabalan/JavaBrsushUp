package java_fundamentals;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LongestWordInFile {

	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("D:\\KhalilGibran.txt"));
			String line;
			String longestWord = "";
			while ((line = reader.readLine()) != null) {
				String[] words = line.split(" ");
				for (String word : words) {
					word = word.replaceAll("[^a-zA-Z]", "");
					if (word.length() > longestWord.length()) {
						longestWord = word;
					}
				}
			}
			reader.close();

			if (!longestWord.isEmpty()) {
				System.out.println("Longest word in the file: " + longestWord);
			} else {
				System.out.println("No words found in the file.");
			}
		} catch (IOException e) {
			System.err.println("An error occurred while reading the file: " + e.getMessage());
			e.printStackTrace();
		}
	}

}
