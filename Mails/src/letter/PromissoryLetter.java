package letter;

public class PromissoryLetter extends LetterDecorator {
	public PromissoryLetter(Letter decoratedLetter) {
		this.decoratedLetter = decoratedLetter;
	}

	public String getDescription() {
		return decoratedLetter.getDescription() + " with money";
	}
}