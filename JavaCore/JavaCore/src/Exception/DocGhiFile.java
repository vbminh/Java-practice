package Exception;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class DocGhiFile {
	public void WriteToFile(String str) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập nôi dung bạn muốn ghi vào file:");
		str = sc.nextLine();
		try {
			FileWriter fw = new FileWriter("text.txt",true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(str);
			bw.newLine();
			
		 	System.out.print("\nGhi thành công");
			bw.close();
			fw.close();
			
		}
		catch(Exception e) {
		}
		sc.close();
	}

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("text.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = "";
			while(true) {
				line = br.readLine();
				if(line == null) {
					break;
				}
				System.out.println(line);
			}
			br.close();
			fr.close();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}
