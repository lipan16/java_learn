public class Vartest{
int var1=0;//�����Ա����
static int var2=0;//���Ա����
void method1(int var3){//�βα���
int var4=0;//�����ھֲ�����
if(var4==0){
int var5=0;//������ھֲ�����
var1++;
var2++;
var3++;
var4++;
var5++;
}
var1++;
var2++;
var3++;
var4++;
var5++;//�Ƿ���var5�Ѿ���ʧ
}
void method2(){
var1++;
var2++;
var3++;//�Ƿ���������
var4++;//�Ƿ���������
var5++;//�Ƿ���������
}
public static void main(String[] args){
Vartest t1=new Vartest();
Vartest t2=new Vartest();
t1.var1++;//��t1�����var1�����Լ�
t2.var1++;//��t2�����var1�����Լ�
Vartest.var2++;//�������var2�Լ�
}}