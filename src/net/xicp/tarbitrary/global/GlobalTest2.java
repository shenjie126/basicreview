package net.xicp.tarbitrary.global;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class GlobalTest2 {
	
	public static void main(String[] args) {
		Locale zhLocal = new Locale("zh", "CN");
		Locale enLocal = new Locale("en", "US");
		
		ResourceBundle zhrb = ResourceBundle.getBundle("tarbitrary", zhLocal);
		ResourceBundle enrb = ResourceBundle.getBundle("tarbitrary", enLocal);
		
		String zhValue = zhrb.getString("info");
		String enValue = enrb.getString("info");
		
		String zhForamt = MessageFormat.format(zhValue, "\u6d82\u5f3a", "zhInfo");
		String enFormat = MessageFormat.format(enValue, "tarbitrary", "enInfo");
		System.out.println(zhForamt);
		System.out.println(enFormat);
		
	}

}
