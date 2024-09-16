/**
 * 
 */
package ModuleOne;

import java.util.Map;
import java.util.HashMap;

//use HashMap to store elements and their counts.

public class Bag<T> {

	/**
	 * @param T item 
	 * */
	private Map<T, Integer> elements;
	
	// constructor to initialize the HashMap
	public Bag() {
		elements = new HashMap<>();
	}
	
	// add method to add an item to the Bag
	public void add(T item) {
		elements.put(item, elements.getOrDefault(item, 0) + 1);
	}
	
	// remove an item from the Bag
	public void remove(T item) {
		if (elements.containsKey(item)) {
			if (elements.get(item) > 1) {
				elements.put(item, elements.get(item) - 1);
			} else {
				elements.remove(item);
			}
		}
	}
	
	// check if a certain item is in the Bag
	public boolean contains(T item) {
		return elements.containsKey(item);
	}
	
	// count for a certain item
	public int count(T item) {
		return elements.getOrDefault(item, 0);
	}
	
	// print content of the Bag
	public void printContent() {
		System.out.println("The Bag contents are: ");
		for (Map.Entry<T, Integer> entry: elements.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue() + " times.");
		}
		
	}
	
	// test the Bag class
	public static void main(String[] args) {
		// create an instance of the Bag class
		Bag<String> bag = new Bag<>();
		
		//add elements to the Bag
		bag.add("apple");
		bag.add("banana");
		bag.add("pear");
		bag.add("banana");
		bag.add("pear");
		
		// print the content of the Bag
		bag.printContent();
		
		//test the contains method
		System.out.println("Testing if peach exists in the Bag: " + bag.contains("peach"));
		System.out.println("Testing if apple exists in the Bag: " + bag.contains("apple"));
		System.out.println("Testing if banana exists in the Bag: " + bag.contains("banana"));
		
		//test the count method
		System.out.println("There are " + bag.count("apple") + " apple in the Bag.");
		System.out.println("There are " + bag.count("banana") + " banana in the Bag.");
		System.out.println("There are " + bag.count("pear") + " pear in the Bag.");
		
		//test the remove method
		bag.remove("apple");
		System.out.println("Apple is removed.");
		
		//print the Bag content again
		bag.printContent();
		
		//test the contains method for apple
		System.out.println("Testing if apple still exists in the Bag after removal: " + bag.contains("apple"));
		
		//test the count method for apple
		System.out.println("There are " + bag.count("apple") + " apple in the Bag.");

	}

}
