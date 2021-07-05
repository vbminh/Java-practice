package DateTime;

import java.util.Calendar;
import java.util.Formatter;

public class setMMM {

	public static void main(String[] args) {
		Formatter fmt = new Formatter();
		Calendar cal = Calendar.getInstance();
		
		fmt.format("%tB %tb %tm", cal, cal, cal);
		System.out.print(fmt);

	}

}
