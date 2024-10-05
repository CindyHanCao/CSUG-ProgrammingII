package moduleFour;


	
public class Cylinder extends Shape {
		/**
		 * @author Cindy Cao
		 * @param radius, height, surface area, and volume
		 * Purpose: to calculate a cone's surface area and volume.
		 */
		
		// Properties
		double radius;
		double height;
		double area;
		double volume;
		
		// Constructor for this class
		public Cylinder(double radius, double height) {
			this.radius = radius;
			this.height = height;
		}

		@Override
		public double surface_area() {
			area = 2  * Math.PI * radius * height + 2  * Math.PI * (radius * radius);
			return area;
		}

		@Override
		public double volume() {
			volume = Math.PI * (radius * radius) * height;
			return volume;
		}
		
		@Override
		public String toString() {
	        return "Cyliner with radius: " + radius + "\n" +
	               "Surface Area: " + surface_area() + "\n" +
	               "Volume: " + volume();
	    }
		
		// test the program
		public static void main(String[] args) {
			Cylinder cylinder = new Cylinder(2.00, 1.00);
			System.out.println(cylinder);
		}
		
}


