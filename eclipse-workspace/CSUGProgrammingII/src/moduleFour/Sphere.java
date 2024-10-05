package moduleFour;


	
public class Sphere extends Shape {
		
		double radius;
		double sphereArea;
		double sphereVolume;
		
		public Sphere(double radius) {
			this.radius = radius;
		}

		@Override
		public double surface_area() {

			sphereArea = 4  * Math.PI * (radius * radius);
			//System.out.println("Sphere's area is: " + sphereArea);
			return sphereArea;
		}

		@Override
		public double volume() {
			// TODO Auto-generated method stub
			sphereVolume = ( 4.0 / 3.0 ) * Math.PI * Math.pow( radius, 3 );
			//System.out.println("Sphere's volume is: " + sphereVolume);
			return sphereVolume;
		}
		
		@Override
		public String toString() {
	        return "Sphere with radius: " + radius + "\n" +
	               "Surface Area: " + surface_area() + "\n" +
	               "Volume: " + volume();
	    }
		
		public static void main(String[] args) {
			Sphere sphere = new Sphere(2.00);
			System.out.println(sphere);
		}
		
}


