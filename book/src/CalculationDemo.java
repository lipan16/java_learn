class Calculation{
public void add(int a,int b){
int c=a+b;
System.out.println("�����ĺ�"+c);}

public void add(float a,float b){
float c=a+b;
System.out.println("�����������ĺͣ�"+c);}

public void add(String a,String b){
String c=a+b;
System.out.println("�����ַ����ĺͣ�"+c);}

public void add(fushu a,fushu b){
fushu f=new fushu(a.getReal()+b.getReal(),a.getImag()+b.getImag());
System.out.println("�������ĺͣ�"+f);}
}
class CalculationDemo{
public static void main(String args[]){
Calculation c=new Calculation();
c.add(10,20);
c.add(40.0F,35.65F);
c.add("����","��");
fushu f1=new fushu(3.4,2.8);
fushu f2=new fushu(1.6,-7.8);
f1.display();
f2.display();
c.add(f1,f2);
}}