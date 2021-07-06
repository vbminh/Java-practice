package file;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) {
		File file = new File("D:/Practice/Source/FileWrite.txt");
		
		BufferedInputStream bis = null;
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(file);
			
			bis = new BufferedInputStream(fis);
			
			while(bis.available() > 0) {
				System.out.print((char)bis.read());
			}
		} catch(FileNotFoundException f) {
			System.out.println("The special file not found" + f);
		}
		catch(IOException e) {
			System.out.print("I/O Exception" + e);
		}
		
		finally {
			try {
				if(fis != null && bis != null) {
					fis.close();
					bis.close();
				}
			}catch(IOException e) {
				System.out.print("Error: ");
				e.printStackTrace();
			}
		}
	}

}
