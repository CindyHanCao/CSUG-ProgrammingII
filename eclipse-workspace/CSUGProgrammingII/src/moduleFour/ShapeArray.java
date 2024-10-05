package moduleFour;

public class ShapeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sphere sphere = new Sphere(2.00);
		Cylinder cylinder = new Cylinder(2.00, 1.00);
		Cone cone = new Cone(2.00, 1.00);
				
		Shape shapeArray[] = {sphere, cylinder, cone};
		
		for (Shape shape: shapeArray) {
			System.out.println(shape.toString());
			
			// create an extra line for better readability
			System.out.println();
		}

	}

}
