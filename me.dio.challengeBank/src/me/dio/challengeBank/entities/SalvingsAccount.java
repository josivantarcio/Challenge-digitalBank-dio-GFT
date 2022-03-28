package me.dio.challengeBank.entities;

public class SalvingsAccount extends Account {

	protected static int sa = 1;
	public SalvingsAccount(int agency) {
		super(agency);
		try {
			Account.account = sa++;
		}catch (Exception e) {
			System.out.println("Account creation error");
			e.printStackTrace();
		}
	}
}
