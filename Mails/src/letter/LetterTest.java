package letter;

import java.util.Random;

import letter.*;
import city.City;
import content.MoneyContent;
import content.TextContent;
import inhabitant.Inhabitant;

public class LetterTest {
	protected static int daySender;
	
	public static void main(String args[]) throws IncorrectCostException {
		City city = new City("Canton");
		Inhabitant[] tab = new Inhabitant[100];
		int sender,receiver;
		int days=new Random().nextInt(10)+1;
		for (int i = 0; i < tab.length; i++) {
			tab[i] = new Inhabitant(""+i,5000);
		}
		System.out.println("Creating 100 inhabitant");
		System.out.println("Mailling letters for "+days+" days");
		for (int daysPassed = 0; daysPassed < days; daysPassed++) {
			System.out.println("**********************************");
			System.out.println("Day "+(daysPassed+1));
			daySender=new Random().nextInt(5)+1;
			for (int i = 0; i < daySender; i++) {
				sender = new Random().nextInt(100);
				receiver=sender;
				while(receiver==sender)
					sender=new Random().nextInt(100);
				city.sendLetter(tab[sender], getARandomLetter(tab[sender],tab[receiver]));
			}
		}
	}

	protected static Letter getARandomLetter(Inhabitant sender, Inhabitant receiver) throws IncorrectCostException {
		int r=new Random().nextInt(5);
		Letter letter = new SimpleLetter(2, sender, receiver, new TextContent("bla bla"));
		
		switch (0) {
		case 0:
			letter = new SimpleLetter(2, sender, receiver, new TextContent("bla bla"));
			break;
		case 1:
			letter = new PromissoryLetter(new MoneyContent(50), letter);
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		default:
			
		}
		return letter;
	}
}
