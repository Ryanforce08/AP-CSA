import java.awt.Color;
import java.awt.Graphics;

public class OvalBalloon extends Balloon
{
	    private int xCenter, yCenter, radius;
	    private Color color;
		public OvalBalloon() {
			super();
		}
		
		public OvalBalloon (int x, int y, int r, Color c)
		{
			super(x,y,r,c);
		}
		
		public double distance(int x, int y)
		{
			 double dx = x - getX();
			 double dy = y - getY();
			 
			 return Math.sqrt(4 * dx* dx + dy * dy);
		}
		
		
		public void draw(Graphics g, boolean makeItFilled)
		{
			xCenter = getX();
			yCenter = getY();
			radius = getRadius();
			color = getColor();
			
			g.setColor(color);
			if (makeItFilled)
			  g.fillOval(xCenter - radius/2,
			             yCenter - radius, radius, 2*radius);
			else
			  g.drawOval(xCenter - radius/2,
			             yCenter - radius, radius, 2*radius);
		}
}
