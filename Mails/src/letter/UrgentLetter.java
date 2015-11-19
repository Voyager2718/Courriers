package letter;

public class UrgentLetter extends LetterDecorator {
	public UrgentLetter(Letter decoratedLetter) {
		this.decoratedLetter = decoratedLetter;
	}

	public String getDescription() {
		return decoratedLetter.getDescription() + "which is urgent";
	}
}