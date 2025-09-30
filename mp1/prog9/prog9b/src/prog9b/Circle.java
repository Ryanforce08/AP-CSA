package prog9b;

public class Circle {
	
	private double radius;
	
	public Circle()
	{
		radius = 5.0;
	}
	
	public Circle(double r)
	{
		radius = r;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public void setRadius(double r)
	{
		radius = r;
	}
	
	public double getArea()
	{
		return Math.PI * Math.pow(radius, 2);
	}
	
	public double getCirc()
	{
		return Math.TAU * radius;
	}
	
	public String toString()
	{
		String s = "";
		s += "Radius: " + getRadius() + ", ";
		s += "Area: " + getArea() + ", ";
		s += "Circ: " + getCirc();
		return s;
	}

}
