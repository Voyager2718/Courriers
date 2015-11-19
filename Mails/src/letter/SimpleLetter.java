package letter;

import content.Content;
import inhabitant.Inhabitant;

public class SimpleLetter implements Letter {
	protected int cost;
	Inhabitant sender;
	Inhabitant receiver;
	Content content;

	public SimpleLetter(int cost, Inhabitant sender, Inhabitant receiver, Content content)
			throws IncorrectCostException {
		if (cost < 0)
			throw new IncorrectCostException();
		this.cost = cost;
		this.sender = sender;
		this.receiver = receiver;
		this.content = content;
	}

	public Inhabitant getSender() {
		return sender;
	}

	public Inhabitant getReceiver() {
		return receiver;
	}

	public Content getContent() {
		return content;
	}

	public String getDescription() {
		return "This is a letter";
	}
}