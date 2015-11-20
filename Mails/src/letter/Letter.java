package letter;

import content.TextContent;
import inhabitant.Inhabitant;

public interface Letter {
	public String getContentDescription();

	public String getLetterDescription();

	public Inhabitant getSender();

	public Inhabitant getReceiver();

	public TextContent getText();

	public void doSend();

	public Letter doReceive();

	public int getCost();
}