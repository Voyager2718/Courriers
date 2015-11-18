package test;

abstract public class LetterDecorator implements Letter{
	protected Letter decoratedLetter;
	
	public LetterDecorator(Letter decoratedLetter){
		this.decoratedLetter = decoratedLetter;
	}
}