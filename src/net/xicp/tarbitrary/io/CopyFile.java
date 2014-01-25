package net.xicp.tarbitrary.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CopyFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File file = new File("d:\\desktop");
		System.out.println(file.getPath());
		File src = new File("d:\\HelloWorld.java");
		File src1 = new File("G:\\复习专用");
		File dest = new File("E:\\");
		if (src1.isDirectory()) {
			String name = src1.getName();
			File newDest = new File(dest.getPath() + File.separator + name);
			newDest.mkdir();
			copyFile(src1, newDest);
		} else if (src1.isFile()) {
			copyFile(src1, dest);
			
		}
	}

	public static void copyFile(File src, File dest) {
		if (src.isDirectory()) {
			File[] srcs = src.listFiles();

			for (File f : srcs) {
				String name = f.getName();
				String myPath = dest.getPath() + File.separator + name;
				if (f.isFile()) {
					copy(f, myPath);
				} else if (f.isDirectory()) {
					File mf = new File(myPath);
					mf.mkdirs();
					copyFile(f, mf);
				}
			}
		} else if (src.isFile()) {
			String name = src.getName();
			String myPath = dest.getPath() + File.separator + name;
			copy(src, myPath);
		}

	}

	public static void copy(File f, String myPath) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					new FileInputStream(f)));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(myPath)));
			int len = 0;

			while ((len = br.read()) != -1) {
				char c = (char) len;
				bw.write(c);
			}

			br.close();
			bw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
