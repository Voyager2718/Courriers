package letter;

import content.TextContent;
import inhabitant.Inhabitant;

public class Receipt extends SimpleLetter {

	public Receipt(int cost, Inhabitant sender, Inhabitant receiver, TextContent text) throws IncorrectCostException {
		super(cost, sender, receiver, text);
	}

	public String getDescription() {
		return "a receipt.";
	}

	public void doSend() {
		System.out.println("o-> Inhabitant-" + getSender().getName()
				+ "mails an aknowledgment of receipt which is a simple letter whose content is a text content (Aknowledgment of receipt for"
				+ getText().getContent() + ").");
	}

	public Letter doReceive() {
		System.out.println("<-o Inhabitant-" + getReceiver().getName()
				+ "receives an aknowledgment of receipt which is a simple letter whose content is a text content (Aknowledgment of receipt for"
				+ getText().getContent() + ").");
		return null;// No need to send a receipt.
	}
}