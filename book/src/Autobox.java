public class Autobox{
public static void main(String args[]) throws Exception{
System.out.println("Demonstrating power of autoboxing/unboxing");
Integer a=100;//�Զ�װ��
int b=200;
int c=a+b;//�Զ����䲢����
System.out.println("Autoboxing int action:arithmetic expressions");
System.out.printf("%d+%d=%d%n%n",a,b,c);
System.out.println("Autoboxing int action:method parameters and return types");
System.out.printf("%d+%d=%d%n",a,b,adder(a,b));
}
private static Integer adder(Integer a,Integer b){
return a+b;
}}