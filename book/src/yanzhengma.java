import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class yanzhengma implements ActionListener{
  JTextField jtf1=new JTextField(20);
  JTextField jtf2=new JTextField(26);

  public static void main(String[] args){
    new yanzhengma();
}

  public yanzhengma(){
    JFrame jf=new JFrame("��֤��������");
    JPanel jp1=new JPanel();
    JPanel jp2=new JPanel();
    JButton jb=new JButton("����");
    JLabel jl1=new JLabel("�����λ��֤�룺");
    JLabel jl2=new JLabel("��֤�룺");

    jb.addActionListener(this);
    //jtf2.setEditable(false);//����ı�����Ϊ���ɱ༭
    jp1.add(jl1);jp1.add(jtf1);jp2.add(jl2);jp2.add(jtf2);
    jf.add(jp1,BorderLayout.NORTH);jf.add(jp2,BorderLayout.CENTER);jf.add(jb,BorderLayout.SOUTH);
    jf.setSize(500,500);
    jf.setVisible(true);
    //jf.setResizable(false);//���ô��ڴ�С���ɱ�
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Ĭ�Ϲرղ���
  }

  public void actionPerformed(ActionEvent event){
    String s=new String();
    String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    for(int i=0;i<Integer.valueOf(jtf1.getText());i++){
      s+=(str.charAt((int)(Math.random()*62)));
    }
    System.out.println(s);
    jtf2.setText(s.toString());
  }
}