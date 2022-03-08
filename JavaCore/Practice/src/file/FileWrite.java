package file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		File file;
		
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap noi dung file: ");
		str = sc.nextLine();
		
		
		try {
			file = new File("D:/Practice/Source/FileWrite.txt");
			fos = new FileOutputStream(file);
			
			if(!file.exists())
				file.createNewFile();
			
			byte[] arr = str.getBytes();
			fos.write(arr);
			fos.flush();
			System.out.print("\nGhi file thanh cong!");
		} catch(IOException e) {
			System.out.println("\nError: ");
			e.printStackTrace();
		}
		
		finally {
			try {
				if(fos != null)
					fos.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
