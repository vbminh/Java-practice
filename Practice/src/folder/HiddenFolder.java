package folder;

import java.io.File;

public class HiddenFolder {

	public static void main(String[] args) {
		File file = new File("D:/Practice/Source/outlook.txt");
		System.out.print("Thu muc " + file.getPath() + " co phai la thu muc an khong? " + file.isHidden());

	}

}
