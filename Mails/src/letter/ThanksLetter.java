package letter;

import content.TextContent;
import inhabitant.Inhabitant;

public class ThanksLetter extends SimpleLetter {

	public ThanksLetter(int cost, Inhabitant sender, Inhabitant receiver, TextContent text)
			throws IncorrectCostException {
		super(cost, sender, receiver, text);
	}

	public ThanksLetter(int cost, Inhabitant sender, Inhabitant receiver) throws IncorrectCostException {
		super(cost, sender, receiver,
				new TextContent("Thanks for a promissory note letter whose content is a money content."));
	}

	public void doSend() {
		System.out.println("<-o Inhabitant-" + getSender().getName()
				+ " mails a thanks letter which is a simple letter whose content is a text content ("
				+ getText().getContent() + ") to inhabitant-" + getReceiver().getName() + " for a cost of " + getCost()
				+ " euro.");
	}

	public Letter doReceive() {
		System.out.println("<-o Inhabitant-" + getReceiver().getName()
				+ " receives a thanks letter which is a simple letter whose content is a text content ("
				+ getText().getContent() + ") from inhabitant-" + getSender().getName());
		return null;
	}
}
