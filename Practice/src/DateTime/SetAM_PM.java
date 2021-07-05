package DateTime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SetAM_PM {
	
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aaa");
		
		System.out.println("Thoi gian hien tai la: " + sdf.format(date));
	}

}
