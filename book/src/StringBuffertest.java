class StringBuffertest{
public static void main(String[] args){
String str1="������������";
str1=str1+"δ��ʥ�Ͳ�����";//��str1�Ĵ洢��ַ�ѷ����仯
System.out.println(str1);
StringBuffer sb1=new StringBuffer("��˼���ǻ�,");
StringBuffer sb2=sb1.append("�ۿɽ�Թ");//sb1��sb2ָ��ͬһ����ַ
sb2.insert(6,"ʶ��ת�ǣ�");
System.out.println("sb1="+sb1);
System.out.println("sb2="+sb2);
sb1.append(Math.E);
System.out.println(sb1);
System.out.println(sb1.charAt(2));
System.out.println("sb1�ĳ���="+sb1.length());
System.out.println("sb1������="+sb1.capacity());
}}