package net.xicp.tarbitrary.array;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ForEachDemo {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		String[][] sj = new String[][] { { "abc", "def" },
				{ "fjeif", "fjikffe", "myefe" },
				{ "fjeif", "fjikffe", "fjeoife", "testest" } };
		
		for (String[] sr : sj) {
			for (String s : sr) {
				System.out.println(s);
			}
			
			
		}
	}

}
