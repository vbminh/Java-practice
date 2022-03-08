package file;

import java.io.File;

public class PathCompare {

	public static void main(String[] args) {
		File file1 = new File("D:/Practice/Source/file1.txt");
		File file2 = new File("D:/Practice/Source/file2.txt");
		
		if(file1.compareTo(file2) == 0)
			System.out.print("Hai file cung duong dan.");
		else
			System.out.print("Hai file khac duong dan.");
	}

}
