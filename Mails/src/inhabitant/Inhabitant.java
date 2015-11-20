package inhabitant;

import city.BankAccount;

/**
 * An inhabitant.
 *
 */
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

	/**
	 * When debiting from the his/her account, a message will be shown.
	 * 
	 * @param cost : How much should it debit.
	 */
	public void debit(int cost) {
		if (cost == 0)
			return;
		bankAccount.debit(cost);
		System.out.println("(-) " + Integer.toString(cost) + " euros are debited from inhabitant-" + getName()
				+ " account whose balance is now " + Integer.toString(getBalance()) + " euros.");
	}

	/**
	 * When crediting from the his/her account, a message will be shown.
	 * 
	 * @param cost : How much should it credit.
	 */
	public void credit(int cost) {
		if (cost == 0)
			return;
		bankAccount.credit(cost);
		System.out.println("(+) Inhabitant-" + getName() + " account is credited with " + Integer.toString(cost)
				+ " euros whose balance is now " + Integer.toString(getBalance()) + " euros.");
	}
}
