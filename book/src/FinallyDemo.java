class FinallyDemo {
int no1,no2;
FinallyDemo(String args[]){
try{
no1 = Integer.parseInt(args[0]);
no2 = Integer.parseInt(args[1]);
System.out.println("������Ϊ "+no1/no2);
}
catch(ArithmeticException i) 
{
System.out.println("���ܳ��� 0");
}
catch(ArrayIndexOutOfBoundsException e1)
 {
        System.out.println("�˳���Ҫ��������������");
     }
     catch(NumberFormatException e2)
     {
       System.out.println("������������! ");
     }
finally {
System.out.println("Finally ��ִ��,��������������");	
}//�����һ��fnally�飬����������return��䱻ִ��ʱ��finally�黹��ִ��	
}
public static void main(String args[]) {
new FinallyDemo(args); 
} 
}