package moduleFour;


	
public class Cylinder extends Shape {
		
		double radius;
		double height;
		double area;
		double volume;
		
		public Cylinder(double radius, double height) {
			this.radius = radius;
			this.height = height;
		}

		@Override
		public double surface_area() {

			area = 2  * Math.PI * radius * height + 2  * Math.PI * (radius * radius);
			//System.out.println("Sphere's area is: " + sphereArea);
			return area;
		}

		@Override
		public double volume() {
			// TODO Auto-generated method stub
			volume = Math.PI * (radius * radius) * height;
			//System.out.println("Sphere's volume is: " + sphereVolume);
			return volume;
		}
		
		@Override
		public String toString() {
	        return "Cyliner with radius: " + radius + "\n" +
	               "Surface Area: " + surface_area() + "\n" +
	               "Volume: " + volume();
	    }
		
		public static void main(String[] args) {
			Cylinder cylinder = new Cylinder(2.00, 1.00);
			System.out.println(cylinder);
		}
		
}


