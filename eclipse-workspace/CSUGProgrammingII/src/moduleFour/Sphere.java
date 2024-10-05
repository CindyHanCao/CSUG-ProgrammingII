package moduleFour;


	
public class Sphere extends Shape {
	
		/**
		 * @author Cindy Cao
		 * @param radius, height, surface area, and volume
		 * Purpose: to calculate a cone's surface area and volume.
		 */
		
		// Properties
		double radius;
		double sphereArea;
		double sphereVolume;
		
		// Constructor for this class 
		public Sphere(double radius) {
			this.radius = radius;
		}

		@Override
		public double surface_area() {
			sphereArea = 4  * Math.PI * (radius * radius);
			return sphereArea;
		}

		@Override
		public double volume() {
			sphereVolume = ( 4.0 / 3.0 ) * Math.PI * Math.pow( radius, 3 );
			return sphereVolume;
		}
		
		@Override
		public String toString() {
	        return "Sphere with radius: " + radius + "\n" +
	               "Surface Area: " + surface_area() + "\n" +
	               "Volume: " + volume();
	    }
		
		// test the program
		public static void main(String[] args) {
			Sphere sphere = new Sphere(2.00);
			System.out.println(sphere);
		}
		
}


