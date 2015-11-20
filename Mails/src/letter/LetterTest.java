package letter;

import java.util.Random;

import letter.*;
import city.City;
import content.MoneyContent;
import content.TextContent;
import inhabitant.Inhabitant;

public class LetterTest {
	protected static int daySender , day;
	protected static int sender,receiver;
	protected static City city;
	
	public static void main(String args[]) throws IncorrectCostException {
		Random r = new Random();
		city = new City("Bakel", 100);
		daySender = r.nextInt(10+1);
		int nbLetter;
		System.out.println("Mailing letters for "+daySender+ " days");
		for(int day = 1; day<=daySender;day++){
			city.distributeLetters();
			System.out.println("***********************************");
			System.out.println("Day "+day);
			sender = r.nextInt(city.getInhabitants().size());
			receiver=sender;
			while(receiver==sender)
				sender = r.nextInt(city.getInhabitants().size());
			receiver = r.nextInt(city.getInhabitants().size());
			nbLetter = r.nextInt(5)+1;
			for (int i = 0; i < nbLetter; i++) {
				city.sendLetter(getARandomLetter(city.getInhabitants(sender), city.getInhabitants(receiver)));
			}
		}
		while(!city.getLetter().isEmpty()){
			daySender++;
			System.out.println("***********************************");
			System.out.println("Day "+daySender);
			city.distributeLetters();
		}
	}

	protected static Letter getARandomLetter(Inhabitant sender, Inhabitant receiver) throws IncorrectCostException {
		int r=new Random().nextInt(5);
		Letter letter = new SimpleLetter(2, sender, receiver, new TextContent("bla bla"));
		TextContent text = new TextContent("bla bla");
		switch (r) {
		case 0:
			letter = new SimpleLetter(2, sender, receiver, text);
			break;
		case 1:
			letter = new PromissoryLetter(new MoneyContent(50), letter);
			break;
		case 2:
			letter = new Receipt(2, sender, receiver, text);
			break;
		case 3:
			letter = new ThanksLetter(2, sender, receiver, text);
			break;
		case 4:
			letter = new UrgentLetter(letter);
			break;
		}
		return letter;
	}
}