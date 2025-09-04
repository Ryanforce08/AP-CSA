// Chapter 2 Question 15 (a)

/**
 * This program displays a red cross on a white
 * background.
 */

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Prog4b extends JPanel
{
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);  // Call JPanel's paintComponent method
                              //   to paint the background
    int xCenter = getWidth() / 2;
    int yCenter = getHeight() / 2;
    g.setColor(Color.RED);
    g.fillOval(xCenter - 100, yCenter - 100, 200, 200);
    g.setColor(Color.WHITE);
    g.fillOval(xCenter - 75, yCenter - 75, 150, 150); 
    g.setColor(Color.RED);
    g.fillOval(xCenter - 38, yCenter - 38, 75, 75);  

  }

  public static void main(String[] args)
  {
    JFrame window = new JFrame("Red Cross");
    window.setBounds(300, 300, 200, 200);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Prog4b panel = new Prog4b();
    panel.setBackground(Color.WHITE);
    Container c = window.getContentPane();
    c.add(panel);
    window.setVisible(true);
  }
}



