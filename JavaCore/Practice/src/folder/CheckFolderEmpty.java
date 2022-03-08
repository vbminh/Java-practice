package folder;

import java.io.File;

public class CheckFolderEmpty {

	public static void main(String[] args) {
		File file = new File("D:/Practice/Source/NewFolder.txt");
		if(file.list().length > 0)
			System.out.print("Folder is not empty.");
		else
			System.out.print("Folder is empty.");

	}

}
