package org.constructor;

public class Circumafance {
	int radius;
	float pi;
	
	public Circumafance() {
		radius=25;
		pi=3.14159f;
		
	}
	public Circumafance(int rad,float pa) {
		radius=rad;	
		pi=pa;
	}
	
	public void fomula() {
		System.out.println(2*pi*radius);
	}

	public static void main(String[] args) {
		
		System.out.println("Default constructor");
		Circumafance cr=new Circumafance();
		cr.fomula();
		System.out.println("Parmeteraized constructor");
		Circumafance cr1=new Circumafance(50,3.14159f);
		cr1.fomula();
		
		

	}

}
