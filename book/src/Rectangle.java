import java.util.Scanner;
class Rectangle{
public static void main(String[] args){
double w,l,s,c;
Scanner keyin=new Scanner(System.in);
System.out.print("�����볤���εĳ���");
l=keyin.nextDouble();
System.out.print("�����볤���εĿ�");
w=keyin.nextDouble();
s=w*l;
c=2*(w+l);
System.out.println("���Ϊ"+s+"\n�ܳ�Ϊ"+c);
}}