class Stringtest{
public static void main(String[] args){
String str1="�鵽��ʱ�����٣��·Ǿ�����֪��";
String str2="���۳ɵ������ף��������������";
String str3="The heard of the wise is in the house of mourning;but the heard of fools is in the house of mirth";
String str4=new String("Whatsoever thy hand findeth to do,do it with thy might;for there is no work,nor device,nor knowledge nor wisdom,in the grave,whither thou goest");
String str5=null;
System.out.println("str1�ĳ�����"+str1.length());
System.out.println("str3�ĳ�����"+str3.length());
str5=str1+str2;
System.out.println("str5"+str5);
System.out.println(str3.concat(str4));
System.out.println(str1.substring(8));
String str6="��ɶ������뽥��";
String str7=new String("��ɶ������뽥��");
System.out.println(str6.equals(str7));
System.out.println(str1.compareTo(str2));
System.out.println(str2.charAt(2));
System.out.println(str3.indexOf("wise"));
System.out.println(str4.replace('h','*'));
System.out.println(str3.toLowerCase());
System.out.println(str4.toUpperCase());
String str8="�й���ֽ��Ц��������װ��";
System.out.println(str8.trim());
}}