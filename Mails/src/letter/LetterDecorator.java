package letter;

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

	public String getText() {
		return decoratedLetter.getText();
	}
}
