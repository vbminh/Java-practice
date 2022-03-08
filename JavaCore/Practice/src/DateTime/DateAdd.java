package DateTime;

import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class DateAdd {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		System.out.println("Hom nay la: " + cal.getTime());
		
		cal.add(Calendar.MONTH, -3);
		
		System.out.println("3 thang truoc la: " + cal.getTime());
		
		cal.add(Calendar.DATE, 15);
		System.out.println("15 ngay sau la: " + cal.getTime());
		
		cal.add(Calendar.YEAR, 3);
		System.out.println("3 nam sau la: " + cal.getTime());
		
	}

}
