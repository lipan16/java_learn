import java.applet.*;
import java.awt.*;
import java.util.Random;
public class shapetest extends Applet
{
     shape[] myshape;
     public void init()
     {
          myshape=new shape[5];
          myshape[0]=new point(50,50);
          point a1=new point(24,24);
          point a2=new point(100,200);
          point a3=new point(200,120);
          myshape[1]=new triangle(a1,a2,a3);
          myshape[2]=new circle(a2,50);
          myshape[3]=new circle(a3,100);
          myshape[4]=new rectangle(new point(100,100),new point(200,200));
     }
     public void paint(Graphics g)
     {
		 Random rand=new Random();//定义随机数
		 System.out.println(rand.nextInt(255));//产生随机数
		 Color c=new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255));
		 //Color c=new Color(255,0,56);
		 g.setColor(c);//改变画笔颜色
         for(int i=0;i<myshape.length;i++)
         {
              myshape[i].drawme(g);
              System.out.println(myshape[i].getName()+":"+myshape[i].area()+","+myshape[i].length());
         }
     }
}