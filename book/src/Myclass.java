import java.util.Scanner;
public class Myclass
{
   private String name;
   private int counts;
   private Student[] stus;

   public Myclass(){name="unknown name";counts=0;stus=null;}
   public Myclass(String n,int c)
   {
       name=n;  counts=c>=0?c:1;
       stus=new Student[c];
   }
   public String getName(){return name;}
   public void setName(String n){name=n;}
   
   public int getCounts(){return counts;}
   public void setCounts(int a){counts=a>=0?a:0;}
   
   public Student[] getStudents(){return stus;}
   public Student getStudent(int i){return stus[i];}
   public void setStudents(Student[] ss){stus=ss;}
   public void setStudent(Student s,int i){ stus[i]=s;}

   public void inputData()
   {
      for(int i=0;i<counts;i++) 
      {
        Scanner in=new Scanner(System.in);
        System.out.println("������ѧ������:");
        String n=in.nextLine();
        System.out.println("������ѧ���Ա�:");
        char C=in.nextLine().charAt(0);
        System.out.println("������ѧ������:");
        int a=in.nextInt();
        stus[i]=new Student(n,C,a);
        stus[i].inputData();
      }
   }
   public void outputData()
   {
       double[] avg=new double[3];
       avg[0]=avg[1]=avg[2]=0;
       System.out.println("�༶����"+name+"\t������"+counts);
       System.out.println("==============================================");
       System.out.print("����");
       for(int i=0;i<stus[0].getCoursenames().length;i++) System.out.print("\t"+stus[0].getCoursename(i));
       System.out.println("\t�ܷ�");
       System.out.println("--------------------------------------------------");
       for(int i=0;i<counts;i++)
       {
          System.out.print(stus[i].getName());
          for(int j=0;j<stus[i].getCoursescores().length;j++)
          { 
             System.out.print("\t  "+stus[i].getCoursescore(j));
             avg[j]=avg[j]+stus[i].getCoursescore(j);
          }
          System.out.println("  "+stus[i].total());
       }
       System.out.println("=============================================");
       System.out.print("ƽ   ����");
       for(int k=0;k<3;k++) System.out.print("\t  "+avg[k]/counts);
       System.out.println("\n===========================================");
       
   }
}