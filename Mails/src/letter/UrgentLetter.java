package letter;

public class UrgentLetter extends LetterDecorator {
	public UrgentLetter(Letter decoratedLetter) {
		this.decoratedLetter = decoratedLetter;
	}

	public String getDescription() {
		return decoratedLetter.getDescription() + "which is urgent";
	}

	public void doSend() {
		System.out.println("<-o Inhabitant-" + getReceiver().getName()
				+ " receives an urgent letter whose content is a registered letter whose content is a simple letter whose content is a text content ("
				+ getText().getContent() + ") from inhabitant-" + getSender().getName());// TODO
																							// :
																							// description
																							// should
																							// be
																							// generated
																							// automatically.
	}

	public Letter doReceive() {
		return null;// TODO : Should return a receipt.
	}

	public int getCost() {
		return decoratedLetter.getCost() * 2;// The price of urgent letter is
												// twice of simple letter.
	}
}