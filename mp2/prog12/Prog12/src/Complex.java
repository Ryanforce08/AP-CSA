
public class Complex {
	public double a;
	public double b;
	
	public Complex(double first, double second) {
		a = first;
		b = second;
	}
	public Complex(double f) {
		this(f, 0);
	}
	
	public double abs(){
		return Math.sqrt((this.a*this.a)+(this.b*this.b));
	}
	
	public Complex add(Complex other) {
		return new Complex((this.a + other.a), (this.b + other.b));
	}
	
	public Complex multiply(Complex other) {
		double new_a = this.a * other.a - this.b * other.b;
		double new_b = this.a * other.b + this.b * other.a;
		return new Complex(new_a, new_b);
	}
	
	public Complex multiply(double n) {
		double new_a = this.a * n;
		double new_b = this.b * n;
		return new Complex(new_a, new_b);
	}
	
	public String toString() {
		String s = "";
		s += this.a;
		s += " + ";
		s += this.b;
		s +="i";
		return s; // just incase
//		return String.format("%.2f + %.2f i", this.a,this.b);
	}
	
	
}
