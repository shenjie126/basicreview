package net.xicp.tarbitrary.encoder;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class URLDecoderTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			String s = URLDecoder.decode("%E8%BF%9C%E9%98%B3%E7%91%9C%E4%BC%BD%E6%9C%8D", "utf-8");
			System.out.println(s);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
