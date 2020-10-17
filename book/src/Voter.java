public class Voter {
  private static int MAX_COUNT=100; //��̬���������ͶƱ��
  private static int count;  //��̬��������ͶƱ��
  private static Voter[] voters=new Voter[MAX_COUNT];
  private String name;
  
  public Voter(String name){this.name=name;}
  public String getName(){return name;}
  public void voteFor(){
    if(count==MAX_COUNT){
       System.out.println("ͶƱ��Ѿ�����");
       return;
    }
    if(isExisted(this))
       System.out.println(name+" :�㲻�����ظ�ͶƱ");
    else {
       votersadd(this); 
       System.out.println(name+" :��л��ͶƱ");
    }
  }
  public static boolean isExisted(Voter obj) {   //�ж��Ƿ���Ͷ��Ʊ��
    for(int i=0;i<count;i++)
    {
       if(voters[i].getName().equals(obj.getName())) {
          return true;
       }
    }
    return false;
  }
  public static void votersadd(Voter obj){   //����ͶƱ�˼�������
     voters[count++]=obj;
  }
  public static void printVoteResult(){
     System.out.println("��ǰͶƱ��Ϊ��"+count);
     System.out.println("����ͶƱ��ѡ�����£�");
     for(int i=0;i<count;i++)
       System.out.println(voters[i].getName());
  }
  public static void main(String[] args)
  {
     Voter majun=new Voter("��");
     Voter flyhorse=new Voter("���з���");
     Voter mike=new Voter("Mike");
     Voter majian=new Voter("��");

     majun.voteFor();
     flyhorse.voteFor();
     mike.voteFor();
     mike.voteFor();
     majian.voteFor();

     Voter.printVoteResult();
  }
}