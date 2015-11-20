package letter;

import content.MoneyContent;
import content.TextContent;

public class PromissoryLetter extends LetterDecorator {
	protected MoneyContent moneyToTransfer;

	public PromissoryLetter(MoneyContent moneyToTransfer, Letter decoratedLetter) {
		this.decoratedLetter = decoratedLetter;
		this.moneyToTransfer = moneyToTransfer;
	}

	public MoneyContent getMoneyContent() {
		return moneyToTransfer;
	}

	public void doSend() {
		System.out.println("o-> Inhabitant-" + getSender().getName() + " mails" + getLetterDescription()
				+ " to inhabitant-" + getReceiver().getName() + " for a cost of " + getCost() + " euro");
	}

	public Letter doReceive() {
		Letter thanksLetter = null;
		System.out.println("<-o Inhabitant-" + getReceiver().getName() + " receives" + getLetterDescription()
				+ " from inhabitant-" + getSender().getName() + ".");
		getReceiver().credit(getMoneyContent().getContent());
		try {
			thanksLetter = new ThanksLetter(0, getReceiver(), getSender(),
					new TextContent("Thanks for a promissory note letter whose content is a money content ("
							+ getMoneyContent().getContent() + " euros)."));
		} catch (IncorrectCostException e) {
		}
		return thanksLetter;
	}

	public int getCost() {
		return (int) (moneyToTransfer.getContent() * 0.01 + decoratedLetter.getCost());
	}

	public String getContentDescription() {
		return " whose content is a promissory letter" + decoratedLetter.getContentDescription();
	}

	public String getLetterDescription() {
		return " a promissory letter whose content is money content(" + moneyToTransfer.getContent() + ")"
				+ decoratedLetter.getContentDescription();
	}
}