package letter;

import content.Content;
import inhabitant.Inhabitant;

public interface Letter {
	public String getDescription();
	public Inhabitant getSender();
	public Inhabitant getReceiver();
	public Content getContent();
}
