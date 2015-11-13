package city;

import java.util.ArrayList;

import java.util.List;

import inhabitant.Inhabitant;
import letter.Letter;

public class City {
	protected String name;
	protected List<Inhabitant> inhabitants = new ArrayList<Inhabitant>();
	@SuppressWarnings("rawtypes")
	protected List<Letter> postbox = new ArrayList<Letter>();
	
	City(String name){
		this.name = name;
	}
	
	City(String name, List<Inhabitant> inhabitants){
		this.name = name;
		this.inhabitants.addAll(inhabitants);
	}
	
	public void addInhabitent(Inhabitant inhabitant){
		this.inhabitants.add(inhabitant);
	}
	
	public void addInhabitents(List<Inhabitant> inhabitant){
		this.inhabitants.addAll(inhabitants);
	}
	
	public void sendLetter(Inhabitant inhabitant, Letter letter){
		
	}
	
	public void distributeLetters(){
		
	}
}