package com.api;

import com.sun.xml.internal.fastinfoset.sax.Properties;

public class Array_copy {

	public static void main(String[] args) {
		int a[]= {1,3,54,7,8,9,0,9};
		int b[]= {1,34,56,678,89,3,34};
		System.arraycopy(a, 2, b, 0, 4);
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
			
		}
		

	}

}
