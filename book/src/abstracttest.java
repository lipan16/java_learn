abstract class Employee
{	
  int basic = 2000;
  abstract void salary();//���󷽷�
}
class Manager extends Employee
{
   void salary()//��������
   {		
     System.out.println("н�ʵ��� "+basic*5);
     System.out.println("********************");
   }
 }
 class Worker extends Employee
{
   void salary()//��������
   {		
   	System.out.println("н�ʵ��� "+basic*2);
    System.out.println("===================");
   }
 } 

class abstracttest
{
    public static void main(String [] args)
    {
		Manager m=new Manager();//ֱ�Ӵ����������
		Worker w=new Worker();//ֱ�Ӵ����������
		m.salary();
		w.salary();				 
		System.out.println();
        Employee [] p=new Employee[5];//����5��Employee����
        p[0]=new Manager();//��������ָ���������Manager
        p[1]=new Worker();//��������ָ���������Worker
        p[2]=new Worker();//��������ָ���������Worker
        p[3]=new Manager();//��������ָ���������Manager
        p[4]=new Worker();//��������ָ���������Worker
        for(int i=0;i<p.length;i++)
			p[i].salary();
    }
}