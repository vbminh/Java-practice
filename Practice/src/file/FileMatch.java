package file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileMatch {

	public static void main(String[] args) {
		try {
			File file = new File("D:/Practice/Source/ReadWrite.txt");
			if(!file.exists())
				file.createNewFile();
			
			FileWriter fw= new FileWriter(file,true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			
			pw.println("");
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Nhap noi dung them vao: ");
			pw.println(sc.nextLine());
			pw.close();
			
			System.out.println("\nNoi chuoi thanh cong");
		}catch(IOException ioe) {
			System.out.println("\nError: ");
			ioe.printStackTrace();
		}
	}
}
