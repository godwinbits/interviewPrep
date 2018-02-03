/**
 * Created by gselvam on 2/3/18.
 * #Queue
 *
 * An animal shelter, which holds only dogs and cats, operates on a strictly "First in, first out" basis. People must adopt either the
 * "oldest" (based on arrival time) of all animals at the shelter, or they can select whether they would prefer a dog or a cat ( and will
 * receive the oldest animal of that type). They cannot select which specific animal they would like. Create the data structure to
 * maintain this system and implement operations such as enqueue, dequeueAny, dequeueDog and dequeueCat. You may use the built-in
 * LinkedList data structure
 */

import java.util.*;

public class Animal {
	private String animalType;
	private int counter;
	
	public String getAnimalType() {
		return animalType;
	}
	
	public int getCounter() {
		return counter;
	}
	
	public Animal(String Species, int count) {
		animalType = Species;
		counter = count;
	}
}
public class Problem001DogCatQueue {
	private rollingCounter = 0;
	private LinkedList<Animal> dogList = new LinkedList<Animal>();
	private LinkedList<Animal> catList = new LinkedList<Animal>();
	
	public Animal dequeueDog() {
		Animal dog = dogList.getFirst();
		dogList.removeFirst();
		return dog;
		
	}
	
	public Animal dequeueCat() {
		Animal cat = catList.getFirst();
		catList.removeFirst();
		return cat;
	}
	
	public Animal dequeueAny() {
		Animal dog = dogList.getFirst();
		Animal cat = catList.getFirst();
		
		if(dog.getCounter() < cat.getCounter()) {
			dogList.removeFirst();
			return dog;
		}
		else {
			catList.removeFirst();
			return cat;
		}
	}
	
	public void enqueue(String animalType) {
		rollingCounter++;
		if (animalType = "dog") {
			Animal dog = new Animal(animalType, rollingCounter);
			dogList.add(dog);
		}
		else {
			Animal cat = new Animal(animalType, rollingCounter);
			catList.add(cat);
		}		
	}		
}
