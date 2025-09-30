/**
 * Represents a balloon in the BalloonDraw program.
 * Author: Willy Bolly
 * Ver 1.0 Created 12/31/17
 */

import java.awt.Color;
import java.awt.Graphics;

public class RoundBalloon extends Balloon
{
  private int xCenter, yCenter, radius;
  private Color color;

  
  public RoundBalloon()
  {
	  super();
  }
  public RoundBalloon(int x, int y, int r, Color c)
  {
	  super(x, y, r, c);
  }

  public void draw(Graphics g, boolean makeItFilled)
  {
	xCenter = getX();
	yCenter = getY();
	radius = getRadius();
	
	color = getColor();
	
	g.setColor(color);
	if (makeItFilled)
	  g.fillOval(xCenter - radius,
	             yCenter - radius, 2*radius, 2*radius);
	else
	  g.drawOval(xCenter - radius,
	             yCenter - radius, 2*radius, 2*radius);
  }
}