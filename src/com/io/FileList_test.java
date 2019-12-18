package com.io;

import java.io.File;
import java.io.FileDescriptor;
import java.util.Arrays;

public class FileList_test {

	public static void main(String[] args) {
		/*File ml=new File("d:/Favorites");
		if(ml.isDirectory()) {
			String[] zml=ml.list();
			Arrays.stream(zml).forEach(f->System.out.println(f));
		}*/
		File ml=new File("E://数据库");
		FileDir(ml);
		}

	private static void FileDir(File ml) {
		File[] wjsz=ml.listFiles();
		//foreach
		for(File file : wjsz) {
			if(file.isDirectory()) {
				FileDir(file);
				//String[] zml=ml.list((dir,name)->name.endsWith(".txt"));
				//Arrays.stream(zml).forEach(f->System.out.println(f));
			}else if(file.isFile()) {
				if(file.getName().endsWith(".doc"))
					System.out.println(file);
			}
				
			
		}
		
		
	}

	private static void fileDir(File file) {
		// TODO 自动生成的方法存根
		
	}
}

