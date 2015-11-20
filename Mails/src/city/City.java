package city;

import java.util.ArrayList;
import java.util.List;

import inhabitant.Inhabitant;
import letter.Letter;

/**
 * This city contains a post office that can send mails. All mailing(sending and
 * receiving) actions will be take place in this class.
 *
 */
public class City {
	protected String name;
	protected List<Inhabitant> inhabitants = new ArrayList<Inhabitant>();
	protected List<Letter> postBox = new ArrayList<Letter>();
	protected List<Letter> deliveringBox = new ArrayList<Letter>();

	/**
	 * It's just a function to simplify our job.
	 * 
	 * @param quantity
	 *            : How many times should it be repeated.
	 */
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

	/**
	 * This constructor will generate plenty of inhabitants.
	 * 
	 * @param name
	 *            : The name of city.
	 * @param quantityOfInhabitant
	 *            : How many inhabitant should be generated.
	 */
	public City(String name, int quantityOfInhabitant) {
		this.name = name;
		System.out.println("Creating " + this.name + " city");
		for (int i = 0; i < 100; i++)
			this.inhabitants.add(new Inhabitant(Integer.toString(i + 1)));
		System.out.print("Creating " + quantityOfInhabitant + " inhabitant");
		System.out.print(((quantityOfInhabitant == 1) ? "" : "s"));
		System.out.println();
	}

	public City(String name, List<Inhabitant> inhabitants) {
		this.name = name;
		for (Inhabitant inhabitant : inhabitants) {
			this.inhabitants.add(inhabitant);
		}
		System.out.print("Creating " + this.inhabitants.size() + " inhabitant");
		System.out.print(((this.inhabitants.size() == 1) ? "" : "s"));
		System.out.println();
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

	/**
	 * Add a letter to the post box of the city.
	 * 
	 * @param letter
	 *            : Letter that should be sent.
	 */
	public void sendLetter(Letter letter) {
		letter.doSend();
		postBox.add(letter);
	}

	/**
	 * At the beginning, this function will distribute all letters in delivering
	 * box of the city. Then will send all letters in the post box of the city
	 * (which will be put into the delivering box).
	 */
	public void distributeLetters() {
		while (!deliveringBox.isEmpty()) {
			Letter letter = deliveringBox.get(0).doReceive();
			if (letter != null)
				postBox.add(letter);
			deliveringBox.remove(0);
		}
		while (!postBox.isEmpty()) {
			postBox.get(0).getSender().debit(postBox.get(0).getCost());
			deliveringBox.add(postBox.get(0));
			postBox.remove(0);
		}
	}
	public List<Inhabitant> getInhabitants() {
		return inhabitants;
	}
	public Inhabitant getInhabitants(int i) {
		return inhabitants.get(i);
	}

	public List<Letter> getLetter() {
		return this.postBox;
	}
}
