package letter;

import content.TextContent;

public class RegisteredLetter extends LetterDecorator {
	public RegisteredLetter(Letter decoratedLetter) {
		this.decoratedLetter = decoratedLetter;
	}

	public String getDescription() {
		return decoratedLetter.getDescription() + " with an acknowledgment of receipt";
	}

	public void doSend() {
		System.out.println("o-> Inhabitant-" + getSender().getName()
				+ " mails a registered letter whose content is a simple letter whose content is a text content ("
				+ getText().getContent() + ") to inhabitant-" + getReceiver().getName());
	}

	public Letter doReceive() {
		Letter receipt = null;
		try {
			receipt = new Receipt(0, getReceiver(), getSender(), new TextContent(
					"Aknowledgment of receipt for a registered letter whose content is a simple letter."));
		} catch (IncorrectCostException e) {
		}
		return receipt;
	}

	public int getCost() {
		return decoratedLetter.getCost() + 15;
	}
}
