package folder;

import java.io.File;

public class allFile {

	public static void main(String[] args) throws Exception {
		File file = new File("D:/Practice/Source");
		
		String[] arr = file.list();
		
		if(arr.length == 0)
			System.out.print("Folder is not exist or empty");
		else {
			for(int i = 0; i < arr.length; i++) {
				String fchild = arr[i];
				System.out.println(fchild);
			}
		}

	}

}
