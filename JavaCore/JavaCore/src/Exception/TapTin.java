package Exception;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class TapTin {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("taptin.txt");
			BufferedReader br = new BufferedReader(fr);
			
			List<Integer> list = new ArrayList<Integer>();
			String line;
			while (true) {
				line = br.readLine();
				if(line == null) {
					break;
				}
				String[] arr = line.split("\\s+");
				
				for(int i = 0; i < arr.length; i++) {
					list.add(Integer.parseInt(arr[i]));	
				}
			}
			
			
			int hang = list.get(0);
			int cot = list.get(1);
			int[][] arr = new int[hang][cot];
			int index = 1;
			int sum = 0;
			
			for(int i = 0; i < hang; i++) {
				for(int j = 0; j < cot; j++) {
					index++;
					arr[i][j] = list.get(index);
				}
			}
			
			for(int i = 0; i < hang; i++) {
				for(int j = 0; j < cot; j++) {
					sum += arr[i][j];
				}
			}
			br.close();
			fr.close();
			
			FileWriter fw = new FileWriter("taptin.txt",true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.newLine();
			bw.write("Tong cac phan tu cua mang la " + sum);
			
			bw.close();
			fw.close();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}
