package moduleFour;


	
public class Cone extends Shape {
	
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
		public Cone(double radius, double height) {
			this.radius = radius;
			this.height = height;
		}

		@Override
		public double surface_area() {
			
			double S = Math.sqrt(radius * radius + height * height);
			area = (Math.PI * radius * radius) + (Math.PI * radius * S);
			return area;
		}

		@Override
		public double volume() {
			volume = (Math.PI * radius * radius * height) / 3;
			return volume;
		}
		
		@Override
		public String toString() {
	        return "Cone with radius: " + radius + "\n" +
	               "Surface Area: " + surface_area() + "\n" +
	               "Volume: " + volume();
	    }
		
		// test the program
		public static void main(String[] args) {
			Cone cone = new Cone(2.00, 1.00);
			System.out.println(cone);
		}
		
}


