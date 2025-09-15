import java.awt.Graphics;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Prog4c extends JPanel
{
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);  // Call JPanel's paintComponent method
                              //  to paint the background
    g.setColor(Color.BLUE);

    g.fillRect(0, 0, 200, 150);

    g.setColor(Color.WHITE);

    g.drawString("Hello, Graphics!", 55, 65);
  }

  public static void main(String[] args)
  {
    JFrame window = new JFrame("Graphics Demo");
    window.setBounds(300, 300, 200, 150);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Prog4c panel = new Prog4c();
    panel.setBackground(Color.WHITE); 
    Container c = window.getContentPane();
    c.add(panel);

    window.setVisible(true);
  }
}

