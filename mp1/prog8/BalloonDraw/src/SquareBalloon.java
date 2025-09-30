import java.awt.Color;
import java.awt.Graphics;

public class SquareBalloon extends Balloon
{
	private int xCenter, yCenter, radius;
	private Color color;
	
	public SquareBalloon()
	  {
		  super();
	  }
	  public SquareBalloon(int x, int y, int r, Color c)
	  {
		  super(x, y, r, c);
	  }
	public double distance(int x, int y)
	  {
		  double dx = Math.abs(x - getX());
		  double dy = Math.abs(y - getY());
			 
		  return Math.max(dx, dy);
	  }
		

	  public void draw(Graphics g, boolean makeItFilled)
	  {
		xCenter = getX();
		yCenter = getY();
		radius = getRadius();
		color = getColor();
		
		g.setColor(color);
		if (makeItFilled)
		  g.fillRect(xCenter - radius,
		             yCenter - radius, 2*radius, 2*radius);
		else
		  g.drawRect(xCenter - radius,
		             yCenter - radius, 2*radius, 2*radius);
	  }
}
