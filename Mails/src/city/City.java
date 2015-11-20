package city;

import java.util.ArrayList;
import java.util.List;

import inhabitant.Inhabitant;
import letter.Letter;

public class City {
	protected String name;
	protected List<Inhabitant> inhabitants = new ArrayList<Inhabitant>();
	protected List<Letter> postBox = new ArrayList<Letter>();
	protected List<Letter> deliveringBox = new ArrayList<Letter>();

	@SuppressWarnings("unused")
	private void drawStars(int quantity) {// This function can be used for
											// drawing stars.
		for (int i = 0; i < quantity; i++)
			System.out.print("*");
	}

	public City(String name) {
		this.name = name;
		System.out.println("Creating " + this.name + " city");
	}

	public City(String name, int quantityOfInhabitant) {
		this.name = name;
		System.out.println("Creating " + this.name + " city");
		for (int i = 0; i < 100; i++)
			this.inhabitants.add(new Inhabitant(Integer.toString(i + 1)));
		System.out.println("Creating " + quantityOfInhabitant + " inhabitant");
		System.out.println(((quantityOfInhabitant == 1) ? "" : "s"));
	}

	public City(String name, List<Inhabitant> inhabitants) {
		this.name = name;
		this.inhabitants.addAll(inhabitants);
		System.out.println("Creating " + this.inhabitants.size() + " inhabitant");
		System.out.println(((this.inhabitants.size() == 1) ? "" : "s"));
	}

	public String getName() {
		return name;
	}

	public void addInhabitant(Inhabitant inhabitant) {
		this.inhabitants.add(inhabitant);
	}

	public void addInhabitants(List<Inhabitant> inhabitants) {
		this.inhabitants.addAll(inhabitants);
	}

	public void sendLetter(Letter letter) {
		postBox.add(letter);
	}

	public void distributeLetters() {
		while (!postBox.isEmpty()) {
			postBox.get(0).doSend();
			postBox.get(0).getSender().debit(postBox.get(0).getCost());
			deliveringBox.add(postBox.get(0));
			postBox.remove(0);
		}
		while (!deliveringBox.isEmpty()) {
			Letter letter = deliveringBox.get(0).doReceive();
			if (letter != null)
				postBox.add(letter);
			deliveringBox.remove(0);
		}
	}
}
