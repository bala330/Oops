package org.in;

public class Person {
	
	public Person() {
		String name;
		int age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 Getters get=new Getters();
  get.setAge(25);
  get.setName("balaharikrishnan");
  System.out.println(get.getAge());
  System.out.println(get.getName());
	}

}
