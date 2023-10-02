package org.emplyee;

public class Employee {
	int id;
	String Firstname;
	String Lastname;
	int salary;
	int annualsalary;
	int perecnt;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void annualsalry() {
		System.out.println("Enter the anual salary :"+ salary*12);
	}
	public void rasiesalary(int perecnt) {
		System.out.println("Enter the rasiesalary :"+ salary*perecnt);
	}
	
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setId(1234);
		emp.setFirstname("balaharikrishnan");
		emp.setLastname("ramesh");
		emp.setSalary(50000);
		System.out.println("Enter the id:"+ emp.getId());
        System.out.println("Enter the firstname: "+ emp.getFirstname());
		System.out.println("Enter the last name: "+ emp.getLastname());
		System.out.println("Enter the salary :" + emp.getSalary());
		emp.annualsalry();
		emp.rasiesalary(30);
	 
		
	}

}
