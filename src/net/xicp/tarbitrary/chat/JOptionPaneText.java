package net.xicp.tarbitrary.chat;

public class JOptionPaneText {

	public static Object[] getYNobj() {
		Object[] opt = {
				"<html> <font   face= '隶书'   size= '3'   color= '#25B7FF '>确认</font> </html>",
				"<html> <font   face= '隶书'   size= '3'   color= '#25B7FF '>取消</font> </html>" };
		return opt;
	}

	public static Object[] getEnsureobj() {
		Object[] options = { "<html> <font   face= '隶书'   size= '3'   color= '#25B7FF '>确认</font> </html>" };
		return options;
	}

	public static String getInfo(String text) {
		String sr = "<html> <font   face= '隶书'   size= '4'   color= '#25B7FF'>　"
				+ text + " </font> </html>";
		return sr;
	}

}
