package folder;

import java.io.File;
import java.io.IOException;

public class DeleteFolder {
	
	public static void delete(File file) {
		if(file.isDirectory()) {
			String[] arr = file.list();
			for(String child : arr) {
				File FChild = new File(file,child);
				if(FChild.isDirectory())
					delete(FChild);
				else
					FChild.delete();
			}
			if(file.list().length == 0)
				file.delete();
		}else
			file.delete();
		System.out.print("Xoa thanh cong thu muc " + file.getAbsolutePath());
	}

	public static void main(String[] args) {
		File file = new File("D:/Practice/Source/Minh.txt");
		delete(file);
	}
}


