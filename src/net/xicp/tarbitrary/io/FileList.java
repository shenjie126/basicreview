package net.xicp.tarbitrary.io;

import java.io.File;

public class FileList {
	
	static int count= 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		File file = new File("F:\\文档资料");
		System.out.println(file);
		System.out.println(file.getPath());
		listAllFiles(file);
	}
	//因为文件夹是一个树状结构的, 所以可以将文件夹看成一棵树,利用 树的遍历来实现输出所有的文件及文件夹功能
	public static void listAllFiles(File file) {
		count ++;
		int mycount = count;//mycount记录当前树的深度,此方法主要利用了树的前序遍历思想
		StringBuffer sb = new StringBuffer("");
		for (int i = 0; i < mycount; i ++ ) {
			sb.append("-->");
		}
		File[] files = file.listFiles();
		
		for (File f : files) {
			if (f.isFile()) {
				System.out.println(sb.toString() + f.getName());
			} else if (f.isDirectory()) {
				System.out.println(sb.toString() + f.getName());
				listAllFiles(f);
			} 
		}
		count --;
	}

}
