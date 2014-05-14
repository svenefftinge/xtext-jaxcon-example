package mein.heim;

import java.util.Calendar;

public class Helper {

	public static boolean isSummer() {
		int month =  Calendar.getInstance().get(Calendar.MONTH);
		return month > 3 && month < 9;
	}
}
