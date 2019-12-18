package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReader_test {

	public static void main(String[] args) throws Exception {
		FileReader fr=new FileReader("d:\\test.txt");
		FileWriter fw=new FileWriter("poem1.txt");
		char []buff=new char[2048];
		int b=fr.read(buff);
		while (b!=-1) {
			fw.write(buff,0,(char)b);
			b=fr.read(buff);
		}
		/*fw.write("再别康桥\r\n");
		fw.write("\t----------徐志摩\r\n");
		fw.write("\r\n");*/
		fr.close();
		fw.flush();
		fw.close();
	}

}
