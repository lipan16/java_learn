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
      if(2*a[8]==a[9]+a[10]) System.out.println("第12个瓶子不合格，质量为："+a[11]);
      if(2*a[9]==a[10]+a[11])System.out.println("第9个瓶子不合格，质量为："+a[8]);
      if(2*a[10]==a[11]+a[8])System.out.println("第10个瓶子不合格，质量为："+a[9]);
      if(2*a[11]==a[8]+a[9]) System.out.println("第11个瓶子不合格，质量为："+a[10]);
      }
    else if(a[0]+a[1]+a[2]+a[3]==a[8]+a[9]+a[10]+a[11])
     {
      if(2*a[4]==a[5]+a[6])System.out.println("第8个瓶子不合格，质量为："+a[7]);
      if(2*a[5]==a[6]+a[7])System.out.println("第5个瓶子不合格，质量为："+a[4]);
      if(2*a[6]==a[7]+a[4])System.out.println("第6个瓶子不合格，质量为："+a[5]);
      if(2*a[7]==a[4]+a[5])System.out.println("第7个瓶子不合格，质量为："+a[6]);
      }
    else {
      if(2*a[0]==a[1]+a[2])System.out.println("第4个瓶子不合格，质量为："+a[3]);
      if(2*a[1]==a[2]+a[3])System.out.println("第1个瓶子不合格，质量为："+a[0]);
      if(2*a[2]==a[3]+a[0])System.out.println("第2个瓶子不合格，质量为："+a[1]);
      if(2*a[3]==a[0]+a[1])System.out.println("第3个瓶子不合格，质量为："+a[2]);
      }
}}