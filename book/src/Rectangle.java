import java.util.Scanner;
class Rectangle{
public static void main(String[] args){
double w,l,s,c;
Scanner keyin=new Scanner(System.in);
System.out.print("请输入长方形的长：");
l=keyin.nextDouble();
System.out.print("请输入长方形的宽：");
w=keyin.nextDouble();
s=w*l;
c=2*(w+l);
System.out.println("面积为"+s+"\n周长为"+c);
}}