import java.io.*;
public class ByteArrayInputStreamTest{
    public static void main(String args[]){
        int ch;
        String str="Create a ByteArrayInputStream";
        byte buf[]=str.getBytes();
        ByteArrayInputStream bais=new ByteArrayInputStream(buf,7,7);
        System.out.println("�ɶ�ȡ���ַ�����"+bais.available());
        while((ch=bais.read())!=-1){
            System.out.print((char)ch);
        }
        System.out.println();
    }
}