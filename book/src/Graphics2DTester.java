import java.awt.*;
import javax.swing.*;
public class Graphics2DTester extends JApplet 
{
	public void paint(Graphics g)
	{
		super.paint(g);
		Graphics2D g2d=(Graphics2D)g;
		g2d.setPaint(new GradientPaint(0,0,Color.red,180,45,Color.yellow));
		g2d.drawString("This is java Applet!;",25,25);
	}
}
