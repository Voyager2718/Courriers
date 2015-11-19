package letter;

import content.TextContent;
import inhabitant.Inhabitant;

public class Receipt extends SimpleLetter {

	public Receipt(int cost, Inhabitant sender, Inhabitant receiver) throws IncorrectCostException {
		super(cost, sender, receiver, new TextContent(""));// A receipt no need
															// to have any text.
	}

	public String getDescription() {
		return "This is a receipt.";
	}

	public void doSend() {
		// TODO Auto-generated method stub
	}

	public Letter doReceive() {
		// TODO Auto-generated method stub
		return null;// No need to send a receipt.
	}
}