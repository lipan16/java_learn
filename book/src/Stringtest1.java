class Stringtest1{
  public static void main(String[] args){
    String str1="�鵽��ʱ�����٣�";
    String str2="�·Ǿ�����֪�ѡ�";
    StringBuffer str3=new StringBuffer("ʱ");
    StringBuffer Str1=new StringBuffer("����ʱ������");
    System.out.println(str1.charAt(1));
    System.out.println(str1.compareTo(str2));
    System.out.println(str1.compareToIgnoreCase(str2));
    System.out.println(str1.concat(str2));
    System.out.println(str1.indexOf(1));
   //System.out.println(str1.indexOf(str3));
    System.out.println(str1.valueOf(str2));
    System.out.println(str1.substring(1,5));
    System.out.println(str1.split("ʱ"));
    //System.out.println(Str1.delete(1,3));
    System.out.println(Str1.append(str3));
    System.out.println(Str1.insert(1,"��"));
}}