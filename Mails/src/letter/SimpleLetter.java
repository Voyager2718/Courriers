package letter;

import inhabitant.Inhabitant;

public class SimpleLetter implements Letter {
	protected int cost;
	protected Inhabitant sender;
	protected Inhabitant receiver;
	protected String text;

	public SimpleLetter(int cost, Inhabitant sender, Inhabitant receiver, String text) throws IncorrectCostException {
		if (cost < 0)
			throw new IncorrectCostException();
		this.cost = cost;
		this.sender = sender;
		this.receiver = receiver;
		this.text = text;
	}

	public Inhabitant getSender() {
		return sender;
	}

	public Inhabitant getReceiver() {
		return receiver;
	}

	public String getText() {
		return text;
	}

	public String getDescription() {
		return "This is a letter";
	}

	public int getCost() {
		return cost;
	}

	public void doSend() {
		System.out.println("Inhabitant-" + getSender().getName()
				+ " mails an simple letter whose content is a text content (" + getText() + ") to inhabitent-"
				+ getReceiver().getName() + " for  a cost of " + Integer.toString(getCost()) + " euros.");
		getSender().debit(getCost());// The order of these 2
										// calls is important.
	}

	public void doReceive() {
		// TODO Auto-generated method stub

	}
}