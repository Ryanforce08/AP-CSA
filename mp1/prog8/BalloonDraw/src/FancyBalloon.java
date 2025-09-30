import java.awt.Color;

public class FancyBalloon extends Balloon
{


	  
	  public FancyBalloon()
	  {
		  super();
	  }
	  public FancyBalloon(int x, int y, int r, Color c)
	  {
		  super(x, y, r, c);
	  }

//	  public void draw(Graphics g, boolean makeItFilled)
//	  {
//		xCenter = getX();
//		yCenter = getY();
//		radius = getRadius();
//		
//		g.setColor(color);
//		if (makeItFilled)
//		  g.fillOval(xCenter - radius,
//		             yCenter - radius, radius, radius);
//		else
//		  g.drawOval(xCenter - radius,
//		             yCenter - radius, radius, radius);
//	  }
}
