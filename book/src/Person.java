import java.io.*;
import java.util.Scanner;
class Person{
  private String name;
  private char sex;
  private String homePhone;
  private String officePhone;
  private String memo;
  public Person(){name="";sex='M';}
  public Person(String name,String homePhone){this.name=name;}
  public Person(String name,char sex,String homePhone){this.name=name;this.sex=sex;this.homePhone=homePhone;}
  public String getName(){return name;}
  public void setName(String s){name=s;}
  public char getSex(){return sex;}
  public void setSex(char c){sex=(c=='M')?'M':'F';}
  public String getHomePhone(){return homePhone;}
  public void setHomePhone(String hp){homePhone=hp==null?"":hp;}
  public String getOfficePhone(){return officePhone;}
  public void setOfficePhone(String op){officePhone=op==null?"":op;}
  public void setMemo(){return memo;}
  public void setMemo(String m){memo=m==null?"":m;}
  public String toString(){
    String personinfo="===========================================\n";
    personinfo+="������"+name+"�Ա�"+(sex=='M'?'��':'Ů')+"\n";
    personinfo+="�绰(H):"+homePhone+"\n";
    personinfo+="�绰(O):"+officePhone+"\n";
    personinfo+="��ע��Ϣ:"+memo+"\n";
    personinfo+="==========================================\n";
    return personinfo;
  }
  public void display(){System.out.println(toString());}
  public void writeToStream(BufferedWriter out)throws IOException{
    out.write(name+","+(sex=='M'?"��":"Ů")+",");
    if(officePhone!=null) out.write(officePhone+",");
        else out.write(",");
        if(memo!=null)out.write(memo);
        out.newLine();
    }
    public boolean readFromStream(BufferedReader in) throws IOException{
        String str=in.readLine();
        if(str.equals("end."))  return false;
        String[] info=str.split(",");
        this.setName(info[0]);
        this.setSex(info[1].charAt(0));
        if(info[2]!=null) this.setHomePhone(info[2]);
        if(info[3]!=null) this.setOfficePhone(info[3]);
        if(info[4]!=null) this.setMemo(info[4]);
        return true;
    }
    public void inputData(){
        Scanner in=new Scanner(System.in);
//        in.useDelimiter("\n") ;
//        if(in.hasNext()) in.next();
        System.out.print("����:");if(in.hasNext()) setName(in.next());
        System.out.print("�Ա�(M/F):");setSex(in.next().charAt(0));
        System.out.print("�绰(H):");setHomePhone(in.next());
        System.out.print("�绰(O):");setOfficePhone(in.next());
        System.out.print("��ע:");setMemo(in.next());
        System.out.println(toString());
    }
}
public class AddressBookTest {
    public static int displayMenu() {
       System.out.println("\t\t*********************************");
       System.out.println("\t\t*    1-----�����µ�ͨѶ¼     *");
       System.out.println("\t\t*    2-----��ʾ���ڵ�ͨѶ¼   *");
       System.out.println("\t\t*    3-----�˳�               *");
       System.out.println("\t\t**********************************");
       try {
          int choice=System.in.read();
          System.in.skip(2);
          if(choice>=49&&choice<=52)
          {  return choice-48;}
          else   {
             return 0;
          }
       }
       catch(IOException e){ System.out.println("Error!");return 0;}
    }
    public static void main(String args[]) throws Exception  {
      int i;
      while(true)  {
         i=displayMenu();
         switch(i)  {
            case 1:
              newAddressBook();break;
            case 2:
              displayAddressBook();break;
            case 3:
              System.exit(0);break;
            case 4:
            default:
            {System.out.println("ѡ������");break;}
         }
      }
   }
   public static boolean yesno(String msg){
       Scanner keyin=new Scanner(System.in);
       System.out.print(msg);
       char ch=keyin.nextLine().charAt(0);
       if(ch=='y' || ch=='Y') return true;
       else return false;
   }
   public static void newAddressBook() {
       System.out.println("========>����һ���µ�ͨѶ¼<========");
       System.out.println("ע�⣺ͨѶ¼�ĳ�ʼ����Ϊ200����");
       Person[] addressbook=new Person[200];
       int i=0;
       boolean yesno=true;
       while(i<200){
           Person tmpPerson=new Person();
           tmpPerson.inputData();
           yesno=yesno("��ȷ��(Y/N)?");
           if(yesno){
               addressbook[i]=tmpPerson;
           } else {
               System.out.println("���������룡");
               continue;
           }
           yesno=yesno("������(Y/N)?");
           if(!yesno) {
                break;                
           }
           i++;
       }
       BufferedWriter addressFile=null;
       try {
           addressFile=new BufferedWriter(new FileWriter("addressbook.txt"));
           for(int k=0;k<=i;k++){
               addressbook[k].writeToStream(addressFile);
           }
           addressFile.write("end.");
       }catch(IOException e){
           e.printStackTrace();
       }catch(Exception e1){
           e1.printStackTrace();
       }finally{
            try {
                if(addressFile!=null) addressFile.close();
            }catch(Exception e2){
                e2.printStackTrace();
            }
       }
       System.out.println("��ͨѶ¼�ѽ����ã�");
    }
    public static void displayAddressBook(){
        Person[] addressbook=new Person[200];
        BufferedReader filein=null;
        try {         
            filein=new BufferedReader(new FileReader("addressbook.txt"));
            int i=0;
            Person tmpPerson=new Person();
            boolean flag=tmpPerson.readFromStream(filein);
            while(flag){
                addressbook[i]=tmpPerson;
                addressbook[i].display();
                i++;
                tmpPerson=new Person();
                flag=tmpPerson.readFromStream(filein);
            }
            filein.close();
        }catch(IOException e1){
             e1.printStackTrace();
        }catch(Exception e2){
             e2.printStackTrace();
        }finally{
            try {
                if(filein!=null) filein.close();
            }catch(Exception e){}
        }
        System.out.println("ͨѶ¼��ʾ������");
    }   
}