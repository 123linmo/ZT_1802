package com.jihe;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
class Customcomparator implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		String key1=(String)o1;
		String key2=(String)o2;
		return key2.compareTo(key1);
	}
	
}

public class TreeMap_test {

	public static void main(String[] args) {
		Map<String,String> tmap=new TreeMap<String,String>(new Customcomparator());
		tmap.put("3", "Smith");
		tmap.put("1", "Lucy");
		tmap.put("2", "John");
		tmap.put("5", "Amanda");
		tmap.put("4", "Aimee");
		System.out.println(tmap);

	}

}
