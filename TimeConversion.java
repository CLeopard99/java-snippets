package main;

import java.text.*;
import java.util.Date;

public class TimeConversion {

	static String timeConversion(String s) {
		// sets DateFormat for input time and DateFormat for output time
		DateFormat df = new SimpleDateFormat("hh:mm:ssaa");
		DateFormat output = new SimpleDateFormat("HH:mm:ss");
		// Date variables to pass and return
		Date date = null;
		String newDate = null;

		// make date equal to formatted date from input
		try {
			date = df.parse(s);
			// new date formed from new formatter
			newDate = output.format(date);
		} catch (ParseException pe) {
			pe.printStackTrace();
		}
		return newDate;

	}

	public static void main(String[] args) {
		String s = "10:50:30pm";
		System.out.println(timeConversion(s));
	}

}
