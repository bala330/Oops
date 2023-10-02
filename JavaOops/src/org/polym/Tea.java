package org.polym;

public class Tea {
	
	public void prepareTea() {
		System.out.println("prepares a basic tea wit hot water and tea powder");
		
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tea[] tea=new Tea[4];
		tea[0]= new BlackTea();
		tea[1]=new GreenTea();
		tea[2]=new HerbalTea();
		tea[3]=new Tea();		
		for (Tea tea2 : tea) {
			
			tea2.prepareTea();
		}
		
		
       
		
		
		
	
		
	
	}
	}


