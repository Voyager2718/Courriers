package letter;

import content.TextContent;
import inhabitant.Inhabitant;

public class Receipt extends SimpleLetter {

	public Receipt(int cost, Inhabitant sender, Inhabitant receiver) throws IncorrectCostException {
		super(cost, sender, receiver, new TextContent(""));// A receipt no need
															// to have any text.
	}

	public String getDescription() {
		return "a receipt.";
	}

	public void doSend() {
		super.doSend();
		System.out.println("no text");
	}

	public Letter doReceive() {
		return null;
	}
}