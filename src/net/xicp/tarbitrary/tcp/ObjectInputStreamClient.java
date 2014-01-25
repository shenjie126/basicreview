package net.xicp.tarbitrary.tcp;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.io.*;
public class ObjectInputStreamClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Socket s = new Socket("127.0.0.1", 8888);
			ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
			Student st = (Student) ois.readObject();
			System.out.println(st.getId() + " :" + st.getAge() + " :" + st.getUsername() + " :"
					+ st.getDepartment());
			ois.close();
			s.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
