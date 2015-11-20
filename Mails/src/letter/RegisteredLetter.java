package letter;

public class RegisteredLetter extends LetterDecorator {
	public RegisteredLetter(Letter decoratedLetter) {
		this.decoratedLetter = decoratedLetter;
	}

	public void doSend() {
		System.out.println("o-> Inhabitant-" + getSender().getName() + " mails" + getLetterDescription()
				+ " to inhabitant-" + getReceiver().getName());
	}

	public Letter doReceive() {
		Letter receipt = null;
		System.out.println("<-o Inhabitant-" + getReceiver().getName() + " receives" + getLetterDescription()
				+ " from inhabitant-" + getSender().getName() + ".");
		try {
			receipt = new Receipt(0, getReceiver(), getSender());
		} catch (IncorrectCostException e) {
		}
		return receipt;
	}

	public int getCost() {
		return decoratedLetter.getCost() + 15;
	}

	public String getContentDescription() {
		return " whose content is a registered letter" + decoratedLetter.getContentDescription();
	}

	public String getLetterDescription() {
		return " a registered letter" + decoratedLetter.getContentDescription();
	}
}
