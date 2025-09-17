public class Circle {
    int radius = 0;

    public Circle(int r)
    {
        radius = r;
    }

    public int getRadius()
    {
        return radius;
    }
    
    public double getArea()
    {
        return Math.PI * (Math.sqrt(radius));
    }
}
