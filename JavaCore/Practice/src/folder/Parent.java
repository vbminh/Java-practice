package folder;

import java.io.File;

public class Parent {

	public static void main(String[] args) {
		File file = new File("D:/Practice/Source/NewFolder.txt");
		String parent = file.getParent();
		System.out.print("Thu muc cha cua thu muc " + file.getAbsolutePath() + " la: " + parent);

	}

}
