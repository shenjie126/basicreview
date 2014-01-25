package net.xicp.tarbitrary.chat;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Desktop desk=Desktop.getDesktop(); 
		try {
			desk.browse(new URI("http://www.google.com"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		 

	}

}
