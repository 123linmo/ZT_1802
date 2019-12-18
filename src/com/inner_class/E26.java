package com.inner_class;


@FunctionalInterface
interface PersonBuilder{
	Person buildPerson(String name);
}
class Person{
	private String name;
	public Person(String name) {
		this.name=name;
}

public String getName() {
		return name;
	}
}
public class E26 {

	public static void main(String[] args) {
		printName("千禧",new PersonBuilder() {
			
			@Override
			public Person buildPerson(String name) {
				// TODO 自动生成的方法存根
				return new Person(name);
			}
		});
		
		
		
		
		
		printName("小红",name->new Person(name));
		printName("小绿",Person::new);
	}
	
public static void printName(String name, PersonBuilder builder) {
	System.out.println(builder.buildPerson(name).getName());
	
	}


	
}


