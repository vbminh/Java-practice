package file;

import java.io.File;
import java.util.Date;

public class lastModified {

	public static void main(String[] args) {
		File file = new File("D:/Practice/Source/FileMatch.txt");
		long lm = file.lastModified();
		Date date = new Date(lm);
		
		System.out.print("Lan sua doi cuoi: " + date);
	}

}
