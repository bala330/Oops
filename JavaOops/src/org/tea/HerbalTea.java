package org.tea;

public class HerbalTea extends GreenTea {
	public void prepareTea() {
		System.out.println("prepares a basic tea wit hot water and  Herbal tea leaf");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GreenTea tea= new HerbalTea();
		tea.prepareTea();
		
	}

}
