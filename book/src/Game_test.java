/* ��ͽ����_���ġ���
�������һ�������߱��ѶԷ����Է������ѣ�ǰ����5�֣����ߵ�0�֣����˫�������ѶԷ���˫������3�֣����˫��ͬʱ���ѶԷ���˫������1�֡�
���������������߶Ա����ߣ�ǰ�ߵ�һ������ѡ�񲻱��ѣ������������෴�����߻��5�֡������µ�5����������λ�����߱��ѶԷ���ÿһ����������1�֡���󣬱����ߵ�10�֣����������ߵ�5�֡�
������˫����Ϊ���������ߣ�������6�������б˴˾����ᱳ�ѶԷ���˫��ÿ�غϸ���3�֣����ÿ�˸���18�֡�
�����������߻��������˫��ÿ�ζ��ᱳ�ѶԷ���˫��ÿ�غϸ���1�֣����ÿ�˸���6�֡�
����
�������������ߴ���û��Ӯ�ù�һ���������������ߴ�δ���һ�����������ǵ�˫�������ͬ���棬����������Ȼ����õĲ��ԡ�
*/
import java.util.Scanner;
public class Game_test {
public static void main(String[] args){
    System.out.print("�˳������������ظ���ͽ�����еĲ��Ĳ��ԣ�1---�����������ԣ�2---������ԣ�3---�˳�");
    Scanner myinputkey=new Scanner(System.in);
    int inputakey=myinputkey.nextInt();
    while(inputakey!=3){
       switch(inputakey){
          case 1:titfortatpolicy();break;
          case 2:randomizedpolicy();break;
       }
       System.out.print("�˳������������ظ���ͽ�����еĲ��Ĳ��ԣ�1---�����������ԣ�2---������ԣ�3---�˳�");
       inputakey=myinputkey.nextInt();
    }
}
    /*���������������ĸ��ص㣺
      1.���ƣ����������߿�ʼһ����ȡ����̬�ȣ����ᱳ�ѶԷ�
      2.�����ԣ��⵽�Է����ѣ�����������һ���ỹ����������
      3.��ˡ�����Է�ֹͣ���ѣ����������߻�ԭ�¶Է�����������
      4.����Ľ���֣����������߸�����Զ����õ�������棬����������ȫ����������Ϊ����
      ��һ�������������裺
      1.��һ���غ�ѡ�����
      2.��һ�غ��Ƿ�ѡ����Ҫ����һ�ضԷ��Ƿ���������Է���һ�ر��ѣ��˻غ����౳�ѣ����Է���һ�غ������˻غϼ�������
    */
    public static void titfortatpolicy(){
       int computerscores=0,userscores=0;
       StringBuffer computerselected=new StringBuffer();
       char computernowselected,usernowselected;
       int rounds=1;
       StringBuffer userselected=new StringBuffer();       
       Scanner myinputkey=new Scanner(System.in);
       computernowselected='A';
       while(true){
           System.out.print("A-������B-���ѣ�Q-��������������ĵ�"+rounds+"�ִε�ѡ��");
           usernowselected=myinputkey.nextLine().toUpperCase().charAt(0);
           if(usernowselected=='Q') break;
           if(usernowselected=='A'&computernowselected=='A') {
              computerscores+=3;
              userscores+=3;
           }else if(usernowselected=='A'&computernowselected=='B'){
              computerscores+=5;
              userscores+=0;
           }else if(usernowselected=='B'&computernowselected=='A'){
              computerscores+=0;
              userscores+=5;
           }else{
              computerscores+=1;
              userscores+=1;
           } 
           computerselected.append(computernowselected);  
           userselected.append(usernowselected);    
           computernowselected=usernowselected; 
           rounds++;    
       }
       System.out.println("Computer:"+computerselected+",the final score is:"+computerscores);
       System.out.println("User    :"+userselected+",the final score is:"+userscores);
       if(computerscores>userscores){ System.out.println("The computer is winner!");}
       else if(computerscores<userscores){ System.out.println("The user is the winner!");}
       else{System.out.println("We both are winners!");}
       System.out.println("The total scores is:"+(computerscores+userscores));
       
    } 
    /*�������û��ʲô�ص㣬ÿ�μ�������ѡ��������ѡ�
    */
    public static void randomizedpolicy(){
       int computerscores=0,userscores=0;
       StringBuffer computerselected=new StringBuffer();
       char computernowselected,usernowselected;
       int rounds=1;
       StringBuffer userselected=new StringBuffer();   
       char preparedanswer[]={'A','B'};        
       Scanner myinputkey=new Scanner(System.in);
       computernowselected=preparedanswer[(int)(Math.random()*2)];
       while(true){
           System.out.print("A-������B-���ѣ�Q-��������������ĵ�"+rounds+"�ִε�ѡ��");
           usernowselected=myinputkey.nextLine().toUpperCase().charAt(0);
           if(usernowselected=='Q') break;          

           if(usernowselected=='A'&computernowselected=='A') {
              computerscores+=3;
              userscores+=3;
           }else if(usernowselected=='A'&computernowselected=='B'){
              computerscores+=5;
              userscores+=0;
           }else if(usernowselected=='B'&computernowselected=='A'){
              computerscores+=0;
              userscores+=5;
           }else{
              computerscores+=1;
              userscores+=1;
           } 
           computerselected.append(computernowselected);  
           userselected.append(usernowselected);    
           computernowselected=preparedanswer[(int)(Math.random()*2)];
           rounds++;    
       }
       System.out.println("Computer:"+computerselected+",the final score is:"+computerscores);
       System.out.println("User    :"+userselected+",the final score is:"+userscores);
       if(computerscores>userscores){ System.out.println("The computer is winner!");}
       else if(computerscores<userscores){ System.out.println("The user is the winner!");}
       else{System.out.println("We both are winners!");}
       System.out.println("The total scores is:"+(computerscores+userscores));
    }
}