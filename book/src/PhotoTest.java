import java.awt.*;
import java.io.*;
import javax.swing.*;
//测试方法：java Test 86e5d.png 246.png bb8d4.png
class PhotoTest
{
	public static void main(String[] args)
	{
      Toolkit imgtool=Toolkit.getDefaultToolkit();
      Image myimg=imgtool.getImage(args[0]); //命令行中输入图片文件名打开图片文件86e5d.png
      Test.displayImage(myimg);
	  myimg=imgtool.getImage(args[1]); //再次打开图片文件246.png
      Test.displayImage(myimg);
	  myimg=imgtool.getImage(args[2]); //再次打开图片文件bb8d4.png
      Test.displayImage(myimg);
    }
    public static void displayImage(Image img)
	{
       JFrame frame =new JFrame("图片显示");
       ImageIcon imgicon=new ImageIcon(img);
       frame.setSize(1024,400);
       //frame.setSize(imgicon.getIconWidth(),imgicon.getIconHeight());
       JLabel label = new JLabel();
       label.setIcon(imgicon);
       frame.add(label);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
    }
}