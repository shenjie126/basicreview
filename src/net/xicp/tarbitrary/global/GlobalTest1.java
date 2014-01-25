package net.xicp.tarbitrary.global;

import java.util.Locale;
import java.util.ResourceBundle;

public class GlobalTest1 {
	
	public static void main(String[] args) {
		Locale zhLocal = new Locale("zh", "CN");
		Locale enLocal = new Locale("en", "US");
		
		ResourceBundle zhrb = ResourceBundle.getBundle("tarbitrary", zhLocal);
		ResourceBundle enrb = ResourceBundle.getBundle("tarbitrary", enLocal);
		
		System.out.println(zhrb.getString("tuqiang"));
		System.out.println(enrb.getString("tuqiang"));
		
	}
	
	
	
	
	

}
