class pingzi{
  public static void main(String[]  args){
    int i,k;
    int a[];
    a=new int[12];
    for(i=0;i<12;i++)
      a[i]=10;
    i=(int)(12*Math.random());
    while(a[i]==10)
      a[i]=(int)(20*Math.random());
    for(i=0;i<12;i++)
      System.out.print(a[i]+" ");
      System.out.println();
    if(a[0]+a[1]+a[2]+a[3]==a[4]+a[5]+a[6]+a[7]){
      if(2*a[8]==a[9]+a[10]) System.out.println("��12��ƿ�Ӳ��ϸ�����Ϊ��"+a[11]);
      if(2*a[9]==a[10]+a[11])System.out.println("��9��ƿ�Ӳ��ϸ�����Ϊ��"+a[8]);
      if(2*a[10]==a[11]+a[8])System.out.println("��10��ƿ�Ӳ��ϸ�����Ϊ��"+a[9]);
      if(2*a[11]==a[8]+a[9]) System.out.println("��11��ƿ�Ӳ��ϸ�����Ϊ��"+a[10]);
      }
    else if(a[0]+a[1]+a[2]+a[3]==a[8]+a[9]+a[10]+a[11])
     {
      if(2*a[4]==a[5]+a[6])System.out.println("��8��ƿ�Ӳ��ϸ�����Ϊ��"+a[7]);
      if(2*a[5]==a[6]+a[7])System.out.println("��5��ƿ�Ӳ��ϸ�����Ϊ��"+a[4]);
      if(2*a[6]==a[7]+a[4])System.out.println("��6��ƿ�Ӳ��ϸ�����Ϊ��"+a[5]);
      if(2*a[7]==a[4]+a[5])System.out.println("��7��ƿ�Ӳ��ϸ�����Ϊ��"+a[6]);
      }
    else {
      if(2*a[0]==a[1]+a[2])System.out.println("��4��ƿ�Ӳ��ϸ�����Ϊ��"+a[3]);
      if(2*a[1]==a[2]+a[3])System.out.println("��1��ƿ�Ӳ��ϸ�����Ϊ��"+a[0]);
      if(2*a[2]==a[3]+a[0])System.out.println("��2��ƿ�Ӳ��ϸ�����Ϊ��"+a[1]);
      if(2*a[3]==a[0]+a[1])System.out.println("��3��ƿ�Ӳ��ϸ�����Ϊ��"+a[2]);
      }
}}