package test;

public class BoxLetter extends LetterDecorator {

	public BoxLetter(Letter decoratedLetter) {
		super(decoratedLetter);
	}

	public String getDescription() {
		return decoratedLetter.getDescription() + " with a box";
	}

}