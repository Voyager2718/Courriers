package letter;

import content.TextContent;
import inhabitant.Inhabitant;
import letter.Letter;

public abstract class LetterDecorator implements Letter {
	protected Letter decoratedLetter;

	public Inhabitant getSender() {
		return decoratedLetter.getSender();
	}

	public Inhabitant getReceiver() {
		return decoratedLetter.getReceiver();
	}

	public TextContent getText() {
		return decoratedLetter.getText();
	}
}
