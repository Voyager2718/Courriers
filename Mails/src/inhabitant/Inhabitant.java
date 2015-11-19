package inhabitant;

import city.BankAccount;

public class Inhabitant {
	protected String name;
	protected BankAccount bankAccount;

	public Inhabitant(String name) {
		this.name = name;
		this.bankAccount = new BankAccount();
	}

	public Inhabitant(String name, int balance) {
		this.name = name;
		this.bankAccount = new BankAccount(balance);
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return bankAccount.getBalance();
	}

	public void debit(int cost) {
		bankAccount.debit(cost);
		System.out.println("(-) " + Integer.toString(cost) + " euros are debited from inhabitant-" + getName()
				+ " account whose balance is now " + Integer.toString(getBalance()) + " euros.");
	}

	public void credit(int cost) {
		System.out.println("(+)Inhabitant-" + getName() + " account is credited with " + Integer.toString(cost)
				+ " euros whose balance is now " + Integer.toString(getBalance()) + " euros.");
		bankAccount.credit(cost);
	}
}
