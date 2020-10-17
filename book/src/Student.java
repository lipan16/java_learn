import java.util.Scanner;
import java.io.*;
public class Student {
   private String name;
   private char sex;
   private int  age;
   private String[] coursenames;
   private double[] coursescores;

   public Student(){
      name="unknown name!";
      sex='M';
      age=18;
      coursenames=new String[3];
      coursescores=new double[3];
      coursenames[0]=new String("����");
      coursenames[1]=new String("��ѧ");
      coursenames[2]=new String("Ӣ��");
      coursescores[0]=coursescores[1]=coursescores[2]=0.0;
   }
   public Student(String n,char s,int a)
   {
      name=n;
      sex=(s=='F')?s:'M';

      if(a>=0&&a<=40) age=a;
      else age=18;

      coursenames=new String[3];
      coursescores=new double[3];
      coursenames[0]=new String("����");
      coursenames[1]=new String("��ѧ");
      coursenames[2]=new String("Ӣ��");
      coursescores[0]=coursescores[1]=coursescores[2]=0.0;
   }
   public String getName(){return name;} 
   public void  setName(String n){name=n;}
   
   public char getSex(){return sex;}
   public void setSex(char s){sex=(s=='F')?s:'M';}
 
   public int getAge(){return age;}
   public void setAge(int a){age=(a>=0&&a<=40)?a:18;}

   public String[] getCoursenames(){return coursenames;}
   public String getCoursename(int i){return coursenames[i];}
   public void setCoursenames(String[] cn){coursenames=cn;}
   public void setCoursename(String cn,int i)
   {
       coursenames[i]=cn;
   }
   public double[] getCoursescores(){return coursescores;}
   public double getCoursescore(int i){return coursescores[i];}
   public void setCoursescores(double[] cs){coursescores=cs;}
   public void setCoursescore(double cs,int i){coursescores[i]=cs;}

   public double total()
   {
     double sum=0.0;
     for(int i=0;i<coursescores.length;i++)
     {
        sum+=coursescores[i];
     }
     return sum;
   }
   
   public void inputData()
   {
      Scanner in=new Scanner(System.in);
      System.out.println("������"+name+"�ĳɼ���");
      for(int i=0;i<coursescores.length;i++)
      {
         System.out.print(coursenames[i]+":");
         coursescores[i]=in.nextDouble();
      }
   }
   public String toString()
   {
      String myinfo="   name:"+name+"\tsex:"+sex+"\tage:"+age;
      myinfo=myinfo+"\n==========================================\n";
      for(int i=0;i<coursenames.length;i++)
      {
         myinfo=myinfo+"    "+coursenames[i]+"   \t";
      }
      myinfo=myinfo+"\n";
      for(int i=0;i<coursescores.length;i++)
      {
         myinfo=myinfo+"    "+coursescores[i]+"   \t";
      }
      myinfo=myinfo+"\n==========================================";
      return myinfo;
   } 
}
