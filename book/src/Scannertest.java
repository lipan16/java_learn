import java.util.Scanner;//����Scanner��
class Scannertest{
public static void main(String[] args){
double d;
float f;
int i;
long l;
boolean b;
String str;
Scanner keyin=new Scanner(System.in);
System.out.println("�������ַ���");
str=keyin.nextLine();
System.out.println("������һ��˫��������");
d=keyin.nextDouble();
System.out.println("������һ������������");
f=keyin.nextFloat();
System.out.println("������һ��������");
i=keyin.nextInt();
System.out.println("������һ��������");
l=keyin.nextLong();
System.out.println("������һ���߼�ֵ");
b=keyin.nextBoolean();
System.out.println(str);
System.out.println("����������ֱ��ǣ�");
//System.out.print("d="+d+"\nf="+f+"\ni="+i+"\nl="+l+"\nb="+"b");
}}
