package com.jihe;

import java.util.HashSet;

class Student{
	String id;
	String name;
	
	public Student(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	@Override
	public int hashCode() {
		return id.hashCode();
	}



	@Override
	public boolean equals(Object obj) {
		Student other = (Student) obj;
		return this.id.equals(other.id);
	}


	@Override
	public String toString() {
		return id+":"+name;
		 
	}
	
}
public class HashSet_test {

	public static void main(String[] args) {
		HashSet<Integer> hset=new HashSet<Integer>();
		Student s1=new Student("1","Mike");
		Student s2=new Student("1","Mike");
		Student s3=new Student("3","Mary");
		HashSet<Student> hset2=new HashSet<Student>();
		hset2.add(s1);
		hset2.add(s2);
		hset2.add(s3);
		System.out.println(hset);
		
	

	}

}
