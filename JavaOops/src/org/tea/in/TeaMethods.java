package org.tea.in;

public class TeaMethods {
	public void prepareTea() {
		System.out.println("prepares a basic tea wit hot water and tea leaf");
		
	}
	public void addmilk() {
		System.out.println("Adds milk to the basic tea");
	}
	public void addsugar() {
		System.out.println("adds sugar to the basic tea");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TeaMethods tea=new TeaMethods();
		tea.prepareTea();
		tea.addmilk();
		tea.addsugar();

	}

}
