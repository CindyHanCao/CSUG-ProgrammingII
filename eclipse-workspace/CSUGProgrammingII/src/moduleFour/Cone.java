package moduleFour;


	
public class Cone extends Shape {
		
		double radius;
		double height;
		double area;
		double volume;
		
		public Cone(double radius, double height) {
			this.radius = radius;
			this.height = height;
		}

		@Override
		public double surface_area() {
			
			double S = Math.sqrt(radius * radius + height * height);
			area = (Math.PI * radius * radius) + (Math.PI * radius * S);
			//System.out.println("Sphere's area is: " + sphereArea);
			return area;
		}

		@Override
		public double volume() {
			// TODO Auto-generated method stub
			volume = (Math.PI * radius * radius * height) / 3;
			//System.out.println("Sphere's volume is: " + sphereVolume);
			return volume;
		}
		
		@Override
		public String toString() {
	        return "Cone with radius: " + radius + "\n" +
	               "Surface Area: " + surface_area() + "\n" +
	               "Volume: " + volume();
	    }
		
		public static void main(String[] args) {
			Cone cone = new Cone(2.00, 1.00);
			System.out.println(cone);
		}
		
}


