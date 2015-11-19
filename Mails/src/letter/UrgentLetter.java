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

	public void doReceive() {
		// TODO Auto-generated method stub

	}
}