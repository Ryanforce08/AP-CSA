package prog9b;

public class Cylinder {
	
	private double radius;
	private double height;
	private Circle base;
	
	public Cylinder(double r, double h)
	{
		height = h;
		radius = r;
		base = new Circle(radius);
	}
	public Cylinder(Circle c, double h)
	{
		base = c;
		height = h;
		radius = base.getRadius();
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public void setHeight(double h)
	{
		height = h;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public void setRadius(double r)
	{
		radius = r;
	}
	
	public double getVolume()
	{
		return base.getArea() * height;
	}
	
	
	public double getCirc()
	{
		return base.getCirc();
	}
	
	public double getSA()
	{
		return (2 * base.getArea()) + (height * (getRadius()));
	}

	public String toString()
	{
		String s = "";
		s += "Radius: " + getRadius() + ", ";
		s += " Surface Area: " + getSA() + ", ";
		s += "Circ: " + getCirc() + ", ";
		s += "Height: " + getHeight();
		return s;
	}

	

}
