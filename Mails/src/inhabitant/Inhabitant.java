package inhabitant;

import city.BankAccount;

public class Inhabitant {
	protected String name;
	protected BankAccount bankAccount;
	
	public Inhabitant(String name){
		this.name = name;
		this.bankAccount = new BankAccount();
	}
	
	public Inhabitant(String name, int balance){
		this.name = name;
		this.bankAccount = new BankAccount(balance);
	}

	public String getName() {
		return name;
	}

	public BankAccount getBankAccount() {
		return bankAccount;
	}
}
