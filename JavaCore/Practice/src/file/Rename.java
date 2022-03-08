package file;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Rename {

	public static void main(String[] args) {
		File oldname = new File("D:/Practice/Source/FileWrite.txt");
		File newname = new File("D:/Practice/Source/Write.txt");
		
		if(oldname.renameTo(newname))
			System.out.print("Doi ten thanh cong");
		else
			System.out.print("Error");
		
		try {
			File file = new File("D:/Practice/Source/Write.txt");
			if(!file.exists())
				file.createNewFile();
			
			FileWriter fw = new FileWriter(file,true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			
			System.out.print("Nhap noi dung phu them: ");
			Scanner sc = new Scanner(System.in);
			pw.println("Yeu em");
			pw.close();
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
	}

}
