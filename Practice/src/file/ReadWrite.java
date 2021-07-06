package file;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadWrite {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		File file;
		
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap noi dung: ");
		str = sc.nextLine();
		
		try {
			file = new File("D:/Practice/Source/RÝ.txt");
			
			fos = new FileOutputStream(file);
			
			if(!file.exists())
				file.createNewFile();
			
			byte[] arr = str.getBytes();
			fos.write(arr);
			fos.flush();
			
			System.out.println("Ghi file thanh cong!");
		} catch(IOException e) {
			System.out.println("Error: ");
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
		
		File fil = new File("D:/Practice/Source/RÝ.txt");
		BufferedInputStream bis = null;
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(fil);
			bis = new BufferedInputStream(fis);
			
			while(bis.available() > 0)
				System.out.print((char)bis.read());
		} catch(FileNotFoundException f) {
			System.out.println("\nKhong tim thay file chi dinh " + f);
		}
		
		catch(IOException e) {
			System.out.print("I/O exception " + e);
		}
		
		finally {
			try {
				if(bis != null && fis != null) {
					fis.close();
					bis.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
