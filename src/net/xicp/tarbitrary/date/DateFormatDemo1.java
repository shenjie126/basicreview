package net.xicp.tarbitrary.date;

import java.text.DateFormat;
import java.util.Date;

public class DateFormatDemo1 {
	public static void main(String[] args) {
		DateFormat df = DateFormat.getDateInstance();
		DateFormat df1 = DateFormat.getDateTimeInstance();
		Date date = new Date();
		
		System.out.println(df.format(date));
		System.out.println(df1.format(date));
	}

}
