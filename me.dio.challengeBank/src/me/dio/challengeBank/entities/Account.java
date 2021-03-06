package me.dio.challengeBank.entities;

public abstract class Account {
	private int agency;
	protected static int account;
	private double totalValue;
	private double taxTransf = 0.10;
	
	
	public Account(int agency) {
		this.agency = agency;
	}

	public int getAccount() {
		return account;
	}

	public int getAgency() {
		return agency;
	}

	public double getTotalValue() {
		return totalValue;
	}

	public void takeOut(double valueOut) {
		totalValue -= valueOut;
	}
	
	public void deposit(double valueIn){
		totalValue += valueIn;
	}
	
	public void transfer(Account accountIn, double valueTransf) {
		this.takeOut(valueTransf + taxTransf); 
		accountIn.deposit(valueTransf);
	}

	
	@Override
	public String toString() {
		return "\n   *** Account ***   \n\n >Agency: " + agency 
				+ "\n >Account: "+ account 
				+"\n >TotalValue:" + String.format("%.2f", totalValue).replace(",", ".");
	}
	
	
}
