package folder;

import java.io.File;

public class Roots {

	public static void main(String[] args) {
		File[] file = File.listRoots();
		System.out.println("Cac thu muc goc trong he thong: ");
		for(int i = 0; i < file.length; i++)
			System.out.println(file[i].toString());
	}

}
