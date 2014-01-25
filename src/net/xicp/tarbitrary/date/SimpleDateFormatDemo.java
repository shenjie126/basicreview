package net.xicp.tarbitrary.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
	public static void main(String[] args) {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy年mm-dd hh-MM-ss*SSS");
		Date date = new Date();
		String st =  sf.format(date);
		System.out.println(st);
		
		String sr = "1990-09-26";
		SimpleDateFormat sf1 = new SimpleDateFormat("yyyy-mm-dd");
		try {
			Date d = sf1.parse(sr);
			System.out.println(d);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
