package letter;

import content.MoneyContent;

public class PromissoryLetter extends LetterDecorator {
	protected MoneyContent moneyToTransfer;

	public PromissoryLetter(MoneyContent moneyToTransfer, Letter decoratedLetter) {
		this.decoratedLetter = decoratedLetter;
		this.moneyToTransfer = moneyToTransfer;
	}

	public String getDescription() {
		return decoratedLetter.getDescription() + " with money";
	}

	public void doSend() {
		System.out.println("o-> Inhabitant-" + getSender().getName()
				+ " mails a promissory letter whose content is money (" + this.moneyToTransfer + " euros) to inhabitent-"
				+ getReceiver().getName() + " for a cost of " + Integer.toString(getCost()) + " euros.");
		getSender().debit(moneyToTransfer.getContent());
	}

	public Letter doReceive() {
		System.out.println("<-o Inhabitant-" + getReceiver().getName() + " receives a promissory letter whose content is money (" + this.moneyToTransfer + " euros) from inhabitant-" + getSender().getName());
		getReceiver().credit(moneyToTransfer.getContent());
		return null;// If no need to send a receive, then return null
	}

	public int getCost() {
		return (int) (decoratedLetter.getCost() * 0.01 + 1);
	}
}