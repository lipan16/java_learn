import java.awt.*;
class SimpleFrame 
{
	public static void main(String[] args) 
	{
		Frame f=new Frame("Helo World");
		Panel p1=new Panel();
		Panel p2=new Panel();
		Label l1=new Label("姓名");
		Label l2=new Label("学号");
		TextField tf=new TextField(5);
		Button bu=new Button("取消");
		
		
		p1.add(l1,BorderLayout.NORTH);p1.add(tf);
		//p2.add(l2,BorderLayout.SOUTH);
		p1.add(bu);
		f.add(p1,BorderLayout.NORTH);
		//f.add(p2,BorderLayout.SOUTH);
		
		p1.setBackground(Color.black);
		p1.setForeground(Color.red);
		//p2.setBackground(Color.yellow);

		f.setSize(1000,600);
		f.setVisible(true);
	}
}
