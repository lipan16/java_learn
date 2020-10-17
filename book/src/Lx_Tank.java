import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Lx_Tank extends JFrame implements ActionListener {
	JMenuBar cd;
	JMenu cd1;
	JButton cd2,cd3,cd4,cd5;
    JMenuItem cdx2,cdx3;
    JPanel aa;
	public static void main(String[] agrs){
		new Lx_Tank();
	}
	Lx_Tank(){
		cd=new JMenuBar();
		
		cd1=new JMenu("游戏");
		
		cd2=new JButton("新游戏");
		cd2.setSize(85,20);
		cd2.addActionListener(this);
		cd2.setActionCommand("101");
		
		cd3=new JButton("继续游戏");
		cd3.addActionListener(this);
		cd3.setActionCommand("102");
		
		cd4=new JButton("保存游戏");
		cd4.addActionListener(this);
		cd4.setActionCommand("103");
		
		cd5=new JButton("退出");
		cd5.addActionListener(this);
		cd5.setActionCommand("104");
		
		cd1.add(cd2);cd1.add(cd3);cd1.add(cd4);cd1.add(cd5);
		cd.add(cd1);
		 this.add(cd,BorderLayout.NORTH);
		 this.setSize(400,300);
		 this.setVisible(true);
		 this.setLocationRelativeTo(null);
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand().equals("101")){
			System.out.println("新游戏");
		}else if(e.getActionCommand().equals("102")){
			System.out.println("继续游戏");
		}else if(e.getActionCommand().equals("103")){
			System.out.println("保存游戏");
		}else if(e.getActionCommand().equals("104")){
			System.out.println("游戏退出");
			System.exit(0);
		}
	}
}
