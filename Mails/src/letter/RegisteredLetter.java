package letter;

public class RegisteredLetter extends LetterDecorator {
	public RegisteredLetter(Letter decoratedLetter) {
		this.decoratedLetter = decoratedLetter;
	}

	public String getDescription() {
		return decoratedLetter.getDescription() + " with an acknowledgment of receipt";
	}

	public void doSend() {
		// TODO Auto-generated method stub

	}

	public Letter doReceive() {
		return null; // TODO : Should return a receipt.
	}

	public int getCost() {
		return decoratedLetter.getCost();
	}
}
