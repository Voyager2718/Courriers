package letter;

public class PromissoryLetter extends LetterDecorator {
	protected int moneyToTransfer;

	public PromissoryLetter(int moneyToTransfer, Letter decoratedLetter) {
		this.decoratedLetter = decoratedLetter;
		this.moneyToTransfer = moneyToTransfer;
	}

	public String getDescription() {
		return decoratedLetter.getDescription() + " with money";
	}

	public void doSend() {
		// TODO Auto-generated method stub
	}

	public Letter doReceive() {
		return null;// If no need to send a receive, then return null
	}

	public int getCost() {
		return (int) (decoratedLetter.getCost() * 0.01 + 1);
	}
}