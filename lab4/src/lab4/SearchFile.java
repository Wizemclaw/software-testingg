package lab4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchFile {

	public SearchFile(String filePath, String word) throws IOException {
		String line;
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)));

		while ((line = br.readLine()) != null) {
			if (line.contains(word)) {
				System.out.println(line);
			}

			br.close();

		}

	}
}
