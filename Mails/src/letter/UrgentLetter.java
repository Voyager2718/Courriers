package letter;

public class UrgentLetter extends LetterDecorator {
	public UrgentLetter(Letter decoratedLetter) {
		this.decoratedLetter = decoratedLetter;
	}

	public String getDescription() {
		return decoratedLetter.getDescription() + "which is urgent";
	}

	public void doSend() {
		// TODO Auto-generated method stub

	}

	public Letter doReceive() {
		return null;// TODO : Should return a receipt.
	}

	public int getCost() {
		return decoratedLetter.getCost() * 2;// The price of urgent letter is
												// twice of simple letter.
	}
}