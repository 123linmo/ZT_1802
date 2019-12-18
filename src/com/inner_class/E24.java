package com.inner_class;


@FunctionalInterface
interface Calcable{
	int calc(int num);
}
class Math{
	public static int abs (int num) {
		if(num<0) {
			return-num;
		}else {
			return num;
		}
		
	}
}
public class E24 {

	public static void main(String[] args) {
	
		PrinterAbs(-50,n->Math.abs(n));
		PrinterAbs(-40,Math::abs);

	}

	private static void PrinterAbs(int i, Calcable c) {
		System.out.println(c.calc(i));
		
	}

}
