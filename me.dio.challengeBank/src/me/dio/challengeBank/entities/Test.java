package me.dio.challengeBank.entities;

public class Test {

	public static void main(String[] args) {
		Account cp = new SalvingsAccount(1);
		cp.deposit(2000);
				
		Account cc1 = new CurrentAccount(1);
		cc1.deposit(500);
		cc1.takeOut(200);
		
		Account cc2 = new CurrentAccount(1);
		
		Account cc3 = new CurrentAccount(1);
		
		Account cp2 = new SalvingsAccount(1);
		cp2.deposit(350.85);
		
		cc1.transfer(cp2, 300);
		cp.transfer(cp2, 1000);

		
		System.out.println(cp);
		System.out.println(cc2);
		System.out.println(cc3);
		System.out.println(cc1);
		System.out.println(cp2);
		
	}

}
