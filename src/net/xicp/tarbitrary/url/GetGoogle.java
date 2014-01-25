package net.xicp.tarbitrary.url;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

import javax.swing.JLayer;
public class GetGoogle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("大中国：");
		getInfo("zh_cn");
		System.out.println("\n");
		System.out.println("小日本：");
		getInfo("ja");
	}
	
	public static void getInfo(String country) {
		try {
			URL url = new URL("http://www.google.com.hk/");
			HttpURLConnection huc =(HttpURLConnection) url.openConnection();
			huc.setRequestProperty("Accept-Language", country);
			

			Map map = huc.getRequestProperties();
/*			Set<Map.Entry> entrySets = map.entrySet();
			System.out.println("=====================");
			for (Map.Entry a: entrySets) {
				System.out.println(a.getKey());
				System.out.println(a.getValue());
			}
			System.out.println("=====================");		*/	
			Set set = map.keySet();
			Iterator it = set.iterator();
			
			while (it.hasNext()) {
				String st = (String) it.next();
				System.out.println("property :" + huc.getRequestProperty(st));
			}
			
			huc.connect();
			
			Map map1 = huc.getHeaderFields();
			Set set1 = map.keySet();
			Iterator it1 = set.iterator();
			
			while (it1.hasNext()) {
				String st = (String) it1.next();
				System.out.println("property :" + huc.getRequestProperty(st));
			}
			
			BufferedReader br = new BufferedReader(
					new InputStreamReader(huc.getInputStream()));
			String sr = null;
			while ((sr = br.readLine()) != null) {
				System.out.println("请求正文");
				System.out.println(sr);
			}
			br.close();
			huc.disconnect();
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
