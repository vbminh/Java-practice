package Exception;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;



public class ReadWriteObjToFile {
	public void WriteObjToFile(List<Student> list) {
		list.add(new Student("Minh",20,"Phú Thọ"));
		list.add(new Student("Trang",21,"Ninh Bình"));
		list.add(new Student("Anh",22,"Hà Nội"));
		list.add(new Student("Chi",23,"Hà Nam"));
		try {
			FileWriter fw = new FileWriter("text.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			for(Student item : list) {
				bw.write(item.toString());
				bw.newLine();
			}
			System.out.print("Ghi thành công");
			bw.close();
			fw.close();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		try {
			FileReader fr = new FileReader("text.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = "";
			while(true) {
				line = br.readLine();
				if(line == null)
					break;
				String[] arr = line.split("\\s+");
				String name = arr[0];
				int age = Integer.parseInt(arr[1]);
				String address = arr[2] + " " + arr[3];
				
				list.add(new Student(name,age,address));
				
				for(Student item : list) {
					System.out.println(item);
				}
				br.close();
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}

