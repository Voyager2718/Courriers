package letter;

import city.City;
import content.TextContent;
import inhabitant.Inhabitant;

public class LetterTest {
	public static void main(String args[]) {
		City city = new City("Canton");
		Inhabitant yang = new Inhabitant("YANG");
		Letter letter;
		try {
			letter = new SimpleLetter(1, yang, yang, new TextContent("Hello"));
			city.addInhabitant(yang);
			city.sendLetter(yang, letter);
			city.distributeLetters();
			city.distributeLetters();
		} catch (IncorrectCostException e) {
			System.out.println(e.getMessage());
		}
	}
}
