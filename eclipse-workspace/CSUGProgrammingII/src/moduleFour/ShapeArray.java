package moduleFour;

public class ShapeArray {
	/**
	 * @author Cindy Cao
	 * Purpose: to test each of the subclass's surface area and volume functionalities.
	 */

	public static void main(String[] args) {
		
		// initiate Objects 
		Sphere sphere = new Sphere(2.00);
		Cylinder cylinder = new Cylinder(2.00, 1.00);
		Cone cone = new Cone(2.00, 1.00);
		
		// Create an array to store these shape objects 
		Shape shapeArray[] = {sphere, cylinder, cone};
		
		// Loop through the objects and print the info out
		for (Shape shape: shapeArray) {
			System.out.println(shape.toString());
			
			// create an extra line for better readability
			System.out.println();
		}

	}

}
