/**
 * 
 */
package ModuleOne;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Class comment 
 */
public class Bagtest {
	
	private Bag<String> bag1;
	private Bag<String> bag2;
	
	@Before
	public void setUp() {
		bag1 = new Bag<>();
		bag2 = new Bag<>();
	}
	
	
//	@Test
//	public void simpleTest() {
//		System.out.println("test.....");
//	    assertTrue(true);
//	}
	
	@Test
	public void testAddAndSize() {
		// add elements to first bag
		bag1.add("apple");
		bag1.add("pear");
		bag1.add("apple");
		
		// Asset the size of the bag
		assertEquals(3, bag1.size());
		
		// Assert the counts for each element
		assertEquals(2, bag1.count("apple"));
		assertEquals(1, bag1.count("pear"));
	}
	
	@Test
	public void testMerge() {
		// add elements to first bag
		bag1.add("apple");
		bag1.add("pear");
		bag1.add("apple");
		
		bag2.add("apple");
		bag2.add("banana");

		bag1.merge(bag2);
		// Asset the size of the bag
		assertEquals(5, bag1.size());
		
		// Assert the counts for each element
		assertEquals(3, bag1.count("apple"));
		assertEquals(1, bag1.count("pear"));
		assertEquals(1, bag1.count("banana"));
	}
	
	@Test
	public void testDistinct() {
		bag1.add("apple");
		bag1.add("banana");
		bag1.add("apple");
		bag1.add("pear");
		bag1.add("pear");
		
		Bag<String> newBag = bag1.distinct();
		
		assertEquals(3, newBag.size());
		assertEquals(1, newBag.count("apple"));
		assertEquals(1, newBag.count("pear"));
		assertEquals(1, newBag.count("banana"));
		
	}

}
