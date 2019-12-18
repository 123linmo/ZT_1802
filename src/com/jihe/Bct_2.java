package com.jihe;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Bct_2 {

	public static void main(String[] args) {
		Map<String,String> tmap=new TreeMap<String,String>();
		tmap.put("3", "Smith");
		tmap.put("1", "Lucy");
		tmap.put("2", "John");
		tmap.put("5", "Amanda");
		tmap.put("4", "Aimee");
		System.out.println(tmap);
		//将双列集合Map变成单列的键对象集合使用keySet()方法
		Set<String> jianji=tmap.keySet();
		Iterator<String> diedai=jianji.iterator();
		while (diedai.hasNext()) {
			Object key = (Object) diedai.next();
			Object value=tmap.get(key);
			System.out.println(key+":"+value);

	}

	}
}
