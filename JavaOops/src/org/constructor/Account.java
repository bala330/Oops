package org.constructor;

public class Account {
	
	long withdraw;
	long deposit;
	long Accountbalance;
	
	public Account() {
		withdraw=500l;
		deposit=600000l;
		Accountbalance=5000l;
		
		
	}
	public Account(long withd,long dep,long balance) {
		withdraw=withd;
		deposit=dep;
		Accountbalance=balance;
		
	}
	public void forumla() {
		long withdrawbalance=Accountbalance-withdraw;
		System.out.println("If the withdraw the amount :"+ withdrawbalance);
		long depositbalance=Accountbalance+deposit;
		System.out.println("If the deposit the amount :"+ depositbalance);
	}
	

	public static void main(String[] args) {
		System.out.println("balance amount");
		Account ac= new Account();
		
		ac.forumla();
		System.out.println("Parmeteraized constructor");
		Account ac1= new Account(5000l, 60000l,50000l);
		ac.forumla();
		

	}

}
