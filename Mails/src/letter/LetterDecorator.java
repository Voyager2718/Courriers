package letter;

import content.Content;
import inhabitant.Inhabitant;
import letter.Letter;

public abstract class LetterDecorator implements Letter{
	protected Letter decoratedLetter;
	
	public Inhabitant getSender(){
		return decoratedLetter.getSender();
	}
	
	public Inhabitant getReceiver(){
		return decoratedLetter.getReceiver();
	}
	
	public Content getContent(){
		return decoratedLetter.getContent();
	}
}
