package com.inner_class;
@FunctionalInterface
interface Printable_{
	void print (StringUtils su,String str);
}

public class E27 {

	public static void main(String[] args) {
	printUpper(new StringUtils(),"hello",(Object,t) -> Object.printUpperCase(t));
	printUpper(new StringUtils(),"hello",StringUtils::printUpperCase);
	}

	private static void printUpper(StringUtils su, String text, Printable_ pt) {
		pt.print(su, text);
	}

	
	}


