package me.dio.challengeBank.entities;

public class CurrentAccount extends Account {

	protected static int ca = 1;
	public CurrentAccount(int agency) {
		super(agency);
		try {
			Account.account = ca++;
		}catch (Exception e) {
			System.out.println("Account creation error");
			e.printStackTrace();
		}
	}

}
