package letter;

public class UrgentLetter extends LetterDecorator {
	public UrgentLetter(Letter decoratedLetter) {
		this.decoratedLetter = decoratedLetter;
	}

	public void doSend() {
		System.out.println("o-> Inhabitant-" + getSender().getName() + " mails" + getLetterDescription()
				+ " to inhabitant-" + getReceiver().getName() + " for a cost of " + getCost() + " euros");
	}

	public Letter doReceive() {
		System.out.println("<-o Inhabitant-" + getReceiver().getName() + " receives" + getLetterDescription()
				+ " from inhabitant-" + getSender().getName());

		return null;// TODO : Should return a receipt.
	}

	public int getCost() {
		return decoratedLetter.getCost() * 2;// The price of urgent letter is
												// twice of simple letter.
	}

	public String getContentDescription() {
		return " whose content is an urgent letter";
	}

	public String getLetterDescription() {
		return " an urgent letter" + decoratedLetter.getContentDescription();
	}
}