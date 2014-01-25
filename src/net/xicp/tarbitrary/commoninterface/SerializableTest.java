package net.xicp.tarbitrary.commoninterface;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URLDecoder;

import org.junit.Test;


public class SerializableTest {
	
	@Test
	public void testSeri() {
		String st = Thread.currentThread().getContextClassLoader().getResource("").getPath();
		String path = null;
		try {
			String myPath = URLDecoder.decode(st,"utf-8");
			path = myPath.replace("/bin/", "/src/");
			System.out.println(path);
			path = path + "testserializalbe.txt";
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			
			ObjectInputStream ois = new ObjectInputStream(
					new FileInputStream(path));
			Person p =(Person) ois.readObject();
			System.out.println(p);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
