abstract class Employee
{	
  int basic = 2000;
  abstract void salary();//抽象方法
}
class Manager extends Employee
{
   void salary()//方法覆盖
   {		
     System.out.println("薪资等于 "+basic*5);
     System.out.println("********************");
   }
 }
 class Worker extends Employee
{
   void salary()//方法覆盖
   {		
   	System.out.println("薪资等于 "+basic*2);
    System.out.println("===================");
   }
 } 

class abstracttest
{
    public static void main(String [] args)
    {
		Manager m=new Manager();//直接创建子类对象
		Worker w=new Worker();//直接创建子类对象
		m.salary();
		w.salary();				 
		System.out.println();
        Employee [] p=new Employee[5];//定义5个Employee引用
        p[0]=new Manager();//父类引用指向子类对象Manager
        p[1]=new Worker();//父类引用指向子类对象Worker
        p[2]=new Worker();//父类引用指向子类对象Worker
        p[3]=new Manager();//父类引用指向子类对象Manager
        p[4]=new Worker();//父类引用指向子类对象Worker
        for(int i=0;i<p.length;i++)
			p[i].salary();
    }
}