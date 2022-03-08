package folder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NewFolder {

	public static void main(String[] args) {
		Path path = Paths.get("D:/Practice/Source/NewFolder.txt");
		if(!Files.exists(path)) {
			try {
				Files.createDirectory(path);
				System.out.print("Tao moi folder thanh cong");
			} catch(IOException ioe) {
				ioe.printStackTrace();
			}
		}
		else
			System.out.print("Folder " + path + " da ton tai");
	}

}
