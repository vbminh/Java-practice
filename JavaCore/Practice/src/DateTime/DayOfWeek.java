package DateTime;

import java.util.Calendar;

public class DayOfWeek {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		System.out.print("Hom nay la: " + cal.get(cal.DAY_OF_WEEK));

	}

}
