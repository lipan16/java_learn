class throwDemo
{
    public static void main(String[] args)
    {
         try   {
            if(args.length!=1) 
                throw new Exception("�������ٻ���࣡");
            else  
                System.out.println(args[0]);
        }
        catch(Exception e){
              System.out.println("******�����������ԣ�");
              System.out.println(e.getMessage());
              e.printStackTrace();
        }
    }
}