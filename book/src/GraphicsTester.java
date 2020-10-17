import java.awt.*;
import javax.swing.*;
class GraphicsTester extends JFrame
{
	public GraphicsTester()
	{
		super("��ʾ����,��ɫ");
		setVisible(true);
		setSize(500,250);
	}
	public void paint(Graphics g)
	{
		super.paint(g);
		g.setFont(new Font("SansSerif",Font.BOLD,12));
		g.setColor(Color.blue);//������ɫ
		g.drawString("����SansSerif�����壬12�ţ���ɫ",20,50);//���ַ���

		g.setFont(new Font("Serif",Font.ITALIC,14));
		g.setColor(new Color(255,0,0));//������ɫ
		g.drawString("����Serif��б�壬14�ţ���ɫ",250,50);//���ַ���

		g.drawLine(20,60,400,60);//��ֱ��

        g.setColor(Color.green);//��ɫ
		g.drawRect(20,70,100,50);//�����ľ���
		g.fillRect(130,70,100,50);//��ʵ�ľ���

		g.setColor(Color.yellow);
		g.drawRoundRect(240,70,100,50,50,50);//������Բ�Ǿ���
		g.fillOval(350,130,100,50);//��������Բ

		g.setColor(new Color(0,120,20));
		g.drawArc(20,190,100,50,0,90);//��һ��Բ��
		g.fillArc(130,190,100,50,0,90);//������

		g.setColor(Color.black);
		int xValues[]={250,280,290,300,330,310,320,290,260,270};
		int yValues[]={210,210,190,210,210,220,230,220,230,220};
		g.drawPolygon(xValues,yValues,10);//�����Ķ����

		int xValues2[]={360,390,400,410,440,420,430,400,370,380};
		g.fillPolygon(xValues2,yValues,10);//��ʵ�Ķ����
	}
	public static void main(String[] args) 
	{
		GraphicsTester application=new GraphicsTester();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
