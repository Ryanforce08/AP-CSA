package prog9b;


public class Cylindertest {

	public static void main(String[] args) {
		Circle circ = new Circle(2);
		Cylinder c2 = new Cylinder(circ,3);
		Cylinder c = new Cylinder(2,3);
		
		System.out.println(c);
		System.out.println(c2);

	}

}
