package net.xicp.tarbitrary.date;

import java.text.DateFormat;
import java.util.Date;

public class DateFormatDemo2 {
	public static void main(String[] args) {
		DateFormat df = DateFormat.getDateInstance(DateFormat.ERA_FIELD);
		DateFormat df1 = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL);
		Date date = new Date();
		
		System.out.println(df.format(date));
		System.out.println(df1.format(date));
	}

}
