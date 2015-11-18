package test;

public class MoneyLetter extends LetterDecorator {
	public MoneyLetter(Letter decoratedLetter) {
		super(decoratedLetter);
	}

	public String getDescription() {
		return decoratedLetter.getDescription() + " with money";
	}
}
