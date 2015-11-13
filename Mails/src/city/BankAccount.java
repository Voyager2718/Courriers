package city;

public class BankAccount {
	protected int amount;
	
	public BankAccount(){
		this.amount = 0;
	}
	
	public void credit(int credit){
		this.amount += credit;
	}
	
	public void debit(int debit){
		this.amount -= debit;
	}
	
	public int balance(){
		return this.amount;
	}
}
