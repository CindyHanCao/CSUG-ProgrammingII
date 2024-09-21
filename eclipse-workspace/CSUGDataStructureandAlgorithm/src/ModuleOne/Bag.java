/**
 * 
 */
package ModuleOne;

import java.util.Map;
import java.util.HashMap;

/**
 * The Bag class represents a collection of elements (a multiset) that allows duplicates.
 * Elements are stored along with their counts, allowing multiple occurrences of the same item.
 * use HashMap to store elements and their counts.
 * @param <T> the type of elements in the bag.
 * @author cindycao
 * @version updated on 9/21/2024
 */

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
		if (item != null) {
			elements.put(item, elements.getOrDefault(item, 0) + 1);
		} else {
			System.out.println("Cannot add null item to the bag!");
		}
	}
	
	// remove an item from the Bag
	public void remove(T item) {
		if (item != null) {
			if (elements.containsKey(item)) {
				if (elements.get(item) > 1) {
					elements.put(item, elements.get(item) - 1);
				} else {
					elements.remove(item);
				}
			}
		} else {
			System.out.println("Cannot remove null item to the bag!");
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
	
	public int size() {
		int totalSize = 0;
		for (int count: elements.values()) {
			totalSize += count;
		}
		return totalSize;
	}
	
	public void merge(Bag<T> otherBag) {
		// loop through the other bag to get its keys and values
		for (Map.Entry<T, Integer> entry: otherBag.elements.entrySet()) {
			T element = entry.getKey();
			//System.out.println("Element is: " + element);
			int otherCount = entry.getValue();
			//System.out.println("Element is: " + element + "count is: " + otherCount);
			
			// get the count from current bag for the element we are checking
			int curCount = this.elements.getOrDefault(element, 0);
			
			// get the total count for the element
			int totalCount = otherCount + curCount;
			
			// update the current bag
			this.elements.put(element, totalCount);
		}
	}
	
	public Bag<T> distinct() {
		Bag<T> newBag = new Bag<>();
		
		for (T item: elements.keySet()) {
			newBag.add(item);
		}
		
		return newBag;
	}
	
	// test the Bag class
	public static void main(String[] args) {
		// create an instance of the Bag class
		Bag<String> bag1 = new Bag<>();
		Bag<String> bag2 = new Bag<>();
		
		//add elements to the Bag
		bag1.add("apple");
		bag1.add("banana");
		bag1.add("pear");
		bag1.add("banana");
		bag1.add("pear");
		
		bag2.add("apple");
		bag2.add("banana");
		bag2.add("pear");
		
		//test the contains method
		System.out.println("Bag 1 size is: " + bag1.size());
		System.out.println("Bag 2 size is: " + bag2.size());
		
		bag1.merge(bag2);
		System.out.println("Bag 2 has merged to Bag 1.");
		// print the content of the Bag
		bag1.printContent();
		
		// new bag from distinct method
		Bag<String> newBag = bag1.distinct();
		System.out.println("Distinct elements in Bag 1");
		newBag.printContent();
		
	}

}
