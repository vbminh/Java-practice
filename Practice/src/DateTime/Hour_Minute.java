package DateTime;

import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;

public class Hour_Minute {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		
		System.out.println("Gio hien tai la: " + date.getHours());
		System.out.println("Phut hien tai la: " + date.getMinutes());
		
		Formatter fmt = new Formatter();
		fmt.format("%tH:%tM",cal, cal);
		System.out.print("Thoi gian hien tai la: " + fmt);
	}

}
