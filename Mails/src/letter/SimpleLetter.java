package letter;

import content.TextContent;
import inhabitant.Inhabitant;

public class SimpleLetter implements Letter {
	protected int cost;
	protected Inhabitant sender;
	protected Inhabitant receiver;
	protected TextContent text;

	public SimpleLetter(int cost, Inhabitant sender, Inhabitant receiver, TextContent textContent)
			throws IncorrectCostException {
		if (cost < 0)
			throw new IncorrectCostException();
		this.cost = cost;
		this.sender = sender;
		this.receiver = receiver;
		this.text = textContent;
	}

	public Inhabitant getSender() {
		return sender;
	}

	public Inhabitant getReceiver() {
		return receiver;
	}

	public TextContent getText() {
		return text;
	}

	public String getDescription() {
		return "a simple letter";
	}

	public int getCost() {
		return cost;
	}

	public void doSend() {
		System.out.println("o-> Inhabitant-" + getSender().getName()
				+ " mails "+this.getDescription()+" whose content is a text (" + getText().getContent() + ") to inhabitent-"
				+ getReceiver().getName() + " for a cost of " + Integer.toString(getCost()) + " euros.");
	}

	public Letter doReceive() {
		System.out.println(
				"<-o Inhabitant-" + getReceiver().getName() + " receives a simple letter whose content is a text "
						+ getText().getContent() + " from inhabitant-" + getSender().getName());
		return null;// TODO : If no need to send a receipt or thanks letter,
					// return null.
	}
}