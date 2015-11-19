package letter;

public class RegisteredLetter extends LetterDecorator {
	public RegisteredLetter(Letter decoratedLetter) {
		this.decoratedLetter = decoratedLetter;
	}

	public String getDescription() {
		return decoratedLetter.getDescription() + " with an acknowledgment of receipt";
	}
}
