import java.awt.*;
import javax.swing.*;
class GraphicsTester extends JFrame
{
	public GraphicsTester()
	{
		super("演示字体,颜色");
		setVisible(true);
		setSize(500,250);
	}
	public void paint(Graphics g)
	{
		super.paint(g);
		g.setFont(new Font("SansSerif",Font.BOLD,12));
		g.setColor(Color.blue);//设置颜色
		g.drawString("字体SansSerif，粗体，12号，蓝色",20,50);//画字符串

		g.setFont(new Font("Serif",Font.ITALIC,14));
		g.setColor(new Color(255,0,0));//设置颜色
		g.drawString("字体Serif，斜体，14号，红色",250,50);//画字符串

		g.drawLine(20,60,400,60);//画直线

        g.setColor(Color.green);//绿色
		g.drawRect(20,70,100,50);//画空心矩形
		g.fillRect(130,70,100,50);//画实心矩形

		g.setColor(Color.yellow);
		g.drawRoundRect(240,70,100,50,50,50);//画空心圆角矩形
		g.fillOval(350,130,100,50);//画空心椭圆

		g.setColor(new Color(0,120,20));
		g.drawArc(20,190,100,50,0,90);//画一段圆弧
		g.fillArc(130,190,100,50,0,90);//画扇形

		g.setColor(Color.black);
		int xValues[]={250,280,290,300,330,310,320,290,260,270};
		int yValues[]={210,210,190,210,210,220,230,220,230,220};
		g.drawPolygon(xValues,yValues,10);//画空心多边形

		int xValues2[]={360,390,400,410,440,420,430,400,370,380};
		g.fillPolygon(xValues2,yValues,10);//画实心多边形
	}
	public static void main(String[] args) 
	{
		GraphicsTester application=new GraphicsTester();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
