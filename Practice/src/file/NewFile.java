package file;

import java.io.File;
import java.io.IOException;

public class NewFile {

	public static void main(String[] args) {
		
		try {
			File file = new File("D:/Practice/Source/File.txt");
			
			boolean check = file.createNewFile();
			if(check)
				System.out.print("Tao file thanh cong");
			else
				System.out.print("file da ton tai");
		} catch(IOException e) {
			System.out.println("Error: ");
			e.printStackTrace();
		}
	}

}
